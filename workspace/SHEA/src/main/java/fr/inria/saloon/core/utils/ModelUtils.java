/*
 * ModelUtils.java
 *
 * v1.0
 *
 * 2014-02-20
 * 
 * Copyright Inria - Universit�� de Lille 1
 */

package fr.inria.saloon.core.utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import type.TypePackage;
import featureModel.FeatureModelPackage;


public class ModelUtils {

	/**
	 * Load an application model (XMI file) and return the corresponding object
	 * @param f The XMI file representing the model to load
	 * @return 
	 */
	public static EObject load(File f) {
		ResourceSet rs = new ResourceSetImpl(); 
		Resource.Factory.Registry registry = rs.getResourceFactoryRegistry();
		Map<String,Object> m = registry.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());
		rs.getPackageRegistry().put(FeatureModelPackage.eNS_URI, FeatureModelPackage.eINSTANCE);
		rs.getPackageRegistry().put(TypePackage.eNS_URI, TypePackage.eINSTANCE);
		URI uri = URI.createFileURI(f.getAbsolutePath());
		Resource resource = rs.getResource(uri, true);
		if (resource.isLoaded() && resource.getContents().size() > 0) {
			TreeIterator<EObject> tree = (TreeIterator<EObject>) resource.getAllContents();

			// The returned tree first element is the root Feature.
			// Without next(), the tree first element would be the container package.
			return tree.next();
		}
		return null;
	}
	
	/**
	 * Save an FM model (XMI file)	
	 * @param featureModel the FM model to save
	 * @return
	 */
	public static void save(EObject featureModel) {
		// Create a resource set.
		ResourceSet rs = new ResourceSetImpl(); 
		Resource.Factory.Registry registry = rs.getResourceFactoryRegistry();
		Map<String,Object> m = registry.getExtensionToFactoryMap(); 
		m.put("xmi", new XMIResourceFactoryImpl());
		m.put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE); // Very useful, add the xsi:location
		rs.getPackageRegistry().put(FeatureModelPackage.eNS_URI, FeatureModelPackage.eINSTANCE);
		rs.getPackageRegistry().put(TypePackage.eNS_URI, TypePackage.eINSTANCE);

		String filePath = "src/main/resources/model/generated.xmi";
		File fmFile = new File(filePath);

		// Get the URI of the model file.
		URI fileURI = URI.createFileURI(fmFile.getAbsolutePath());

		// Create a resource for this file.
		Resource resource = rs.createResource(fileURI);

		// Add the model objects to the contents.
		resource.getContents().add(featureModel);

		// Save the contents of the resource to the file system.
		try
		{
			resource.save(m); // the map can pass special saving options to the operation
		} catch (IOException e) {
			/* error handling */
		}
		
		//return load(fmFile);
	}
}
