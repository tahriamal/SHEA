/*
 * RandomFM.java
 *
 * v1.0
 *
 * 2014-02-20
 * 
 * Copyright Inria - Université de Lille 1
 */

package com.inria.ecsa.validation;

import java.util.ArrayList;
import java.util.List;

import featureModel.Attribute;
import featureModel.FMConstraint;
import featureModel.Feature;

public class RandomFM {

	// The tree hierarchie of the FM
	// Each list of features reifies a level
	private List<List<Feature>> featuresTree;
	private List <Attribute> attributes ;
	private List<FMConstraint> fmConstraints = new ArrayList<FMConstraint>();

//	public <List> getAttributes() {
//		
//		for (Attribute list : attributes) {
//			list.getName();
//		}
//		}
	
	
	public RandomFM() {
		this.featuresTree = new ArrayList<List<Feature>>();
		this.fmConstraints = new ArrayList<FMConstraint>();
	}
	
	public List<List<Feature>> getFeaturesTree() {
		return featuresTree;
	}

	public void setFeaturesTree(List<List<Feature>> featuresTree) {
		this.featuresTree = featuresTree;
	}
	
	public List<FMConstraint> getFmConstraints() {
		return fmConstraints;
	}

	public void setFmConstraints(List<FMConstraint> fmConstraints) {
		this.fmConstraints = fmConstraints;
	}

	public int getNbFeatures() {
		int i = 0;		
		for (List<Feature> list : featuresTree) {
			i = i + list.size();
		}
		return i;
	}
	
}
