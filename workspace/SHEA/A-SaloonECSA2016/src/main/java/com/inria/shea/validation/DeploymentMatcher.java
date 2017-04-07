package com.inria.shea.validation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.io.FileUtils;
import org.chocosolver.solver.constraints.Constraint;

import org.chocosolver.solver.variables.IntVar;


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
import featureModel.BooleanConstraint;
import featureModel.Colocated;
import featureModel.Excludes;
import featureModel.FeatureModelFactory;
import featureModel.HostedBy;
import featureModel.Implies;
import featureModel.NodeFeature;
import featureModel.FMConstraint;
import featureModel.FeatCardinality;
import featureModel.Feature;
import featureModel.NodeFeature;
import featureModel.FeatureModel;
import featureModel.FeatureModelPackage;
import featureModel.Requires;

public class DeploymentMatcher {
	
	static DeploymentBuilder deploymentBuilder = new DeploymentBuilder();
	public static	List<Feature> features1 = new ArrayList<Feature>();
		
	private static Map<String, Attribute> attrParentattr = new HashMap<String,Attribute>();
	public static HashMap<Feature, Feature> MatchingList = new HashMap<Feature, Feature>();
	public static	List<FMConstraint> fmConstraints1 = new ArrayList<FMConstraint>();
	public static List<Feature> nodeFeatures = new ArrayList<Feature>(); 
	public static	List<Feature> appFeatures = new ArrayList<Feature>(); 
	static Feature rootFeature;
	static Feature parentFeature;
	public static Constraint c;
	public static IntVar parent1 ;
	public static IntVar node1;
	private static NodeFeature nodenew ;
	
	static String NodeHAB= "<nodeFeature name=\"HAB\"> <nodeAttributes name=\"CPU\"><value xsi:type=\"type:IntValue\" value=\"1024\"/></NodeAttributes>"
			+ "<NodeCardinalities cardinalityMin=\"1\" cardinalityMax=\"1\"/> </nodeFeature>";
	static String NodeCloud="<nodeFeature name=\"Cloud\"><NodeAttributes name=\"CPUCloud\"><value xsi:type=\"type:IntValue\" value=\"1024\"/></NodeAttributes>"
			+ "<NodeCardinalities cardinalityMin=\"1\" cardinalityMax=\"1\"/></nodeFeature>";
	static String search ="</rootFeature>";
	String search1= "</featuremodel:FeatureModel>";
	static String HOSTEDBY ="<constraints xsi:type=\"featuremodel:HostedBy";
	static String NOTHOSTEDBY ="<constraints xsi:type=\"featuremodel:NotHostedBy";
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		long startTime = System.currentTimeMillis();
		String app = "src/main/resources/model/AppSecurity.xmi" ;
		File target = new File("C:/validation/App.xmi");
		String node = "Cloud.xmi";
		EObject AppfeatureModel = (EObject) loadModel(app);
		EObject NodefeatureModel = (EObject) loadModel(node);
		
		//Onmatch doit être au moins après retrieveCSPElementsFromFM
		
		deploymentBuilder.retrieveCSPElementsFromFM(AppfeatureModel);
		//deploymentBuilder.cspConstraints.add(OnMatch(AppfeatureModel, NodefeatureModel));
		OnMatch(AppfeatureModel, NodefeatureModel);
		//removeADDLineFromFile(target, search, NodeHAB);
		
		deploymentBuilder.translateFeatureTreeIntoCSP(deploymentBuilder.features);
		deploymentBuilder.translateFeatureModelConstraintsIntoCSP(deploymentBuilder.fmConstraints);
		//deploymentBuilder.cspConstraints.add(c);
		deploymentBuilder.postCSPConstraintsToTheSolver(deploymentBuilder.cspConstraints);
		// quand je place OnMatch après le translateModelIntoCSP j'ai chaque configuration dupliqué par 8
		
		reason(deploymentBuilder);
		long endTime = System.currentTimeMillis();
	    System.out.println("Total execution time: " + (endTime-startTime) + "ms"); 
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
	//frechly addede by amal 22-04-2016
//	public static NodeFeature createNodefromFeature(Feature F){
//		nodeFeatures = retrieveFeatureFromFM(node);
//	FeatCardinality fc = F.getFeatureCardinality();
//	NodeFeature NF	 = FeatureModelFactory.eINSTANCE.createNodeFeature();
//	System.out.println("create einstance");
//	String fName = F.getName();
//	NF.setName(fName);
//	NF.setNodeCardinalities(fc);
//	AttributeDeployment attdep = null;
//	NF.setNodeAttributes(attdep);
//	System.out.println("Deployment Node added:" + NF.getName());
//  return NF ;
//	}
//	private void generateImplies(Feature fromFeature, Feature toFeature) {
//		Feature appFM = retrieveRootFromFM(node);
//		Implies implies = FeatureModelFactory.eINSTANCE.createImplies();
//		implies.setFrom(fromFeature);
//		implies.setTo(toFeature);
//		//AppfeatureModel.getFmConstraints().add(implies);
//	}
	

	private static Constraint OnMatch(EObject app , EObject node) {
		

	List<Attribute> nodeAttributes = new ArrayList<Attribute>();
	List<Attribute> appAttributes = new ArrayList<Attribute>();
	//Feature cloud = retrieveRootFromFM(node);

		 nodeFeatures = retrieveFeatureFromFM(node);
		 appFeatures = retrieveFeatureFromFM(app);
		 appAttributes = retrieveAttributeFromFM(app);
		 nodeAttributes= retrieveAttributeFromFM(node);
		//nodeAttributes = retrieveAttributeFromFM(node);
		for (int i=0; i<appAttributes.size(); i++) {
			//System.out.println("boucle appattr" + i);
			for (int j=0; j<nodeAttributes.size(); j++) {
				//System.out.println("boucle nodeattr" + j);
				if (appAttributes.get(i).getName().equals(nodeAttributes.get(j).getName()) | 
						nodeAttributes.get(j).getName().equals(appAttributes.get(i).getName())) {
					// parentFeature = ((Feature) (appAttributes.get(j).eContainer()));
					 //System.out.println("parentFeature.eContainer()" + parentFeature.);
									
						//System.out.println("rootFeature.eContainer()" + rootFeature.eContainer()); 
								
					}
					
				
					System.out.println("Find Match : " + appAttributes.get(j).getName() + "  parentFeature " 
							+ parentFeature.getName() + "in the node FM " + ( nodeFeatures.get(0)).getName());
					if (MatchingList.containsKey(parentFeature) && MatchingList.containsValue(nodeFeatures.get(0))) {
						//System.out.println(" parentFeature already found");
						System.out.println(MatchingList.size());
					}
					else 
					MatchingList.put(parentFeature, nodeFeatures.get(0));
					
					//parentFeature.getNodeFeature().get(0).setName(nodeFeatures.get(0).getName());
					//deploymentBuilder.features.add(parentFeature);
					//deploymentBuilder.features.add(nodeFeatures.get(0));
					
					//deploymentBuilder.translateFeaturesIntoCSP(nodeFeatures.get(0));
					// quand j'appelle cette méthod ela cxardinalité de Aa devient 3 et j'aurai 24 configurations
					//deploymentBuilder.translateFeaturesIntoCSP(parentFeature);
					//
					
					
				}	
				//else 
				//	System.out.println("No Match found: ");
			}
	
	
			
	//}
		
		
	//public static Constraint addConstraint (Map<Feature, Feature> ml){
		for (Entry<Feature, Feature> entry : MatchingList.entrySet()) {
			
		System.out.println("Matching algorithm "+ entry.getKey().getName() + " " + entry.getValue().getName() );
		//String nodename= entry.getValue().getName() ;
		//if (entry.getKey().getNodeFeature() == null){}
		//test 1
		EStructuralFeature NF = nodeFeatures.get(0).eContainingFeature();
		//text2
		Feature NF1 = nodeFeatures.get(0);
		NodeFeature feature = FeatureModelFactory.eINSTANCE.createNodeFeature();
		feature.setName(NF1.getName());
		feature.setHostedBy(entry.getKey(), feature);
		
		NF1.getName();
//		List<Attribute> attributesNF1 = new ArrayList<Attribute>(); 
//		
//		for (int i=0; i<NF1.getAttributes().size(); i++){
//			
//		}
		String nodename = NF.getName(); // returns rootFeature
		//ici est un pb
		//nodenew = (NodeFeature) NF1; 
		
       //nodenew = null;
      // nodenew.setName(nodename); 
       //start here 18-01
			System.out.println("node feature:" + nodeFeatures.get(0));
			System.out.println("node name:" + nodename);
			//createNodefromFeature(nodeFeatures.get(0));
			
			//nodenew.setNodeCardinalities(value);
			//deploymentBuilder.nodefeatures.add(nodenew);
		
//		 parent1 = deploymentBuilder.getCSPVariableFromFeature(entry.getKey());
//		System.out.println(parent1.getName());
//
//		node1 = deploymentBuilder.getCSPVariableFromNodeFeature(nodenew);
//		System.out.println(parent1.getName());
		 //c = LCF.ifThen_reifiable(ICF.arithm(node1, ">", 0) , ppos);
		}
		
		
		//Constraint ppos = ICF.arithm(parent1, ">", 0);
		//node1 = VF.bounded(entry.getValue().getName(), 0, entry.getValue().getFeatureCardinality().getCardinalityMax(), deploymentBuilder.solver); ;
		// System.out.println(node1.getName());
		// a revoir next ligne car elle génère 3 features dans la même configuration.
//		deploymentBuilder.translateFeaturesIntoCSP(entry.getValue()); // va ajouter constarint ou 
//		deploymentBuilder.translateFeaturesIntoCSP(entry.getKey());
////		translateintoCSP(entry.getKey());
//		translateintoCSP(entry.getValue());
//		IntVar parent1 = deploymentBuilder.getCSPVariableFromFeature();
//		IntVar node1 = deploymentBuilder.getCSPVariableFromFeature(nodeFeatures.get(0));
	   
			//}
		return c;
	}
	
	
	
	private static Object getFeatureByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<Feature> retrieveFeatureFromFM(EObject featureModel) {		

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
	public static List<Attribute> retrieveAttributeFromFM(EObject featureModel) {		

		//TreeIterator <EObject> fmContent = (TreeIterator<EObject>) featureModel.eContents();
		TreeIterator<EObject> fmContent = (TreeIterator<EObject>) featureModel.eAllContents();
		List<Attribute> attributes1 = new ArrayList<Attribute>();
	
		//for(int i=0; i<fmContent.; i++) {
			//TreeIterator<EObject> fmContent = (TreeIterator<EObject>) featureModel.eAllContents();

			while (fmContent.hasNext()) {
			Object modelElement = fmContent.next();
			if (modelElement instanceof Attribute) {
				Attribute attribute = (Attribute) modelElement;
				//Feature parentFeature = ((Feature) (attribute.eContainer()));
				//System.out.println("parentFeature" + parentFeature.getName());
				//attrParentattr.put(parentFeature.getName(), attribute);
				attributes1.add(attribute);
				//System.out.println("attributes size: " + attributes.size());

				System.out.println("Attribute "+ attribute.getName());
				
			}
					
		}
		//return attrParentattr;
		return attributes1;
	}

	public static List<FMConstraint> retrieveConstraintFromFM(EObject featureModel) {		

		TreeIterator<EObject> fmContent = (TreeIterator<EObject>) featureModel.eAllContents();

		while (fmContent.hasNext()) {
			Object modelElement = fmContent.next();
			if (modelElement instanceof FMConstraint) {

				FMConstraint constraint = (FMConstraint) modelElement;
				fmConstraints1.add(constraint);
				System.out.println("fmConstraints size: " + fmConstraints1.size());
				//System.out.println("feature " +feature.getName());
			}

		}
		return fmConstraints1;
	}
	
	public static Feature retrieveRootFromFM(EObject featureModel) {		

		TreeIterator<EObject> fmContent = (TreeIterator<EObject>) featureModel.eAllContents();

		while (fmContent.hasNext()) {
			Object modelElement = fmContent.next();
			
				if (modelElement instanceof FeatureModel) {
				Feature rootFeature = ((FeatureModel) modelElement).getRootFeature();
				rootFeature.getName();
				//variable = VF.bounded(feature.getName(), 1, 1, solver);
			}
				
		}
		return rootFeature;
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
	
	public FMConstraint AddHostedBy (NodeFeature node, Feature fromFeature) {
		//create new Node Feature in the application model
		HostedBy hostedBy = FeatureModelFactory.eINSTANCE.createHostedBy();
		hostedBy.setTo(node); 
		hostedBy.setFrom(fromFeature);
		fmConstraints1.add(hostedBy);
		return hostedBy;
	}
	private void writeConstraint(PrintWriter bufferedWriter, FMConstraint constraint) {
//		String xmiFrom = buildXMIStringForFeatureReference(((BooleanConstraint) constraint).getFrom());
//		String xmiTo = buildXMIStringForFeatureReference(((BooleanConstraint) constraint).getTo());		
//		bufferedWriter.println("<constraints " + getConstraintType(constraint) + " from=\"" + xmiFrom + " to=\"" + xmiTo + ">");
//		bufferedWriter.println(LEVEL);
//		if (constraint instanceof Requires) {
//			Requires requires = (Requires) constraint;
//			writeCardRequires("From", requires.getCardFrom(), bufferedWriter);
//			writeCardRequires("To", requires.getCardTo(), bufferedWriter);
//		}
		bufferedWriter.println("</constraints>");
	}
	
private String getConstraintType(FMConstraint constraint) {		
	if (constraint instanceof Requires) {
		return HOSTEDBY;
	}
	if (constraint instanceof Implies) {
		return NOTHOSTEDBY;
	}
	return "";
}
}
//	public static void translateintoCSP(Feature feature) {
//	IntVar variable;
//	
//	FeatCardinality featureCardinality = feature.getFeatureCardinality();
//	variable = VF.bounded(feature.getName(), 0, featureCardinality.getCardinalityMax(), deploymentBuilder.solver);
//
//	if (featureCardinality.getConfigValue() == -1) {
//		// Feature unwanted, i.e deselected
//		deploymentBuilder.cspConstraints.add(ICF.arithm(variable, "=", 0));
//	} else if (featureCardinality.getConfigValue() != 0) {
//		deploymentBuilder.cspConstraints.add(
//				ICF.arithm(variable, ">=", featureCardinality.getConfigValue()));
//	}
//	}
