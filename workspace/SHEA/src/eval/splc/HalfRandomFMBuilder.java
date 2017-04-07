/*
 * RandomFMBuilder.java
 *
 * v1.0
 *
 * 2014-02-20
 * 
 * Copyright Inria - Universit�� de Lille 1
 */

package splc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

import random.RandomFM;
import featureModel.Alternative;
import featureModel.Cardinality;
import featureModel.Excludes;
import featureModel.Exclusive;
import featureModel.FMConstraint;
import featureModel.FeatCardinality;
import featureModel.Feature;
import featureModel.FeatureModel;
import featureModel.FeatureModelFactory;
import featureModel.Functional;
import featureModel.Implies;
import featureModel.RangeOperation;
import featureModel.Requires;

public class HalfRandomFMBuilder {
	
	boolean verbose = false;
	boolean consistent = true;
	boolean hgic = false;
	
	private Random random;
	
	private RandomFM fm;
	
	// Maximum number of features in the FM
	private int nbFeatures;
	
	// Upper bound of the cardinality to randomly assign
	private int cardMax;
	
	// Maximum number of constraints in the FM
	private int nbConstraints;
	
	// Store the random number of features for each hierarchy level 
	private List<Integer> nbFeaturesPerLevel = new ArrayList<Integer>();
	
	public HalfRandomFMBuilder() {
		this.random = new Random();
		this.fm = new RandomFM();
	}

	public FeatureModel generateRandomFM() {
		generateRandomTreeHierarchie();
		generateRandomConstraints();
		FeatureModel featureModel = buildFinalFM(fm);
		if (verbose) {
			printStructure(fm);
		}
		return featureModel;
	}
	
	/**
	 * Generate the FM hierarchy, i.e. create the features of a random type,
	 * assign random subfeatures and cardinality, and give these features a level
	 * in the tree hierarchy.
	 */
	private void generateRandomTreeHierarchie() {
		splitFeaturesIntoLevels();
		assignSubFeatures();
		assignCardinality();
		createNewStructureWithFeatureType();		
	}
	
	/**
	 * Get the random number of feature per level
	 * and build the related level
	 */
	private void splitFeaturesIntoLevels() {
		getNbFeaturesPerLevel();
		buildFeaturesPerLevel();
	}
	
	/**
	 * Get the random number of features per level
	 */
	private void getNbFeaturesPerLevel() {
		int nbRemainingFeatures = nbFeatures;
		
		int i = 0;
		int nbFeaturesForThisLevel;
		while (nbRemainingFeatures > 1) {
			nbFeaturesForThisLevel = 1 + (int)(Math.random() * (nbRemainingFeatures - 1) + 1);
			nbFeaturesPerLevel.add(i, nbFeaturesForThisLevel);
			nbRemainingFeatures = nbRemainingFeatures - nbFeaturesForThisLevel;
			i++;
		}
	}
	
	/**
	 * Create the correct amount of features for each level
	 */
	private void buildFeaturesPerLevel() {
		List<Feature> featuresOfThisLevel;

		// For all levels
		for (int i = 0; i < nbFeaturesPerLevel.size(); i++) {
			featuresOfThisLevel = new ArrayList<Feature>();

			// For the amount of feature in this level
			for (int j = 0; j < nbFeaturesPerLevel.get(i); j++) {

				// Build the feature and add it to the feature level list
				Feature feature = FeatureModelFactory.eINSTANCE.createFeature();
				feature.setName(buildFeatureName(i, j));				

				featuresOfThisLevel.add(feature);				
			}

			// Add the feature level list to the global list
			this.fm.getFeaturesTree().add(featuresOfThisLevel);
		}		
	}
	
	/**
	 * Assign a random number of subfeatures to features,
	 * i.e. link each feature level together.
	 */
	private void assignSubFeatures() {
		
		// Last level does not have children features to assign
		for (int i = 0; i < fm.getFeaturesTree().size() -1; i++) {

			int nbSubFeaturesAlreadyAssigned = 0; 
			int nbSubFeatures = 0;

			// While there are subfeatures unassigned
			List<Feature> featureLevelList = fm.getFeaturesTree().get(i);
			for (int j = 0; j < featureLevelList.size(); j++) {
				Feature feature = featureLevelList.get(j);

				// If last element and not all subfeatures assigned, all subFeatures are assigned to last element
				if (j == featureLevelList.size() - 1) {
					for (int y = nbSubFeaturesAlreadyAssigned; y < fm.getFeaturesTree().get(i+1).size(); y++) {
						feature.getSubFeatures().add(fm.getFeaturesTree().get(i+1).get(y));
					}
				} else {
					nbSubFeatures = random.nextInt(fm.getFeaturesTree().get(i+1).size() + 1 - nbSubFeaturesAlreadyAssigned);
					if (nbSubFeatures > 0) {				
						for (int y = nbSubFeaturesAlreadyAssigned; y < nbSubFeaturesAlreadyAssigned + nbSubFeatures; y++) {
							feature.getSubFeatures().add(fm.getFeaturesTree().get(i+1).get(y));
						}	
					}
					nbSubFeaturesAlreadyAssigned = nbSubFeaturesAlreadyAssigned + nbSubFeatures;
				}			
			}
		}
	}
	
	/**
	 * Assign a random cardinality to all features
	 */
	private void assignCardinality() {
		for (Feature feature : this.fm.getFeaturesTree().get(0)) {
			assignHalfRandomCardinality(feature);
			for (Feature subFeature : feature.getSubFeatures()) {
				assignRandomCardinalityToSubFeature(subFeature, feature);
			}
		}
	}
	
	/**
	 * Randomly assign a type to each feature: Feature, Alternative or Exclusive
	 */
	private void createNewStructureWithFeatureType() {
		RandomFM newFM = new RandomFM();
		newFM = this.fm;
		
		for (int i = 0; i < fm.getFeaturesTree().size(); i++) {
			List<Feature> featureList = fm.getFeaturesTree().get(i);

			for (int j = 0; j < featureList.size(); j++) {
				Feature feature = featureList.get(j);

				List<Feature> subFeatures = feature.getSubFeatures();
				int nbSubFeatures = subFeatures.size(); 
				
				if (nbSubFeatures > 1) {
					
					// Create a feature cardinality for the feature
					FeatCardinality cardinality = FeatureModelFactory.eINSTANCE.createFeatCardinality();
					cardinality.setCardinalityMax(feature.getFeatureCardinality().getCardinalityMax());
					cardinality.setCardinalityMin(feature.getFeatureCardinality().getCardinalityMin());
					
					if (isAlternative()) {
						if (isExclusive()) {
							Exclusive exclusive = FeatureModelFactory.eINSTANCE.createExclusive();
							exclusive.setName(feature.getName());
							exclusive.getSubFeatures().addAll(feature.getSubFeatures());
							exclusive.setFeatureCardinality(cardinality);
							newFM.getFeaturesTree().get(i).set(j, exclusive);
							Feature fatherFeature = (Feature) feature.eContainer();
							if (fatherFeature != null) {
								for (int k = 0; k < fatherFeature.getSubFeatures().size(); k++) {
									if (fatherFeature.getSubFeatures().get(k).getName().equals(feature.getName())) {
										fatherFeature.getSubFeatures().set(k, exclusive);
									}
								}									
							}
						} else {
							Alternative alternative = FeatureModelFactory.eINSTANCE.createAlternative();
							alternative.setName(feature.getName());
							alternative.getSubFeatures().addAll(feature.getSubFeatures());
							alternative.setFeatureCardinality(cardinality);
							newFM.getFeaturesTree().get(i).set(j, alternative);
							Feature fatherFeature = (Feature) feature.eContainer();
							if (fatherFeature != null) {
								for (int k = 0; k < fatherFeature.getSubFeatures().size(); k++) {
									if (fatherFeature.getSubFeatures().get(k).getName().equals(feature.getName())) {
										fatherFeature.getSubFeatures().set(k, alternative);
									}
								}									
							}
						}
					} 	
				} 		
			}
		}			
		this.fm = newFM;
	}

	/**
	 * Generate random constraints
	 */
	private void generateRandomConstraints() {
		for (int k = 0; k < nbConstraints; k++) {
			Feature fromFeature = getRandomFromFeature();
			Feature toFeature = getRandomToFeature(fromFeature);
			
			int constraint = random.nextInt(3);
			
			// Used for SPLC experiments only!!!!!!!
			// We don't care about Boolean constraints
			if (constraint == 0) constraint++;
			
//			if (constraint == 0) {
//				if (random.nextInt(2) < 1) {
					generateImplies(fromFeature, toFeature);	
//				} else {
//					generateExcludes(fromFeature, toFeature);
//				}
//			} else if (constraint == 1) {
//				generateRangeConstraint(fromFeature, toFeature);
//			} else {
//				generateFunctionalConstraint(fromFeature, toFeature);
//			}
		}		
	}

	/** 
	 * Get a random target feature for the constraint, 
	 * which must be different from @param fromFeature
	 */
	private Feature getRandomToFeature(Feature fromFeature) {
		
		int iTo;
		int jTo;
		String featureName;
		// The toFeature must be different from the fromFeature
		do {
			iTo = random.nextInt(fm.getFeaturesTree().size());
			jTo = random.nextInt(fm.getFeaturesTree().get(iTo).size());
			featureName = buildFeatureName(iTo, jTo);	
		} while (featureName.equals(fromFeature.getName()));

		// The toFeature must not be subFeature of an alternative whose fromFeature is also subFeature
		Feature fatherFeature = (Feature) getFeatureByName(featureName).eContainer();
		if (fatherFeature instanceof Alternative) {
			if (fatherFeature.getSubFeatures().contains(fromFeature)) {
				getRandomToFeature(fromFeature);
			}
		}		
		return getFeatureByName(featureName);
	}

	/**
	 * Get a random source feature for the constraint
	 * @return
	 */
	private Feature getRandomFromFeature() {
		// Define random from feature
		int iFrom = random.nextInt(fm.getFeaturesTree().size());
		int jFrom = random.nextInt(fm.getFeaturesTree().get(iFrom).size());
		String featureName = buildFeatureName(iFrom, jFrom);
		return getFeatureByName(featureName);
	}

	/**
	 * Generate a RangeConstraint with random ranges 
	 * for @param fromFeature
	 * and @param toFeature
	 */
	private void generateRangeConstraint(Feature fromFeature, Feature toFeature) {
		Requires requires = FeatureModelFactory.eINSTANCE.createRequires();
		RangeOperation rangeOperationFrom = FeatureModelFactory.eINSTANCE.createRangeOperation();
		rangeOperationFrom.setFeature(fromFeature);
		if (!consistent) {			
			rangeOperationFrom.setMax(setSafeCardinalityToRangeConstraint(fromFeature).getCardinalityMax());
			rangeOperationFrom.setMin(setRandomCardinalityToRangeConstraint(fromFeature).getCardinalityMax());	
		} else {
			rangeOperationFrom.setMax(setSafeCardinalityToRangeConstraint(fromFeature).getCardinalityMax());
			rangeOperationFrom.setMin(setSafeCardinalityToRangeConstraint(fromFeature).getCardinalityMin());
		}

		RangeOperation rangeOperationTo = FeatureModelFactory.eINSTANCE.createRangeOperation();
		rangeOperationTo.setFeature(toFeature);
		rangeOperationTo.setMax(setSafeCardinalityToRangeConstraint(toFeature).getCardinalityMax());
		rangeOperationTo.setMin(setSafeCardinalityToRangeConstraint(toFeature).getCardinalityMin());
		
		requires.getConditions().add(rangeOperationFrom);
		requires.setAction(rangeOperationTo);
		
		fm.getFmConstraints().add(requires);
	}

	/**
	 * Generate a Functional constraint with a random value
	 * @param fromFeature
	 * @param toFeature
	 */
	private void generateFunctionalConstraint(Feature fromFeature, Feature toFeature) {
		if (!consistent) {
			Functional functional = FeatureModelFactory.eINSTANCE.createFunctional();
			functional.setFrom(fromFeature);
			functional.setTo(toFeature);
			int min = 1; // Minimum random value for the functional
			int max = 3; // Maximum random value for the functional
			functional.setValue(min + (int)(Math.random() * ((max - min) + 1))); // TODO can lead to inconsistency!!
			System.out.println(functional.getFrom().getName() + 
					" --> " + functional.getValue() + 
					functional.getTo().getName());
			System.out.println(functional.getFrom().getFeatureCardinality().getCardinalityMin() + ".." + 
					functional.getFrom().getFeatureCardinality().getCardinalityMax() + " --> " +
					functional.getTo().getFeatureCardinality().getCardinalityMin() + ".." +
					functional.getTo().getFeatureCardinality().getCardinalityMax());
			fm.getFmConstraints().add(functional);
		}
	}

	/**
	 * Get the random range for the RangeConstraint,
	 * but a range that is between the bound of the @param feature cardinality
	 * @return
	 */
	private FeatCardinality setSafeCardinalityToRangeConstraint(Feature feature) {
		FeatCardinality cardinality = FeatureModelFactory.eINSTANCE.createFeatCardinality();
		
		int featMin = feature.getFeatureCardinality().getCardinalityMin();
		int featMax = feature.getFeatureCardinality().getCardinalityMax();
		
		int quantifierMin = featMin + (int)(Math.random() * ((featMax - featMin) + 1));
		int quantifierMax = featMin + (int)(Math.random() * ((featMax - featMin) + 1));		
		
		if (quantifierMin <= quantifierMax) {
			cardinality.setCardinalityMax(quantifierMax);
			cardinality.setCardinalityMin(quantifierMin);	
		} else {
			cardinality.setCardinalityMax(quantifierMin);
			cardinality.setCardinalityMin(quantifierMax);
		}
		return cardinality;
	}
	
	/**
	 * Get the random range for the RangeConstraint,
	 * with a range that may be different than the @param feature cardinality
	 * e.g., B:[0..4] and A --> [2,5]B
	 */
	private Cardinality setRandomCardinalityToRangeConstraint(Feature feature) {
		FeatCardinality cardinality = FeatureModelFactory.eINSTANCE.createFeatCardinality();
		
		int min = random.nextInt(cardMax);
		int max = random.nextInt(cardMax);		
		
		if (min <= max) {
			cardinality.setCardinalityMax(max);
			cardinality.setCardinalityMin(min);	
		} else {
			cardinality.setCardinalityMax(min);
			cardinality.setCardinalityMin(max);
		}
		return cardinality;
	}

	/**
	 * Create an Implies constraint where the selection of
	 * @param fromFeature implies the selection of @param toFeature
	 */
	private void generateImplies(Feature fromFeature, Feature toFeature) {
		Implies implies = FeatureModelFactory.eINSTANCE.createImplies();
		implies.setFrom(fromFeature);
		implies.setTo(toFeature);
		fm.getFmConstraints().add(implies);
	}
	
	/**
	 * Create an Excludes constraint where the selection of
	 * @param fromFeature implies the non-selection of @param toFeature
	 */
	private void generateExcludes(Feature fromFeature, Feature toFeature) {
		Excludes excludes = FeatureModelFactory.eINSTANCE.createExcludes();
		excludes.setFrom(fromFeature);
		excludes.setTo(toFeature);
		fm.getFmConstraints().add(excludes);
	}
	
	/**
	 * Return a feature which has @param featureName as name
	 */
	private Feature getFeatureByName(String featureName) {
		List<List<Feature>> featuresTree = fm.getFeaturesTree();
		for (int i = 0; i < featuresTree.size(); i++) {
			List<Feature> list = featuresTree.get(i);
			for (int j = 0; j < list.size(); j++) {
				if (list.get(j).getName().equals(featureName)) {
					return list.get(j);
				}
			}
		}
		return null;
	}

	/**
	 * An output to see the generated FM structure
	 * @param fm
	 */
	private void printStructure(RandomFM fm) {
		
		System.out.println("RandomFMBuilder: Print generated structure");
		
		for (List<Feature> featureList : fm.getFeaturesTree()) {
			for (Feature feature : featureList) {
				if (feature.getSubFeatures().size() < 2) {
					if (feature.getSubFeatures().size() > 0) {
						System.out.println(feature.getName() + " " + feature.getSubFeatures().get(0).getName());
					} else {
						System.out.println(feature.getName());
					}					 
				} else {
					System.out.print(feature.getName());
					if (feature instanceof Exclusive) {
						System.out.print(" (exc)" + " ");
					} else if (feature instanceof Alternative) {
						System.out.print(" (alt)" + " ");
					} else {
						System.out.print(" ");
					}
					for (Feature subFeature : feature.getSubFeatures()) {
						System.out.print(subFeature.getName() + " ");
					}
					System.out.println();					
				}
			}	
		}	
	}
	
	/**
	 * Build the final feature model to be saved as XMI
	 * @param fm
	 * @return
	 */
	private FeatureModel buildFinalFM(RandomFM fm) {

		// Add root feature
		FeatureModel featureModel = FeatureModelFactory.eINSTANCE.createFeatureModel();
		Feature rootFeature = FeatureModelFactory.eINSTANCE.createFeature();
		rootFeature.setName("Root");
		FeatCardinality featCardinality = FeatureModelFactory.eINSTANCE.createFeatCardinality();
		featCardinality.setCardinalityMax(1);
		featCardinality.setCardinalityMin(1);
		rootFeature.setFeatureCardinality(featCardinality);
		featureModel.setRootFeature(rootFeature);

		// Add features from the first level of hierarchy as child features of the root
		for (int i = 0; i < fm.getFeaturesTree().get(0).size(); i++) {
			rootFeature.getSubFeatures().add(fm.getFeaturesTree().get(0).get(i));
		}

		// Add the constraints
		for (FMConstraint fmConstraint : fm.getFmConstraints()) {
			featureModel.getConstraints().add(fmConstraint);	
		}
		return featureModel;
	}
	
	/**
	 * Assign a random cardinality to the @param feature regarding
	 * its @param parentFeature
	 */
	private void assignRandomCardinalityToSubFeature(Feature feature, Feature parentFeature) {

		FeatCardinality cardinality = FeatureModelFactory.eINSTANCE.createFeatCardinality();
		cardinality.setCardinalityMax(1);
		cardinality.setCardinalityMin(0);
		
		if (parentFeature.getSubFeatures().size() > 1) {
			if (parentFeature instanceof Exclusive) {
				feature.setFeatureCardinality(cardinality);
			} else {
				feature.setFeatureCardinality(cardinality);
			}
		} else {
			assignHalfRandomCardinality(feature);
		} 

		for (Feature subFeature : feature.getSubFeatures()) {
			assignRandomCardinalityToSubFeature(subFeature, feature);
		}
	}
	
	/**
	 * Assign a random cardinality to the @param feature
	 */
	private void assignHalfRandomCardinality(Feature feature) {
		
		// Create a feature cardinality for the feature
		FeatCardinality cardinality = FeatureModelFactory.eINSTANCE.createFeatCardinality();
		
		// Generates half random cardinality, that is, if cardMax = 8,
		// generates minCard 0 or 1 and maxCard between 7 and 8
		int minValueForMaxCard = cardMax - 1;
		
		int maxCard = minValueForMaxCard + (int)(Math.random() * ((cardMax - minValueForMaxCard) + 1));		
		int minCard = random.nextInt(1);	
		
		if (minCard == 0 && maxCard == 0) maxCard++;
		
		if (minCard <= maxCard) {
			cardinality.setCardinalityMax(maxCard);
			cardinality.setCardinalityMin(minCard);	
		} else {
			cardinality.setCardinalityMax(minCard);
			cardinality.setCardinalityMin(maxCard);
		}
		
		feature.setFeatureCardinality(cardinality);		
	}

	// Build the feature name
	private String buildFeatureName(int i, int j) {
		return "v" + i + "" + j;
	}

	// 1 chance out of 2 to be alternative
	private boolean isAlternative(){
		return (random.nextInt(2) > 0);
	}

	// If alternative, 1 chance out of 2 to be exclusive
	private boolean isExclusive(){
		return (random.nextInt(2) > 0);
	}

	public int getNbFeatures() {
		return nbFeatures;
	}

	public void setNbFeatures(int nbFeatures) {
		this.nbFeatures = nbFeatures;
	}

	public int getCardMax() {
		return cardMax;
	}

	public void setCardMax(int cardMax) {
		this.cardMax = cardMax;
	}

	public int getNbConstraints() {
		return nbConstraints;
	}

	public void setNbConstraints(int nbConstraints) {
		this.nbConstraints = nbConstraints;
	}

	public boolean isConsistent() {
		return consistent;
	}

	public void setConsistent(boolean consistent) {
		this.consistent = consistent;
	}

	/////////////////////////////////////////////////// INCONSISTENCY GENERATION
	
	public void addGIC(FeatureModel featureModel) {
		// Add a RangeConstraint leading to a GIC
		Feature fromFeature = getRandomFromFeature();
		Feature toFeature = getHalfRandomToFeature(fromFeature);
		
		Requires requires = FeatureModelFactory.eINSTANCE.createRequires();
		RangeOperation rangeOperationFrom = FeatureModelFactory.eINSTANCE.createRangeOperation();
		rangeOperationFrom.setFeature(fromFeature);
					
		// Constraint always valid...
		rangeOperationFrom.setMax(fromFeature.getFeatureCardinality().getCardinalityMax());
		rangeOperationFrom.setMin(fromFeature.getFeatureCardinality().getCardinalityMin());	

		RangeOperation rangeOperationTo = FeatureModelFactory.eINSTANCE.createRangeOperation();
		rangeOperationTo.setFeature(toFeature);
		int toCardMax = toFeature.getFeatureCardinality().getCardinalityMax() - 1;
		int toCardMin = toFeature.getFeatureCardinality().getCardinalityMin() + 1;
		rangeOperationTo.setMax(toCardMax);
		int minCard = toCardMin + (int)(Math.random() * ((toCardMax - toCardMin) + 1));
		rangeOperationTo.setMin(minCard);
		
		requires.getConditions().add(rangeOperationFrom);
		requires.setAction(rangeOperationTo);
		
		System.out.println("GIC: from " + fromFeature.getName() + "[" + 
				fromFeature.getFeatureCardinality().getCardinalityMin() + ".." + 
				fromFeature.getFeatureCardinality().getCardinalityMax() + 
				"] to " + toFeature.getName() + "[" + 
				toFeature.getFeatureCardinality().getCardinalityMin() + ".." + 
				toFeature.getFeatureCardinality().getCardinalityMax()+"]");
		System.out.println("Generated:" + rangeOperationFrom.getMin() + ".." + rangeOperationFrom.getMax() +" --> " +
				rangeOperationTo.getMin() + ".." + rangeOperationTo.getMax());
		featureModel.getConstraints().add(requires);		
	}
	
	/**
	 * Search for a toFeature that must not be a subFeature of an Alternative
	 * @param fromFeature
	 * @return
	 */
	private Feature getHalfRandomToFeature(Feature fromFeature) {
		
		int iTo;
		int jTo;
		String featureName;
		
		// The toFeature must be different from the fromFeature
		do {
			iTo = random.nextInt(fm.getFeaturesTree().size());
			jTo = random.nextInt(fm.getFeaturesTree().get(iTo).size());
			featureName = buildFeatureName(iTo, jTo);	
		} while (featureName.equals(fromFeature.getName()) || (Feature) getFeatureByName(featureName).eContainer() instanceof Alternative);
		
		Feature toFeature = getFeatureByName(featureName);
		
		// The cardinality is updated if required
		FeatCardinality featureCardinality = toFeature.getFeatureCardinality();
		if (featureCardinality.getCardinalityMax() - featureCardinality.getCardinalityMin() <= 2) {
			featureCardinality.setCardinalityMax(featureCardinality.getCardinalityMax() + 2);
		}
		return toFeature;
	}

	public void addHGIC(FeatureModel featureModel) {
		List<Feature> features = new ArrayList<Feature>();
		TreeIterator<EObject> fmContent = (TreeIterator<EObject>) featureModel.eAllContents();
		while (fmContent.hasNext()) {
			Object modelElement = fmContent.next();
			if (modelElement instanceof Feature) {
				Feature feature = (Feature) modelElement;
				features.add(feature);
			}
		}
		Feature from = null, to = null;
		
		// 1: Trouver une feature from
		for (int i = 0; i < features.size(); i++) {
			// Si est source de Functional et a une feature parent
			Feature feature = features.get(i);
			if (!(feature.eContainer() instanceof FeatureModel)) {
				if (!(feature.eContainer().eContainer() instanceof FeatureModel)) {
					if (feature.getFeatureCardinality().getCardinalityMax() < 2) {
						feature.getFeatureCardinality().setCardinalityMax(2);
					}
					from = feature;
					
					// 2: Augmenter la cardinalité du parent de from
					if (((Feature) feature.eContainer()).getFeatureCardinality().getCardinalityMax() < 2) {
						((Feature) feature.eContainer()).getFeatureCardinality().setCardinalityMax(3);
					}
					// To break
					i = features.size();
				}
			}
		}		
		
		// 2: Trouver une feature to
		for (Feature feature : features) {
			if (!(feature.eContainer() instanceof FeatureModel)) {
				if (!(feature.eContainer().eContainer() instanceof FeatureModel)) {
					if (!feature.equals(from)) {
						if (!(feature instanceof Alternative)) {
							if (!(feature.eContainer() instanceof Alternative)) {
								if (feature.getFeatureCardinality().getCardinalityMax() < 2) {
									feature.getFeatureCardinality().setCardinalityMax(4);
								}
								to = feature;
							}	
						}
					}
				}
			}
		}
		
		// 4: Créer la Functional
		if (from != null && to != null) {
//			System.out.println("GENERATE HGIC");
			generateFunctionalConstraintHGIC(featureModel, from, to);
		} 
	}
	
	private void generateFunctionalConstraintHGIC(FeatureModel featureModel, Feature fromFeature, Feature toFeature) {
		Functional functional = FeatureModelFactory.eINSTANCE.createFunctional();
		functional.setFrom(fromFeature);
		functional.setTo(toFeature);
		int min = 2; // Minimum random value for the functional
		int max = 3; // Maximum random value for the functional
		functional.setValue(min + (int)(Math.random() * ((max - min) + 1))); // TODO can lead to inconsistency!!
//		System.out.println(functional.getFrom().getName() + 
//				" --> " + functional.getValue() + 
//				functional.getTo().getName());
//		System.out.println(functional.getFrom().getFeatureCardinality().getCardinalityMin() + ".." + 
//				functional.getFrom().getFeatureCardinality().getCardinalityMax() + " --> " +
//				functional.getTo().getFeatureCardinality().getCardinalityMin() + ".." +
//				functional.getTo().getFeatureCardinality().getCardinalityMax());
		featureModel.getConstraints().add(functional);
	}
}
