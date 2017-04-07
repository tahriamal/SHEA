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


public class Matching010716 {
	static public void main(String args[]){

	 
	String fmPath = "SecurityApp.xmi";
	String fmdesitination = "App.xmi";
	String nodeCloud = "Cloud.xmi";
	String nodeHAB = "HAB.xmi";
	EObject AppfM = (EObject) loadModel(fmPath);
	EObject cloudFM = (EObject) loadModel(nodeCloud);
	EObject HABFM = (EObject) loadModel(nodeHAB);
	List<Feature> HABFeature = retrieveFeatureFromFM(HABFM);
	String nameRoot = HABFeature.get(0).getName();
	System.out.println("Name "+ nameRoot); }
	
	
	
	
	public static List<Feature> retrieveFeatureFromFM(EObject featureModel) {		
		List<Feature> features = new ArrayList<Feature>();
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