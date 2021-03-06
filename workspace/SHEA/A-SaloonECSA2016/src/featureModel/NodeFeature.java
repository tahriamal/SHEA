/**
 */
package featureModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureModel.NodeFeature#getName <em>Name</em>}</li>
 *   <li>{@link featureModel.NodeFeature#getNodeAttributes <em>Node Attributes</em>}</li>
 *   <li>{@link featureModel.NodeFeature#getNodeCardinalities <em>Node Cardinalities</em>}</li>
 *   <li>{@link featureModel.NodeFeature#getHostedBy <em>Hosted By</em>}</li>
 *   <li>{@link featureModel.NodeFeature#getNotHostedBy <em>Not Hosted By</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureModel.FeatureModelPackage#getNodeFeature()
 * @model
 * @generated
 */
public interface NodeFeature extends NodeFeatureElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see featureModel.FeatureModelPackage#getNodeFeature_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link featureModel.NodeFeature#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Node Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link featureModel.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Attributes</em>' containment reference list.
	 * @see featureModel.FeatureModelPackage#getNodeFeature_NodeAttributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getNodeAttributes();

	/**
	 * Returns the value of the '<em><b>Node Cardinalities</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Cardinalities</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Cardinalities</em>' containment reference.
	 * @see #setNodeCardinalities(FeatCardinality)
	 * @see featureModel.FeatureModelPackage#getNodeFeature_NodeCardinalities()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeatCardinality getNodeCardinalities();

	/**
	 * Sets the value of the '{@link featureModel.NodeFeature#getNodeCardinalities <em>Node Cardinalities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Cardinalities</em>' containment reference.
	 * @see #getNodeCardinalities()
	 * @generated
	 */
	void setNodeCardinalities(FeatCardinality value);

	/**
	 * Returns the value of the '<em><b>Hosted By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hosted By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hosted By</em>' containment reference.
	 * @see #setHostedBy(HostedBy)
	 * @see featureModel.FeatureModelPackage#getNodeFeature_HostedBy()
	 * @model containment="true"
	 * @generated
	 */
	HostedBy getHostedBy();

	/**
	 * Sets the value of the '{@link featureModel.NodeFeature#getHostedBy <em>Hosted By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hosted By</em>' containment reference.
	 * @see #getHostedBy()
	 * @generated
	 */
	void setHostedBy(HostedBy value);

	/**
	 * Returns the value of the '<em><b>Not Hosted By</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Hosted By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Hosted By</em>' containment reference.
	 * @see #setNotHostedBy(NotHostedBy)
	 * @see featureModel.FeatureModelPackage#getNodeFeature_NotHostedBy()
	 * @model containment="true"
	 * @generated
	 */
	NotHostedBy getNotHostedBy();

	/**
	 * Sets the value of the '{@link featureModel.NodeFeature#getNotHostedBy <em>Not Hosted By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Hosted By</em>' containment reference.
	 * @see #getNotHostedBy()
	 * @generated
	 */
	void setNotHostedBy(NotHostedBy value);

} // NodeFeature
