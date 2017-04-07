/*
 * XMIFileWriter.java
 *
 * v1.0
 *
 * 2014-02-20
 * 
 * Copyright Inria - Université de Lille 1
 */

package com.inria.ecsa.validation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import featureModel.Alternative;
import featureModel.BooleanConstraint;
import featureModel.Cardinality;
import featureModel.FMConstraint;
import featureModel.Excludes;
import featureModel.Exclusive;
import featureModel.Feature;
import featureModel.FeatureModel;
import featureModel.Implies;
import featureModel.Requires;
import fr.inria.saloon.core.solver.ConstraintBuilder;
import fr.inria.saloon.core.utils.ModelUtils;
import fr.inria.saloon.validation.splc.HalfRandomFMBuilder;

public class XMIFileWriter {
	
	boolean verbose = false;

	private RandomFM fm;
	private static final String EXCLUSIVE = "xsi:type=\"featuremodel:Exclusive\"";
	private static final String ALTERNATIVE = "xsi:type=\"featuremodel:Alternative\"";
	private static final String LEVEL = "<level xsi:type=\"cardSemantics:Global\" href=\"../CardSemantics.xmi#//@levels.0\"/>";
	private static final String REQUIRES = "xsi:type=\"featuremodel:Requires\"";
	private static final String IMPLIES = "xsi:type=\"featuremodel:Implies\"";
	private static final String EXCLUDES = "xsi:type=\"featuremodel:Excludes\"";
	private static final String COLOCATED = "xsi:type=\"featuremodel:Colocated\"";
	private static final String SEPARATED = "xsi:type=\"featuremodel:Separated\"";
	
	public XMIFileWriter(RandomFM fm) {
		this.fm = fm;
	}
	
	private void printStructure(int indent, Feature feature) {
		int i = 0;
		while (i < indent) {
			System.out.print(" ");
			i++;
		}	
		
		if (feature.getSubFeatures().size() > 0) {
			System.out.print(feature.getName());
			
			if (feature instanceof Exclusive) {
				System.out.println(" (exc)" + " " + feature.getSubFeatures().size());
			} else if (feature instanceof Alternative) {
				System.out.println(" (alt)" + " " + feature.getSubFeatures().size());
			} else{
				System.out.println(" (nor)" + " " + feature.getSubFeatures().size());
			}
			
			for (Feature subFeature : feature.getSubFeatures()) {
				printStructure(indent+1, subFeature);
			}
		} else {
			System.out.println(feature.getName());
		}
	}
	
	public File writeToFile(File xmiFile) {
		
		if (verbose) {
			System.out.println();
			for (Feature feature : this.fm.getFeaturesTree().get(0)) {
				printStructure(0,feature);
			}	
		}
		
		try {
			FileWriter fileWriter = new FileWriter(xmiFile, false);
			PrintWriter bufferedWriter = new PrintWriter(fileWriter);
			
			// Write XMI file
			writeHeader(bufferedWriter);
			writeFeatures(bufferedWriter);
		//	writeAttributes(bufferedWriter);
			writeConstraints(bufferedWriter);
//			writeDeploymentConstraints(bufferedWriter);
//			writeNodeFeature(bufferedWriter);
			writeFooter(bufferedWriter);
			
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return xmiFile;
	}

//	private void writeAttributes(PrintWriter bufferedWriter) {
//		for (Attributes constraint : fm.getAttributes) {
//			writeConstraint(bufferedWriter, constraint);
//		}
		//
	//}

	private void writeConstraints(PrintWriter bufferedWriter) {
		for (FMConstraint constraint : fm.getFmConstraints()) {
			writeConstraint(bufferedWriter, constraint);
		}
	}

	private void writeConstraint(PrintWriter bufferedWriter, FMConstraint constraint) {
		String xmiFrom = buildXMIStringForFeatureReference(((BooleanConstraint) constraint).getFrom());
		String xmiTo = buildXMIStringForFeatureReference(((BooleanConstraint) constraint).getTo());		
		bufferedWriter.println("<constraints " + getConstraintType(constraint) + " from=\"" + xmiFrom + " to=\"" + xmiTo + ">");
		bufferedWriter.println(LEVEL);
//		if (constraint instanceof Requires) {
//			Requires requires = (Requires) constraint;
//			writeCardRequires("From", requires.getCardFrom(), bufferedWriter);
//			writeCardRequires("To", requires.getCardTo(), bufferedWriter);
//		}
		bufferedWriter.println("</constraints>");
	}
	
	private void writeCardRequires(String dest, Cardinality card, PrintWriter bufferedWriter) {
		bufferedWriter.println("<card" + dest + " xsi:type=\"featuremodel:FeatCardinality\" cardinalityMax=\"" +
				card.getCardinalityMax() + "\" cardinalityMin=\"" + card.getCardinalityMin() + "\">");
		bufferedWriter.println(LEVEL);
	    bufferedWriter.println("</card" + dest + ">");
	}

	/**
	 * @param feature
	 * @return
	 */
	private String buildXMIStringForFeatureReference(Feature feature) {
		String consToXMI = "//@rootFeature/@subFeatures.";
		
		List<String> levelToString = new ArrayList<String>();
		
		// If the feature is at first level, there is no container
		while (((Feature) feature.eContainer()) != null) {
			int position = 0;
			Feature parent = (Feature) feature.eContainer();
			for (int i = 0; i < parent.getSubFeatures().size(); i++) {
				if (parent.getSubFeatures().get(i).getName().equals(feature.getName())) {
					position = i;
				}
			}

			if (parent instanceof Alternative) {
				levelToString.add("/@variants." + position);
			} else {
				levelToString.add("/@subFeatures." + position);
			}
			feature = (Feature) feature.eContainer();
		}
				
		consToXMI = consToXMI + feature.getName().substring(feature.getName().length() - 1);
		for (int i = levelToString.size() - 1; i >= 0; i--) {
			consToXMI = consToXMI + levelToString.get(i);
		}
		consToXMI = consToXMI + "\"";
		return consToXMI;
	}

	private void writeFeatures(PrintWriter bufferedWriter) {
		writeRootFeature(bufferedWriter);
		if(fm.getFeaturesTree().get(0)== null)
			System.out.println("feature tree empty");
			else {
		for (Feature feature : fm.getFeaturesTree().get(0)) {
			// We make the assumption the root feature can not be Alternative
			// So each feature of the first level is a subfeature
			writeFeature(feature, "subFeatures" , bufferedWriter);
		}	
		}
		bufferedWriter.println("</rootFeature>");
	}
	
	private void writeFeature(Feature feature, String type, PrintWriter bufferedWriter) {				
		bufferedWriter.println("<" + type + " " + getFeatureType(feature) + " name=\"" + feature.getName() + "\">");
		writeFeatureCardinality(bufferedWriter, feature);
		
		for (Feature subFeature : feature.getSubFeatures()) {
			writeFeature(subFeature, getSubFeatureType(feature), bufferedWriter);
		}
		bufferedWriter.println("</" + type + ">");
	}	

	private void writeRootFeature(PrintWriter bufferedWriter) {
		bufferedWriter.println("" +
				"<rootFeature name=\"RootFeature\">" +
				"<featureCardinality cardinalityMax=\"1\" cardinalityMin=\"1\">" +
				LEVEL +
				"</featureCardinality>");
	}
	
	private void writeFeatureCardinality(PrintWriter bufferedWriter, Feature f) {
		bufferedWriter.println("" +
				"<featureCardinality cardinalityMax=\"" + f.getFeatureCardinality().getCardinalityMax() + 
				"\" cardinalityMin=\"" + f.getFeatureCardinality().getCardinalityMin() + "\">" +
				LEVEL +
				"</featureCardinality>");
	}

	/**
	 * @param bufferedWriter
	 */
	private void writeFooter(PrintWriter bufferedWriter) {
		bufferedWriter.println("</featuremodel:FeatureModel>");
	}

	/**
	 * @param bufferedWriter
	 */
	private void writeHeader(PrintWriter bufferedWriter) {
		bufferedWriter.println("<?xml version=\"1.0\" encoding=\"ASCII\"?>" +
				"<featuremodel:FeatureModel xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" " +
				"xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" " +
				"xmlns:cardSemantics=\"http://fr.saloon.model.cardSemantics\" " +
				"xmlns:featuremodel=\"http://fr.saloon.model.featuremodel\" " +
				"xsi:schemaLocation=\"http://fr.saloon.model.cardSemantics ../../metamodel/CardSemantics.ecore " +
				"http://fr.saloon.model.featuremodel ../../metamodel/FeatureModel.ecore\">");
	}
	
	private String getFeatureType(Feature feature) {	
		if (feature instanceof Exclusive) {
			return EXCLUSIVE;
		} else if (feature instanceof Alternative) {
			return ALTERNATIVE;
		} else {
			return "";	
		}
	}
	
	private String getSubFeatureType(Feature feature) {	
		if (feature instanceof Exclusive) {
			return "variants";
		} else if (feature instanceof Alternative) {
			return "variants";
		} else {
			return "subFeatures";	
		}
	}
	
	
	private String getConstraintType(FMConstraint constraint) {		
		if (constraint instanceof Requires) {
			return REQUIRES;
		}
		if (constraint instanceof Implies) {
			return IMPLIES;
		}
		if (constraint instanceof Excludes) {
			return EXCLUDES;
		}
		return "";
	}
	public static void main(String[] args) {
		final String fmPath = "src/generatedEFM/";
		boolean verbose = false;
		int nbFMToGenerate = 10;
		
		for (int i = 0; i < nbFMToGenerate ; i++) {
			
			File f;
			f = new File(fmPath + i + ".xmi");
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}

			System.out.println("fm"+i);
			if (verbose) System.out.print("Generating random FM");	
			RandomFMBuilder fmBuilder = new RandomFMBuilder();
			RandomFM fm = fmBuilder.generateRandomFM();
			if (verbose) System.out.print(" with " + fm.getNbFeatures() + " features");
			if (verbose) System.out.println("... Done");
			
			if (verbose) System.out.print("Writing FM to XMI");
			XMIFileWriter xmiFileWriter = new XMIFileWriter(fm);
			xmiFileWriter.writeToFile(f);
			

		
		

	}
}
	}

