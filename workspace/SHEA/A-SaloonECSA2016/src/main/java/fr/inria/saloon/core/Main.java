package fr.inria.saloon.core;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import org.chocosolver.solver.variables.IntVar;
import org.eclipse.emf.ecore.EObject;

import fr.inria.saloon.core.solver.ConstraintBuilder;
import fr.inria.saloon.core.solver.DeploymentBuilder;
import fr.inria.saloon.core.utils.ModelUtils;

public class Main {

	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		EObject featureModel = loadFeatureModel(args);
//		ConstraintBuilder constraintBuilder = new ConstraintBuilder();
//		constraintBuilder.translateModelIntoCSP(featureModel);
//		reason(constraintBuilder);
//		//constraintBuilder.setProperties();
//		
//	}
//	
//	/**
//	 * Reason on the feature model configuration and display the related information
//	 * @param constraintBuilder
//	 */
//	private static void reason(ConstraintBuilder constraintBuilder) {
//		if (constraintBuilder.hasASolution()) {
//			displayFeedback(constraintBuilder);
//		} else {
//			System.out.println("No solution found");
//		}				
//	}
//
//	/**
//	 * Display one or several configurations for the FM
//	 * @param constraintBuilder
//	 */
//	private static void displayFeedback(ConstraintBuilder constraintBuilder) {
//		
//	 
//		boolean verbose = true;
//		if (verbose) {
//			constraintBuilder.displayAllSolutions();
//		}
//			else {
//			constraintBuilder.displayOneSolution();
//		}
//	}
//
//	/**
//	 * @param args is the name of the xmi file
//	 * @param args
//	 * @return
//	 */
//	private static EObject loadFeatureModel(String[] args) {
//		File fm = new File(args[0]);
//		EObject featureModel = ModelUtils.load(fm);
//		return featureModel;
//	}
//
//}
	public static void main(String[] args) {
		EObject featureModel = loadFeatureModel(args);
		DeploymentBuilder deploymentBuilder = new DeploymentBuilder();
		deploymentBuilder.translateModelIntoCSP(featureModel);
		reason(deploymentBuilder);}
	
	/**
	 * Reason on the feature model configuration and display the related information
	 * @param constraintBuilder
	 */
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
			constraintBuilder.displayOneSolution();
		}
	}

	/**
	 * @param args is the name of the xmi file
	 * @param args
	 * @return
	 */
	private static EObject loadFeatureModel(String[] args) {
		File fm = new File(args[0]);
		EObject featureModel = ModelUtils.load(fm);
		return featureModel;
	}

}