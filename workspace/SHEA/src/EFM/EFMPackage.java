/**
 */
package EFM;

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
 * @see EFM.EFMFactory
 * @model kind="package"
 * @generated
 */
public interface EFMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "EFM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://example.org/EFM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "EFM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EFMPackage eINSTANCE = EFM.impl.EFMPackageImpl.init();

	/**
	 * The meta object id for the '{@link EFM.impl.FeatureModelImpl <em>Feature Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.impl.FeatureModelImpl
	 * @see EFM.impl.EFMPackageImpl#getFeatureModel()
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
	 * The meta object id for the '{@link EFM.impl.FMElementImpl <em>FM Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.impl.FMElementImpl
	 * @see EFM.impl.EFMPackageImpl#getFMElement()
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
	 * The meta object id for the '{@link EFM.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.impl.FeatureImpl
	 * @see EFM.impl.EFMPackageImpl#getFeature()
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
	 * The meta object id for the '{@link EFM.impl.AlternativeImpl <em>Alternative</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.impl.AlternativeImpl
	 * @see EFM.impl.EFMPackageImpl#getAlternative()
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
	 * The meta object id for the '{@link EFM.impl.ExclusiveImpl <em>Exclusive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.impl.ExclusiveImpl
	 * @see EFM.impl.EFMPackageImpl#getExclusive()
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
	 * The meta object id for the '{@link EFM.impl.CardinalityImpl <em>Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.impl.CardinalityImpl
	 * @see EFM.impl.EFMPackageImpl#getCardinality()
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
	 * The meta object id for the '{@link EFM.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.impl.AttributeImpl
	 * @see EFM.impl.EFMPackageImpl#getAttribute()
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
	 * The meta object id for the '{@link EFM.impl.FMConstraintImpl <em>FM Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.impl.FMConstraintImpl
	 * @see EFM.impl.EFMPackageImpl#getFMConstraint()
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
	 * The meta object id for the '{@link EFM.impl.BooleanConstraintImpl <em>Boolean Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.impl.BooleanConstraintImpl
	 * @see EFM.impl.EFMPackageImpl#getBooleanConstraint()
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
	 * The meta object id for the '{@link EFM.impl.FeatCardinalityImpl <em>Feat Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.impl.FeatCardinalityImpl
	 * @see EFM.impl.EFMPackageImpl#getFeatCardinality()
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
	 * The meta object id for the '{@link EFM.impl.ImpliesImpl <em>Implies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.impl.ImpliesImpl
	 * @see EFM.impl.EFMPackageImpl#getImplies()
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
	 * The meta object id for the '{@link EFM.impl.ExcludesImpl <em>Excludes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.impl.ExcludesImpl
	 * @see EFM.impl.EFMPackageImpl#getExcludes()
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
	 * The meta object id for the '{@link EFM.impl.RequiresImpl <em>Requires</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.impl.RequiresImpl
	 * @see EFM.impl.EFMPackageImpl#getRequires()
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
	 * The meta object id for the '{@link EFM.impl.FunctionalImpl <em>Functional</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.impl.FunctionalImpl
	 * @see EFM.impl.EFMPackageImpl#getFunctional()
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
	 * The meta object id for the '{@link EFM.impl.ComparisonImpl <em>Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.impl.ComparisonImpl
	 * @see EFM.impl.EFMPackageImpl#getComparison()
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
	 * The meta object id for the '{@link EFM.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.impl.OperationImpl
	 * @see EFM.impl.EFMPackageImpl#getOperation()
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
	 * The meta object id for the '{@link EFM.impl.RangeOperationImpl <em>Range Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.impl.RangeOperationImpl
	 * @see EFM.impl.EFMPackageImpl#getRangeOperation()
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
	 * The meta object id for the '{@link EFM.impl.ValueOperationImpl <em>Value Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.impl.ValueOperationImpl
	 * @see EFM.impl.EFMPackageImpl#getValueOperation()
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
	 * The meta object id for the '{@link EFM.impl.ColocatedImpl <em>Colocated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.impl.ColocatedImpl
	 * @see EFM.impl.EFMPackageImpl#getColocated()
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
	 * The meta object id for the '{@link EFM.impl.NodeFeatureElementImpl <em>Node Feature Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.impl.NodeFeatureElementImpl
	 * @see EFM.impl.EFMPackageImpl#getNodeFeatureElement()
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
	 * The meta object id for the '{@link EFM.impl.NodeFeatureImpl <em>Node Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.impl.NodeFeatureImpl
	 * @see EFM.impl.EFMPackageImpl#getNodeFeature()
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
	 * The meta object id for the '{@link EFM.impl.HostedByImpl <em>Hosted By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.impl.HostedByImpl
	 * @see EFM.impl.EFMPackageImpl#getHostedBy()
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
	 * The meta object id for the '{@link EFM.impl.SeparatedImpl <em>Separated</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.impl.SeparatedImpl
	 * @see EFM.impl.EFMPackageImpl#getSeparated()
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
	 * The meta object id for the '{@link EFM.impl.ResourceVerificationImpl <em>Resource Verification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.impl.ResourceVerificationImpl
	 * @see EFM.impl.EFMPackageImpl#getResourceVerification()
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
	 * The meta object id for the '{@link EFM.impl.NotHostedByImpl <em>Not Hosted By</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.impl.NotHostedByImpl
	 * @see EFM.impl.EFMPackageImpl#getNotHostedBy()
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
	 * The meta object id for the '{@link EFM.ComparisonOperator <em>Comparison Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.ComparisonOperator
	 * @see EFM.impl.EFMPackageImpl#getComparisonOperator()
	 * @generated
	 */
	int COMPARISON_OPERATOR = 25;

	/**
	 * The meta object id for the '{@link EFM.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.Operator
	 * @see EFM.impl.EFMPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 26;

	/**
	 * The meta object id for the '{@link EFM.LogicalOperator <em>Logical Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see EFM.LogicalOperator
	 * @see EFM.impl.EFMPackageImpl#getLogicalOperator()
	 * @generated
	 */
	int LOGICAL_OPERATOR = 27;


	/**
	 * Returns the meta object for class '{@link EFM.FeatureModel <em>Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Model</em>'.
	 * @see EFM.FeatureModel
	 * @generated
	 */
	EClass getFeatureModel();

	/**
	 * Returns the meta object for the containment reference list '{@link EFM.FeatureModel#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see EFM.FeatureModel#getConstraints()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_Constraints();

	/**
	 * Returns the meta object for the containment reference '{@link EFM.FeatureModel#getRootFeature <em>Root Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Feature</em>'.
	 * @see EFM.FeatureModel#getRootFeature()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_RootFeature();

	/**
	 * Returns the meta object for class '{@link EFM.FMElement <em>FM Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FM Element</em>'.
	 * @see EFM.FMElement
	 * @generated
	 */
	EClass getFMElement();

	/**
	 * Returns the meta object for class '{@link EFM.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see EFM.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the containment reference list '{@link EFM.Feature#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see EFM.Feature#getAttributes()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link EFM.Feature#getSubFeatures <em>Sub Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Features</em>'.
	 * @see EFM.Feature#getSubFeatures()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_SubFeatures();

	/**
	 * Returns the meta object for the containment reference '{@link EFM.Feature#getFeatureCardinality <em>Feature Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Feature Cardinality</em>'.
	 * @see EFM.Feature#getFeatureCardinality()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_FeatureCardinality();

	/**
	 * Returns the meta object for the attribute '{@link EFM.Feature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see EFM.Feature#getName()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link EFM.Feature#getNodeFeature <em>Node Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Feature</em>'.
	 * @see EFM.Feature#getNodeFeature()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_NodeFeature();

	/**
	 * Returns the meta object for class '{@link EFM.Exclusive <em>Exclusive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclusive</em>'.
	 * @see EFM.Exclusive
	 * @generated
	 */
	EClass getExclusive();

	/**
	 * Returns the meta object for class '{@link EFM.Alternative <em>Alternative</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternative</em>'.
	 * @see EFM.Alternative
	 * @generated
	 */
	EClass getAlternative();

	/**
	 * Returns the meta object for the containment reference list '{@link EFM.Alternative#getVariants <em>Variants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variants</em>'.
	 * @see EFM.Alternative#getVariants()
	 * @see #getAlternative()
	 * @generated
	 */
	EReference getAlternative_Variants();

	/**
	 * Returns the meta object for class '{@link EFM.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality</em>'.
	 * @see EFM.Cardinality
	 * @generated
	 */
	EClass getCardinality();

	/**
	 * Returns the meta object for the attribute '{@link EFM.Cardinality#getCardinalityMin <em>Cardinality Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality Min</em>'.
	 * @see EFM.Cardinality#getCardinalityMin()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_CardinalityMin();

	/**
	 * Returns the meta object for the attribute '{@link EFM.Cardinality#getCardinalityMax <em>Cardinality Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cardinality Max</em>'.
	 * @see EFM.Cardinality#getCardinalityMax()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_CardinalityMax();

	/**
	 * Returns the meta object for the attribute '{@link EFM.Cardinality#getConfigValue <em>Config Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Config Value</em>'.
	 * @see EFM.Cardinality#getConfigValue()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_ConfigValue();

	/**
	 * Returns the meta object for class '{@link EFM.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see EFM.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link EFM.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see EFM.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the containment reference '{@link EFM.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see EFM.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Value();

	/**
	 * Returns the meta object for class '{@link EFM.FMConstraint <em>FM Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FM Constraint</em>'.
	 * @see EFM.FMConstraint
	 * @generated
	 */
	EClass getFMConstraint();

	/**
	 * Returns the meta object for class '{@link EFM.BooleanConstraint <em>Boolean Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Constraint</em>'.
	 * @see EFM.BooleanConstraint
	 * @generated
	 */
	EClass getBooleanConstraint();

	/**
	 * Returns the meta object for the reference '{@link EFM.BooleanConstraint#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see EFM.BooleanConstraint#getFrom()
	 * @see #getBooleanConstraint()
	 * @generated
	 */
	EReference getBooleanConstraint_From();

	/**
	 * Returns the meta object for the reference '{@link EFM.BooleanConstraint#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see EFM.BooleanConstraint#getTo()
	 * @see #getBooleanConstraint()
	 * @generated
	 */
	EReference getBooleanConstraint_To();

	/**
	 * Returns the meta object for class '{@link EFM.FeatCardinality <em>Feat Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feat Cardinality</em>'.
	 * @see EFM.FeatCardinality
	 * @generated
	 */
	EClass getFeatCardinality();

	/**
	 * Returns the meta object for class '{@link EFM.Implies <em>Implies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implies</em>'.
	 * @see EFM.Implies
	 * @generated
	 */
	EClass getImplies();

	/**
	 * Returns the meta object for class '{@link EFM.Excludes <em>Excludes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Excludes</em>'.
	 * @see EFM.Excludes
	 * @generated
	 */
	EClass getExcludes();

	/**
	 * Returns the meta object for class '{@link EFM.Requires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requires</em>'.
	 * @see EFM.Requires
	 * @generated
	 */
	EClass getRequires();

	/**
	 * Returns the meta object for the containment reference list '{@link EFM.Requires#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see EFM.Requires#getConditions()
	 * @see #getRequires()
	 * @generated
	 */
	EReference getRequires_Conditions();

	/**
	 * Returns the meta object for the containment reference '{@link EFM.Requires#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see EFM.Requires#getAction()
	 * @see #getRequires()
	 * @generated
	 */
	EReference getRequires_Action();

	/**
	 * Returns the meta object for the attribute '{@link EFM.Requires#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see EFM.Requires#getOperator()
	 * @see #getRequires()
	 * @generated
	 */
	EAttribute getRequires_Operator();

	/**
	 * Returns the meta object for class '{@link EFM.Functional <em>Functional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional</em>'.
	 * @see EFM.Functional
	 * @generated
	 */
	EClass getFunctional();

	/**
	 * Returns the meta object for the reference '{@link EFM.Functional#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see EFM.Functional#getFrom()
	 * @see #getFunctional()
	 * @generated
	 */
	EReference getFunctional_From();

	/**
	 * Returns the meta object for the reference '{@link EFM.Functional#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see EFM.Functional#getTo()
	 * @see #getFunctional()
	 * @generated
	 */
	EReference getFunctional_To();

	/**
	 * Returns the meta object for the attribute '{@link EFM.Functional#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see EFM.Functional#getType()
	 * @see #getFunctional()
	 * @generated
	 */
	EAttribute getFunctional_Type();

	/**
	 * Returns the meta object for the attribute '{@link EFM.Functional#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see EFM.Functional#getValue()
	 * @see #getFunctional()
	 * @generated
	 */
	EAttribute getFunctional_Value();

	/**
	 * Returns the meta object for class '{@link EFM.Comparison <em>Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison</em>'.
	 * @see EFM.Comparison
	 * @generated
	 */
	EClass getComparison();

	/**
	 * Returns the meta object for the reference '{@link EFM.Comparison#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see EFM.Comparison#getFrom()
	 * @see #getComparison()
	 * @generated
	 */
	EReference getComparison_From();

	/**
	 * Returns the meta object for the reference '{@link EFM.Comparison#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see EFM.Comparison#getTo()
	 * @see #getComparison()
	 * @generated
	 */
	EReference getComparison_To();

	/**
	 * Returns the meta object for the attribute '{@link EFM.Comparison#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see EFM.Comparison#getType()
	 * @see #getComparison()
	 * @generated
	 */
	EAttribute getComparison_Type();

	/**
	 * Returns the meta object for class '{@link EFM.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see EFM.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the reference '{@link EFM.Operation#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see EFM.Operation#getFeature()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Feature();

	/**
	 * Returns the meta object for class '{@link EFM.RangeOperation <em>Range Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range Operation</em>'.
	 * @see EFM.RangeOperation
	 * @generated
	 */
	EClass getRangeOperation();

	/**
	 * Returns the meta object for the attribute '{@link EFM.RangeOperation#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see EFM.RangeOperation#getMin()
	 * @see #getRangeOperation()
	 * @generated
	 */
	EAttribute getRangeOperation_Min();

	/**
	 * Returns the meta object for the attribute '{@link EFM.RangeOperation#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see EFM.RangeOperation#getMax()
	 * @see #getRangeOperation()
	 * @generated
	 */
	EAttribute getRangeOperation_Max();

	/**
	 * Returns the meta object for the reference '{@link EFM.RangeOperation#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see EFM.RangeOperation#getAttribute()
	 * @see #getRangeOperation()
	 * @generated
	 */
	EReference getRangeOperation_Attribute();

	/**
	 * Returns the meta object for class '{@link EFM.ValueOperation <em>Value Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Operation</em>'.
	 * @see EFM.ValueOperation
	 * @generated
	 */
	EClass getValueOperation();

	/**
	 * Returns the meta object for the reference '{@link EFM.ValueOperation#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see EFM.ValueOperation#getAttribute()
	 * @see #getValueOperation()
	 * @generated
	 */
	EReference getValueOperation_Attribute();

	/**
	 * Returns the meta object for the containment reference '{@link EFM.ValueOperation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see EFM.ValueOperation#getValue()
	 * @see #getValueOperation()
	 * @generated
	 */
	EReference getValueOperation_Value();

	/**
	 * Returns the meta object for class '{@link EFM.Colocated <em>Colocated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colocated</em>'.
	 * @see EFM.Colocated
	 * @generated
	 */
	EClass getColocated();

	/**
	 * Returns the meta object for the reference '{@link EFM.Colocated#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see EFM.Colocated#getFrom()
	 * @see #getColocated()
	 * @generated
	 */
	EReference getColocated_From();

	/**
	 * Returns the meta object for the reference list '{@link EFM.Colocated#getFromAgain <em>From Again</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Again</em>'.
	 * @see EFM.Colocated#getFromAgain()
	 * @see #getColocated()
	 * @generated
	 */
	EReference getColocated_FromAgain();

	/**
	 * Returns the meta object for class '{@link EFM.NodeFeature <em>Node Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Feature</em>'.
	 * @see EFM.NodeFeature
	 * @generated
	 */
	EClass getNodeFeature();

	/**
	 * Returns the meta object for the attribute '{@link EFM.NodeFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see EFM.NodeFeature#getName()
	 * @see #getNodeFeature()
	 * @generated
	 */
	EAttribute getNodeFeature_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link EFM.NodeFeature#getNodeAttributes <em>Node Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Node Attributes</em>'.
	 * @see EFM.NodeFeature#getNodeAttributes()
	 * @see #getNodeFeature()
	 * @generated
	 */
	EReference getNodeFeature_NodeAttributes();

	/**
	 * Returns the meta object for the containment reference '{@link EFM.NodeFeature#getNodeCardinalities <em>Node Cardinalities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Node Cardinalities</em>'.
	 * @see EFM.NodeFeature#getNodeCardinalities()
	 * @see #getNodeFeature()
	 * @generated
	 */
	EReference getNodeFeature_NodeCardinalities();

	/**
	 * Returns the meta object for the containment reference '{@link EFM.NodeFeature#getHostedBy <em>Hosted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hosted By</em>'.
	 * @see EFM.NodeFeature#getHostedBy()
	 * @see #getNodeFeature()
	 * @generated
	 */
	EReference getNodeFeature_HostedBy();

	/**
	 * Returns the meta object for the containment reference '{@link EFM.NodeFeature#getNotHostedBy <em>Not Hosted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Not Hosted By</em>'.
	 * @see EFM.NodeFeature#getNotHostedBy()
	 * @see #getNodeFeature()
	 * @generated
	 */
	EReference getNodeFeature_NotHostedBy();

	/**
	 * Returns the meta object for class '{@link EFM.HostedBy <em>Hosted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hosted By</em>'.
	 * @see EFM.HostedBy
	 * @generated
	 */
	EClass getHostedBy();

	/**
	 * Returns the meta object for the reference list '{@link EFM.HostedBy#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From</em>'.
	 * @see EFM.HostedBy#getFrom()
	 * @see #getHostedBy()
	 * @generated
	 */
	EReference getHostedBy_From();

	/**
	 * Returns the meta object for the reference '{@link EFM.HostedBy#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see EFM.HostedBy#getTo()
	 * @see #getHostedBy()
	 * @generated
	 */
	EReference getHostedBy_To();

	/**
	 * Returns the meta object for class '{@link EFM.Separated <em>Separated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Separated</em>'.
	 * @see EFM.Separated
	 * @generated
	 */
	EClass getSeparated();

	/**
	 * Returns the meta object for the reference '{@link EFM.Separated#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see EFM.Separated#getFrom()
	 * @see #getSeparated()
	 * @generated
	 */
	EReference getSeparated_From();

	/**
	 * Returns the meta object for the reference '{@link EFM.Separated#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see EFM.Separated#getTo()
	 * @see #getSeparated()
	 * @generated
	 */
	EReference getSeparated_To();

	/**
	 * Returns the meta object for class '{@link EFM.ResourceVerification <em>Resource Verification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Verification</em>'.
	 * @see EFM.ResourceVerification
	 * @generated
	 */
	EClass getResourceVerification();

	/**
	 * Returns the meta object for the reference list '{@link EFM.ResourceVerification#getFromAtt <em>From Att</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From Att</em>'.
	 * @see EFM.ResourceVerification#getFromAtt()
	 * @see #getResourceVerification()
	 * @generated
	 */
	EReference getResourceVerification_FromAtt();

	/**
	 * Returns the meta object for the reference '{@link EFM.ResourceVerification#getExtF <em>Ext F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ext F</em>'.
	 * @see EFM.ResourceVerification#getExtF()
	 * @see #getResourceVerification()
	 * @generated
	 */
	EReference getResourceVerification_ExtF();

	/**
	 * Returns the meta object for class '{@link EFM.NotHostedBy <em>Not Hosted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Hosted By</em>'.
	 * @see EFM.NotHostedBy
	 * @generated
	 */
	EClass getNotHostedBy();

	/**
	 * Returns the meta object for the reference '{@link EFM.NotHostedBy#getExtF <em>Ext F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ext F</em>'.
	 * @see EFM.NotHostedBy#getExtF()
	 * @see #getNotHostedBy()
	 * @generated
	 */
	EReference getNotHostedBy_ExtF();

	/**
	 * Returns the meta object for the reference list '{@link EFM.NotHostedBy#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>From</em>'.
	 * @see EFM.NotHostedBy#getFrom()
	 * @see #getNotHostedBy()
	 * @generated
	 */
	EReference getNotHostedBy_From();

	/**
	 * Returns the meta object for class '{@link EFM.NodeFeatureElement <em>Node Feature Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node Feature Element</em>'.
	 * @see EFM.NodeFeatureElement
	 * @generated
	 */
	EClass getNodeFeatureElement();

	/**
	 * Returns the meta object for enum '{@link EFM.ComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comparison Operator</em>'.
	 * @see EFM.ComparisonOperator
	 * @generated
	 */
	EEnum getComparisonOperator();

	/**
	 * Returns the meta object for enum '{@link EFM.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see EFM.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the meta object for enum '{@link EFM.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Operator</em>'.
	 * @see EFM.LogicalOperator
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
	EFMFactory getEFMFactory();

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
		 * The meta object literal for the '{@link EFM.impl.FeatureModelImpl <em>Feature Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.impl.FeatureModelImpl
		 * @see EFM.impl.EFMPackageImpl#getFeatureModel()
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
		 * The meta object literal for the '{@link EFM.impl.FMElementImpl <em>FM Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.impl.FMElementImpl
		 * @see EFM.impl.EFMPackageImpl#getFMElement()
		 * @generated
		 */
		EClass FM_ELEMENT = eINSTANCE.getFMElement();

		/**
		 * The meta object literal for the '{@link EFM.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.impl.FeatureImpl
		 * @see EFM.impl.EFMPackageImpl#getFeature()
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
		 * The meta object literal for the '{@link EFM.impl.ExclusiveImpl <em>Exclusive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.impl.ExclusiveImpl
		 * @see EFM.impl.EFMPackageImpl#getExclusive()
		 * @generated
		 */
		EClass EXCLUSIVE = eINSTANCE.getExclusive();

		/**
		 * The meta object literal for the '{@link EFM.impl.AlternativeImpl <em>Alternative</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.impl.AlternativeImpl
		 * @see EFM.impl.EFMPackageImpl#getAlternative()
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
		 * The meta object literal for the '{@link EFM.impl.CardinalityImpl <em>Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.impl.CardinalityImpl
		 * @see EFM.impl.EFMPackageImpl#getCardinality()
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
		 * The meta object literal for the '{@link EFM.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.impl.AttributeImpl
		 * @see EFM.impl.EFMPackageImpl#getAttribute()
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
		 * The meta object literal for the '{@link EFM.impl.FMConstraintImpl <em>FM Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.impl.FMConstraintImpl
		 * @see EFM.impl.EFMPackageImpl#getFMConstraint()
		 * @generated
		 */
		EClass FM_CONSTRAINT = eINSTANCE.getFMConstraint();

		/**
		 * The meta object literal for the '{@link EFM.impl.BooleanConstraintImpl <em>Boolean Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.impl.BooleanConstraintImpl
		 * @see EFM.impl.EFMPackageImpl#getBooleanConstraint()
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
		 * The meta object literal for the '{@link EFM.impl.FeatCardinalityImpl <em>Feat Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.impl.FeatCardinalityImpl
		 * @see EFM.impl.EFMPackageImpl#getFeatCardinality()
		 * @generated
		 */
		EClass FEAT_CARDINALITY = eINSTANCE.getFeatCardinality();

		/**
		 * The meta object literal for the '{@link EFM.impl.ImpliesImpl <em>Implies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.impl.ImpliesImpl
		 * @see EFM.impl.EFMPackageImpl#getImplies()
		 * @generated
		 */
		EClass IMPLIES = eINSTANCE.getImplies();

		/**
		 * The meta object literal for the '{@link EFM.impl.ExcludesImpl <em>Excludes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.impl.ExcludesImpl
		 * @see EFM.impl.EFMPackageImpl#getExcludes()
		 * @generated
		 */
		EClass EXCLUDES = eINSTANCE.getExcludes();

		/**
		 * The meta object literal for the '{@link EFM.impl.RequiresImpl <em>Requires</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.impl.RequiresImpl
		 * @see EFM.impl.EFMPackageImpl#getRequires()
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
		 * The meta object literal for the '{@link EFM.impl.FunctionalImpl <em>Functional</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.impl.FunctionalImpl
		 * @see EFM.impl.EFMPackageImpl#getFunctional()
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
		 * The meta object literal for the '{@link EFM.impl.ComparisonImpl <em>Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.impl.ComparisonImpl
		 * @see EFM.impl.EFMPackageImpl#getComparison()
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
		 * The meta object literal for the '{@link EFM.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.impl.OperationImpl
		 * @see EFM.impl.EFMPackageImpl#getOperation()
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
		 * The meta object literal for the '{@link EFM.impl.RangeOperationImpl <em>Range Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.impl.RangeOperationImpl
		 * @see EFM.impl.EFMPackageImpl#getRangeOperation()
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
		 * The meta object literal for the '{@link EFM.impl.ValueOperationImpl <em>Value Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.impl.ValueOperationImpl
		 * @see EFM.impl.EFMPackageImpl#getValueOperation()
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
		 * The meta object literal for the '{@link EFM.impl.ColocatedImpl <em>Colocated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.impl.ColocatedImpl
		 * @see EFM.impl.EFMPackageImpl#getColocated()
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
		 * The meta object literal for the '{@link EFM.impl.NodeFeatureImpl <em>Node Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.impl.NodeFeatureImpl
		 * @see EFM.impl.EFMPackageImpl#getNodeFeature()
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
		 * The meta object literal for the '{@link EFM.impl.HostedByImpl <em>Hosted By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.impl.HostedByImpl
		 * @see EFM.impl.EFMPackageImpl#getHostedBy()
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
		 * The meta object literal for the '{@link EFM.impl.SeparatedImpl <em>Separated</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.impl.SeparatedImpl
		 * @see EFM.impl.EFMPackageImpl#getSeparated()
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
		 * The meta object literal for the '{@link EFM.impl.ResourceVerificationImpl <em>Resource Verification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.impl.ResourceVerificationImpl
		 * @see EFM.impl.EFMPackageImpl#getResourceVerification()
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
		 * The meta object literal for the '{@link EFM.impl.NotHostedByImpl <em>Not Hosted By</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.impl.NotHostedByImpl
		 * @see EFM.impl.EFMPackageImpl#getNotHostedBy()
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
		 * The meta object literal for the '{@link EFM.impl.NodeFeatureElementImpl <em>Node Feature Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.impl.NodeFeatureElementImpl
		 * @see EFM.impl.EFMPackageImpl#getNodeFeatureElement()
		 * @generated
		 */
		EClass NODE_FEATURE_ELEMENT = eINSTANCE.getNodeFeatureElement();

		/**
		 * The meta object literal for the '{@link EFM.ComparisonOperator <em>Comparison Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.ComparisonOperator
		 * @see EFM.impl.EFMPackageImpl#getComparisonOperator()
		 * @generated
		 */
		EEnum COMPARISON_OPERATOR = eINSTANCE.getComparisonOperator();

		/**
		 * The meta object literal for the '{@link EFM.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.Operator
		 * @see EFM.impl.EFMPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '{@link EFM.LogicalOperator <em>Logical Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see EFM.LogicalOperator
		 * @see EFM.impl.EFMPackageImpl#getLogicalOperator()
		 * @generated
		 */
		EEnum LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

	}

} //EFMPackage
