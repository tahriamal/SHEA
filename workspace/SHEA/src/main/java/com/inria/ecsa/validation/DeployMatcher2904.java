package com.inria.ecsa.validation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
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
import featureModel.FMConstraint;
import featureModel.Feature;
import featureModel.FeatureModel;
import featureModel.FeatureModelPackage;

public class DeployMatcher2904 {
	//removeADDLineFromFile(target, search, NodeHAB);	
	public static HashMap<Feature, Feature> MatchingList = new HashMap<Feature, Feature>();
	public static	List<FMConstraint> fmConstraints = new ArrayList<FMConstraint>();
	public static List<Feature> nodeFeatures = new ArrayList<Feature>(); 
	public static	List<Feature> appFeatures = new ArrayList<Feature>(); 
	public static	List<Feature> features1 = new ArrayList<Feature>();
	
	public static void main (String[] args) {
	String app = "AppSecurity.xmi" ;
	File appTarget = new File("App.xmi");
	String nodeCloud = "Cloud.xmi";
	String nodeHAB = "HAB.xmi";
	EObject AppfM = (EObject) loadModel(app);
	EObject cloudFM = (EObject) loadModel(nodeCloud);
	EObject HABFM = (EObject) loadModel(nodeHAB);
	File fmSource = new File(app);
	
    // copy file Xmi avant d'ajouter qq chose
	copyFile(fmSource, appTarget);
	//OnMatch(
	//addNode
	//addHosteByConstraint
	
	
	String nodeName= retrieveRootNameFromFM(cloudFM); 
	}
	

	public static boolean copyFile( File source, File destination ){ //Methode permettant la copie d'un fichier 
		boolean resultat = false; 

		// Declaration des flux 
		java.io.FileInputStream sourceFile=null; 
		java.io.FileOutputStream destinationFile=null; 
		try { 
		// Création du fichier : 
		destination.createNewFile(); 
		// Ouverture des flux 
		sourceFile = new java.io.FileInputStream(source); 
		destinationFile = new java.io.FileOutputStream(destination); 
		// Lecture par segment de 0.5Mo 
		byte buffer[]=new byte[512*1024]; 
		int nbLecture; 
		while( (nbLecture = sourceFile.read(buffer)) != -1 ) { 
		destinationFile.write(buffer, 0, nbLecture); 
		} 

		// Copie réussie 
		resultat = true; 
		} catch( java.io.FileNotFoundException f ) { 
		} catch( java.io.IOException e ) { 
		} finally { 
		// Quoi qu'il arrive, on ferme les flux 
		try { 
		sourceFile.close(); 
		} catch(Exception e) { } 
		try { 
		destinationFile.close(); 
		} catch(Exception e) { } 
		} 
		return( resultat ); 
		}
	
	
	
	
	
	
	
	public static String retrieveRootNameFromFM(EObject featureModel) {		

		TreeIterator<EObject> fmContent = (TreeIterator<EObject>) featureModel.eAllContents();
		String rootFeature = null ;
		while (fmContent.hasNext()) {
			Object modelElement = fmContent.next();
			
				if (modelElement instanceof FeatureModel) {
					rootFeature = ((FeatureModel) modelElement).getRootFeature().getName();
				//variable = VF.bounded(feature.getName(), 1, 1, solver);
				
			}
				
		}
		return rootFeature;
	
		}
	
	
	public static List retrieveFeatureFromFM(EObject featureModel) {		

		TreeIterator<EObject> fmContent = (TreeIterator<EObject>) featureModel.eAllContents();

		while (fmContent.hasNext()) {
			Object modelElement = fmContent.next();
			if (modelElement instanceof Feature) {
				Feature feature = (Feature) modelElement;
				features1.add(feature);
				//System.out.println("features size: " + features1.size());

				//System.out.println("feature " +feature.getName());
			}

		}
		return features1;
	}
	
	
	
	public static void changeFile(File targetFile, String searchTerm, String addNode)
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
	        	fileContents.append(addNode);
	        	fileContents.append(searchTerm);
	        }

	        fileContents.append(fileContentLines[fileContentLinesIndex] + System.lineSeparator());
	    }

	    FileUtils.writeStringToFile(targetFile, fileContents.toString().trim());
	    long endTime = System.currentTimeMillis();
	    System.out.println("Total execution time: " + (endTime-startTime) + "ms");
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
	        	fileContents.append(addNode);
	        	fileContents.append(searchTerm);
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
