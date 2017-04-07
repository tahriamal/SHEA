/**
 */
package featureModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requires</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureModel.Requires#getConditions <em>Conditions</em>}</li>
 *   <li>{@link featureModel.Requires#getAction <em>Action</em>}</li>
 *   <li>{@link featureModel.Requires#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureModel.FeatureModelPackage#getRequires()
 * @model
 * @generated
 */
public interface Requires extends FMConstraint {
	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link featureModel.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see featureModel.FeatureModelPackage#getRequires_Conditions()
	 * @model containment="true" required="true" upper="2"
	 * @generated
	 */
	EList<Operation> getConditions();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(Operation)
	 * @see featureModel.FeatureModelPackage#getRequires_Action()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Operation getAction();

	/**
	 * Sets the value of the '{@link featureModel.Requires#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Operation value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link featureModel.LogicalOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see featureModel.LogicalOperator
	 * @see #setOperator(LogicalOperator)
	 * @see featureModel.FeatureModelPackage#getRequires_Operator()
	 * @model
	 * @generated
	 */
	LogicalOperator getOperator();

	/**
	 * Sets the value of the '{@link featureModel.Requires#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see featureModel.LogicalOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(LogicalOperator value);

} // Requires
