/*
 * RandomFMBuilder.java
 *
 * v1.0
 *
 * 2014-02-20
 * 
 * Copyright Inria - Université de Lille 1
 */

package com.inria.shea.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import featureModel.Alternative;
import featureModel.Cardinality;
import featureModel.Colocated;
import featureModel.Exclusive;
import featureModel.FeatCardinality;
import featureModel.Feature;
import featureModel.FeatureModelFactory;
import featureModel.Implies;
import featureModel.Requires;
import featureModel.Separated;

public class RandomFMBuilder {
	
	boolean verbose = false;
	
	private Random random;
	
	private RandomFM fm;
	
	// Maximum number of features in the FM
	private static final int NB_FEATURES = 5;
	
	// Upper bound of the cardinality to randomly assign
	private static final int CARD_MAX = 1;
	
	// Maximum number of constraints in the FM
	private static final int NB_CONSTRAINTS = 3;
	
	// Store the random number of features per level of hierarchie
	private List<Integer> nbFeaturesPerLevel = new ArrayList<Integer>();

	public Cardinality card;
	
	public RandomFMBuilder() {
		this.random = new Random();
		this.fm = new RandomFM();
	}

	public RandomFM generateRandomFM() {
		generateRandomTreeHierarchie();
		generateRandomConstraints();
		if (verbose) {
			printStructure(fm);
		}
		return fm;
	}
	
	public boolean isVerbose() {
		return verbose;
	}

	public void setVerbose(boolean verbose) {
		this.verbose = verbose;
	}

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	public RandomFM getFm() {
		return fm;
	}

	public void setFm(RandomFM fm) {
		this.fm = fm;
	}

	public static int getNbFeatures() {
		return NB_FEATURES;
	}

	public static int getCardMax() {
		return CARD_MAX;
	}

	public static int getNbConstraints() {
		return NB_CONSTRAINTS;
	}

	public void setNbFeaturesPerLevel(List<Integer> nbFeaturesPerLevel) {
		this.nbFeaturesPerLevel = nbFeaturesPerLevel;
	}

	private void generateRandomConstraints() {
		
		// Number of constraints in the FM is a % of NB_FEATURES
		for (int k = 0; k < NB_CONSTRAINTS; k++) {
			Feature fromFeature = getRandomFromFeature();
			Feature toFeature = getRandomToFeature(fromFeature);
			
//			System.out.println("FROM " + fromFeature.getName() + " TO " + toFeature.getName());
			
			if (isColocated()) {
				generateColocated(fromFeature, toFeature);
			} else if(isSeperated()){
				generateSeperated(fromFeature, toFeature);
			}
		}		
	}

	private void generateSeperated(Feature fromFeature, Feature toFeature) {
		Separated seperated = FeatureModelFactory.eINSTANCE.createSeparated();
		seperated.setFrom(fromFeature);
		seperated.setTo(toFeature);
		fm.getFmConstraints().add(seperated);
		
	}

	private boolean isSeperated() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isColocated() {
		// TODO Auto-generated method stub
		return false;
	}

	
		private void generateColocated(Feature fromFeature, Feature toFeature) {
		Colocated colocated = FeatureModelFactory.eINSTANCE.createColocated();
		colocated.setFrom(fromFeature);
		colocated.setTo(toFeature);
		fm.getFmConstraints().add(colocated);
		
	}

	private Feature getRandomToFeature(Feature fromFeature) {
		
		int iTo;
		int jTo;
		String featureName;
		
		iTo = random.nextInt(fm.getFeaturesTree().size());
		jTo = random.nextInt(fm.getFeaturesTree().get(iTo).size());
		featureName = iTo + "" + jTo;
			
		// The toFeature must be different from the fromFeature
		if (featureName.equals(fromFeature.getName())) {
			getRandomToFeature(fromFeature);
		}

		// The toFeature must not be subFeature of an alternative whose fromFeature is also subFeature
		Feature fatherFeature = (Feature) getFeatureByName(featureName).eContainer();
		if (fatherFeature instanceof Alternative) {
			if (fatherFeature.getSubFeatures().contains(fromFeature)) {
				getRandomToFeature(fromFeature);
			}
		}		
		return getFeatureByName(featureName);
	}

	private Feature getRandomFromFeature() {
		// Define random from feature
		int iFrom = random.nextInt(fm.getFeaturesTree().size());
		int jFrom = random.nextInt(fm.getFeaturesTree().get(iFrom).size());
		String featureName = iFrom + "" + jFrom;
		return getFeatureByName(featureName);
	}

//	private void generateRequires(Feature fromFeature, Feature toFeature) {
//		Requires requires = FeatureModelFactory.eINSTANCE.createRequires();
//		requires.setFrom(fromFeature);
//		requires.setTo(toFeature);
//		requires.setCardFrom(setCardinalityToConstraint(fromFeature));
//		requires.setCardTo(setCardinalityToConstraint(toFeature));
//		fm.getFmConstraints().add(requires);
//	}

	/**
	 * @param feature
	 * @return
	 */
	private FeatCardinality setCardinalityToConstraint(Feature feature) {
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

	private void generateImplies(Feature fromFeature, Feature toFeature) {
		Implies implies = FeatureModelFactory.eINSTANCE.createImplies();
		implies.setFrom(fromFeature);
		implies.setTo(toFeature);
		fm.getFmConstraints().add(implies);
	}
	
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

	private void generateRandomTreeHierarchie() {
		splitFeaturesIntoLevels();
		assignSubFeatures();
		assignCardinality();
		createNewStructureWithFeatureType();		
	}

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
//							newFeatureList.add(exclusive);
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
//							newFeatureList.add(alternative);
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

	private void splitFeaturesIntoLevels() {
		getNbFeaturesPerLevel();
		buildFeaturesPerLevel();
	}
	
	
	private void getNbFeaturesPerLevel() {
		int nbRemainingFeatures = NB_FEATURES;
		
		int i = 0;
		int nbFeaturesForThisLevel;
		while (nbRemainingFeatures > 1) {
			nbFeaturesForThisLevel = 1 + (int)(Math.random() * (nbRemainingFeatures - 1) + 1);
			nbFeaturesPerLevel.add(i, nbFeaturesForThisLevel);
			nbRemainingFeatures = nbRemainingFeatures - nbFeaturesForThisLevel;
			i++;
		}
	}

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
	
	private void buildFeaturesPerLevel() {
		
		List<Feature> featuresOfThisLevel;
		
		// For all levels
		for (int i = 0; i < nbFeaturesPerLevel.size(); i++) {
			featuresOfThisLevel = new ArrayList<Feature>();
			
			// For the amount of feature in this level
			for (int j = 0; j < nbFeaturesPerLevel.get(i); j++) {
				
				// Build the feature and add it to the feature level list
				Feature feature = FeatureModelFactory.eINSTANCE.createFeature();
				feature.setName(i+""+j);				
				
				featuresOfThisLevel.add(feature);				
			}
			
			// Add the feature level list to the global list
			this.fm.getFeaturesTree().add(featuresOfThisLevel);
		}		
	}

	private void assignCardinality() {
		for (Feature feature : this.fm.getFeaturesTree().get(0)) {
			assignRandomCardinality(feature);
			for (Feature subFeature : feature.getSubFeatures()) {
				assignRandomCardinalityToSubFeature(subFeature, feature);
			}
		}
	}
	
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
			assignRandomCardinality(feature);
		} 

		for (Feature subFeature : feature.getSubFeatures()) {
			assignRandomCardinalityToSubFeature(subFeature, feature);
		}
	}
	
	private void assignRandomCardinality(Feature feature) {
		
		// Create a feature cardinality for the feature
		FeatCardinality cardinality = FeatureModelFactory.eINSTANCE.createFeatCardinality();
		
		int minCard = random.nextInt(CARD_MAX);
		int maxCard = random.nextInt(CARD_MAX);		
		
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

	// 1 chance out of 2 to be alternative
	private boolean isAlternative(){
		return (random.nextInt(2) > 0);
	}

	// If alternative, 1 chance out of 2 to be exclusive
	private boolean isExclusive(){
		return (random.nextInt(2) > 0);
	}
	
	// For a constraint, 1 chance out of 2 to be Requires
	private boolean isRequires(){
		return (random.nextInt(2) > 0);
	}

}
