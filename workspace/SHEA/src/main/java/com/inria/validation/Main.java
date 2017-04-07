package com.inria.validation;


/*
 * FMGenerator.java
 *
 * v1.0
 *
 * 2014-02-20
 * 
 * Copyright Inria - Universit?????? de Lille 1
 */

//import random.RandomFMBuilder;
import java.io.File;
import java.io.IOException;

import featureModel.Cardinality;
import featureModel.FeatureModel;
import fr.inria.saloon.core.solver.ConstraintBuilder;
import fr.inria.saloon.core.utils.ModelUtils;
import fr.inria.saloon.validation.splc.BR4CPBuilder;
import fr.inria.saloon.validation.splc.HalfRandomFMBuilder;

public class Main {
	private static final int nbFMs = 10;

	// Maximum number of features in the FM
	private static final int nbFeatures = 10;

	// Upper bound of the cardinality to randomly assign
	private static final int cardMax = 4;

	// Maximum number of constraints in the FM
	private static final int nbConstraints = 1;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String dirPath = "src/generated" + nbFMs + "/";

		for (int i = 0; i < nbFMs; i++) {
			// Generate a random FM
			HalfRandomFMBuilder fmBuilder = new HalfRandomFMBuilder();
			fmBuilder.setCardMax(cardMax);
			fmBuilder.setNbConstraints(nbConstraints);
			fmBuilder.setNbFeatures(nbFeatures);
			fmBuilder.setConsistent(false);

			FeatureModel featureModel = fmBuilder.generateRandomFM();

			//		File fm = new File("src/main/resources/model/hgic.xmi");
			//		EObject featureModel = ModelUtils.load(fm);

			//		fmBuilder.addGIC(featureModel);		
			fmBuilder.addHGIC((FeatureModel) featureModel);

			//		ModelUtils.save(featureModel);

			File f;
			f = new File(dirPath + "amal" + i + ".txt");
			if (!f.getParentFile().exists()) {
				f.getParentFile().mkdirs();
			}
			if (!f.exists()) {
				try {
					f.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}	
			}
			BR4CPBuilder br4cpBuilder = new BR4CPBuilder();
			br4cpBuilder.translateModelIntoCSP(featureModel);	
			br4cpBuilder.writeToFile(f);
			//			System.out.println("Done");
		}

		int cpt = 0;
		double totalTime = 0;
		File dir = new File(dirPath);
		System.out.println(dir.listFiles().length);
//		for (int i = 0; i < dir.listFiles().length; i++) {
//			try {
//				Br4cpCLI br4cpCLI = new Br4cpCLI(dirPath + "hgic" + i + ".txt", null);
//
//				if (br4cpCLI.getNonGICValues().size() > 0) {
//					totalTime += br4cpCLI.getTimeForMaintainingGIC();
//					cpt++;
//				}
//
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		System.out.println("Total time " + totalTime);
		System.out.println("Average time " + totalTime/cpt);
	}
}