package com.inria.shea.validation;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;

import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.constraints.ICF;
import org.chocosolver.solver.constraints.LCF;
import org.chocosolver.solver.constraints.LogicalConstraintFactory;
import org.chocosolver.solver.constraints.SatFactory;
import org.chocosolver.solver.constraints.nary.cnf.ILogical;
import org.chocosolver.solver.constraints.nary.cnf.LogOp;
import org.chocosolver.solver.search.solution.AllSolutionsRecorder;
import org.chocosolver.solver.search.solution.ISolutionRecorder;
import org.chocosolver.solver.trace.Chatterbox;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.VF;
import org.chocosolver.solver.variables.Variable;
import org.chocosolver.solver.variables.VariableFactory;
//import org.chocosolver.solver.constraints.nary.cnf.LogOp;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

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
import featureModel.FeatCardinality;
import featureModel.Feature;
import featureModel.NodeFeature;
import featureModel.Colocated;
import featureModel.FeatureModel;
import featureModel.Functional;
import featureModel.HostedBy;
import featureModel.Implies;
import featureModel.LogicalOperator;
import featureModel.NotHostedBy;
import featureModel.Operation;
import featureModel.Operator;
import featureModel.RangeOperation;
import featureModel.Requires;
import featureModel.ResourceVerification;
import featureModel.Separated;
import featureModel.ValueOperation;

public class DeploymentBuilder {

	boolean log = false;

	// List of FM features 
	//private	List<Feature> featuresColocated = new ArrayList<Feature>();
	public	List<NodeFeature> NodeFeatures = new ArrayList<NodeFeature>();

	public List<Attribute> extAttributes = new ArrayList<Attribute>();
	public List<Attribute> attAmal = new ArrayList<Attribute>();
	public List<String> featuresInVars = new ArrayList<String>();
	public List <IntVar> att = new ArrayList<IntVar>();
	public HashMap <String, IntVar> resourceF = new HashMap<String,IntVar>();
	int hello ;
	int sum ;
	// List of FM features 
	public	List<Feature> features = new ArrayList<Feature>();
	public	List<NodeFeature> nodefeatures = new ArrayList<NodeFeature>();

	// List of FM constraints 
	public	List<FMConstraint> fmConstraints = new ArrayList<FMConstraint>();

	// List of CSP constraints 
	public	List<Constraint> cspConstraints = new ArrayList<Constraint>();

	// Map feature's name --> CSP variable
	public Map<String, IntVar> featNameToVariables = new HashMap<String,IntVar>();

	// Map attribute's name --> CSP variable
	public Map<Attribute, IntVar> attrNameToVariables = new HashMap<Attribute,IntVar>();

	public Feature rootFeature;

	// In Choco 3, the solver is the model
	public Solver solver;

	public DeploymentBuilder() {
		solver = new Solver();
	}
	/**
	 * Call every required methods to translate the XMI FM
	 * into a CSP model to be solved
	 * @param featureModel
	 */
	public void translateModelIntoCSP(EObject featureModel) {
		retrieveCSPElementsFromFM(featureModel);
		//translateFeatureTreeIntoCSPSAT(features);
		translateFeatureTreeIntoCSP(features);
		translateFeatureModelConstraintsIntoCSP(fmConstraints);
		postCSPConstraintsToTheSolver(cspConstraints);
		
	}


	public void retrieveCSPElementsFromFM(EObject featureModel) {		

		TreeIterator<EObject> fmContent = (TreeIterator<EObject>) featureModel.eAllContents();

		while (fmContent.hasNext()) {
			Object modelElement = fmContent.next();
			if (modelElement instanceof Feature) {
				Feature feature = (Feature) modelElement;
				features.add(feature);
				translateFeaturesIntoCSP(feature);
			} else if (modelElement instanceof NodeFeature ){
				NodeFeature nodefeature = (NodeFeature) modelElement;
				nodefeatures.add(nodefeature);
				translateNodeFeaturesIntoCSP(nodefeature);

			} else if (modelElement instanceof FMConstraint) {
				FMConstraint constraint = (FMConstraint) modelElement;
				fmConstraints.add(constraint);
				

			} else if (modelElement instanceof Attribute) {
				Attribute attribute = (Attribute) modelElement;
				attAmal.add(attribute);
				translateAttributesIntoCSP(attribute);
			} 
		}
	}
	
	/**
	 * Translate every features into CSP variables 
	 * @param features1
	 * @return
	 */
	//		private void translateFeaturesIntoCSPSAT(Feature feature) {
	//			BoolVar variable;
	//
	//			if (feature.eContainer() instanceof FeatureModel) {
	//				// Root feature
	//				rootFeature = feature;
	//				variable = VF.bool(feature.getName(), solver);
	//				cspSATConstraints.add(SatFactory.addTrue(variable));
	//			} else {
	//				variable = VF.bool(feature.getName(), solver);
	//				FeatCardinality featureCardinality = feature.getFeatureCardinality();
	//					
	//				if (featureCardinality.getConfigValue() == -1) {
	//					// Feature unwanted, i.e deselected
	//					//cspConstraints.add(ICF.arithm(variable, "=", 0));
	//					cspSATConstraints.add(SatFactory.addFalse(variable));
	//				} else if (featureCardinality.getConfigValue() != 0) {
	//					for (int i=0; i<featureCardinality.getCardinalityMax(); i++){
	//					//cspConstraints.add(ICF.arithm(variable, ">=", featureCardinality.getConfigValue()));
	//					cspSATConstraints.add(SatFactory.addTrue(variable));
	//				}				
	//			}
	//			}
	//
	//			// Fill hashmap feature name --> variable
	//			featNameToVariables.put(variable.getName(), variable);
	//		}
	public void translateNodeFeaturesIntoCSP(NodeFeature nodefeature) {
		IntVar variable;
		FeatCardinality nodefeatureCard = nodefeature.getNodeCardinalities();
		variable = VF.bounded(nodefeature.getName(), nodefeatureCard.getCardinalityMin(), nodefeatureCard.getCardinalityMax() , solver);
		featNameToVariables.put(variable.getName(), variable);
	}
	public void translateFeaturesIntoCSP(Feature feature) {
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


	public IntVar getCSPVariableFromFeature(Feature feature) {
		return featNameToVariables.get(feature.getName());
	}
	public IntVar getCSPVariableFromNodeFeature(NodeFeature nodefeature) {
		return featNameToVariables.get(nodefeature.getName());
	}

	private IntVar getCSPVariableFromAttribute(Attribute attribute) {
		return attrNameToVariables.get(attribute);	
	}

	private void translateAttributesIntoCSP(Attribute attribute) {
		IntVar variable = null ;
		//Feature parentFeature = ((Feature) (attribute.eContainer()));
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
			//				variable = VF.enumerated(attrName, values, solver);
			variable = VF.bounded(attrName, 0, 1, solver);
			//				variable = VF.bounded(attrName, rangeValue.getMin(), rangeValue.getMax(), solver);
		}

		// Fill hashmap attribute's name --> variable
		attrNameToVariables.put(attribute, variable);		
		
				if (attribute.eContainer() instanceof Feature){
					Feature parentFeature = ((Feature) (attribute.eContainer()));
				
		// The value of the attribute is computed only if its parent feature is selected
		cspConstraints.add(LCF.ifThenElse_reifiable(ICF.arithm(getCSPVariableFromFeature(parentFeature), ">", 0), 
				ICF.arithm(getCSPVariableFromAttribute(attribute), ">", 0),
				ICF.arithm(getCSPVariableFromAttribute(attribute), "=", 0))); }
				if (attribute.eContainer() instanceof NodeFeature){
					NodeFeature nodeparentFeature = ((NodeFeature) (attribute.eContainer()));
				
		// The value of the attribute is computed only if its parent feature is selected
		cspConstraints.add(LCF.ifThenElse_reifiable(ICF.arithm(getCSPVariableFromNodeFeature(nodeparentFeature), ">", 0), 
				ICF.arithm(getCSPVariableFromAttribute(attribute), ">", 0),
				ICF.arithm(getCSPVariableFromAttribute(attribute), "=", 0))); }
	}

	/**
	 * Translate the tree structure into CSP variables, 
	 * e.g. mandatory/ optional relationships, or/xor groups 
	 * @param features
	 * @return
	 */
	 void translateFeatureTreeIntoCSP(List<Feature> features) {
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

	void translateFeatureModelConstraintsIntoCSP(List<FMConstraint> fmConstraints) {

		for (FMConstraint constraint : fmConstraints) {

			if (constraint instanceof BooleanConstraint) {
				buildBooleanConstraint(constraint);
			}
			else if (constraint instanceof Colocated){
				buildColocatedConstraint(constraint);
			} else if (constraint instanceof HostedBy){
				buildHostedByConstraint(constraint);
			} else if (constraint instanceof Separated) {
				buildSeparatedConstraint(constraint);
			} else if (constraint instanceof ResourceVerification){
				buildResourceVerificationConstraint(constraint) ;
			} else if (constraint instanceof NotHostedBy) {
				buildNotHostedByConstraint(constraint);
			}
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
	 * Author Amal
	 * adding the colocated constraint
	 * 
	 */
	private void buildColocatedConstraint(FMConstraint constraint) {
		Feature fromFeature;
		IntVar var;
		NodeFeature toFeature;
		Colocated colocated = (Colocated) constraint;
		fromFeature = ((Colocated) constraint).getFrom();
		List<Feature> fromAgain = ((Colocated) constraint).getFromAgain();
		if (constraint instanceof Colocated){
			//Colocated colocated =(Colocated) constraint ;
			Constraint Frompos = ICF.arithm(getCSPVariableFromFeature(fromFeature), ">", 0);
			if (colocated.getFromAgain() != null) {
				for (int i=0; i < colocated.getFromAgain().size(); i++){
					var = getCSPVariableFromFeature(colocated.getFromAgain().get(i));
					Constraint FromAgainpos = ICF.arithm(var, ">", 0);
					cspConstraints.add(LCF.ifThenElse_reifiable(Frompos, FromAgainpos,(LCF.ifThen_reifiable(FromAgainpos, Frompos)))); 
				}
				//					 System.out.println("The feature "+ fromFeature.getName() 
				//							 + " is colocated witht features :" );
				//					 for (int i=0; i < colocated.getFromAgain().size(); i++){
				//					  System.out.println(colocated.getFromAgain().get(i).getName());
				//					 }
			}
		}

	}
	/**
	 *	 adding the Separated constraint
	 * 
	 */
	private void buildSeparatedConstraint(FMConstraint constraint) {
		Feature fromFeature;
		Feature toFeature;

		NodeFeature extF;
		Separated separated = (Separated) constraint;
		

		fromFeature = ((Separated) constraint).getFrom();
		toFeature = ((Separated) constraint).getTo();
	


		if (constraint instanceof Separated){
			IntVar from = getCSPVariableFromFeature(fromFeature);
			Constraint Frompos = ICF.arithm(from, ">", 0);
			Constraint Fromneg = ICF.arithm(from, "<", 0);
			//				IntVar ext = getCSPVariableFromFeature(extF);
			//				Constraint extpos = ICF.arithm(ext, ">", 0);
			IntVar to = getCSPVariableFromFeature(toFeature);
			Constraint topos = ICF.arithm(to, ">", 0);
			Constraint toneg = ICF.arithm(to, "<", 0);
			//				Constraint extegfrom = ICF.arithm(from, "=", ext);
			//				Constraint extegto = ICF.arithm(to, "=", ext);
			//			 
			//			ILogical arg1 = (ILogical) getCSPVariableFromFeature(toFeature);
			//			ILogical arg0 = (ILogical) getCSPVariableFromFeature(fromFeature);;
			//		SatFactory.addClauses(LogOp.xor(arg0 , arg1 ), solver);


			IntVar [] subFeaturesVars = new IntVar [] {getCSPVariableFromFeature(toFeature), getCSPVariableFromFeature(fromFeature)};
			IntVar one = VF.fixed(1, solver);
			cspConstraints.add(
					LCF.ifThen_reifiable(ICF.sum(subFeaturesVars, ">", one), 
							ICF.sum(subFeaturesVars, VF.zero(solver))));
			//this one is the xor if extF> 0 then only one feature will appear. The problem is whenever extF appears
			//we will find one of the feature even if they are optional so there is no config such as root HAB only
			//			cspConstraints.add(LCF.ifThenElse_reifiable(ICF.arithm(getCSPVariableFromFeature(extF), ">", 0), 
			//						ICF.sum(subFeaturesVars , VF.one(solver)), 
			//						ICF.sum(subFeaturesVars, VF.zero(solver))));
			//collocated
			//			cspConstraints.add(
			//					LCF.ifThen_reifiable(ICF.sum(subFeaturesVars, VF.one(solver)), 
			//					ICF.sum(subFeaturesVars, VF.zero(solver))));

			//			complicated and doesn't work correctly
			//				Constraint c1 = LCF.ifThenElse_reifiable(Frompos, toneg, topos);
			//			//	Constraint c2 =LCF.ifThen_reifiable(Fromneg, topos);
			//				Constraint c3 = LCF.ifThenElse_reifiable(topos, Fromneg, Frompos);
			//Constraint c4 = LCF.ifThen_reifiable(toneg, Frompos);
			//				cspConstraints.add(LCF.ifThenElse_reifiable(Frompos, toneg, 
			//						LCF.ifThenElse_reifiable(topos, Fromneg, 
			//								LCF.ifThenElse_reifiable(Fromneg, topos, 
			//										LCF.ifThen_reifiable(toneg, Frompos)))));
			//cspConstraints.add(LCF.ifThenElse_reifiable(extegfrom, toneg,(LCF.ifThen_reifiable(extegto, Fromneg)))); 
			//cspConstraints.add(LCF.ifThenElse_reifiable(Fposextpos, toneg,(LCF.ifThen_reifiable(toposextpos, Fromneg)))); 


		}				

	}
	private void buildResourceVerificationConstraint(FMConstraint constraint) {
		List<Attribute> fromAttributes = new ArrayList<Attribute>(); 
		Attribute extF ;
		fromAttributes = ((ResourceVerification) constraint).getFromAtt();
		extF = ((ResourceVerification) constraint).getExtF();
		//ResourceVerification rv = (ResourceVerification) constraint;
		for (int i =0; i<fromAttributes.size(); i++ ){
			Attribute tempAtt = fromAttributes.get(i);
			
			System.out.println("attributes in Resource Verification" + tempAtt.getName());
			System.out.println("attribute Value "+ tempAtt.getValue());
		}
		// TO DO
//		NodeFeature extF;
//		IntVar CPUHAB = VF.fixed(1000, solver) ;	
//		List<Attribute> fromFeatures = ((ResourceVerification) constraint).getFromAtt();
//		List<Attribute> fromAtt = new ArrayList<Attribute>();
//		for (int i =0; i<fromFeatures.size(); i++ ){
//			fromAtt= getAttributes().get(i);
//		}
//		ResourceVerification rv = (ResourceVerification) constraint;
//		IntVar [] subFeaturesVars = new IntVar [fromFeatures.size()] ;
//		for(int i=0; i<fromFeatures.size(); i++){
//			subFeaturesVars[i] = getCSPVariableFromFeature(fromFeatures.get(i));
//		}
//		Attribute attribute= (Attribute) ((Feature) fromFeatures).getAttributes();
//		//extAttributes = extF.getAttributes();
//		for(int i=0; i<extAttributes.size(); i++){
//			IntVar extA = getCSPVariableFromAttribute(extAttributes.get(i));
//		}
//		int[] sizes;
//		IntVar[] BLOADS;
//		//cspConstraints.add(ICF.bin_packing(IBIN, sizes, BLOADS, 1));
//		//cspConstraints.add(ICF.bin_packing(subFeaturesVars, sizes, BLOADS, 1));
//		//					LCF.ifThen_reifiable(ICF.sum(subFeaturesVars, ">", one), 
//		//					ICF.sum(subFeaturesVars, VF.zero(solver))));
//
//		for (Entry<Attribute, IntVar> entry : attrNameToVariables.entrySet()) {
//			if (fromAtt.equals(entry.getValue()) && (((IntVar) fromAtt)).getValue() > 0) {
//				System.out.print(fromAtt + " fromAtt ");
//
//
//				//sum = sum + entry.getValue();
//				System.out.print("CPU:" + entry.getValue());
//
//
//			}
//		}		

	}

	private void buildNotHostedByConstraint(FMConstraint constraint) {
		NodeFeature extF;
		List<Feature> From = new ArrayList<Feature>(); 
		From = ((NotHostedBy) constraint).getFrom();
		IntVar tempF;
		extF = ((NotHostedBy) constraint).getExtF();

		for (int i=0; i<From.size(); i++)
		{  //System.out.println(from.get(i));
			//BoolVar Cloud = VF.bool("Cloud", solver);featNameToVariables.get(((Feature) from).getName());
			tempF = getCSPVariableFromFeature(From.get(i));
			// lately in 11-12-2015 i have ad the cast (Feature) toFeature because otherwise, i have to modify the getCSPVariableFromFeature parameters.
			cspConstraints.add(LCF.ifThen_reifiable(ICF.arithm(getCSPVariableFromNodeFeature((NodeFeature) extF), ">", 0),LCF.ifThen_reifiable(ICF.arithm(tempF, ">", 0), ICF.arithm(tempF, "<", 0)))); 
			//cspConstraints.add(ICF.arithm(getCSPVariableFromFeature(From.get(i)), "<", 0));

		}
		
//		Feature fromFeature;
//		IntVar var;
//		NodeFeature extF;
//		NotHostedBy NHB = (NotHostedBy) constraint;
//		fromFeature = (Feature) ((NotHostedBy) constraint).getFrom();
//		extF = ((NotHostedBy) constraint).getExtF();
//		//Colocated colocated =(Colocated) constraint ;
//		var = getCSPVariableFromFeature(fromFeature);	
//		Constraint Frompos = ICF.arithm(var, ">", 0);
//
//
//
//		Constraint FromAgainpos = ICF.arithm(var, ">", 0);
//		cspConstraints.add(LCF.ifThenElse_reifiable(Frompos, FromAgainpos,(LCF.ifThen_reifiable(FromAgainpos, Frompos)))); 
//
//		//					 System.out.println("The feature "+ fromFeature.getName() 
//		//							 + " is colocated witht features :" );
//		//					 for (int i=0; i < colocated.getFromAgain().size(); i++){
//		//					  System.out.println(colocated.getFromAgain().get(i).getName());
//		//					 }
//

	}
	private void buildHostedByConstraint(FMConstraint constraint) {
		
		NodeFeature toFeature;
		List<Feature> from = new ArrayList<Feature>(); 
		from = ((HostedBy) constraint).getFrom();
		IntVar tempF;
		toFeature = ((HostedBy) constraint).getTo();

		for (int i=0; i<from.size(); i++)
		{  //System.out.println(from.get(i));
			//BoolVar Cloud = VF.bool("Cloud", solver);featNameToVariables.get(((Feature) from).getName());
			tempF = getCSPVariableFromFeature(from.get(i));
			// lately in 11-12-2015 i have ad the cast (Feature) toFeature because otherwise, i have to modify the getCSPVariableFromFeature parameters.
			cspConstraints.add(LCF.ifThen_reifiable(ICF.arithm(tempF, ">", 0), ICF.arithm(getCSPVariableFromNodeFeature((NodeFeature) toFeature), ">", 0))); 
			// ça je l'ai décommenté le 19-01-2016 pck si j'utiise le non hostedby il me donne toujours no solution found
			cspConstraints.add(ICF.arithm(getCSPVariableFromFeature(from.get(i)), ">", 0));

		}


		//			 ExtF =  getCSPVariableFromFeature(toFeature);
		//			Constraint c =  LCF.ifThen_reifiable(varFrom, ICF.arithm(varTo, "=", 1));
		//			cspConstraints.add(c);

	}
//	 private void Matching(){
//		 MatchingAlgorithmFMS mA = new MatchingAlgorithmFMS();
//		for(int i=0; i<mA.match().size(); i++){
//			System.out.println("Matching algorithm"+ mA.match().get(i));
//			//cspConstraints.add
//		}
//	 }


	/**
	 * Post the collected constraints cspConstraints.add(...) to the solver
	 * Author Clement
	 * amah has changed the private method to public to test it in the matching algorithm. 
	 */ 

	public void postCSPConstraintsToTheSolver(List<Constraint> cspConstraints2) {

		//récupérer l ematching Map de l'autre classe et créer une constrainte de hosted By ou peut être pas !! faut réfléchir à ça
		//if (){}
		Constraint[] constraintsCSP = new Constraint[cspConstraints.size()];
		for (int i = 0; i < constraintsCSP.length; i++) {
			constraintsCSP[i] = (Constraint) cspConstraints.get(i);
			System.out.println("nb constraint" + i);
		}
		solver.post(constraintsCSP);
	//	 AllSolutionsRecorder() ;
	}

	/**
	 * Display all solutions of the Feature Model 
	 */
	public void displayAllSolutions() {	
		//int nbFM = 100;
		int i = 1;
		Date date = new Date() ;
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss") ;
		final String fmPath = "C:/validation/fm/";
		//File file = new File("test.txt");
	
		//for (int k = 0; k < nbFM ; i++) {
		
		
//		File file = new File(fmPath + k + ".xmi");
//		
//		 if (file.exists()) {
//			 k++;
//			  file = new File(fmPath + k + ".xmi");}
		File file = new File(fmPath + dateFormat.format(date) + ".xmi"); 
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		FileOutputStream fis;
		try {
			fis = new FileOutputStream(file);

			PrintStream out = new PrintStream(fis);


			System.setOut(out);

			do {   

				System.setOut(out);
				System.out.print("#" + i + ": ");
				displayOneSolutionOnTable();
				//sumAtt(atributeCount());

				i++;
			} while (solver.nextSolution());
			System.out.println(i-1);
			//			IntVar [] solutionset = solver.retrieveIntVars();
			//			for (int i1 = 0; i1 <solutionset.length; i1++) {
			//			
			//				System.out.println("solutionSet: " + solutionset[i1]);
			//			}
			//		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * Display One solution of the Feature Model 
	 */
	public void displayOneSolution() {
		// To store features displayed by the solver
		
		//List<String> featuresInVars = new ArrayList<String>();
		//System.out.print(rootFeature.getName() + " ");
		for (int i = 0; i < solver.getVars().length; i++) {
			Variable variable = solver.getVars()[i];
			//feature of one solver variable
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
										
										
									}
									toPrint = true;
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
	public void displayOneSolutionOnTable() {
		boolean toPrint = false;
		// To store features displayed by the solver
		for (int i = 0; i < solver.getVars().length; i++) {
			Variable variable = solver.getVars()[i];
			//feature of one solver variable
			if (featNameToVariables.containsKey(variable.getName())) {
				if (((IntVar) variable).getValue() > 0) {
					System.out.print(variable.getName() + " ");
					featuresInVars.add(variable.getName());

				}
			}
			//Attribute feature of the above feature inside the solver variable
			if (attrNameToVariables.containsValue(variable)) {
				
				for (Entry<Attribute, IntVar> entry : attrNameToVariables.entrySet()) {
					if (variable.equals(entry.getValue()) && (((IntVar) variable)).getValue() > 0) {
						System.out.print("[ ");
//						if (entry.getKey().eContainer() instanceof Feature){
//							System.out.print("[ " + ((Feature) entry.getKey().eContainer()).getName() + ".");
//							
//							}
//						else
//						{System.out.print("[ " + ((Feature) entry.getKey().eContainer()).getName() + ".");
//							}
						
						
						toPrint = true;}
					}
				}

				for (Entry<Attribute, IntVar> entry : attrNameToVariables.entrySet()) {
					if (variable.equals(entry.getValue()) && (((IntVar) variable)).getValue() > 0) {
						System.out.print(variable + " ");
						if (entry.getKey().eContainer() instanceof NodeFeature){
							resourceF.put(((NodeFeature) entry.getKey().eContainer()).getName(), entry.getValue() );}
						else
						{
						resourceF.put(((Feature) entry.getKey().eContainer()).getName(), entry.getValue() );}
//						if(variable.getName().equals("CPU")){
//							att.add(entry.getValue());}
					}
				}	
				if (toPrint) {
					//System.out.print("] ");	

				}
				// end of the attribute feature as [A.CPU=500]

			//}
		}
		// créer un retour à la ligne
		System.out.println();
	
	}
	public List<IntVar> atributeCount() {
		for (int i = 0; i < solver.getVars().length; i++) {
			Variable variable = solver.getVars()[i];
			for (Entry<Attribute, IntVar> entry : attrNameToVariables.entrySet()) {
				if (variable.equals(entry.getValue()) && (((IntVar) variable)).getValue() > 0) {
					if(variable.getName().equals("CPU")){
						att.add(entry.getValue());

					}
				}
			}
		}
		return att;

	}
	// A revoir urgeament ça ne fonctionne pas pour la somme des CPU il boucle en faisant l'addition même s'il n'ya pas plusieurs CPU
//	public int sumAtt(List<IntVar> attValue){
//		
//		for (int k=1; k< attValue.size(); k++){
//			while (attValue.get(k).getName().equals("CPU")) {
//				hello = attValue.get(k).getValue();
//				sum += hello;
//			}
//			
//			//System.out.println("sumCPU" + sum);
//		}
//		return sum;
//	}
	public boolean hasASolution() {
		//Chatterbox.showSolutions(solver);
		return solver.findSolution();
		
	}
	public void getOneSolution() {
		// To store features displayed by the solver
		
		//List<String> featuresInVars = new ArrayList<String>();
		//System.out.print(rootFeature.getName() + " ");
		for (int i = 0; i < solver.getVars().length; i++) {
			Variable variable = solver.getVars()[i];
			//feature of one solver variable
			if (featNameToVariables.containsKey(variable.getName())) {
				if (((IntVar) variable).getValue() > 0) {
					System.out.print(variable + " ");
					featuresInVars.add(variable.getName());	
				}
			}
			//				if (attrNameToVariables.containsValue(variable)) {
			//					boolean toPrint = false;
			//					for (Entry<Attribute, IntVar> entry : attrNameToVariables.entrySet()) {
			//						if (variable.equals(entry.getValue()) && (((IntVar) variable)).getValue() > 0) {
			//							System.out.print("[ " + ((Feature) entry.getKey().eContainer()).getName() + ".");
			//							toPrint = true;
			//						}
			//					}
			//					for (Entry<Attribute, IntVar> entry : attrNameToVariables.entrySet()) {
			//						if (variable.equals(entry.getValue()) && (((IntVar) variable)).getValue() > 0) {
			//							System.out.print(variable + " ");
			//						}
			//					}	
			//					if (toPrint) {
			//						System.out.print("] ");	
			//					}
			//				}
		}								
		System.out.println();
	}
}

