package fr.inria.saloon.core.solver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import type.TypePackage;
import featureModel.FeatureModelPackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import featureModel.Feature;
public class ReadProperties {

	Random random = new Random();
	long startTime = System.currentTimeMillis();
	static String app = "src/main/resources/model/AppSecurity.xmi" ;
	static EObject AppfeatureModel = (EObject) loadModel(app);
	
	DeploymentBuilder db = new DeploymentBuilder();
	

	public int getRandomList(List<Feature> list) {
	
		int index = random.nextInt(db.features.size());		
	    System.out.println("\nIndex :" + index );
	    db.features.get(index);
		System.out.println(db.features.get(index).getName());
		return index;
		
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
	
	
	public static void main(String[] args) {
		
			Properties prop = new Properties();
			InputStream input = null;
			DeploymentBuilder db = new DeploymentBuilder();
			db.retrieveCSPElementsFromFM(AppfeatureModel);
			for(int i=0; i<db.features.size()-1; i++){
			System.out.println("FeatureName" + db.features.get(i).getName());}
			ReadProperties rp = new ReadProperties();
			if(db.features.size()>0){
				//
				System.out.println(rp.getRandomList(db.features));
			}
			
			
//			try {
//		 
//				input = new FileInputStream("plandep.properties");
//		 
//				// load a properties file
//				prop.load(input);
//		 
//				// get the property value and print it out
//				System.out.println(prop.getProperty("database"));
//				System.out.println(prop.getProperty("dbuser"));
//				System.out.println(prop.getProperty("dbpassword"));
//		 
//			} catch (IOException ex) {
//				ex.printStackTrace();
//			} finally {
//				if (input != null) {
//					try {
//						input.close();
//					} catch (IOException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		 
//
	}


}
