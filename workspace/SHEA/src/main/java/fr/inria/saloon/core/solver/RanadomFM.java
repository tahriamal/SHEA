package fr.inria.saloon.core.solver;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import type.TypePackage;
import featureModel.Feature;
import featureModel.FeatureModel;
import featureModel.FeatureModelPackage;

public class RanadomFM {
	//List of FM features 
		private static	List<Feature> features = new ArrayList<Feature>();

	    
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
	    public void save(FeatureModel g, File f) {
	  ResourceSet  rs = new ResourceSetImpl ();
	  
	  Resource.Factory.Registry  registry = rs.getResourceFactoryRegistry ();
	  Map <String, Object > m = registry.getExtensionToFactoryMap ();
	  m.put("xmi ",new XMIResourceFactoryImpl ());
	  m.put("ecore",new EcoreResourceFactoryImpl ());
	  //rs.getPackageRegistry().put(GraphPackage.eNS_URI , GraphPackage.eINSTANCE );
	  rs.getPackageRegistry().put(FeatureModelPackage.eNS_URI , FeatureModelPackage.eINSTANCE );
	  rs.getPackageRegistry().put(TypePackage.eNS_URI , TypePackage.eINSTANCE );
	  Resource  packageResource = rs.createResource(URI.createFileURI("model/Graph.ecore"));
	  packageResource.getContents (). add(FeatureModelPackage.eINSTANCE );
	  packageResource.getContents (). add(TypePackage.eINSTANCE );
	  //TypePackage.eINSTANCE.eClass(); 
	  //FeatureModelPackage.eINSTANCE.eClass(); 
	  try
	   { packageResource.load(null);}
	  catch
	   (IOException  e1) { e1.printStackTrace (); }
	  URI  uri = URI.createFileURI(f.getAbsolutePath ());
	  Resource  resource = rs.createResource(uri);
	  resource.getContents().add(g);
	  try
	   { HashMap <String , Boolean > options = new HashMap <String , Boolean >();
	  options.put(XMIResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
	  resource.save(options);}
	   catch
	   (IOException e) { e.printStackTrace (); }
	  }
	    
		public static List retrieveFeatureFromFM(EObject featureModel) {		

			TreeIterator<EObject> fmContent = (TreeIterator<EObject>) featureModel.eAllContents();
			while (fmContent.hasNext()) {
				Object modelElement = fmContent.next();
				//EStructuralFeature EstF = fmContent.
				//EObject reference = ((EObject) fmContent).eGet();
				if (modelElement instanceof Feature) {
					Feature feature = (Feature) modelElement;
					features.add(feature);


					//System.out.println("feature " +feature.getName());
				}

			}
			return features;
		}
		
	

//    eResource()
//    eContainer()
//    eContainingFeature()
//    eContainmentFeature()
//    eContents()
//    eAllContents()
//    eCrossReferences()
public static void main(String[] args) {
}
}
