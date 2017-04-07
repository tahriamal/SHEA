package fr.inria.saloon.core.solver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.*;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.VF;
import org.chocosolver.solver.variables.Variable;

import type.BooleanValue;
import type.EnumListValue;
import type.IntValue;
import type.RangeValue;
import type.StringValue;
import type.Value;
import featureModel.Alternative;
import featureModel.Attribute;
import featureModel.BooleanConstraint;
import featureModel.Comparison;
import featureModel.ComparisonOperator;
import featureModel.Excludes;
import featureModel.Exclusive;
import featureModel.FMConstraint;
import featureModel.FMElement;
import featureModel.FeatCardinality;
import featureModel.Feature;
import featureModel.NodeFeature;
import featureModel.FeatureModel;
import featureModel.Functional;
import featureModel.Implies;
import featureModel.LogicalOperator;
import featureModel.Operation;
import featureModel.Operator;
import featureModel.RangeOperation;
import featureModel.Requires;
import featureModel.ValueOperation;

// No colocate or hosted this is the version made by clement 
public class ConstraintBuilder {	
	boolean log = false;

	// List of FM features 
	private	List<Feature> features = new ArrayList<Feature>();

	// List of FM constraints 
	private	List<FMConstraint> fmConstraints = new ArrayList<FMConstraint>();

	// List of CSP constraints 
	private	List<Constraint> cspConstraints = new ArrayList<Constraint>();

	// Map feature's name --> CSP variable
	private Map<String, IntVar> featNameToVariables = new HashMap<String,IntVar>();

	// Map attribute's name --> CSP variable
	private Map<Attribute, IntVar> attrNameToVariables = new HashMap<Attribute,IntVar>();

	private Feature rootFeature;

	// In Choco 3, the solver is the model
	Solver solver;

	public ConstraintBuilder() {
		solver = new Solver();
	}

	/**
	 * Call every required methods to translate the XMI FM
	 * into a CSP model to be solved
	 * @param featureModel
	 */
	public void translateModelIntoCSP(EObject featureModel) {
		retrieveCSPElementsFromFM(featureModel);
		translateFeatureTreeIntoCSP(features);
		translateFeatureModelConstraintsIntoCSP(fmConstraints);
		postCSPConstraintsToTheSolver(cspConstraints);
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
				translateFeaturesIntoCSP(feature);

			} else if (modelElement instanceof FMConstraint) {
				FMConstraint constraint = (FMConstraint) modelElement;
				fmConstraints.add(constraint);

			} else if (modelElement instanceof Attribute) {
				Attribute attribute = (Attribute) modelElement;
				translateAttributesIntoCSP(attribute);
			} 
		}
	}

	/**
	 * Translate every features into CSP variables 
	 * @param features1
	 * @return
	 */
	private void translateFeaturesIntoCSP(Feature feature) {
		IntVar variable;

		if (feature.eContainer() instanceof FeatureModel) {
			// Root feature
			rootFeature = feature;
			variable = VF.bounded(feature.getName(), 1, 1, solver);
		} else {
			FeatCardinality featureCardinality = feature.getFeatureCardinality();
			variable = VF.bounded(feature.getName(), 0, featureCardinality.getCardinalityMax(), solver);
			
			if (featureCardinality.getConfigValue() == -1) {
				// Feature unwanted, i.e deselected
				cspConstraints.add(ICF.arithm(variable, "=", 0));
			} else if (featureCardinality.getConfigValue() != 0) {
				cspConstraints.add(
						ICF. arithm(variable, ">=", featureCardinality.getConfigValue()));
			}				
		}

		// Fill hashmap feature name --> variable
		featNameToVariables.put(variable.getName(), variable);
	}

	/**
	 * Translate every attributes into CSP variables 
	 * @param attributes
	 * @return
	 */
	private void translateAttributesIntoCSP(Attribute attribute) {
		IntVar variable;
		Feature parentFeature = ((Feature) (attribute.eContainer()));
		String attrName = attribute.getName();

		Value value = attribute.getValue();
		if (value instanceof IntValue) {
			// To be able to reason on attribute value, I must not use fixed value, 
			// otherwise an attribute is always part of the configuration whether its parent
			// feature is present or not
			IntValue intValue = (IntValue) value;
			int[] values = new int[2];
			values[0] = 0; values[1] = intValue.getValue();
			variable = VF.enumerated(attrName, values, solver);
		} else if (value instanceof BooleanValue) {
			BooleanValue boolValue = (BooleanValue) value;
			variable = VF.bounded(attrName, 0, 1, solver);
		} else if (value instanceof StringValue) {
			StringValue stringValue = (StringValue) value;
			variable = VF.bounded(attrName, 0, 1, solver);
		} else if (value instanceof EnumListValue) {
			EnumListValue enumListValue = (EnumListValue) value;
			// TODO we only consider enum of int type
			// To be able to reason on attribute value, I must fix 0 as min value, 
			// otherwise an attribute is always part of the configuration whether its parent
			// feature is present or not
			int[] values = new int[enumListValue.getValues().size() + 1];
			values[0] = 0;
			
			IntValue intValue;
			for (int i = 0; i < enumListValue.getValues().size(); i++) {
				intValue = (IntValue) enumListValue.getValues().get(i);
				values[i+1] = intValue.getValue();
			}
			variable = VF.enumerated(attrName, values, solver);
		} else {
			// RangeValue
			RangeValue rangeValue = (RangeValue) value;
			
			// Fix solveAll
			int[] values = new int[2];
			values[0] = rangeValue.getMin(); values[1] = rangeValue.getMax();
//			variable = VF.enumerated(attrName, values, solver);
			variable = VF.bounded(attrName, 0, 1, solver);
//			variable = VF.bounded(attrName, rangeValue.getMin(), rangeValue.getMax(), solver);
		}

		// Fill hashmap attribute's name --> variable
		attrNameToVariables.put(attribute, variable);		
		// The value of the attribute is computed only if its parent feature is selected
		cspConstraints.add(LCF.ifThenElse_reifiable(ICF.arithm(getCSPVariableFromFeature(parentFeature), ">", 0), 
				ICF.arithm(getCSPVariableFromAttribute(attribute), ">", 0),
				ICF.arithm(getCSPVariableFromAttribute(attribute), "=", 0)));
	}

	/**
	 * Translate the tree structure into CSP variables, 
	 * e.g. mandatory/ optional relationships, or/xor groups 
	 * @param features
	 * @return
	 */
	private void translateFeatureTreeIntoCSP(List<Feature> features) {
		for (Feature feature : features) {
			if (!(feature.equals(rootFeature))) {
				FeatCardinality featureCardinality = feature.getFeatureCardinality();
				Feature parentFeature = ((Feature) (feature.eContainer()));

				if (featureCardinality.getCardinalityMin() > 0) {
					// Mandatory		
					cspConstraints.add(LCF.ifThenElse_reifiable(ICF.arithm(getCSPVariableFromFeature(parentFeature), ">", 0), 
							ICF.arithm(getCSPVariableFromFeature(feature), ">", 0), 
							ICF.arithm(getCSPVariableFromFeature(feature), "=", 0)));
				} else {
					// Optional
					cspConstraints.add(LCF.ifThenElse_reifiable(ICF.arithm(getCSPVariableFromFeature(feature), ">", 0), 
							ICF.arithm(getCSPVariableFromFeature(parentFeature), ">", 0), 
							ICF.arithm(getCSPVariableFromFeature(feature), "=", 0)));
				}	
			}

			if (feature instanceof Alternative) {				
				Alternative alternative = (Alternative) feature;
				EList<Feature> variants = alternative.getVariants();
				IntVar[] subFeaturesVars = new IntVar[variants.size()];

				// Get the children CSP variables
				for (int i = 0; i < variants.size(); i++) {
					Feature childFeature = variants.get(i);
					subFeaturesVars[i] = getCSPVariableFromFeature(childFeature);
					cspConstraints.add(LCF.ifThen_reifiable(ICF.arithm(getCSPVariableFromFeature(childFeature), ">", 0), 
							ICF.arithm(getCSPVariableFromFeature(feature), ">", 0)));
				}

				if (feature instanceof Exclusive) {
					cspConstraints.add(LCF.ifThenElse_reifiable(ICF.arithm(getCSPVariableFromFeature(feature), ">", 0), 
							ICF.sum(subFeaturesVars, VF.one(solver)), 
							ICF.sum(subFeaturesVars, VF.zero(solver))));
				} else {
					cspConstraints.add(LCF.ifThenElse_reifiable(
							ICF.arithm(getCSPVariableFromFeature(feature), ">", 0), 
							ICF.sum(subFeaturesVars, ">=", VF.one(solver)), 
							ICF.sum(subFeaturesVars, VF.zero(solver))));
				}
			}
		}
	}

	/**
	 * Translate every XMI constraints for the FM into CSP ones
	 * @param fmConstraints
	 */
	private void translateFeatureModelConstraintsIntoCSP(List<FMConstraint> fmConstraints) {

		for (FMConstraint constraint : fmConstraints) {

			if (constraint instanceof BooleanConstraint) {
				buildBooleanConstraint(constraint);
			} else if (constraint instanceof Functional) {
				buildFunctionalConstraint(constraint);
			} else if (constraint instanceof Comparison) {
				buildComparisonConstraint(constraint);
			} else if (constraint instanceof Requires){
				buildRequiresConstraint(constraint);
			}
//			else if (constraint instanceof Colocated){
//				buildColocatedConstraint(constraint);
//			} else if (constraint instanceof HostedBy){
//			buildHostedByConstraint(constraint);
//		}
			}
			
	}

	private void buildComparisonConstraint(FMConstraint constraint) {
		Comparison comparison = (Comparison) constraint;
		FMElement fromElem = comparison.getFrom();
		FMElement toElem = comparison.getTo();
		
		IntVar varFrom, varTo;
		if (fromElem instanceof Feature) {
			varFrom = getCSPVariableFromFeature((Feature) fromElem);
		} else {
			varFrom = getCSPVariableFromAttribute((Attribute) fromElem);
		}
		if (toElem instanceof Feature) {
			varTo = getCSPVariableFromFeature((Feature) fromElem);
		} else {
			varTo = getCSPVariableFromAttribute((Attribute) fromElem);
		}
		
		cspConstraints.add(ICF.arithm(varFrom, getComparisonOperator(comparison.getType()), varTo));
	}

	private void buildRequiresConstraint(FMConstraint constraint) {
		Requires requires = (Requires) constraint;

		// Build the condition
		Constraint conditionConstraint;
		EList<Operation> conditions = requires.getConditions();

		if (conditions.size() == 1) {
			Operation condition = conditions.get(0);
			conditionConstraint = translateOperationIntoCSP(condition);
			if (log) {
				System.out.print("Condition: ");
				System.out.println(conditionConstraint);
			}
		} else {
			// 2
			Operation firstOperation = conditions.get(0);
			Operation secondOperation = conditions.get(1);
			LogicalOperator logicalOperator = requires.getOperator();

			Constraint firstCondition = translateOperationIntoCSP(firstOperation);
			Constraint secondCondition = translateOperationIntoCSP(secondOperation);
			
			if (log) {
				System.out.print("First condition: ");
				System.out.println(firstCondition);
				System.out.print("Second condition: ");
				System.out.println(secondCondition);	
			}

			if (logicalOperator.getName().equals("and")) {
				conditionConstraint = LCF.and(firstCondition, secondCondition); 
			} else {
				conditionConstraint = LCF.or(firstCondition, secondCondition);
			}
		}

		// Build the action
		Constraint actionConstraint = translateOperationIntoCSP(requires.getAction());
		if (log) {
			System.out.println("Action: " + actionConstraint);
		}

		// Add the built constraint to the CSP model
		cspConstraints.add(LCF.ifThen_reifiable(conditionConstraint, actionConstraint));
	}

	private void buildFunctionalConstraint(FMConstraint constraint) {
		Functional functional = (Functional) constraint;
		Operator operator = functional.getType();
		int value = functional.getValue();
		Feature fromFeature = functional.getFrom();
		Feature toFeature = functional.getTo();

		if (operator.getName().equals("select")) {
			Arithmetic arithm1 = (Arithmetic) ICF.arithm(getCSPVariableFromFeature(fromFeature), ">", 0);
			IntVar scale = VF.scale(getCSPVariableFromFeature(fromFeature), value);
		 
			cspConstraints.add(LCF.ifThen_reifiable(arithm1, ICF.arithm(getCSPVariableFromFeature(toFeature), ">=", scale)));
			if (log) {
				System.out.println("Functional: IF " + arithm1.toString() + ", THEN " 
									+ getCSPVariableFromFeature(toFeature).getName() + " >= " + scale.toString());
			}
		} else {
			// TODO, but they are not global constraint
			// Not sure it has to be considered anymore
		}
	}

	private void buildBooleanConstraint(FMConstraint constraint) {
		Feature fromFeature, toFeature;
		fromFeature = ((BooleanConstraint) constraint).getFrom();
		toFeature = ((BooleanConstraint) constraint).getTo();
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
	
	
	
	/**
	 * Translate a ValueOperation (e.g. size >= 2) 
	 * or a RangeOperation (e.g. A in [2,5]) into CSP
	 * @param condition
	 * @param fromFeature 
	 * @return 
	 */
	private Constraint translateOperationIntoCSP(Operation condition) {
		if (condition instanceof ValueOperation) {
			return buildValueOperation((ValueOperation) condition);
		} else if (condition instanceof RangeOperation) {
			return buildRangeOperation((RangeOperation) condition);
		} else {
			return buildSingleOperation((Operation) condition);
		}
	}

	private Constraint buildSingleOperation(Operation operation) {
		return ICF.arithm((IntVar) getCSPVariableFromFeature(operation.getFeature()), ">", 0);
	}

	/**
	 * Build a constraint to check if the feature cardinality
	 * or the attribute value is in the range
	 * @param rangeOperation
	 * @return
	 */
	private Constraint buildRangeOperation(RangeOperation rangeOperation) {
		IntVar var;
		if (rangeOperation.getAttribute() != null) {
			var = getCSPVariableFromAttribute(rangeOperation.getAttribute());
		} else {
			var = getCSPVariableFromFeature(rangeOperation.getFeature());
		}
		
		if (rangeOperation.getMax() == -1) {
			return ICF.arithm(var, ">=", rangeOperation.getMin());	
		} else {
			return LCF.and(ICF.arithm(var, ">=", rangeOperation.getMin()), 
					ICF.arithm(var, "<=", rangeOperation.getMax()));	
		}
	}
	
	/**
	 * Build a comparison between a feature or an attribute and a value
	 * @param valueOperation
	 * @return
	 */
	private Constraint buildValueOperation(ValueOperation valueOperation) {
		IntValue value = valueOperation.getValue();
		ComparisonOperator comparisonOperator = ((Comparison) valueOperation).getType();
		Feature feature = valueOperation.getFeature();
		 
		IntVar var = null;
		if (valueOperation.getAttribute() != null) {
			// Compare the attribute value with value
			for (Attribute attr : feature.getAttributes()) {
				if (attr.getName().equals(valueOperation.getAttribute().getName())) {
					var = getCSPVariableFromAttribute(attr);
				}
			}	
		} else {
			// Compare the feature value, i.e. its cardinality, with value
			var = getCSPVariableFromFeature(feature);
		}	
		
		String operator = getComparisonOperator(comparisonOperator);

		if (var == null) {
			System.out.println("Feature " + valueOperation.getFeature().getName() + " does not hold a " + 
					valueOperation.getAttribute().getName() + " Attribute");
		}
		
		Arithmetic valueCond = (Arithmetic) ICF.arithm(var, operator, value.getValue());
		return valueCond;
	}

	private void postCSPConstraintsToTheSolver(List<Constraint> cspConstraints2) {
		Constraint[] constraintsCSP = new Constraint[cspConstraints.size()];
		for (int i = 0; i < constraintsCSP.length; i++) {
			constraintsCSP[i] = (Constraint) cspConstraints.get(i);
		}
		solver.post(constraintsCSP);
	}

	/**
	 * Display all solutions of the Feature Model 
	 */
	public void displayAllSolutions() {	
		int i = 1;
		File file = new File("test.txt");
		FileOutputStream fis;
		try {
			fis = new FileOutputStream(file);
		
		PrintStream out = new PrintStream(fis);
		
			
			System.setOut(out);
			
		do {   
			
			System.setOut(out);
			System.out.print("#" + i + ": ");
			displayOneSolution();
			i++;
		} while (solver.nextSolution());
		System.out.println(i-1);

	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
	}
	
	

	public void setProperties (){
		Properties prop = new Properties();
		OutputStream output = null;
		try {
			 
			output = new FileOutputStream("config.properties");
		
				
			// To store features displayed by the solver
			List<String> featuresInVars = new ArrayList<String>();
									
			prop.setProperty("rootFeature", rootFeature.getName() + " ");
			for (int i = 0; i < solver.getVars().length; i++) {
				prop.setProperty("solver",String.valueOf(solver.getVars()[i]));
				Variable variable = solver.getVars()[i];
				if (featNameToVariables.containsKey(variable.getName())) {
				if (((IntVar) variable).getValue() > 0) {
				prop.setProperty("variable", variable.getName() );
				featuresInVars.add(variable.getName());	
			}
			}
			if (attrNameToVariables.containsValue(variable)) {
			boolean toPrint = false;
			for (Entry<Attribute, IntVar> entry : attrNameToVariables.entrySet()) {
				if (variable.equals(entry.getValue()) && (((IntVar) variable)).getValue() > 0) {
					prop.setProperty("Feature Name ", ((Feature) entry.getKey().eContainer()).getName());
					toPrint = true;
			}
			}
			for (Entry<Attribute, IntVar> entry : attrNameToVariables.entrySet()) {
			if (variable.equals(entry.getValue()) && (((IntVar) variable)).getValue() > 0) {
			prop.setProperty("Variable ", String.valueOf(((IntVar) variable).getValue()));
			}
			}	
									if (toPrint) {
										prop.setProperty("fin", "] ");	
									}
								}
							}								
							System.out.println();
					
					
			 
			// save properties to project root folder C:\Users\phgm9349\workspace1\Properties
			prop.store(output, null);
			System.out.println("Out put fine");
	 
		} catch (IOException io) {
			io.printStackTrace();

		} finally {
			if (output != null) {
				try {
					output.close();
					System.out.println("Out put finally");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
}

	/**
	 * @param featuresInVars
	 */
	public void displayOneSolution() {
		// To store features displayed by the solver
		List<String> featuresInVars = new ArrayList<String>();
				
		System.out.print(rootFeature.getName() + " ");
		for (int i = 0; i < solver.getVars().length; i++) {
			Variable variable = solver.getVars()[i];
			if (featNameToVariables.containsKey(variable.getName())) {
				if (((IntVar) variable).getValue() > 0) {
					System.out.print(variable + " ");
					featuresInVars.add(variable.getName());	
				}
			}
			if (attrNameToVariables.containsValue(variable)) {
				boolean toPrint = false;
				for (Entry<Attribute, IntVar> entry : attrNameToVariables.entrySet()) {
					if (variable.equals(entry.getValue()) && (((IntVar) variable)).getValue() > 0) {
						System.out.print("[ " + ((Feature) entry.getKey().eContainer()).getName() + ".");
						toPrint = true;
					}
				}
				for (Entry<Attribute, IntVar> entry : attrNameToVariables.entrySet()) {
					if (variable.equals(entry.getValue()) && (((IntVar) variable)).getValue() > 0) {
						System.out.print(variable + " ");
					}
				}	
				if (toPrint) {
					System.out.print("] ");	
				}
			}
		}								
		System.out.println();
	}

	private String getComparisonOperator(ComparisonOperator comparisonOperator) {
		String operator;
		if (comparisonOperator.getName().equals("geq")) {
			operator = ">=";
		} else if (comparisonOperator.getName().equals("gt")) {
			operator = ">";
		} else if (comparisonOperator.getName().equals("leq")) {
			operator = "<=";
		} else if (comparisonOperator.getName().equals("lt")) {
			operator = "<";
		} else {
			operator = "=";
		}
		return operator;
	}
	
	public boolean hasASolution() {
		return solver.findSolution();
	}
	
	private IntVar getCSPVariableFromFeature(Feature feature) {
		return featNameToVariables.get(feature.getName());
	}
	

	private IntVar getCSPVariableFromAttribute(Attribute attribute) {
		return attrNameToVariables.get(attribute);	
	}
}
