/**
 */
package featureModel.util;

import featureModel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see featureModel.FeatureModelPackage
 * @generated
 */
public class FeatureModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FeatureModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureModelSwitch() {
		if (modelPackage == null) {
			modelPackage = FeatureModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FeatureModelPackage.FEATURE_MODEL: {
				FeatureModel featureModel = (FeatureModel)theEObject;
				T result = caseFeatureModel(featureModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureModelPackage.FM_ELEMENT: {
				FMElement fmElement = (FMElement)theEObject;
				T result = caseFMElement(fmElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureModelPackage.FEATURE: {
				Feature feature = (Feature)theEObject;
				T result = caseFeature(feature);
				if (result == null) result = caseFMElement(feature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureModelPackage.EXCLUSIVE: {
				Exclusive exclusive = (Exclusive)theEObject;
				T result = caseExclusive(exclusive);
				if (result == null) result = caseAlternative(exclusive);
				if (result == null) result = caseFeature(exclusive);
				if (result == null) result = caseFMElement(exclusive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureModelPackage.ALTERNATIVE: {
				Alternative alternative = (Alternative)theEObject;
				T result = caseAlternative(alternative);
				if (result == null) result = caseFeature(alternative);
				if (result == null) result = caseFMElement(alternative);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureModelPackage.CARDINALITY: {
				Cardinality cardinality = (Cardinality)theEObject;
				T result = caseCardinality(cardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureModelPackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseFMElement(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureModelPackage.FM_CONSTRAINT: {
				FMConstraint fmConstraint = (FMConstraint)theEObject;
				T result = caseFMConstraint(fmConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureModelPackage.BOOLEAN_CONSTRAINT: {
				BooleanConstraint booleanConstraint = (BooleanConstraint)theEObject;
				T result = caseBooleanConstraint(booleanConstraint);
				if (result == null) result = caseFMConstraint(booleanConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureModelPackage.FEAT_CARDINALITY: {
				FeatCardinality featCardinality = (FeatCardinality)theEObject;
				T result = caseFeatCardinality(featCardinality);
				if (result == null) result = caseCardinality(featCardinality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureModelPackage.IMPLIES: {
				Implies implies = (Implies)theEObject;
				T result = caseImplies(implies);
				if (result == null) result = caseBooleanConstraint(implies);
				if (result == null) result = caseFMConstraint(implies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureModelPackage.EXCLUDES: {
				Excludes excludes = (Excludes)theEObject;
				T result = caseExcludes(excludes);
				if (result == null) result = caseBooleanConstraint(excludes);
				if (result == null) result = caseFMConstraint(excludes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureModelPackage.REQUIRES: {
				Requires requires = (Requires)theEObject;
				T result = caseRequires(requires);
				if (result == null) result = caseFMConstraint(requires);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureModelPackage.FUNCTIONAL: {
				Functional functional = (Functional)theEObject;
				T result = caseFunctional(functional);
				if (result == null) result = caseFMConstraint(functional);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureModelPackage.COMPARISON: {
				Comparison comparison = (Comparison)theEObject;
				T result = caseComparison(comparison);
				if (result == null) result = caseFMConstraint(comparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureModelPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureModelPackage.RANGE_OPERATION: {
				RangeOperation rangeOperation = (RangeOperation)theEObject;
				T result = caseRangeOperation(rangeOperation);
				if (result == null) result = caseOperation(rangeOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureModelPackage.VALUE_OPERATION: {
				ValueOperation valueOperation = (ValueOperation)theEObject;
				T result = caseValueOperation(valueOperation);
				if (result == null) result = caseOperation(valueOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureModelPackage.COLOCATED: {
				Colocated colocated = (Colocated)theEObject;
				T result = caseColocated(colocated);
				if (result == null) result = caseFMConstraint(colocated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureModelPackage.NODE_FEATURE: {
				NodeFeature nodeFeature = (NodeFeature)theEObject;
				T result = caseNodeFeature(nodeFeature);
				if (result == null) result = caseNodeFeatureElement(nodeFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureModelPackage.HOSTED_BY: {
				HostedBy hostedBy = (HostedBy)theEObject;
				T result = caseHostedBy(hostedBy);
				if (result == null) result = caseFMConstraint(hostedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureModelPackage.SEPARATED: {
				Separated separated = (Separated)theEObject;
				T result = caseSeparated(separated);
				if (result == null) result = caseFMConstraint(separated);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureModelPackage.RESOURCE_VERIFICATION: {
				ResourceVerification resourceVerification = (ResourceVerification)theEObject;
				T result = caseResourceVerification(resourceVerification);
				if (result == null) result = caseFMConstraint(resourceVerification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureModelPackage.NOT_HOSTED_BY: {
				NotHostedBy notHostedBy = (NotHostedBy)theEObject;
				T result = caseNotHostedBy(notHostedBy);
				if (result == null) result = caseFMConstraint(notHostedBy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FeatureModelPackage.NODE_FEATURE_ELEMENT: {
				NodeFeatureElement nodeFeatureElement = (NodeFeatureElement)theEObject;
				T result = caseNodeFeatureElement(nodeFeatureElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureModel(FeatureModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FM Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FM Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMElement(FMElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclusive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclusive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExclusive(Exclusive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alternative</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlternative(Alternative object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCardinality(Cardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FM Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FM Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFMConstraint(FMConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanConstraint(BooleanConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feat Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feat Cardinality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatCardinality(FeatCardinality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplies(Implies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Excludes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Excludes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcludes(Excludes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requires</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requires</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequires(Requires object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctional(Functional object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparison(Comparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Range Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Range Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangeOperation(RangeOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueOperation(ValueOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colocated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colocated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColocated(Colocated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeFeature(NodeFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hosted By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hosted By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHostedBy(HostedBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Separated</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Separated</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeparated(Separated object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Verification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Verification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceVerification(ResourceVerification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Hosted By</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Hosted By</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotHostedBy(NotHostedBy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Node Feature Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Node Feature Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNodeFeatureElement(NodeFeatureElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FeatureModelSwitch
