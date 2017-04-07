package fr.inria.saloon.validationECSA;
import java.io.File;
import java.io.IOException;

import featureModel.FeatureModel;
import fr.inria.saloon.core.solver.ConstraintBuilder;
import fr.inria.saloon.core.utils.ModelUtils;
import fr.inria.saloon.validation.splc.HalfRandomFMBuilder;

public class TestECSA2016 {
		
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
			String dirPath = "C:/validation/" + nbFMs + ":";

			for (int i = 0; i < nbFMs; i++) {
				// Generate a random FM
				HalfRandomFMBuilder fmBuilder = new HalfRandomFMBuilder();
				fmBuilder.setCardMax(cardMax);
				fmBuilder.setNbConstraints(nbConstraints);
				fmBuilder.setNbFeatures(nbFeatures);
				fmBuilder.setConsistent(false);

				FeatureModel featureModel = fmBuilder.generateRandomFM();

				ModelUtils.save(featureModel);
				
				// Start the experiments
				ConstraintBuilder constraintBuilder = new ConstraintBuilder();
				
				// Measure time to translate from XMI to CSP
				long startXMITime = System.currentTimeMillis();
				constraintBuilder.translateModelIntoCSP(featureModel);
				long endXMITime   = System.currentTimeMillis();
				long xmiTotalTime = endXMITime - startXMITime;		
//				System.out.println("Time to write xmi into CSP: " + xmiTotalTime + "ms");
				
				// Measure time to find a solution
				long startSolvingTime = System.currentTimeMillis();
				boolean print = constraintBuilder.hasASolution();
				long endSolvingTime   = System.currentTimeMillis();
				long solvingTime = endSolvingTime - startSolvingTime;
//				System.out.println("Time to solve: " + solvingTime + "ms");
				
				// Total time
				long totalTime = System.currentTimeMillis() - startXMITime;
//				System.out.println("Time to write and solve: " + totalTime + "ms");
				
				if (print) {
					System.out.println(xmiTotalTime);
					System.out.println(solvingTime);
					System.out.println(totalTime);	
				} else {
					System.out.println("void");
				}
			}

		}
}

