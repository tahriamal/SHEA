/*
 * FMGenerator.java
 *
 * v1.0
 *
 * 2014-02-20
 * 
 * Copyright Inria - Universit?????? de Lille 1
 */

package spe;

import random.RandomFMBuilder;
import featureModel.FeatureModel;
import fr.inria.saloon.core.solver.ConstraintBuilder;
import fr.inria.saloon.core.utils.ModelUtils;

public class SPE {

	// Maximum number of features in the FM
	private static final int nbFeatures = 10;

	// Upper bound of the cardinality to randomly assign
	private static final int cardMax = 5;

	// Maximum number of constraints in the FM
	private static final int nbConstraints = 1;

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		// Generate a random FM
		RandomFMBuilder fmBuilder = new RandomFMBuilder();
		fmBuilder.setCardMax(cardMax);
		fmBuilder.setNbConstraints(nbConstraints);
		fmBuilder.setNbFeatures(nbFeatures);
		fmBuilder.setConsistent(true);
		FeatureModel featureModel = fmBuilder.generateRandomFM();
		ModelUtils.save(featureModel);
		
		// Start the experiments
		ConstraintBuilder constraintBuilder = new ConstraintBuilder();
		
		// Measure time to translate from XMI to CSP
		long startXMITime = System.currentTimeMillis();
		constraintBuilder.translateModelIntoCSP(featureModel);
		long endXMITime   = System.currentTimeMillis();
		long xmiTotalTime = endXMITime - startXMITime;		
//		System.out.println("Time to write xmi into CSP: " + xmiTotalTime + "ms");
		
		// Measure time to find a solution
		long startSolvingTime = System.currentTimeMillis();
		boolean print = constraintBuilder.hasASolution();
		long endSolvingTime   = System.currentTimeMillis();
		long solvingTime = endSolvingTime - startSolvingTime;
//		System.out.println("Time to solve: " + solvingTime + "ms");
		
		// Total time
		long totalTime = System.currentTimeMillis() - startXMITime;
//		System.out.println("Time to write and solve: " + totalTime + "ms");
		
		if (print) {
			System.out.println(xmiTotalTime);
			System.out.println(solvingTime);
			System.out.println(totalTime);	
		} else {
			System.out.println("void");
		}
	}

}
