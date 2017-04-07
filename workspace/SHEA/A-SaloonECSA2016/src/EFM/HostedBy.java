/**
 */
package EFM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hosted By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EFM.HostedBy#getFrom <em>From</em>}</li>
 *   <li>{@link EFM.HostedBy#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see EFM.EFMPackage#getHostedBy()
 * @model
 * @generated
 */
public interface HostedBy extends FMConstraint {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference list.
	 * The list contents are of type {@link EFM.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference list.
	 * @see EFM.EFMPackage#getHostedBy_From()
	 * @model required="true"
	 * @generated
	 */
	EList<Feature> getFrom();

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(NodeFeature)
	 * @see EFM.EFMPackage#getHostedBy_To()
	 * @model required="true"
	 * @generated
	 */
	NodeFeature getTo();

	/**
	 * Sets the value of the '{@link EFM.HostedBy#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(NodeFeature value);

} // HostedBy
