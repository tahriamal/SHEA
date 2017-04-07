import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import type.TypePackage;
import featureModel.Feature;
import featureModel.FMConstraint;
import featureModel.FeatureModelPackage;
import fr.inria.saloon.core.solver.DeploymentBuilder;

public class RandomExample {
	static String app = "src/main/resources/model/AppSecurity.xmi" ;
	static EObject AppfeatureModel = (EObject) loadModel(app);
	private Random random = new Random();
	static List <Feature> dpFeatures = new ArrayList<Feature>();
	static List <Feature> featuresVar= new ArrayList<Feature>();
	static List <FMConstraint> dpConstraints = new ArrayList<FMConstraint>();
	static int index ;
	
	public static void main(String[] args) {
		DeploymentBuilder db = new DeploymentBuilder();
		db.retrieveCSPElementsFromFM(AppfeatureModel);
		for(int i=0; i<db.features.size(); i++){
		if (dpFeatures.get(i).getFeatureCardinality().getCardinalityMin()== 0){
			index ++;
			System.out.println("FeatureName" + db.features.get(i).getName());
			featuresVar.add(db.features.get(i));
		} else{
			
		}
		
		db.translateFeaturesIntoCSP(db.features.get(i));}
		
		for(int i=0; i<db.fmConstraints.size(); i++){
			System.out.println("Constraints" + db.fmConstraints.get(i));
			dpConstraints.add(db.fmConstraints.get(i));
		}

		RandomExample obj = new RandomExample();
		for(int i = 0; i < index; i++){
			System.out.println(obj.getRandomList(db.features));
		}
		
	}

	public Feature getRandomList(List<Feature> features) {

	    //0-4
	    int index = random.nextInt(features.size());
	    System.out.println("\nIndex :" + index );
	    return features.get(index);
	    
	}
	
public static void proprtiesWrite(){
	Properties prop = new Properties();
	OutputStream output = null;

	try {

		output = new FileOutputStream("config.properties");

		// set the properties value
		prop.setProperty("database", "localhost");
		prop.setProperty("dbuser", "mkyong");
		prop.setProperty("dbpassword", "password");

		// save properties to project root folder
		prop.store(output, null);

	} catch (IOException io) {
		io.printStackTrace();
	} finally {
		if (output != null) {
			try {
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

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
}
