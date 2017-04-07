/**
 */
package featureModel;

import type.IntValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureModel.ValueOperation#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link featureModel.ValueOperation#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureModel.FeatureModelPackage#getValueOperation()
 * @model
 * @generated
 */
public interface ValueOperation extends Operation {
	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' reference.
	 * @see #setAttribute(Attribute)
	 * @see featureModel.FeatureModelPackage#getValueOperation_Attribute()
	 * @model
	 * @generated
	 */
	Attribute getAttribute();

	/**
	 * Sets the value of the '{@link featureModel.ValueOperation#getAttribute <em>Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Attribute value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' containment reference.
	 * @see #setValue(IntValue)
	 * @see featureModel.FeatureModelPackage#getValueOperation_Value()
	 * @model containment="true" required="true"
	 * @generated
	 */
	IntValue getValue();

	/**
	 * Sets the value of the '{@link featureModel.ValueOperation#getValue <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' containment reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(IntValue value);

} // ValueOperation
