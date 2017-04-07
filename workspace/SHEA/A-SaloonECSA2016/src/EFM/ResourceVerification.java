/**
 */
package EFM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Verification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EFM.ResourceVerification#getFromAtt <em>From Att</em>}</li>
 *   <li>{@link EFM.ResourceVerification#getExtF <em>Ext F</em>}</li>
 * </ul>
 * </p>
 *
 * @see EFM.EFMPackage#getResourceVerification()
 * @model
 * @generated
 */
public interface ResourceVerification extends FMConstraint {
	/**
	 * Returns the value of the '<em><b>From Att</b></em>' reference list.
	 * The list contents are of type {@link EFM.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Att</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Att</em>' reference list.
	 * @see EFM.EFMPackage#getResourceVerification_FromAtt()
	 * @model required="true"
	 * @generated
	 */
	EList<Attribute> getFromAtt();

	/**
	 * Returns the value of the '<em><b>Ext F</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext F</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext F</em>' reference.
	 * @see #setExtF(Attribute)
	 * @see EFM.EFMPackage#getResourceVerification_ExtF()
	 * @model required="true"
	 * @generated
	 */
	Attribute getExtF();

	/**
	 * Sets the value of the '{@link EFM.ResourceVerification#getExtF <em>Ext F</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext F</em>' reference.
	 * @see #getExtF()
	 * @generated
	 */
	void setExtF(Attribute value);

} // ResourceVerification
