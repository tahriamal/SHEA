/**
 */
package type;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum List Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link type.EnumListValue#getValues <em>Values</em>}</li>
 *   <li>{@link type.EnumListValue#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see type.TypePackage#getEnumListValue()
 * @model
 * @generated
 */
public interface EnumListValue extends Value {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link type.EnumValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see type.TypePackage#getEnumListValue_Values()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<EnumValue> getValues();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(EnumValue)
	 * @see type.TypePackage#getEnumListValue_Value()
	 * @model
	 * @generated
	 */
	EnumValue getValue();

	/**
	 * Sets the value of the '{@link type.EnumListValue#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(EnumValue value);

} // EnumListValue
