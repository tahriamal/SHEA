package fr.inria.saloon.core.solver;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.constraints.ICF;
import org.chocosolver.solver.constraints.LCF;
import org.chocosolver.solver.variables.IntVar;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import type.TypePackage;
import featureModel.Attribute;
import featureModel.FMConstraint;
import featureModel.Feature;
import featureModel.FeatureModelPackage;
import featureModel.HostedBy;
import featureModel.NodeFeature;
//import fr.inria.saloon.core.utils.ModelUtils;


public class MatchingAlgorithmFMS {
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
	public static Map<Feature, Feature> MatchingList = new HashMap<Feature, Feature>();
	//public static Map<Feature, ExternalFeature> toConstraint = new HashMap<Feature,ExternalFeature>();
	//this is mandatory for the loadModel to find the packages. Always call it before the loadModel
	static DeploymentBuilder db = new DeploymentBuilder();
	
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

	public static List retrieveFeatureFromFM(EObject featureModel) {		

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
	public static List retrieveAttributeFromFM(EObject featureModel) {		

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

	public static List retrieveConstraintFromFM(EObject featureModel) {		

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
	public static void addConstraintToFM(EObject featureModel, Map<Feature, Feature> mlist) {

		DeploymentBuilder db = new DeploymentBuilder();
		for (Entry<Feature, Feature> entry : mlist.entrySet()) {

			System.out.println("Matching algorithm "+ entry.getKey() + entry.getValue() );
			//				db.translateModelIntoCSP(appFM) ;
			//				cspConstraints.add

			Constraint c = LCF.ifThen_reifiable(
					ICF.arithm(db.getCSPVariableFromFeature(entry.getKey()), ">", 0), 
					ICF.arithm(db.getCSPVariableFromFeature(entry.getValue()), ">", 0)) ;
			db.cspConstraints.add(c);

		}

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

	//	public Map<String, String> match(String pathFMApp, String pathFMNode ) {
	public NodeFeature createNodeF(){
		
		
		return null;
		
	}
	public static void main (String args []) {
		DeploymentBuilder db = new DeploymentBuilder();
		long startTime = System.currentTimeMillis();
		Boolean FindMatch = true;
		//create an instance
		//String app = "FaceRecognition.xmi" ;
		String app = "SecurityApp.xmi" ;
		//String app = "C:/Users/phgm9349/workspace1/ASaloon/src/main/resources/model/App.xmi";
		Resource rApp =  MatchingAlgorithmFMS.loadModel(app); 
		// matchingAlgorithm.loadFM(rApp);
		

		//String node = "amazonEC2.xmi";
		// String node = "C:/Users/phgm9349/workspace1/ASaloon/src/main/resources/model/Cloud.xmi" ;
		String node = "Cloud.xmi";
		Resource rNode = MatchingAlgorithmFMS.loadModel(node);
		//matchingAlgorithm.loadFM(rNode);
		EList<EObject> nodeFM = rNode.getContents();
		//		 TreeIterator<EObject> treenodeFM = rNode.getAllContents();
		//		 while (treenodeFM.hasNext()) {
		//			 nodeFeatures = retrieveFeatureFromFM(treenodeFM.next());
		//			 System.out.println(nodeFeatures);
		//		 }
		for (int i=0; i < nodeFM.size(); i++){
			EObject tempNodeFM = nodeFM.get(i);
			//rootNode = retrieveRootFromFM(tempNodeFM);
			nodeFeatures = retrieveFeatureFromFM(tempNodeFM);
			for (int l=0; l<nodeFeatures.size(); l++) {
				System.out.println(nodeFeatures.get(l).getName());
			}

			nodeAttributes = retrieveAttributeFromFM(tempNodeFM);}
		
		if (rApp.isLoaded() && rApp.getContents().size() > 0) {
			TreeIterator<EObject> fmContent = (TreeIterator<EObject>) rApp.getAllContents();

			// The returned tree first element is the root Feature.
			// Without next(), the tree first element would be the container package.
			//return tree.next();
		
//		EList<EObject>  appFM = rApp.getContents();
//		TreeIterator<EObject> fmContent = (TreeIterator<EObject>) ((EObject) appFM).eAllContents();
		while (fmContent.hasNext()) {
			Object modelElement = fmContent.next();
			if (modelElement instanceof Feature) {
				Feature feature = (Feature) modelElement;
				appFeatures.add(feature);
			}
			if (modelElement instanceof Attribute) {
				Attribute attribute = (Attribute) modelElement;
				appAttributes.add(attribute);
			}
		}
		}

		for (int i=0; i<appAttributes.size(); i++) {
			for (int j=0; j<nodeAttributes.size(); j++) {

				if (appAttributes.get(i).getName().equals(nodeAttributes.get(j).getName())) {
					Feature parentFeature = ((Feature) (appAttributes.get(j).eContainer()));
					System.out.println("Find Match : " + appAttributes.get(j).getName() + "  parentFeature " 
							+ parentFeature.getName() + "in the node FM " + nodeFeatures.get(0).getName());
					MatchingList.put(parentFeature, nodeFeatures.get(0));
//					Constraint c = LCF.ifThen_reifiable(
//							ICF.arithm(db.getCSPVariableFromFeature(parentFeature), ">", 0), 
//							ICF.arithm(db.getCSPVariableFromFeature(nodeFeatures.get(0)), ">", 0)) ;
//					db.cspConstraints.add(c);
				}	
			}
		}
		//			for(int j=1; j<nodeFeatures.size(); j++) {
		//				  System.out.println("nodeFeatures" + nodeFeatures.get(j).getName());
		//			
		//				for (int k=1; k<appAttributes.size(); k++){
		//				for (int i=1; i<nodeFeatures.get(j).getAttributes().size()-1; i++) {
		//				                    
		//					System.out.print("j= " + j);
		//					System.out.print("k= " + k);
		//				
		//						if (appAttributes.get(k).getName().equals(nodeFeatures.get(j).getName()) | 
		//								appAttributes.get(k).getName().equals(nodeAttributes.get(j).getName())){
		//							Feature parentFeature = ((Feature) (appAttributes.get(k).eContainer()));
		//	   						System.out.println("Find Match : " + appAttributes.get(k).getName() + "  parentFeature " 
		//							+ parentFeature.getName() + "in the node FM " + nodeFeatures.get(0).getName());
		//	   					
		//	   						MatchingList.put(parentFeature.getName(), nodeFeatures.get(0).getName());
		//	   					
		//	   						FindMatch =true ;
		//	   						
		//						
		//	   				}
		//						else FindMatch = false;
		//						//System.out.println("No Match found");
		//
		//				}
		//				
		//				}	
		//				}
		for (Entry<Feature, Feature> entry :MatchingList.entrySet()) {

			System.out.println("Matching algorithm "+ entry.getKey().getName() + entry.getValue().getName() );
			
//			Constraint c = LCF.ifThen_reifiable(
//					ICF.arithm(db.getCSPVariableFromFeature((entry.getKey().eContainer())), ">", 0), 
//					ICF.arithm(db.getCSPVariableFromFeature(entry.getValue()), ">", 0)) ;
//			db.cspConstraints.add(c);
		}
	
		reason(db);
		long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime-startTime) + "ms"); 
		//return Matching; 


	}
	private static void reason(DeploymentBuilder constraintBuilder) {
		if (constraintBuilder.hasASolution()) {
			displayFeedback(constraintBuilder);
		} else {
			System.out.println("No solution found");
		}				
	}

	/**
	 * Display one or several configurations for the FM
	 * @param constraintBuilder
	 */
	private static void displayFeedback(DeploymentBuilder constraintBuilder) {


		boolean verbose = true;
		if (verbose) {
			constraintBuilder.displayAllSolutions();
		}
		else {
			constraintBuilder.displayOneSolutionOnTable();
		}
	}


}


