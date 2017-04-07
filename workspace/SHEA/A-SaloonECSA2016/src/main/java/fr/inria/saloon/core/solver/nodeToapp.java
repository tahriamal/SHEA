package fr.inria.saloon.core.solver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;







import javax.xml.parsers.*;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.chocosolver.solver.Solver;
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
import org.w3c.dom.NodeList;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import type.TypePackage;
import featureModel.Attribute;
import featureModel.FMConstraint;
import featureModel.Feature;
import featureModel.FeatureModel;
import featureModel.FeatureModelFactory;
import featureModel.FeatureModelPackage;
import featureModel.Implies;
import featureModel.NodeFeature;

public class nodeToapp {
	private static final String LEVEL = "<level xsi:type=\"cardSemantics:Global\" href=\"../CardSemantics.xmi#//@levels.0\"/>";
	public static	List<Feature> features1 = new ArrayList<Feature>();
	public	List<FMConstraint> fmConstraints = new ArrayList<FMConstraint>();
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
	long startTime = System.currentTimeMillis();

	private String xml;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		long startTime = System.currentTimeMillis();
		String app = "App.xmi" ;
		String node = "HAB.xml";
		//2nd method
		//File fmSource = new File(app);
		File destination = new File(app);
		
		FileWriter fileWriter = new FileWriter(destination, true);
		PrintWriter bufferedWriter = new PrintWriter(fileWriter);
		readXmiFile(bufferedWriter, destination, destination);
		//writeNodeFeature(bufferedWriter);
		
		//1st method
//		EObject AppfeatureModel = (EObject) loadModel(app);
//		EObject NodefeatureModel = (EObject) loadModel(node);
		//OnMatch(AppfeatureModel, NodefeatureModel);

		long endTime = System.currentTimeMillis();
	    System.out.println("Total execution time: " + (endTime-startTime) + "ms"); 
	}
	public static void verifyNodeExitence() throws XPathExpressionException, ParserConfigurationException, SAXException, IOException{ 
		String xml = " </rootFeature>";

		XPathFactory xpathFactory = XPathFactory.newInstance();
		XPath xpath = xpathFactory.newXPath();

		InputSource source = new InputSource(new StringReader(xml));
		Document doc = (Document) xpath.evaluate("/", source, XPathConstants.NODE);
		String status = xpath.evaluate("/resp/status", doc);
		String msg = xpath.evaluate("/resp/msg", doc);

		System.out.println("status=" + status);
		System.out.println("Message=" + msg);
	
		}
	private static void writeNodeFeature(PrintWriter bufferedWriter) {				
		bufferedWriter.println("<nodeFeature name=\"HAB\"> <NodeAttributes> <value xsi:type=\"type:EnumListValue\"> "+
	"<values value=\"1000\" id=\"CPU\"/> <values value=\"1024\" id=\"RAM\"/> </value>"+
  "</NodeAttributes> <NodeCardinalities cardinalityMin=\"1\" cardinalityMax=\"1\"/> </nodeFeature>");
	}
	
//	private void writeFeature(NodeFeature nodeFeature, PrintWriter bufferedWriter) {				
//		bufferedWriter.println("<" + "nodeFeature" + " name=\"" + nodeFeature.getName() + "\">");
//		writeNodeAttributes(bufferWriter, nodeAtt);
//		writeNodeFeatureCardinality(bufferedWriter, nodeFeature);
//		
//		
//		bufferedWriter.println("</" + type + ">");
//	}
	private void writeNodeFeatureCardinality(PrintWriter bufferedWriter, NodeFeature nodeFeature) {
		bufferedWriter.println("" +
				"<featureCardinality cardinalityMax=\""  + 
				"\" cardinalityMin=\"" + "\">" +
				LEVEL +
				"</featureCardinality>");
	}
	public static boolean readXmiFile(PrintWriter bufferedWriter, File source, File destination){ //Methode permettant la copie d'un fichier 
		boolean resultat = false; 

		// Declaration des flux 
		java.io.FileInputStream sourceFile=null; 
		java.io.FileOutputStream destinationFile=null; 
		try { 
		// Création du fichier : 
		//destination.createNewFile(); 
		// Ouverture des flux 
		sourceFile = new java.io.FileInputStream(source); 
		//destinationFile = new java.io.FileOutputStream(destination); 
		// Lecture par segment de 0.5Mo 
		byte buffer[]=new byte[512*1024]; 
		int nbLecture; 
		if( (nbLecture = sourceFile.read(buffer)) == -1 ) { 
		//destinationFile.write(buffer, 0, nbLecture); 
			//verifyNodeExitence();
			destinationFile.write(buffer, 0, nbLecture);
			writeNodeFeature(bufferedWriter); 
		} 

		// Copie réussie 
		resultat = true; 
		} catch( java.io.FileNotFoundException f ) { 
		} catch( java.io.IOException e ) { 
		} finally { }
		 
		return( resultat ); 
		}
	private void generateImplies(Feature fromFeature, Feature toFeature) {
		Implies implies = FeatureModelFactory.eINSTANCE.createImplies();
		implies.setFrom(fromFeature);
		implies.setTo(toFeature);
		fmConstraints.add(implies);
	}
	
	//public static NodeFeature createNodefromFeature(Feature F){
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
	
	private static Constraint OnMatch(EObject app , EObject node) {
		
		@SuppressWarnings("unchecked")
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
						 parentFeature = ((Feature) (appAttributes.get(j).eContainer()));
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
			NF1.getName();
//			List<Attribute> attributesNF1 = new ArrayList<Attribute>(); 
//			
//			for (int i=0; i<NF1.getAttributes().size(); i++){
//				
//			}
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
			
//			 parent1 = deploymentBuilder.getCSPVariableFromFeature(entry.getKey());
//			System.out.println(parent1.getName());
	//
//			node1 = deploymentBuilder.getCSPVariableFromNodeFeature(nodenew);
//			System.out.println(parent1.getName());
			 //c = LCF.ifThen_reifiable(ICF.arithm(node1, ">", 0) , ppos);
			}
			
			
			//Constraint ppos = ICF.arithm(parent1, ">", 0);
			//node1 = VF.bounded(entry.getValue().getName(), 0, entry.getValue().getFeatureCardinality().getCardinalityMax(), deploymentBuilder.solver); ;
			// System.out.println(node1.getName());
			// a revoir next ligne car elle génère 3 features dans la même configuration.
//			deploymentBuilder.translateFeaturesIntoCSP(entry.getValue()); // va ajouter constarint ou 
//			deploymentBuilder.translateFeaturesIntoCSP(entry.getKey());
////			translateintoCSP(entry.getKey());
//			translateintoCSP(entry.getValue());
//			IntVar parent1 = deploymentBuilder.getCSPVariableFromFeature();
//			IntVar node1 = deploymentBuilder.getCSPVariableFromFeature(nodeFeatures.get(0));
		   
				//}
			return c;
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
		public static List retrieveAttributeFromFM(EObject featureModel) {		

			//List <EObject> fmContent = featureModel.eContents();
			List<Attribute> attributes1 = new ArrayList<Attribute>();
		
			//for(int i=0; i<fmContent.size(); i++) {
				TreeIterator<EObject> fmContent = (TreeIterator<EObject>) featureModel.eAllContents();

				while (fmContent.hasNext()) {
				Object modelElement = fmContent.next();
				if (modelElement instanceof Attribute) {
					Attribute attribute = (Attribute) modelElement;
					Feature parentFeature = ((Feature) (attribute.eContainer()));
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

		public static List retrieveConstraintFromFM(EObject featureModel) {		

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
					//variable = VF.bounded(feature.getName(), 1, 1, solver);
				}
					
			}
			return rootFeature;
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static EObject loadModel(String path) {
		TypePackage.eINSTANCE.eClass(); 
		FeatureModelPackage.eINSTANCE.eClass(); 
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());  
		ResourceSet rs = new ResourceSetImpl();
		Resource r = rs.getResource(URI.createFileURI((new File(path)).getAbsolutePath()), true);
		
		try {
			r.load(null);
			EcoreUtil.resolveAll(r); 
			for (Resource.Diagnostic d : r.getWarnings()) {
				System.out.print(d.toString());}
			for (Resource.Diagnostic d : r.getErrors()) {
				System.out.print(d.toString());}
			if (r.isLoaded() && r.getContents().size() > 0) {
				TreeIterator<EObject> tree = (TreeIterator<EObject>) r.getAllContents();
				// The returned tree first element is the root Feature.
				// Without next(), the tree first element would be the container package.
				return tree.next();}}
		catch (IOException e) {
			e.printStackTrace(); 
			return null; }
		return null;}
}
