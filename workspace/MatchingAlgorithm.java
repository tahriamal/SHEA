package fr.inria.saloon.core.solver;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.chocosolver.solver.constraints.Constraint;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EStructuralFeatureImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;









//import solver.variables.IntVar;
import type.IntValue;
import type.TypePackage;
import type.Value;
import featureModel.Alternative;
import featureModel.Attribute;
import featureModel.ExternalFeature;
import featureModel.FMConstraint;
import featureModel.Feature;
import featureModel.FeatureModel;
import featureModel.HostedBy;
import featureModel.FeatureModelPackage;
public class matchingAlgorithm {
		//List of FM features 
		private static	List<Feature> features = new ArrayList<Feature>();
		private static	List<Feature> nodeFeatures = new ArrayList<Feature>();
		private static	List<FMConstraint> fmConstraints = new ArrayList<FMConstraint>();
		private static	List<Attribute> nodeAttributes = new ArrayList<Attribute>();
		private static	List<Feature> appFeatures = new ArrayList<Feature>(); 
		private static	List<Attribute> appAttributes = new ArrayList<Attribute>();
		private static Feature rootFeature;
		private static Feature rootApp;
		private static Feature rootNode	;
		
		private static	List<Attribute> attributes = new ArrayList<Attribute>();
		private static Map<String, Attribute> attrParentattr = new HashMap<String,Attribute>();
		private static Map<String, String> Matching = new HashMap<String,String>();
	//this is mandatory for the loadModel to find the packages. Always call it before the loadModel

		public static Resource loadModel(String path) {
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
	            
	            return r;
		
	}
		 catch (IOException e) {
	e.printStackTrace(); 
	return null; 
	}
		}
	      
	private static List retrieveFeatureFromFM(EObject featureModel) {		

			TreeIterator<EObject> fmContent = (TreeIterator<EObject>) featureModel.eAllContents();

			while (fmContent.hasNext()) {
				Object modelElement = fmContent.next();
				if (modelElement instanceof Feature) {
					Feature feature = (Feature) modelElement;
					features.add(feature);
				
					//System.out.println("feature " +feature.getName());
						}
					
					}
			return features;
				}
		private static List<Attribute> retrieveAttributeFromFM(EObject featureModel) {		

			TreeIterator<EObject> fmContent = (TreeIterator<EObject>) featureModel.eAllContents();
		

			while (fmContent.hasNext()) {
				Object modelElement = fmContent.next();
					if (modelElement instanceof Attribute) {
						Attribute attribute = (Attribute) modelElement;
						Feature parentFeature = ((Feature) (attribute.eContainer()));
						//System.out.println("parentFeature" + parentFeature.getName());
						attrParentattr.put(parentFeature.getName(), attribute);
						attributes.add(attribute);
						
						//System.out.println("Attribute "+ attribute.getName());
					}
					}
			//return attrParentattr;
			return attributes;
				}
		
		private static List<FMConstraint> retrieveConstraintFromFM(EObject featureModel) {		

			TreeIterator<EObject> fmContent = (TreeIterator<EObject>) featureModel.eAllContents();

			while (fmContent.hasNext()) {
				Object modelElement = fmContent.next();
				if (modelElement instanceof FMConstraint) {
					FMConstraint constraint = (FMConstraint) modelElement;
					fmConstraints.add(constraint);
				
					//System.out.println("feature " +feature.getName());
						}
					
					}
			return fmConstraints;
			
				}
		
//		  private static void loadFM (Resource r){	
//		        EList<EObject> MyFM =r.getContents();
//	            for (int i=0; i < MyFM.size(); i++){
//	   			 EObject tempFME = MyFM.get(i);
//	   			List<Feature> features = retrieveFeatureFromFM(tempFME);
//	   			List<Attribute> attributes = retrieveAttributeFromFM(tempFME);
//	   			for(int j=0; j<features.size(); j++) {
//	   				for (int k=0; k<attributes.size(); k++){
//	   					if (attributes.contains(features.get(j).getName()))
////	   					if (attributes.containsKey(features.get(j).getName())){
////	   						System.out.println("Find : " + attributes.get(k).getName() + "From the Feature : " + attributes.toString());
//	   						if (attributes.get(k).getName().equals(features.get(j).getName())){
//		   						System.out.println("Find : " + attributes.get(k).getName() );
//	   					}
//	   				}
//	   				}
//	   			}
//
//			}
//		public static boolean Find (List<Feature> features, List<Attribute> attributes) {
//			for(int j=0; j<features.size(); j++) {
//				
//			for (int i=0; i<attributes.size(); i++){
//				if (attributes.get(i).getName().equals(features.get(j).getName())){
//					System.out.println("Find : " + attributes.get(i).getName());
//					return true;
//				}
//			}
//			}
//			return false;
//			
//		}
		public void compare (Resource r1, Resource r2) {
			
		}
		
		
	public static boolean FindMatch() {
		long startTime = System.currentTimeMillis();
		Boolean findMatch = true;
		//create an instance
		 String app = "FaceRecognition.xmi" ;
		 Resource rApp =  matchingAlgorithm.loadModel(app); 
		// matchingAlgorithm.loadFM(rApp);
		
		
		String node = "OpenStack.xmi";
		Resource rNode = matchingAlgorithm.loadModel(node);
		//matchingAlgorithm.loadFM(rNode);
		 EList<EObject> nodeFM =rNode.getContents();
         for (int i=0; i < nodeFM.size(); i++){
			 EObject tempNodeFM = nodeFM.get(i);
		//rootNode = retrieveRootFromFM(tempNodeFM);
		 nodeFeatures = retrieveFeatureFromFM(tempNodeFM); 
		 nodeAttributes = retrieveAttributeFromFM(tempNodeFM);}
         
         EList<EObject> appFM =rApp.getContents();
         for (int i=0; i < appFM.size(); i++){
			 EObject tempAppFM = appFM.get(i);
			//rootApp = retrieveRootFromFM(tempAppFM);
			 appFeatures = retrieveFeatureFromFM(tempAppFM); 
			 appAttributes = retrieveAttributeFromFM(tempAppFM);}
         
         
			for(int j=0; j<nodeFeatures.size(); j++) {
				//System.out.println(nodeFeatures.get(j).getName());
				for (int k=0; k<appAttributes.size(); k++){
//					if (attributes.containsKey(features.get(j).getName())){
//						System.out.println("Find : " + attributes.get(k).getName() + "From the Feature : " + attributes.toString());
						if (appAttributes.get(k).getName().equals(nodeFeatures.get(j).getName())){
							Feature parentFeature = ((Feature) (appAttributes.get(k).eContainer()));
	   						System.out.println("Find Match : " + appAttributes.get(k).getName() + "  parentFeature " + parentFeature.getName() + " in the FM " + nodeFeatures.get(0).getName());
	   					Matching.put(parentFeature.getName(),nodeFeatures.get(0).getName());
	   					 findMatch =true ;
	   							
	   						
					}
						else  findMatch = false;

				}
				}
			long endTime = System.currentTimeMillis();
		       System.out.println("Total execution time: " + (endTime-startTime) + "ms"); 
			//return Matching; 
			return findMatch;
		
			}
	public static Constraint addConstraint(){
		boolean FM = matchingAlgorithm.FindMatch();
		if (FM==true){
			
			
		}
		return null;
		
	}

	public static void main(String[] args) {
		matchingAlgorithm.FindMatch();
	}
			}


