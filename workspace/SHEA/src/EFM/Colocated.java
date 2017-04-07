/**
 */
package EFM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colocated</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EFM.Colocated#getFrom <em>From</em>}</li>
 *   <li>{@link EFM.Colocated#getFromAgain <em>From Again</em>}</li>
 * </ul>
 * </p>
 *
 * @see EFM.EFMPackage#getColocated()
 * @model
 * @generated
 */
public interface Colocated extends FMConstraint {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Feature)
	 * @see EFM.EFMPackage#getColocated_From()
	 * @model required="true"
	 * @generated
	 */
	Feature getFrom();

	/**
	 * Sets the value of the '{@link EFM.Colocated#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Feature value);

	/**
	 * Returns the value of the '<em><b>From Again</b></em>' reference list.
	 * The list contents are of type {@link EFM.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Again</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Again</em>' reference list.
	 * @see EFM.EFMPackage#getColocated_FromAgain()
	 * @model
	 * @generated
	 */
	EList<Feature> getFromAgain();

} // Colocated
