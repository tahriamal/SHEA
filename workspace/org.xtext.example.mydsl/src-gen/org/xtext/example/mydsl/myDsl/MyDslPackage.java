/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.configurationImpl <em>configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.configurationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getconfiguration()
   * @generated
   */
  int CONFIGURATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__NAME = MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Components</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__COMPONENTS = MODEL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_FEATURE_COUNT = MODEL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.nodeImpl <em>node</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.nodeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getnode()
   * @generated
   */
  int NODE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE__NAME = MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>node</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_FEATURE_COUNT = MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.relationshipImpl <em>relationship</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.relationshipImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getrelationship()
   * @generated
   */
  int RELATIONSHIP = 4;

  /**
   * The number of structural features of the '<em>relationship</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RELATIONSHIP_FEATURE_COUNT = MODEL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.collocatedImpl <em>collocated</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.collocatedImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getcollocated()
   * @generated
   */
  int COLLOCATED = 7;

  /**
   * The number of structural features of the '<em>collocated</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLOCATED_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.componentImpl <em>component</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.componentImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getcomponent()
   * @generated
   */
  int COMPONENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__NAME = COLLOCATED_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT__RELATIONSHIP = COLLOCATED_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>component</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPONENT_FEATURE_COUNT = COLLOCATED_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.hostedByImpl <em>hosted By</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.hostedByImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#gethostedBy()
   * @generated
   */
  int HOSTED_BY = 5;

  /**
   * The number of structural features of the '<em>hosted By</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HOSTED_BY_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.notHostedByImpl <em>not Hosted By</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.notHostedByImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getnotHostedBy()
   * @generated
   */
  int NOT_HOSTED_BY = 6;

  /**
   * The number of structural features of the '<em>not Hosted By</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_HOSTED_BY_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.separatedImpl <em>separated</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.separatedImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getseparated()
   * @generated
   */
  int SEPARATED = 8;

  /**
   * The number of structural features of the '<em>separated</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEPARATED_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.configuration <em>configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>configuration</em>'.
   * @see org.xtext.example.mydsl.myDsl.configuration
   * @generated
   */
  EClass getconfiguration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.configuration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.configuration#getName()
   * @see #getconfiguration()
   * @generated
   */
  EAttribute getconfiguration_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.configuration#getComponents <em>Components</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Components</em>'.
   * @see org.xtext.example.mydsl.myDsl.configuration#getComponents()
   * @see #getconfiguration()
   * @generated
   */
  EReference getconfiguration_Components();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.node <em>node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>node</em>'.
   * @see org.xtext.example.mydsl.myDsl.node
   * @generated
   */
  EClass getnode();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.node#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.node#getName()
   * @see #getnode()
   * @generated
   */
  EAttribute getnode_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.component <em>component</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>component</em>'.
   * @see org.xtext.example.mydsl.myDsl.component
   * @generated
   */
  EClass getcomponent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.component#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.component#getName()
   * @see #getcomponent()
   * @generated
   */
  EAttribute getcomponent_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.component#getRelationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relationship</em>'.
   * @see org.xtext.example.mydsl.myDsl.component#getRelationship()
   * @see #getcomponent()
   * @generated
   */
  EReference getcomponent_Relationship();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.relationship <em>relationship</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>relationship</em>'.
   * @see org.xtext.example.mydsl.myDsl.relationship
   * @generated
   */
  EClass getrelationship();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.hostedBy <em>hosted By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>hosted By</em>'.
   * @see org.xtext.example.mydsl.myDsl.hostedBy
   * @generated
   */
  EClass gethostedBy();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.notHostedBy <em>not Hosted By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>not Hosted By</em>'.
   * @see org.xtext.example.mydsl.myDsl.notHostedBy
   * @generated
   */
  EClass getnotHostedBy();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.collocated <em>collocated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>collocated</em>'.
   * @see org.xtext.example.mydsl.myDsl.collocated
   * @generated
   */
  EClass getcollocated();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.separated <em>separated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>separated</em>'.
   * @see org.xtext.example.mydsl.myDsl.separated
   * @generated
   */
  EClass getseparated();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.configurationImpl <em>configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.configurationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getconfiguration()
     * @generated
     */
    EClass CONFIGURATION = eINSTANCE.getconfiguration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONFIGURATION__NAME = eINSTANCE.getconfiguration_Name();

    /**
     * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATION__COMPONENTS = eINSTANCE.getconfiguration_Components();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.nodeImpl <em>node</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.nodeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getnode()
     * @generated
     */
    EClass NODE = eINSTANCE.getnode();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE__NAME = eINSTANCE.getnode_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.componentImpl <em>component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.componentImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getcomponent()
     * @generated
     */
    EClass COMPONENT = eINSTANCE.getcomponent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPONENT__NAME = eINSTANCE.getcomponent_Name();

    /**
     * The meta object literal for the '<em><b>Relationship</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPONENT__RELATIONSHIP = eINSTANCE.getcomponent_Relationship();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.relationshipImpl <em>relationship</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.relationshipImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getrelationship()
     * @generated
     */
    EClass RELATIONSHIP = eINSTANCE.getrelationship();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.hostedByImpl <em>hosted By</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.hostedByImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#gethostedBy()
     * @generated
     */
    EClass HOSTED_BY = eINSTANCE.gethostedBy();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.notHostedByImpl <em>not Hosted By</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.notHostedByImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getnotHostedBy()
     * @generated
     */
    EClass NOT_HOSTED_BY = eINSTANCE.getnotHostedBy();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.collocatedImpl <em>collocated</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.collocatedImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getcollocated()
     * @generated
     */
    EClass COLLOCATED = eINSTANCE.getcollocated();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.separatedImpl <em>separated</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.separatedImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getseparated()
     * @generated
     */
    EClass SEPARATED = eINSTANCE.getseparated();

  }

} //MyDslPackage
