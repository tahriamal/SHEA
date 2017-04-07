/**
 */
package featureModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see featureModel.FeatureModelPackage
 * @generated
 */
public interface FeatureModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeatureModelFactory eINSTANCE = featureModel.impl.FeatureModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Feature Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Model</em>'.
	 * @generated
	 */
	FeatureModel createFeatureModel();

	/**
	 * Returns a new object of class '<em>FM Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FM Element</em>'.
	 * @generated
	 */
	FMElement createFMElement();

	/**
	 * Returns a new object of class '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature</em>'.
	 * @generated
	 */
	Feature createFeature();

	/**
	 * Returns a new object of class '<em>Exclusive</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclusive</em>'.
	 * @generated
	 */
	Exclusive createExclusive();

	/**
	 * Returns a new object of class '<em>Alternative</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alternative</em>'.
	 * @generated
	 */
	Alternative createAlternative();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	Attribute createAttribute();

	/**
	 * Returns a new object of class '<em>Feat Cardinality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feat Cardinality</em>'.
	 * @generated
	 */
	FeatCardinality createFeatCardinality();

	/**
	 * Returns a new object of class '<em>Implies</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implies</em>'.
	 * @generated
	 */
	Implies createImplies();

	/**
	 * Returns a new object of class '<em>Excludes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Excludes</em>'.
	 * @generated
	 */
	Excludes createExcludes();

	/**
	 * Returns a new object of class '<em>Requires</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requires</em>'.
	 * @generated
	 */
	Requires createRequires();

	/**
	 * Returns a new object of class '<em>Functional</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional</em>'.
	 * @generated
	 */
	Functional createFunctional();

	/**
	 * Returns a new object of class '<em>Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparison</em>'.
	 * @generated
	 */
	Comparison createComparison();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>Range Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range Operation</em>'.
	 * @generated
	 */
	RangeOperation createRangeOperation();

	/**
	 * Returns a new object of class '<em>Value Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Operation</em>'.
	 * @generated
	 */
	ValueOperation createValueOperation();

	/**
	 * Returns a new object of class '<em>Colocated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Colocated</em>'.
	 * @generated
	 */
	Colocated createColocated();

	/**
	 * Returns a new object of class '<em>Node Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Feature</em>'.
	 * @generated
	 */
	NodeFeature createNodeFeature();

	/**
	 * Returns a new object of class '<em>Hosted By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hosted By</em>'.
	 * @generated
	 */
	HostedBy createHostedBy();

	/**
	 * Returns a new object of class '<em>Separated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Separated</em>'.
	 * @generated
	 */
	Separated createSeparated();

	/**
	 * Returns a new object of class '<em>Resource Verification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource Verification</em>'.
	 * @generated
	 */
	ResourceVerification createResourceVerification();

	/**
	 * Returns a new object of class '<em>Not Hosted By</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Hosted By</em>'.
	 * @generated
	 */
	NotHostedBy createNotHostedBy();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FeatureModelPackage getFeatureModelPackage();

} //FeatureModelFactory
