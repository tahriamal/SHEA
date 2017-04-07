/**
 */
package EFM.util;

import EFM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see EFM.EFMPackage
 * @generated
 */
public class EFMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EFMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EFMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EFMPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EFMSwitch<Adapter> modelSwitch =
		new EFMSwitch<Adapter>() {
			@Override
			public Adapter caseFeatureModel(FeatureModel object) {
				return createFeatureModelAdapter();
			}
			@Override
			public Adapter caseFMElement(FMElement object) {
				return createFMElementAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseExclusive(Exclusive object) {
				return createExclusiveAdapter();
			}
			@Override
			public Adapter caseAlternative(Alternative object) {
				return createAlternativeAdapter();
			}
			@Override
			public Adapter caseCardinality(Cardinality object) {
				return createCardinalityAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseFMConstraint(FMConstraint object) {
				return createFMConstraintAdapter();
			}
			@Override
			public Adapter caseBooleanConstraint(BooleanConstraint object) {
				return createBooleanConstraintAdapter();
			}
			@Override
			public Adapter caseFeatCardinality(FeatCardinality object) {
				return createFeatCardinalityAdapter();
			}
			@Override
			public Adapter caseImplies(Implies object) {
				return createImpliesAdapter();
			}
			@Override
			public Adapter caseExcludes(Excludes object) {
				return createExcludesAdapter();
			}
			@Override
			public Adapter caseRequires(Requires object) {
				return createRequiresAdapter();
			}
			@Override
			public Adapter caseFunctional(Functional object) {
				return createFunctionalAdapter();
			}
			@Override
			public Adapter caseComparison(Comparison object) {
				return createComparisonAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter caseRangeOperation(RangeOperation object) {
				return createRangeOperationAdapter();
			}
			@Override
			public Adapter caseValueOperation(ValueOperation object) {
				return createValueOperationAdapter();
			}
			@Override
			public Adapter caseColocated(Colocated object) {
				return createColocatedAdapter();
			}
			@Override
			public Adapter caseNodeFeature(NodeFeature object) {
				return createNodeFeatureAdapter();
			}
			@Override
			public Adapter caseHostedBy(HostedBy object) {
				return createHostedByAdapter();
			}
			@Override
			public Adapter caseSeparated(Separated object) {
				return createSeparatedAdapter();
			}
			@Override
			public Adapter caseResourceVerification(ResourceVerification object) {
				return createResourceVerificationAdapter();
			}
			@Override
			public Adapter caseNotHostedBy(NotHostedBy object) {
				return createNotHostedByAdapter();
			}
			@Override
			public Adapter caseNodeFeatureElement(NodeFeatureElement object) {
				return createNodeFeatureElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link EFM.FeatureModel <em>Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EFM.FeatureModel
	 * @generated
	 */
	public Adapter createFeatureModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EFM.FMElement <em>FM Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EFM.FMElement
	 * @generated
	 */
	public Adapter createFMElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EFM.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EFM.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EFM.Exclusive <em>Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EFM.Exclusive
	 * @generated
	 */
	public Adapter createExclusiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EFM.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EFM.Alternative
	 * @generated
	 */
	public Adapter createAlternativeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EFM.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EFM.Cardinality
	 * @generated
	 */
	public Adapter createCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EFM.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EFM.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EFM.FMConstraint <em>FM Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EFM.FMConstraint
	 * @generated
	 */
	public Adapter createFMConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EFM.BooleanConstraint <em>Boolean Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EFM.BooleanConstraint
	 * @generated
	 */
	public Adapter createBooleanConstraintAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EFM.FeatCardinality <em>Feat Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EFM.FeatCardinality
	 * @generated
	 */
	public Adapter createFeatCardinalityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EFM.Implies <em>Implies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EFM.Implies
	 * @generated
	 */
	public Adapter createImpliesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EFM.Excludes <em>Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EFM.Excludes
	 * @generated
	 */
	public Adapter createExcludesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EFM.Requires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EFM.Requires
	 * @generated
	 */
	public Adapter createRequiresAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EFM.Functional <em>Functional</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EFM.Functional
	 * @generated
	 */
	public Adapter createFunctionalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EFM.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EFM.Comparison
	 * @generated
	 */
	public Adapter createComparisonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EFM.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EFM.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EFM.RangeOperation <em>Range Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EFM.RangeOperation
	 * @generated
	 */
	public Adapter createRangeOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EFM.ValueOperation <em>Value Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EFM.ValueOperation
	 * @generated
	 */
	public Adapter createValueOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EFM.Colocated <em>Colocated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EFM.Colocated
	 * @generated
	 */
	public Adapter createColocatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EFM.NodeFeature <em>Node Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EFM.NodeFeature
	 * @generated
	 */
	public Adapter createNodeFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EFM.HostedBy <em>Hosted By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EFM.HostedBy
	 * @generated
	 */
	public Adapter createHostedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EFM.Separated <em>Separated</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EFM.Separated
	 * @generated
	 */
	public Adapter createSeparatedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EFM.ResourceVerification <em>Resource Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EFM.ResourceVerification
	 * @generated
	 */
	public Adapter createResourceVerificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EFM.NotHostedBy <em>Not Hosted By</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EFM.NotHostedBy
	 * @generated
	 */
	public Adapter createNotHostedByAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link EFM.NodeFeatureElement <em>Node Feature Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see EFM.NodeFeatureElement
	 * @generated
	 */
	public Adapter createNodeFeatureElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EFMAdapterFactory
