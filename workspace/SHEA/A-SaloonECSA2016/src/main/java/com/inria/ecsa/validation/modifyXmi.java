package com.inria.ecsa.validation;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import type.TypePackage;
import featureModel.Feature;
import featureModel.FeatureModel;
import featureModel.FeatureModelPackage;


public class modifyXmi {

	static String NodeHAB= "<nodeFeature name=\"HAB\"> <NodeAttributes name=\"CPU\"><value xsi:type=\"type:IntValue\" value=\"1024\"/></NodeAttributes> <NodeCardinalities cardinalityMin=\"1\" cardinalityMax=\"1\"/> </nodeFeature>";
	static String NodeCloud="<nodeFeature name=\"Cloud\"><NodeAttributes name=\"CPUCloud\"><value xsi:type=\"type:IntValue\" value=\"1000\"/></NodeAttributes><NodeCardinalities cardinalityMin=\"1\" cardinalityMax=\"1\"/></nodeFeature>";
	static String Fin="</rootFeature></featuremodel:FeatureModel>";
	public static	List<Feature> features = new ArrayList<Feature>();
	public Feature rootFeature;
	
	
	public static void main(String[] args) throws IOException {
		int cpt = 0;
		double totalTime = 0;
		// TODO Auto-generated method stub
		String fmPath = "SecurityApp.xmi";
		String fmdesitination = "App.xmi";
		String nodeCloud = "Cloud.xmi";
		String nodeHAB = "HAB.xmi";
		EObject AppfM = (EObject) loadModel(fmPath);
		EObject cloudFM = (EObject) loadModel(nodeCloud);
		EObject HABFM = (EObject) loadModel(nodeHAB);
		File fmSource = new File(fmPath);
		File destination = new File(fmdesitination);
		
		
		String HABName= retrieveRootNameFromFM(HABFM);
		System.out.println("Name"+HABName);
		String cloudName= retrieveRootNameFromFM(cloudFM);
		System.out.println(cloudName);
		String addNode = addNodeFeature(HABName);
		System.out.println(addNode);
		
		TreeIterator<EObject> fmContent = (TreeIterator<EObject>) cloudFM.eAllContents();
		
		while (fmContent.hasNext()) {
			Object modelElement = fmContent.next();
			
				if (modelElement instanceof FeatureModel) {
					String rootFeatureName = ((FeatureModel) modelElement).getRootFeature().getName();
					System.out.println("Name"+ rootFeatureName);}
		
		}
		
		
		
		File target = new File("App.xmi");
		String search ="</rootFeature>";
		String search1= "</featuremodel:FeatureModel>";
		CopyFile.copyFile(fmSource, destination);
		removeADDLineFromFile(target, search, addNode);
		//removeLineFromFile(target, search1);
		System.out.println("Total time " + totalTime);
		System.out.println("Average time " + totalTime/cpt);
	}
	
	
public static String retrieveRootNameFromFM(EObject featureModel) {		

	TreeIterator<EObject> fmContent = (TreeIterator<EObject>) featureModel.eAllContents();
		//Feature rootFeature = null;
		String rootFeatureName ="";
		while (fmContent.hasNext()) {
			Object modelElement = fmContent.next();
			
				if (modelElement instanceof FeatureModel) {
					Feature rootFeature = ((FeatureModel) modelElement).getRootFeature();
					rootFeatureName = rootFeature.getName();
					System.out.println(rootFeatureName);
				//variable = VF.bounded(feature.getName(), 1, 1, solver);
				
			}
				
		}
		return rootFeatureName;
	
		}
public List<Feature> retrieveFeatureFromFM(EObject featureModel) {		

	TreeIterator<EObject> fmContent = (TreeIterator<EObject>) featureModel.eAllContents();

		while (fmContent.hasNext()) {
			Object modelElement = fmContent.next();
			if (modelElement instanceof Feature) {
				Feature feature = (Feature) modelElement;
				features.add(feature);
				//System.out.println("features size: " + features1.size());

				//System.out.println("feature " +feature.getName());
			}

		}
		return features;
	}
	
	
	
	public static void removeADDLineFromFile(File targetFile, String searchTerm, String addNode)
	        throws IOException
	{ long startTime = System.currentTimeMillis();
	    StringBuffer fileContents = new StringBuffer(
	            FileUtils.readFileToString(targetFile));
	    String[] fileContentLines = fileContents.toString().split(
	            System.lineSeparator());
	
	    emptyFile(targetFile);
	    fileContents = new StringBuffer();

	    for (int fileContentLinesIndex = 0; fileContentLinesIndex < fileContentLines.length; fileContentLinesIndex++)
	    {
	        if (fileContentLines[fileContentLinesIndex].contains(searchTerm))
	        {
	           // continue;
	        	System.out.println("Index:" + fileContentLinesIndex);
	        	fileContents.delete(fileContentLinesIndex, fileContentLines.length);
	        	fileContents.append(addNode);
	        	//fileContents.append(Fin);
	        	//fileContents.append(searchTerm1);
	        }

	        fileContents.append(fileContentLines[fileContentLinesIndex] + System.lineSeparator());
	    }

	    FileUtils.writeStringToFile(targetFile, fileContents.toString().trim());
	    long endTime = System.currentTimeMillis();
	    System.out.println("Total execution time: " + (endTime-startTime) + "ms");
	}

	private static void emptyFile(File targetFile) throws FileNotFoundException,
	        IOException
	{
	    RandomAccessFile randomAccessFile = new RandomAccessFile(targetFile, "rw");

	    randomAccessFile.setLength(0);
	    randomAccessFile.close();
	}
	private static String addNodeFeature(String name) {				
		return "<nodeFeature name=\""
				+ name+"\"> <NodeAttributes name=\"CPU\"> <value xsi:type=\"type:IntValue\" value=\"1000\"> </NodeAttributes>"+
	"<NodeAttributes name=\"RAM\"> <value xsi:type=\"type:IntValue\" value=\"1024\"> "+
  "</NodeAttributes> <NodeCardinalities cardinalityMin=\"1\" cardinalityMax=\"1\"/> </nodeFeature>";
	}

	public static EObject loadModel(String path) {
		TypePackage.eINSTANCE.eClass(); 
		FeatureModelPackage.eINSTANCE.eClass(); 
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());  
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.getResource(URI.createFileURI((new File(path)).getAbsolutePath()), true);

		//Resource r = rs.getResource(URI.createFileURI(path), true);
		try {
			r.load(null);
			EcoreUtil.resolveAll(r); 
			for (Resource.Diagnostic d : r.getWarnings()) 
			{
				System.out.print(d.toString());
			}
			for (Resource.Diagnostic d : r.getErrors()) 
			{
				System.out.print(d.toString());
			}

			if (r.isLoaded() && r.getContents().size() > 0) {
				TreeIterator<EObject> tree = (TreeIterator<EObject>) r.getAllContents();

				// The returned tree first element is the root Feature.
				// Without next(), the tree first element would be the container package.
				return tree.next();
		}

		}
		catch (IOException e) {
			e.printStackTrace(); 
			return null; 
		}
		return null;
	}
}
