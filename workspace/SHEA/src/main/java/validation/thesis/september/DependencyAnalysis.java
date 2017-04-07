package validation.thesis.september;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.constraints.ICF;
import org.chocosolver.solver.constraints.LCF;
import org.chocosolver.solver.variables.IntVar;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import type.TypePackage;
import featureModel.BooleanConstraint;
import featureModel.Colocated;
import featureModel.Excludes;
import featureModel.FMConstraint;
import featureModel.Feature;
import featureModel.FeatureModel;
import featureModel.FeatureModelPackage;
import featureModel.HostedBy;
import featureModel.Implies;
import featureModel.NodeFeature;
import featureModel.NotHostedBy;
import featureModel.ResourceVerification;
import featureModel.Separated;
import fr.inria.saloon.core.solver.DeploymentBuilder;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class DependencyAnalysis {
	
	private static Feature rootFeature;
	private static List<Feature> features = new ArrayList<Feature>();
	private static List<FMConstraint> fmConstraint = new ArrayList<FMConstraint>();
	static Map<Feature, FMConstraint> featset = new HashMap<Feature, FMConstraint> ();
	static Map<NodeFeature, List<Feature>> DeploySet = new HashMap<NodeFeature, List<Feature>>();
	public static Map<String, IntVar> featNameToVariables = new HashMap<String,IntVar>();
	static String app = "AppSecurity.xmi" ;
	static String node = "HAB.xml"; 
	// List of CSP constraints 
		public static	List<Constraint> cspConstraints = new ArrayList<Constraint>();
	
	public static void main(String[] args) {
		EObject AppfeatureModel = (EObject) loadModel(app);
		//EObject NodefeatureModel = (EObject) loadModel(node);
		DependencyAnalysis rd = new DependencyAnalysis();
		List<String> listF = rd.getConfiguration();
		Iterator itListF = listF.iterator();
		while (itListF.hasNext()){
			
		String name = (String) itListF.next();
		retrieveFeatureFromFM(AppfeatureModel, name);}
		DeploymentBuilder deploymentBuilder = new DeploymentBuilder();
		deploymentBuilder.translateModelIntoCSP(AppfeatureModel);
		//reason(deploymentBuilder);
	}
	
	private List<String> getConfiguration(){
		Properties prop = new Properties();
		List<String> enumm;
		List <String> proplist = new ArrayList<String>();
		InputStream input = null;
	 
		try {
	 
			input = new FileInputStream("config.properties");
	 
			// load a properties file
			prop.load(input);
	 
			// get the property value and print it out

 Enumeration<?> e = prop.propertyNames();
 for (int i =0; i<=prop.size(); i++){
	 
	while (e.hasMoreElements()) {
		//comme je n'ai pas défini de valeur pour chaque element. 
		String key = (String) e.nextElement();
		String value = prop.getProperty(key);
		System.out.println( "key : " + key);
	 proplist.add(key);
	}
 }
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return proplist;
		
	}
	
	public static List retrieveFeatureFromFM(EObject featureModel, String name) {		

		TreeIterator<EObject> fmContent = (TreeIterator<EObject>) featureModel.eAllContents();

		while (fmContent.hasNext()) {
			Object modelElement = fmContent.next();
			if (modelElement instanceof Feature) {
				Feature feature = (Feature) modelElement;
				if(feature.getName().equals(name))
					System.out.println("found"+feature.getName() );
				features.add(feature);
				
			}

		}
		return features;
	}
	private Feature getFeaturefromListFeatures(List<Feature> listfeatures, String name){
		Feature feature = null ;
		Iterator it = listfeatures.iterator();
		while(it.hasNext()){
			Object modelElement = it.next();
			if (modelElement instanceof Feature){
				 feature = (Feature) modelElement;
				if (feature.getName().equals(name))
					return feature;
				else return null;
			}
		}
		return feature;
		
		
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
	public static List<FMConstraint> retrieveConstraintFromFM(EObject featureModel) {		
				
		TreeIterator<EObject> fmContent = (TreeIterator<EObject>) featureModel.eAllContents();

		while (fmContent.hasNext()) {
			Object modelElement = fmContent.next();
			if (modelElement instanceof FMConstraint) {

				FMConstraint constraints = (FMConstraint) modelElement;
			
				fmConstraint.add(constraints);
				System.out.println("fmConstraints size: " + fmConstraint.size());
				//System.out.println("feature " +feature.getName());
				}
		}
		return fmConstraint;
	}
	public static Map<Feature,FMConstraint> verifyConstraints(List<FMConstraint> fmConstraint, String name){
				
			Feature from;
			Feature to;
			Feature fromAgain;
			for (FMConstraint constraint : fmConstraint) {

					if (constraint instanceof BooleanConstraint) {
						System.out.println("Building a boolean constraint");
						buildBooleanConstraint(constraint);
						///buildBooleanConstraint(constraint);
						from = ((BooleanConstraint) constraint).getFrom();
						System.out.println("from "+from.getName());
						to = ((BooleanConstraint) constraint).getTo();
						System.out.println("to "+ to.getName());
						if(from.getName().equals(name)){
							featset.put(from, constraint);}
							else if(to.getName().equals(name)){
								featset.put(to, constraint);}
					}
					else if (constraint instanceof Colocated){
						//buildColocatedConstraint(constraint);
					} else if (constraint instanceof HostedBy){
						//buildHostedByConstraint(constraint);
					} else if (constraint instanceof Separated) {
						//buildSeparatedConstraint(constraint);
					} else if (constraint instanceof ResourceVerification){
						//buildResourceVerificationConstraint(constraint) ;
					} else if (constraint instanceof NotHostedBy) {
						//buildNotHostedByConstraint(constraint);
					}
				}
			return featset;
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
	
	private static void buildBooleanConstraint(FMConstraint constraint) {
		Feature fromFeature, toFeature;
		fromFeature = ((BooleanConstraint) constraint).getFrom();
		System.out.println("fromBoolean "+fromFeature.getName());
		toFeature = ((BooleanConstraint) constraint).getTo();
		System.out.println("toBoolean "+ toFeature.getName());
		if (constraint instanceof Implies) {
			Implies implies = (Implies) constraint;
			cspConstraints.add(LCF.ifThen_reifiable(ICF.arithm(getCSPVariableFromFeature(fromFeature), ">", 0), 
					ICF.arithm(getCSPVariableFromFeature(toFeature), ">", 0)));
		} else if (constraint instanceof Excludes) {
			Excludes excludes = (Excludes) constraint;
			cspConstraints.add(LCF.ifThen_reifiable(ICF.arithm(getCSPVariableFromFeature(fromFeature), ">", 0), 
					ICF.arithm(getCSPVariableFromFeature(toFeature), "=", 0)));
		} 
	}
	public static IntVar getCSPVariableFromFeature(Feature feature) {
		return featNameToVariables.get(feature.getName());
	}
	}
