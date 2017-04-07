package fr.inria.saloon.validation.splc;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import featureModel.BooleanConstraint;
import featureModel.FMConstraint;
import featureModel.FeatCardinality;
import featureModel.Feature;
import featureModel.FeatureModel;
import featureModel.Functional;
import featureModel.Implies;
import featureModel.RangeOperation;
import featureModel.Requires;

public class BR4CPBuilder {
	
	// List of FM features 
	private	List<Feature> features = new ArrayList<Feature>();

	// List of FM constraints 
	private	List<FMConstraint> fmConstraints = new ArrayList<FMConstraint>();
	
	private List<String> br4cpConstraints = new ArrayList<String>();
	
	private List<String> br4cpVariables = new ArrayList<String>();

	public BR4CPBuilder() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Call every required methods to translate the XMI FM
	 * into a BR4CP model to be solved
	 * @param featureModel
	 */
	public void translateModelIntoCSP(EObject featureModel) {
		retrieveCSPElementsFromFM(featureModel);
		translateFeaturesIntoVariables();
		translateFeaturesRelationshipsIntoConstraints();
		translateConstraintsIntoConstraints();
	}

	/**
	 * Get the list of features, constraints and attributes from the XMI FM
	 * @param featureModel
	 * @return
	 */
	private void retrieveCSPElementsFromFM(EObject featureModel) {		

		TreeIterator<EObject> fmContent = (TreeIterator<EObject>) featureModel.eAllContents();

		while (fmContent.hasNext()) {
			Object modelElement = fmContent.next();
			if (modelElement instanceof Feature) {
				Feature feature = (Feature) modelElement;
				features.add(feature);

			} else if (modelElement instanceof FMConstraint) {
				FMConstraint constraint = (FMConstraint) modelElement;
				fmConstraints.add(constraint);
			} 
		}
	}

	private void translateFeaturesIntoVariables() {
		FeatCardinality featureCardinality;
		int min, max;
		String varName;
		
		br4cpVariables.add("/* Variables */");
		for (Feature feature : features) {
			varName = feature.getName();
			if (feature.eContainer() instanceof FeatureModel) {
				String varString = "#(1,1,[" + varName + ".1]);";
				br4cpVariables.add(varString);
			} else {
				featureCardinality = feature.getFeatureCardinality();
				min = featureCardinality.getCardinalityMin();
				max = featureCardinality.getCardinalityMax();
				
				if (isFeatureSourceOfFunctionalHGIC(varName)) {
					Feature parentFeature = (Feature) feature.eContainer();
					max = max * parentFeature.getFeatureCardinality().getCardinalityMax();
					createFictiveVariableHGIC(feature, parentFeature);
					createFictiveConstraintsHGIC(feature, parentFeature);
				}
				
				String varString = "#(1,1,[" + varName + "." +  min;
				for (int i = min+1; i <= max; i++) {
					varString = varString + "," + varName + "." +  i;
				}
				varString = varString + "]);";
				br4cpVariables.add(varString);
			}			
		}
	}
	
	private void createFictiveVariableHGIC(Feature feature, Feature parentFeature) {
		String featName = feature.getName();
		String parentName = parentFeature.getName();
		String varName = featName + parentName;
		
		int featureMax = feature.getFeatureCardinality().getCardinalityMax();
		int featureMin = feature.getFeatureCardinality().getCardinalityMin();
		int parentMax = parentFeature.getFeatureCardinality().getCardinalityMax();
		int parentMin = parentFeature.getFeatureCardinality().getCardinalityMin();
		
		String varString = "#(1,1,[" + varName + "." +  featureMin + parentMin;
		for (int i = featureMin; i <= featureMax; i++) {
			for (int j = parentMin; j <= parentMax; j++) {
				if (!(j == 0)) {
					varString = varString + "," + varName + "." + i + j;
				}	
			}
		}
		varString = varString + "]);";
		br4cpVariables.add(varString);
	}
	
	private void createFictiveConstraintsHGIC(Feature feature, Feature parentFeature) {
		String featName = feature.getName();
		String parentName = parentFeature.getName();
		String varName = featName + parentName;
		
		int featureMax = feature.getFeatureCardinality().getCardinalityMax();
		int featureMin = feature.getFeatureCardinality().getCardinalityMin();
		int parentMax = parentFeature.getFeatureCardinality().getCardinalityMax();
		int parentMin = parentFeature.getFeatureCardinality().getCardinalityMin();
		
		br4cpConstraints.add("\n/* Add constraints for HGIC variable " + varName + " */");
		for (int i = featureMin; i <= featureMax; i++) {
			for (int j = parentMin; j <= parentMax; j++) {
				if (!(j == 0 & i > 0)) {
					br4cpConstraints.add("(" + varName + "." + i + j + " => " + featName + "." + i*j + ");");
				}	
			}
		}
	}
	
	private boolean isFeatureSourceOfFunctionalHGIC (String featureName) {
		boolean hgic = false;
		for (FMConstraint constraint : fmConstraints) {
			if (constraint instanceof Functional) {
				if (((Functional) constraint).getFrom().getName().equals(featureName)) {
					if (((Functional) constraint).getFrom().eContainer() instanceof Feature) {
						Feature parent = (Feature) ((Functional) constraint).getFrom().eContainer(); 
						if (parent.getFeatureCardinality().getCardinalityMax() > 1) {
							hgic = true;
						}
					}
				}
			}
		}
		return hgic;
	}
	
	private void translateFeaturesRelationshipsIntoConstraints() {
		br4cpConstraints.add("\n/* Child-Parent relationships */");
		
		for (Feature feature : features) {
			if (feature.eContainer() instanceof FeatureModel) {
				// Root
			} else {
				Feature parentFeature = (Feature) feature.eContainer();
				String parentName = parentFeature.getName();
				String featName = feature.getName();
				int parentCardinalityMin = parentFeature.getFeatureCardinality().getCardinalityMin();
				int parentCardinalityMax = parentFeature.getFeatureCardinality().getCardinalityMax();
				int featureCardinalityMin = feature.getFeatureCardinality().getCardinalityMin();
				int featureCardinalityMax = feature.getFeatureCardinality().getCardinalityMax();
				
				if (featureCardinalityMin == 0) {
					// Optional feature
					if (parentCardinalityMin == 0) {
						br4cpConstraints.add("(-" + featName + ".0 => -" + parentName + ".0);");
					} else {
						String constraint = "(" + parentName + "." + parentCardinalityMin;
						for (int i = parentCardinalityMin + 1; i <= parentCardinalityMax; i++) {
							constraint = constraint + " | " + parentName + "." + i;
						}
						constraint = constraint + ")";
						br4cpConstraints.add("(-" + featName + ".0 => " + constraint + ");");
					}
				} else {
					// Mandatory feature
					if (parentCardinalityMin == 0) {
						for (int i = featureCardinalityMin; i <= featureCardinalityMax; i++) {
							br4cpConstraints.add("(" + featName + "." + i + " => -" + parentName + ".0);");
						}
					} else {
						// TODO? Nothing to do I guess
					}
				}
			}
		}
	}
	
	private void translateConstraintsIntoConstraints() {
		for (FMConstraint fmConstraint : fmConstraints) {
			if (fmConstraint instanceof BooleanConstraint) {
				buildBooleanConstraint(fmConstraint);
			} else if (fmConstraint instanceof Requires) {
				buildRangeConstraint(fmConstraint);
			} else {
				buildFunctionalConstraint(fmConstraint);
			}
		}
	}

	private void buildBooleanConstraint(FMConstraint fmConstraint) {
		BooleanConstraint booleanConstraint = (BooleanConstraint) fmConstraint;
		String fromName = booleanConstraint.getFrom().getName();
		String toName = booleanConstraint.getTo().getName();
		
		br4cpConstraints.add("\n/* BooleanConstraints */");
		if (fmConstraint instanceof Implies) {
			br4cpConstraints.add("(" + fromName + ".1 => " + toName + ".1);");
		} else {
			br4cpConstraints.add("(" + fromName + ".1 => " + toName + ".0);");
		}
	}
	
	private void buildRangeConstraint(FMConstraint fmConstraint) {
		Requires requires = (Requires) fmConstraint;
		// We consider there is only one, e.g., [2,3]A --> ...
		// We do not consider attributes, only RangeOperation
		RangeOperation condition = (RangeOperation) requires.getConditions().get(0); 
		RangeOperation action = (RangeOperation) requires.getAction();
		
		String condName = condition.getFeature().getName();
		String actionName = action.getFeature().getName();
		
		String actionString = "( " + actionName + "." +  action.getMin();
		for (int j = action.getMin()+1; j <= action.getMax(); j++) {
			actionString = actionString + " | " + actionName + "." + j;
		}
		actionString = actionString + " )";
		
		for (int i = condition.getMin(); i <= condition.getMax(); i++) {
			// To avoid generating br4cp constraint with unused card value
			// e.g., A:[3..7], Range: [1..7]A -->... which is always true but
			// br4cp does not deal with a.1 --> etc.
			if (i >= condition.getFeature().getFeatureCardinality().getCardinalityMin()) {
				br4cpConstraints.add("\n/* RangeConstraints */");
				br4cpConstraints.add("(" + condName + "." + i + " => " + actionString + ");");	
			}	
		}
	}
	
	private void buildFunctionalConstraint(FMConstraint fmConstraint) {
		Functional functional = (Functional) fmConstraint;
		int mult = functional.getValue();

		Feature fFrom = functional.getFrom();		
		String fromName = fFrom.getName();
		int fromMin = fFrom.getFeatureCardinality().getCardinalityMin();
		int fromMax = fFrom.getFeatureCardinality().getCardinalityMax();
		Feature fTo = functional.getTo();
		int toMin = fTo.getFeatureCardinality().getCardinalityMin();
		int toMax = fTo.getFeatureCardinality().getCardinalityMax();
		String fToName = fTo.getName();

		System.out.println(fromName + ":[" + fromMin + ".." + fromMax + "] --> " + mult +  " " + fToName + ":[" + toMin + ".." + toMax + "]");

		br4cpConstraints.add("\n/* Constraint " + fToName + " >= " + mult + fromName + " */");
		// To avoid useless constraints
		if ((fromMax-fromMin > 1) || (toMax-toMin > 1)) {
			
			if (((Feature) fFrom.eContainer()).getFeatureCardinality().getCardinalityMax() > 1) {
				// For the HGIC consistency
				fromMax = fromMax * ((Feature) fFrom.eContainer()).getFeatureCardinality().getCardinalityMax();
			}
			
			for (int i = fromMin; i <= fromMax; i++) {
				if ((i > 0) && !(toMin > fromMax * mult) && !(toMin >= i * mult)) {
					// If i = 0, the constraint does not hold anyway
					// and to avoid building constraint like A:[0..1] --> 1 B:[2..5]
					String constraint = "(";
					List<String> varValues = new ArrayList<String>();
					for (int j = toMin; j <= toMax; j++) {
						if (j < i*mult) {
							varValues.add(j+"");
						}
					}
					for (int k = 0; k < varValues.size(); k++) {
						if (k == 0) {
							constraint = constraint + "-" + fToName + "." + varValues.get(k) + " ";
						} else {
							constraint = constraint + "& -" + fToName + "." + varValues.get(k) + " ";
						}
					}
					constraint = constraint + ")";
					br4cpConstraints.add("(" + fromName + "." + i + " => " + constraint + ");");	
				}
			}	
		}		
	}

	private void buildHGICConstraints(Functional functional) {
		// TODO Auto-generated method stub
		Feature fFrom = functional.getFrom();
		int cardMax = fFrom.getFeatureCardinality().getCardinalityMax();
		int cardMin = fFrom.getFeatureCardinality().getCardinalityMin();
		
		Feature parentFeature = (Feature) fFrom.eContainer();
		int parentMax = parentFeature.getFeatureCardinality().getCardinalityMax();
		int parentMin = parentFeature.getFeatureCardinality().getCardinalityMin();
		
		
	}

	public void writeToFile(File f) {
		
		try {
			FileWriter fileWriter = new FileWriter(f, false);
			PrintWriter bufferedWriter = new PrintWriter(fileWriter);
		
			for (String variable : br4cpVariables) {
				bufferedWriter.println(variable);
			}
			
			for (String constraint : br4cpConstraints) {
				bufferedWriter.println(constraint);
			}
					
			bufferedWriter.flush();
			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
