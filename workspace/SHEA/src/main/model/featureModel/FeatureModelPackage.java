/**
 */
package featureModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see featureModel.FeatureModelFactory
 * @model kind="package"
 * @generated
 */
public interface FeatureModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "featureModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://fr.saloon.model.featuremodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "featuremodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeatureModelPackage eINSTANCE = featureModel.impl.FeatureModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link featureModel.impl.FeatureModelImpl <em>Feature Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.FeatureModelImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getFeatureModel()
	 * @generated
	 */
	int FEATURE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__CONSTRAINTS = 0;

	/**
	 * The feature id for the '<em><b>Root Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__ROOT_FEATURE = 1;

	/**
	 * The number of structural features of the '<em>Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.FMElementImpl <em>FM Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.FMElementImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getFMElement()
	 * @generated
	 */
	int FM_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>FM Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FM_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>FM Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FM_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.FeatureImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 2;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ATTRIBUTES = FM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sub Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SUB_FEATURES = FM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Feature Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FEATURE_CARDINALITY = FM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = FM_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Node Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NODE_FEATURE = FM_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = FM_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_OPERATION_COUNT = FM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.AlternativeImpl <em>Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.AlternativeImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getAlternative()
	 * @generated
	 */
	int ALTERNATIVE = 4;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__ATTRIBUTES = FEATURE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Sub Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__SUB_FEATURES = FEATURE__SUB_FEATURES;

	/**
	 * The feature id for the '<em><b>Feature Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__FEATURE_CARDINALITY = FEATURE__FEATURE_CARDINALITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__NAME = FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Node Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__NODE_FEATURE = FEATURE__NODE_FEATURE;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE__VARIANTS = FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Alternative</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATIVE_OPERATION_COUNT = FEATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.ExclusiveImpl <em>Exclusive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.ExclusiveImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getExclusive()
	 * @generated
	 */
	int EXCLUSIVE = 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE__ATTRIBUTES = ALTERNATIVE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Sub Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE__SUB_FEATURES = ALTERNATIVE__SUB_FEATURES;

	/**
	 * The feature id for the '<em><b>Feature Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE__FEATURE_CARDINALITY = ALTERNATIVE__FEATURE_CARDINALITY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE__NAME = ALTERNATIVE__NAME;

	/**
	 * The feature id for the '<em><b>Node Feature</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE__NODE_FEATURE = ALTERNATIVE__NODE_FEATURE;

	/**
	 * The feature id for the '<em><b>Variants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE__VARIANTS = ALTERNATIVE__VARIANTS;

	/**
	 * The number of structural features of the '<em>Exclusive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_FEATURE_COUNT = ALTERNATIVE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exclusive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUSIVE_OPERATION_COUNT = ALTERNATIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.CardinalityImpl <em>Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.CardinalityImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 5;

	/**
	 * The feature id for the '<em><b>Cardinality Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__CARDINALITY_MIN = 0;

	/**
	 * The feature id for the '<em><b>Cardinality Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__CARDINALITY_MAX = 1;

	/**
	 * The feature id for the '<em><b>Config Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__CONFIG_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.AttributeImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = FM_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = FM_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = FM_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = FM_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.FMConstraintImpl <em>FM Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.FMConstraintImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getFMConstraint()
	 * @generated
	 */
	int FM_CONSTRAINT = 7;

	/**
	 * The number of structural features of the '<em>FM Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FM_CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>FM Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FM_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.BooleanConstraintImpl <em>Boolean Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.BooleanConstraintImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getBooleanConstraint()
	 * @generated
	 */
	int BOOLEAN_CONSTRAINT = 8;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTRAINT__FROM = FM_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTRAINT__TO = FM_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Boolean Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTRAINT_FEATURE_COUNT = FM_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Boolean Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTRAINT_OPERATION_COUNT = FM_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.FeatCardinalityImpl <em>Feat Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.FeatCardinalityImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getFeatCardinality()
	 * @generated
	 */
	int FEAT_CARDINALITY = 9;

	/**
	 * The feature id for the '<em><b>Cardinality Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEAT_CARDINALITY__CARDINALITY_MIN = CARDINALITY__CARDINALITY_MIN;

	/**
	 * The feature id for the '<em><b>Cardinality Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEAT_CARDINALITY__CARDINALITY_MAX = CARDINALITY__CARDINALITY_MAX;

	/**
	 * The feature id for the '<em><b>Config Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEAT_CARDINALITY__CONFIG_VALUE = CARDINALITY__CONFIG_VALUE;

	/**
	 * The number of structural features of the '<em>Feat Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEAT_CARDINALITY_FEATURE_COUNT = CARDINALITY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feat Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEAT_CARDINALITY_OPERATION_COUNT = CARDINALITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.ImpliesImpl <em>Implies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.ImpliesImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getImplies()
	 * @generated
	 */
	int IMPLIES = 10;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES__FROM = BOOLEAN_CONSTRAINT__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES__TO = BOOLEAN_CONSTRAINT__TO;

	/**
	 * The number of structural features of the '<em>Implies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_FEATURE_COUNT = BOOLEAN_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Implies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLIES_OPERATION_COUNT = BOOLEAN_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.ExcludesImpl <em>Excludes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.ExcludesImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getExcludes()
	 * @generated
	 */
	int EXCLUDES = 11;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDES__FROM = BOOLEAN_CONSTRAINT__FROM;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDES__TO = BOOLEAN_CONSTRAINT__TO;

	/**
	 * The number of structural features of the '<em>Excludes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDES_FEATURE_COUNT = BOOLEAN_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Excludes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDES_OPERATION_COUNT = BOOLEAN_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.RequiresImpl <em>Requires</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.RequiresImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getRequires()
	 * @generated
	 */
	int REQUIRES = 12;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__CONDITIONS = FM_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__ACTION = FM_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES__OPERATOR = FM_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Requires</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_FEATURE_COUNT = FM_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Requires</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRES_OPERATION_COUNT = FM_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.FunctionalImpl <em>Functional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.FunctionalImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getFunctional()
	 * @generated
	 */
	int FUNCTIONAL = 13;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__FROM = FM_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__TO = FM_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__TYPE = FM_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL__VALUE = FM_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Functional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_FEATURE_COUNT = FM_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Functional</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_OPERATION_COUNT = FM_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.ComparisonImpl <em>Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.ComparisonImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getComparison()
	 * @generated
	 */
	int COMPARISON = 14;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__FROM = FM_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__TO = FM_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON__TYPE = FM_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_FEATURE_COUNT = FM_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_OPERATION_COUNT = FM_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.OperationImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 15;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__FEATURE = 0;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.RangeOperationImpl <em>Range Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.RangeOperationImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getRangeOperation()
	 * @generated
	 */
	int RANGE_OPERATION = 16;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION__FEATURE = OPERATION__FEATURE;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION__MIN = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION__MAX = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION__ATTRIBUTE = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Range Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Range Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.ValueOperationImpl <em>Value Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.ValueOperationImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getValueOperation()
	 * @generated
	 */
	int VALUE_OPERATION = 17;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION__FEATURE = OPERATION__FEATURE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION__ATTRIBUTE = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION__VALUE = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Value Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.ColocatedImpl <em>Colocated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.ColocatedImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getColocated()
	 * @generated
	 */
	int COLOCATED = 18;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOCATED__FROM = FM_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From Again</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOCATED__FROM_AGAIN = FM_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Colocated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOCATED_FEATURE_COUNT = FM_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Colocated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLOCATED_OPERATION_COUNT = FM_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.NodeFeatureElementImpl <em>Node Feature Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.NodeFeatureElementImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getNodeFeatureElement()
	 * @generated
	 */
	int NODE_FEATURE_ELEMENT = 24;

	/**
	 * The number of structural features of the '<em>Node Feature Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Node Feature Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.NodeFeatureImpl <em>Node Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.NodeFeatureImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getNodeFeature()
	 * @generated
	 */
	int NODE_FEATURE = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE__NAME = NODE_FEATURE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE__NODE_ATTRIBUTES = NODE_FEATURE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node Cardinalities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE__NODE_CARDINALITIES = NODE_FEATURE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Hosted By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE__HOSTED_BY = NODE_FEATURE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Not Hosted By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE__NOT_HOSTED_BY = NODE_FEATURE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Node Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_FEATURE_COUNT = NODE_FEATURE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Node Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_OPERATION_COUNT = NODE_FEATURE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.HostedByImpl <em>Hosted By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.HostedByImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getHostedBy()
	 * @generated
	 */
	int HOSTED_BY = 20;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTED_BY__FROM = FM_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTED_BY__TO = FM_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hosted By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTED_BY_FEATURE_COUNT = FM_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hosted By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTED_BY_OPERATION_COUNT = FM_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.SeparatedImpl <em>Separated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.SeparatedImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getSeparated()
	 * @generated
	 */
	int SEPARATED = 21;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATED__FROM = FM_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATED__TO = FM_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Separated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATED_FEATURE_COUNT = FM_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Separated</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPARATED_OPERATION_COUNT = FM_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.ResourceVerificationImpl <em>Resource Verification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.ResourceVerificationImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getResourceVerification()
	 * @generated
	 */
	int RESOURCE_VERIFICATION = 22;

	/**
	 * The feature id for the '<em><b>From Att</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERIFICATION__FROM_ATT = FM_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ext F</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERIFICATION__EXT_F = FM_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resource Verification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERIFICATION_FEATURE_COUNT = FM_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Resource Verification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_VERIFICATION_OPERATION_COUNT = FM_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.impl.NotHostedByImpl <em>Not Hosted By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.impl.NotHostedByImpl
	 * @see featureModel.impl.FeatureModelPackageImpl#getNotHostedBy()
	 * @generated
	 */
	int NOT_HOSTED_BY = 23;

	/**
	 * The feature id for the '<em><b>Ext F</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_HOSTED_BY__EXT_F = FM_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_HOSTED_BY__FROM = FM_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Not Hosted By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_HOSTED_BY_FEATURE_COUNT = FM_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Not Hosted By</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_HOSTED_BY_OPERATION_COUNT = FM_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link featureModel.ComparisonOperator <em>Comparison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.ComparisonOperator
	 * @see featureModel.impl.FeatureModelPackageImpl#getComparisonOperator()
	 * @generated
	 */
	int COMPARISON_OPERATOR = 25;

	/**
	 * The meta object id for the '{@link featureModel.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.Operator
	 * @see featureModel.impl.FeatureModelPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 26;

	/**
	 * The meta object id for the '{@link featureModel.LogicalOperator <em>Logical Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see featureModel.LogicalOperator
	 * @see featureModel.impl.FeatureModelPackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 27;


	/**
	 * Returns the meta object for class '{@link featureModel.FeatureModel <em>Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Model</em>'.
	 * @see featureModel.FeatureModel
	 * @generated
	 */
	EClass getFeatureModel();

	/**
	 * Returns the meta object for the containment reference list '{@link featureModel.FeatureModel#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see featureModel.FeatureModel#getConstraints()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_Constraints();

	/**
	 * Returns the meta object for the containment reference '{@link featureModel.FeatureModel#getRootFeature <em>Root Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Feature</em>'.
	 * @see featureModel.FeatureModel#getRootFeature()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_RootFeature();

	/**
	 * Returns the meta object for class '{@link featureModel.FMElement <em>FM Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FM Element</em>'.
	 * @see featureModel.FMElement
	 * @generated
	 */
	EClass getFMElement();

	/**
	 * Returns the meta object for class '{@link featureModel.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see featureModel.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link featureModel.Feature#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see featureModel.Feature#getAttributes()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link featureModel.Feature#getSubFeatures <em>Sub Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Features</em>'.
	 * @see featureModel.Feature#getSubFeatures()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_SubFeatures();

	/**
	 * Returns the meta object for the containment reference '{@link featureModel.Feature#getFeatureCardinality <em>Feature Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Cardinality</em>'.
	 * @see featureModel.Feature#getFeatureCardinality()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_FeatureCardinality();

	/**
	 * Returns the meta object for the attribute '{@link featureModel.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see featureModel.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link featureModel.Feature#getNodeFeature <em>Node Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Feature</em>'.
	 * @see featureModel.Feature#getNodeFeature()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_NodeFeature();

	/**
	 * Returns the meta object for class '{@link featureModel.Exclusive <em>Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive</em>'.
	 * @see featureModel.Exclusive
	 * @generated
	 */
	EClass getExclusive();

	/**
	 * Returns the meta object for class '{@link featureModel.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative</em>'.
	 * @see featureModel.Alternative
	 * @generated
	 */
	EClass getAlternative();

	/**
	 * Returns the meta object for the containment reference list '{@link featureModel.Alternative#getVariants <em>Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variants</em>'.
	 * @see featureModel.Alternative#getVariants()
	 * @see #getAlternative()
	 * @generated
	 */
	EReference getAlternative_Variants();

	/**
	 * Returns the meta object for class '{@link featureModel.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality</em>'.
	 * @see featureModel.Cardinality
	 * @generated
	 */
	EClass getCardinality();

	/**
	 * Returns the meta object for the attribute '{@link featureModel.Cardinality#getCardinalityMin <em>Cardinality Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality Min</em>'.
	 * @see featureModel.Cardinality#getCardinalityMin()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_CardinalityMin();

	/**
	 * Returns the meta object for the attribute '{@link featureModel.Cardinality#getCardinalityMax <em>Cardinality Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality Max</em>'.
	 * @see featureModel.Cardinality#getCardinalityMax()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_CardinalityMax();

	/**
	 * Returns the meta object for the attribute '{@link featureModel.Cardinality#getConfigValue <em>Config Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Value</em>'.
	 * @see featureModel.Cardinality#getConfigValue()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_ConfigValue();

	/**
	 * Returns the meta object for class '{@link featureModel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see featureModel.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link featureModel.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see featureModel.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the containment reference '{@link featureModel.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see featureModel.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Value();

	/**
	 * Returns the meta object for class '{@link featureModel.FMConstraint <em>FM Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FM Constraint</em>'.
	 * @see featureModel.FMConstraint
	 * @generated
	 */
	EClass getFMConstraint();

	/**
	 * Returns the meta object for class '{@link featureModel.BooleanConstraint <em>Boolean Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Constraint</em>'.
	 * @see featureModel.BooleanConstraint
	 * @generated
	 */
	EClass getBooleanConstraint();

	/**
	 * Returns the meta object for the reference '{@link featureModel.BooleanConstraint#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see featureModel.BooleanConstraint#getFrom()
	 * @see #getBooleanConstraint()
	 * @generated
	 */
	EReference getBooleanConstraint_From();

	/**
	 * Returns the meta object for the reference '{@link featureModel.BooleanConstraint#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see featureModel.BooleanConstraint#getTo()
	 * @see #getBooleanConstraint()
	 * @generated
	 */
	EReference getBooleanConstraint_To();

	/**
	 * Returns the meta object for class '{@link featureModel.FeatCardinality <em>Feat Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feat Cardinality</em>'.
	 * @see featureModel.FeatCardinality
	 * @generated
	 */
	EClass getFeatCardinality();

	/**
	 * Returns the meta object for class '{@link featureModel.Implies <em>Implies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implies</em>'.
	 * @see featureModel.Implies
	 * @generated
	 */
	EClass getImplies();

	/**
	 * Returns the meta object for class '{@link featureModel.Excludes <em>Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Excludes</em>'.
	 * @see featureModel.Excludes
	 * @generated
	 */
	EClass getExcludes();

	/**
	 * Returns the meta object for class '{@link featureModel.Requires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requires</em>'.
	 * @see featureModel.Requires
	 * @generated
	 */
	EClass getRequires();

	/**
	 * Returns the meta object for the containment reference list '{@link featureModel.Requires#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see featureModel.Requires#getConditions()
	 * @see #getRequires()
	 * @generated
	 */
	EReference getRequires_Conditions();

	/**
	 * Returns the meta object for the containment reference '{@link featureModel.Requires#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see featureModel.Requires#getAction()
	 * @see #getRequires()
	 * @generated
	 */
	EReference getRequires_Action();

	/**
	 * Returns the meta object for the attribute '{@link featureModel.Requires#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see featureModel.Requires#getOperator()
	 * @see #getRequires()
	 * @generated
	 */
	EAttribute getRequires_Operator();

	/**
	 * Returns the meta object for class '{@link featureModel.Functional <em>Functional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional</em>'.
	 * @see featureModel.Functional
	 * @generated
	 */
	EClass getFunctional();

	/**
	 * Returns the meta object for the reference '{@link featureModel.Functional#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see featureModel.Functional#getFrom()
	 * @see #getFunctional()
	 * @generated
	 */
	EReference getFunctional_From();

	/**
	 * Returns the meta object for the reference '{@link featureModel.Functional#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see featureModel.Functional#getTo()
	 * @see #getFunctional()
	 * @generated
	 */
	EReference getFunctional_To();

	/**
	 * Returns the meta object for the attribute '{@link featureModel.Functional#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see featureModel.Functional#getType()
	 * @see #getFunctional()
	 * @generated
	 */
	EAttribute getFunctional_Type();

	/**
	 * Returns the meta object for the attribute '{@link featureModel.Functional#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see featureModel.Functional#getValue()
	 * @see #getFunctional()
	 * @generated
	 */
	EAttribute getFunctional_Value();

	/**
	 * Returns the meta object for class '{@link featureModel.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison</em>'.
	 * @see featureModel.Comparison
	 * @generated
	 */
	EClass getComparison();

	/**
	 * Returns the meta object for the reference '{@link featureModel.Comparison#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see featureModel.Comparison#getFrom()
	 * @see #getComparison()
	 * @generated
	 */
	EReference getComparison_From();

	/**
	 * Returns the meta object for the reference '{@link featureModel.Comparison#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see featureModel.Comparison#getTo()
	 * @see #getComparison()
	 * @generated
	 */
	EReference getComparison_To();

	/**
	 * Returns the meta object for the attribute '{@link featureModel.Comparison#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see featureModel.Comparison#getType()
	 * @see #getComparison()
	 * @generated
	 */
	EAttribute getComparison_Type();

	/**
	 * Returns the meta object for class '{@link featureModel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see featureModel.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the reference '{@link featureModel.Operation#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see featureModel.Operation#getFeature()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Feature();

	/**
	 * Returns the meta object for class '{@link featureModel.RangeOperation <em>Range Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Operation</em>'.
	 * @see featureModel.RangeOperation
	 * @generated
	 */
	EClass getRangeOperation();

	/**
	 * Returns the meta object for the attribute '{@link featureModel.RangeOperation#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see featureModel.RangeOperation#getMin()
	 * @see #getRangeOperation()
	 * @generated
	 */
	EAttribute getRangeOperation_Min();

	/**
	 * Returns the meta object for the attribute '{@link featureModel.RangeOperation#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see featureModel.RangeOperation#getMax()
	 * @see #getRangeOperation()
	 * @generated
	 */
	EAttribute getRangeOperation_Max();

	/**
	 * Returns the meta object for the reference '{@link featureModel.RangeOperation#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see featureModel.RangeOperation#getAttribute()
	 * @see #getRangeOperation()
	 * @generated
	 */
	EReference getRangeOperation_Attribute();

	/**
	 * Returns the meta object for class '{@link featureModel.ValueOperation <em>Value Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Operation</em>'.
	 * @see featureModel.ValueOperation
	 * @generated
	 */
	EClass getValueOperation();

	/**
	 * Returns the meta object for the reference '{@link featureModel.ValueOperation#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see featureModel.ValueOperation#getAttribute()
	 * @see #getValueOperation()
	 * @generated
	 */
	EReference getValueOperation_Attribute();

	/**
	 * Returns the meta object for the containment reference '{@link featureModel.ValueOperation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see featureModel.ValueOperation#getValue()
	 * @see #getValueOperation()
	 * @generated
	 */
	EReference getValueOperation_Value();

	/**
	 * Returns the meta object for class '{@link featureModel.Colocated <em>Colocated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colocated</em>'.
	 * @see featureModel.Colocated
	 * @generated
	 */
	EClass getColocated();

	/**
	 * Returns the meta object for the reference '{@link featureModel.Colocated#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see featureModel.Colocated#getFrom()
	 * @see #getColocated()
	 * @generated
	 */
	EReference getColocated_From();

	/**
	 * Returns the meta object for the reference list '{@link featureModel.Colocated#getFromAgain <em>From Again</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Again</em>'.
	 * @see featureModel.Colocated#getFromAgain()
	 * @see #getColocated()
	 * @generated
	 */
	EReference getColocated_FromAgain();

	/**
	 * Returns the meta object for class '{@link featureModel.NodeFeature <em>Node Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Feature</em>'.
	 * @see featureModel.NodeFeature
	 * @generated
	 */
	EClass getNodeFeature();

	/**
	 * Returns the meta object for the attribute '{@link featureModel.NodeFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see featureModel.NodeFeature#getName()
	 * @see #getNodeFeature()
	 * @generated
	 */
	EAttribute getNodeFeature_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link featureModel.NodeFeature#getNodeAttributes <em>Node Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Attributes</em>'.
	 * @see featureModel.NodeFeature#getNodeAttributes()
	 * @see #getNodeFeature()
	 * @generated
	 */
	EReference getNodeFeature_NodeAttributes();

	/**
	 * Returns the meta object for the containment reference '{@link featureModel.NodeFeature#getNodeCardinalities <em>Node Cardinalities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node Cardinalities</em>'.
	 * @see featureModel.NodeFeature#getNodeCardinalities()
	 * @see #getNodeFeature()
	 * @generated
	 */
	EReference getNodeFeature_NodeCardinalities();

	/**
	 * Returns the meta object for the containment reference '{@link featureModel.NodeFeature#getHostedBy <em>Hosted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hosted By</em>'.
	 * @see featureModel.NodeFeature#getHostedBy()
	 * @see #getNodeFeature()
	 * @generated
	 */
	EReference getNodeFeature_HostedBy();

	/**
	 * Returns the meta object for the containment reference '{@link featureModel.NodeFeature#getNotHostedBy <em>Not Hosted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Not Hosted By</em>'.
	 * @see featureModel.NodeFeature#getNotHostedBy()
	 * @see #getNodeFeature()
	 * @generated
	 */
	EReference getNodeFeature_NotHostedBy();

	/**
	 * Returns the meta object for class '{@link featureModel.HostedBy <em>Hosted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hosted By</em>'.
	 * @see featureModel.HostedBy
	 * @generated
	 */
	EClass getHostedBy();

	/**
	 * Returns the meta object for the reference list '{@link featureModel.HostedBy#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From</em>'.
	 * @see featureModel.HostedBy#getFrom()
	 * @see #getHostedBy()
	 * @generated
	 */
	EReference getHostedBy_From();

	/**
	 * Returns the meta object for the reference '{@link featureModel.HostedBy#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see featureModel.HostedBy#getTo()
	 * @see #getHostedBy()
	 * @generated
	 */
	EReference getHostedBy_To();

	/**
	 * Returns the meta object for class '{@link featureModel.Separated <em>Separated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Separated</em>'.
	 * @see featureModel.Separated
	 * @generated
	 */
	EClass getSeparated();

	/**
	 * Returns the meta object for the reference '{@link featureModel.Separated#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see featureModel.Separated#getFrom()
	 * @see #getSeparated()
	 * @generated
	 */
	EReference getSeparated_From();

	/**
	 * Returns the meta object for the reference '{@link featureModel.Separated#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see featureModel.Separated#getTo()
	 * @see #getSeparated()
	 * @generated
	 */
	EReference getSeparated_To();

	/**
	 * Returns the meta object for class '{@link featureModel.ResourceVerification <em>Resource Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Verification</em>'.
	 * @see featureModel.ResourceVerification
	 * @generated
	 */
	EClass getResourceVerification();

	/**
	 * Returns the meta object for the reference list '{@link featureModel.ResourceVerification#getFromAtt <em>From Att</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Att</em>'.
	 * @see featureModel.ResourceVerification#getFromAtt()
	 * @see #getResourceVerification()
	 * @generated
	 */
	EReference getResourceVerification_FromAtt();

	/**
	 * Returns the meta object for the reference '{@link featureModel.ResourceVerification#getExtF <em>Ext F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ext F</em>'.
	 * @see featureModel.ResourceVerification#getExtF()
	 * @see #getResourceVerification()
	 * @generated
	 */
	EReference getResourceVerification_ExtF();

	/**
	 * Returns the meta object for class '{@link featureModel.NotHostedBy <em>Not Hosted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Hosted By</em>'.
	 * @see featureModel.NotHostedBy
	 * @generated
	 */
	EClass getNotHostedBy();

	/**
	 * Returns the meta object for the reference '{@link featureModel.NotHostedBy#getExtF <em>Ext F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ext F</em>'.
	 * @see featureModel.NotHostedBy#getExtF()
	 * @see #getNotHostedBy()
	 * @generated
	 */
	EReference getNotHostedBy_ExtF();

	/**
	 * Returns the meta object for the reference list '{@link featureModel.NotHostedBy#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From</em>'.
	 * @see featureModel.NotHostedBy#getFrom()
	 * @see #getNotHostedBy()
	 * @generated
	 */
	EReference getNotHostedBy_From();

	/**
	 * Returns the meta object for class '{@link featureModel.NodeFeatureElement <em>Node Feature Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Feature Element</em>'.
	 * @see featureModel.NodeFeatureElement
	 * @generated
	 */
	EClass getNodeFeatureElement();

	/**
	 * Returns the meta object for enum '{@link featureModel.ComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Operator</em>'.
	 * @see featureModel.ComparisonOperator
	 * @generated
	 */
	EEnum getComparisonOperator();

	/**
	 * Returns the meta object for enum '{@link featureModel.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see featureModel.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the meta object for enum '{@link featureModel.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Operator</em>'.
	 * @see featureModel.LogicalOperator
	 * @generated
	 */
	EEnum getLogicalOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FeatureModelFactory getFeatureModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link featureModel.impl.FeatureModelImpl <em>Feature Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.FeatureModelImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getFeatureModel()
		 * @generated
		 */
		EClass FEATURE_MODEL = eINSTANCE.getFeatureModel();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__CONSTRAINTS = eINSTANCE.getFeatureModel_Constraints();

		/**
		 * The meta object literal for the '<em><b>Root Feature</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__ROOT_FEATURE = eINSTANCE.getFeatureModel_RootFeature();

		/**
		 * The meta object literal for the '{@link featureModel.impl.FMElementImpl <em>FM Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.FMElementImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getFMElement()
		 * @generated
		 */
		EClass FM_ELEMENT = eINSTANCE.getFMElement();

		/**
		 * The meta object literal for the '{@link featureModel.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.FeatureImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__ATTRIBUTES = eINSTANCE.getFeature_Attributes();

		/**
		 * The meta object literal for the '<em><b>Sub Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__SUB_FEATURES = eINSTANCE.getFeature_SubFeatures();

		/**
		 * The meta object literal for the '<em><b>Feature Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__FEATURE_CARDINALITY = eINSTANCE.getFeature_FeatureCardinality();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Node Feature</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__NODE_FEATURE = eINSTANCE.getFeature_NodeFeature();

		/**
		 * The meta object literal for the '{@link featureModel.impl.ExclusiveImpl <em>Exclusive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.ExclusiveImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getExclusive()
		 * @generated
		 */
		EClass EXCLUSIVE = eINSTANCE.getExclusive();

		/**
		 * The meta object literal for the '{@link featureModel.impl.AlternativeImpl <em>Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.AlternativeImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getAlternative()
		 * @generated
		 */
		EClass ALTERNATIVE = eINSTANCE.getAlternative();

		/**
		 * The meta object literal for the '<em><b>Variants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATIVE__VARIANTS = eINSTANCE.getAlternative_Variants();

		/**
		 * The meta object literal for the '{@link featureModel.impl.CardinalityImpl <em>Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.CardinalityImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getCardinality()
		 * @generated
		 */
		EClass CARDINALITY = eINSTANCE.getCardinality();

		/**
		 * The meta object literal for the '<em><b>Cardinality Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__CARDINALITY_MIN = eINSTANCE.getCardinality_CardinalityMin();

		/**
		 * The meta object literal for the '<em><b>Cardinality Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__CARDINALITY_MAX = eINSTANCE.getCardinality_CardinalityMax();

		/**
		 * The meta object literal for the '<em><b>Config Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__CONFIG_VALUE = eINSTANCE.getCardinality_ConfigValue();

		/**
		 * The meta object literal for the '{@link featureModel.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.AttributeImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '{@link featureModel.impl.FMConstraintImpl <em>FM Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.FMConstraintImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getFMConstraint()
		 * @generated
		 */
		EClass FM_CONSTRAINT = eINSTANCE.getFMConstraint();

		/**
		 * The meta object literal for the '{@link featureModel.impl.BooleanConstraintImpl <em>Boolean Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.BooleanConstraintImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getBooleanConstraint()
		 * @generated
		 */
		EClass BOOLEAN_CONSTRAINT = eINSTANCE.getBooleanConstraint();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_CONSTRAINT__FROM = eINSTANCE.getBooleanConstraint_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_CONSTRAINT__TO = eINSTANCE.getBooleanConstraint_To();

		/**
		 * The meta object literal for the '{@link featureModel.impl.FeatCardinalityImpl <em>Feat Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.FeatCardinalityImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getFeatCardinality()
		 * @generated
		 */
		EClass FEAT_CARDINALITY = eINSTANCE.getFeatCardinality();

		/**
		 * The meta object literal for the '{@link featureModel.impl.ImpliesImpl <em>Implies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.ImpliesImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getImplies()
		 * @generated
		 */
		EClass IMPLIES = eINSTANCE.getImplies();

		/**
		 * The meta object literal for the '{@link featureModel.impl.ExcludesImpl <em>Excludes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.ExcludesImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getExcludes()
		 * @generated
		 */
		EClass EXCLUDES = eINSTANCE.getExcludes();

		/**
		 * The meta object literal for the '{@link featureModel.impl.RequiresImpl <em>Requires</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.RequiresImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getRequires()
		 * @generated
		 */
		EClass REQUIRES = eINSTANCE.getRequires();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRES__CONDITIONS = eINSTANCE.getRequires_Conditions();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRES__ACTION = eINSTANCE.getRequires_Action();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIRES__OPERATOR = eINSTANCE.getRequires_Operator();

		/**
		 * The meta object literal for the '{@link featureModel.impl.FunctionalImpl <em>Functional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.FunctionalImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getFunctional()
		 * @generated
		 */
		EClass FUNCTIONAL = eINSTANCE.getFunctional();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL__FROM = eINSTANCE.getFunctional_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL__TO = eINSTANCE.getFunctional_To();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL__TYPE = eINSTANCE.getFunctional_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL__VALUE = eINSTANCE.getFunctional_Value();

		/**
		 * The meta object literal for the '{@link featureModel.impl.ComparisonImpl <em>Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.ComparisonImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getComparison()
		 * @generated
		 */
		EClass COMPARISON = eINSTANCE.getComparison();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON__FROM = eINSTANCE.getComparison_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON__TO = eINSTANCE.getComparison_To();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON__TYPE = eINSTANCE.getComparison_Type();

		/**
		 * The meta object literal for the '{@link featureModel.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.OperationImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__FEATURE = eINSTANCE.getOperation_Feature();

		/**
		 * The meta object literal for the '{@link featureModel.impl.RangeOperationImpl <em>Range Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.RangeOperationImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getRangeOperation()
		 * @generated
		 */
		EClass RANGE_OPERATION = eINSTANCE.getRangeOperation();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_OPERATION__MIN = eINSTANCE.getRangeOperation_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE_OPERATION__MAX = eINSTANCE.getRangeOperation_Max();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGE_OPERATION__ATTRIBUTE = eINSTANCE.getRangeOperation_Attribute();

		/**
		 * The meta object literal for the '{@link featureModel.impl.ValueOperationImpl <em>Value Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.ValueOperationImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getValueOperation()
		 * @generated
		 */
		EClass VALUE_OPERATION = eINSTANCE.getValueOperation();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_OPERATION__ATTRIBUTE = eINSTANCE.getValueOperation_Attribute();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_OPERATION__VALUE = eINSTANCE.getValueOperation_Value();

		/**
		 * The meta object literal for the '{@link featureModel.impl.ColocatedImpl <em>Colocated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.ColocatedImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getColocated()
		 * @generated
		 */
		EClass COLOCATED = eINSTANCE.getColocated();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLOCATED__FROM = eINSTANCE.getColocated_From();

		/**
		 * The meta object literal for the '<em><b>From Again</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLOCATED__FROM_AGAIN = eINSTANCE.getColocated_FromAgain();

		/**
		 * The meta object literal for the '{@link featureModel.impl.NodeFeatureImpl <em>Node Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.NodeFeatureImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getNodeFeature()
		 * @generated
		 */
		EClass NODE_FEATURE = eINSTANCE.getNodeFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE_FEATURE__NAME = eINSTANCE.getNodeFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Node Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_FEATURE__NODE_ATTRIBUTES = eINSTANCE.getNodeFeature_NodeAttributes();

		/**
		 * The meta object literal for the '<em><b>Node Cardinalities</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_FEATURE__NODE_CARDINALITIES = eINSTANCE.getNodeFeature_NodeCardinalities();

		/**
		 * The meta object literal for the '<em><b>Hosted By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_FEATURE__HOSTED_BY = eINSTANCE.getNodeFeature_HostedBy();

		/**
		 * The meta object literal for the '<em><b>Not Hosted By</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE_FEATURE__NOT_HOSTED_BY = eINSTANCE.getNodeFeature_NotHostedBy();

		/**
		 * The meta object literal for the '{@link featureModel.impl.HostedByImpl <em>Hosted By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.HostedByImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getHostedBy()
		 * @generated
		 */
		EClass HOSTED_BY = eINSTANCE.getHostedBy();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSTED_BY__FROM = eINSTANCE.getHostedBy_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSTED_BY__TO = eINSTANCE.getHostedBy_To();

		/**
		 * The meta object literal for the '{@link featureModel.impl.SeparatedImpl <em>Separated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.SeparatedImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getSeparated()
		 * @generated
		 */
		EClass SEPARATED = eINSTANCE.getSeparated();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEPARATED__FROM = eINSTANCE.getSeparated_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEPARATED__TO = eINSTANCE.getSeparated_To();

		/**
		 * The meta object literal for the '{@link featureModel.impl.ResourceVerificationImpl <em>Resource Verification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.ResourceVerificationImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getResourceVerification()
		 * @generated
		 */
		EClass RESOURCE_VERIFICATION = eINSTANCE.getResourceVerification();

		/**
		 * The meta object literal for the '<em><b>From Att</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_VERIFICATION__FROM_ATT = eINSTANCE.getResourceVerification_FromAtt();

		/**
		 * The meta object literal for the '<em><b>Ext F</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_VERIFICATION__EXT_F = eINSTANCE.getResourceVerification_ExtF();

		/**
		 * The meta object literal for the '{@link featureModel.impl.NotHostedByImpl <em>Not Hosted By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.NotHostedByImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getNotHostedBy()
		 * @generated
		 */
		EClass NOT_HOSTED_BY = eINSTANCE.getNotHostedBy();

		/**
		 * The meta object literal for the '<em><b>Ext F</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_HOSTED_BY__EXT_F = eINSTANCE.getNotHostedBy_ExtF();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT_HOSTED_BY__FROM = eINSTANCE.getNotHostedBy_From();

		/**
		 * The meta object literal for the '{@link featureModel.impl.NodeFeatureElementImpl <em>Node Feature Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.impl.NodeFeatureElementImpl
		 * @see featureModel.impl.FeatureModelPackageImpl#getNodeFeatureElement()
		 * @generated
		 */
		EClass NODE_FEATURE_ELEMENT = eINSTANCE.getNodeFeatureElement();

		/**
		 * The meta object literal for the '{@link featureModel.ComparisonOperator <em>Comparison Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.ComparisonOperator
		 * @see featureModel.impl.FeatureModelPackageImpl#getComparisonOperator()
		 * @generated
		 */
		EEnum COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

		/**
		 * The meta object literal for the '{@link featureModel.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.Operator
		 * @see featureModel.impl.FeatureModelPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link featureModel.LogicalOperator <em>Logical Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see featureModel.LogicalOperator
		 * @see featureModel.impl.FeatureModelPackageImpl#getLogicalOperator()
		 * @generated
		 */
		EEnum LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

	}

} //FeatureModelPackage
