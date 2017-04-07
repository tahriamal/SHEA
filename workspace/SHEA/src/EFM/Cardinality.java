/**
 */
package EFM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link EFM.Cardinality#getCardinalityMin <em>Cardinality Min</em>}</li>
 *   <li>{@link EFM.Cardinality#getCardinalityMax <em>Cardinality Max</em>}</li>
 *   <li>{@link EFM.Cardinality#getConfigValue <em>Config Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see EFM.EFMPackage#getCardinality()
 * @model abstract="true"
 * @generated
 */
public interface Cardinality extends EObject {
	/**
	 * Returns the value of the '<em><b>Cardinality Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality Min</em>' attribute.
	 * @see #setCardinalityMin(int)
	 * @see EFM.EFMPackage#getCardinality_CardinalityMin()
	 * @model required="true"
	 * @generated
	 */
	int getCardinalityMin();

	/**
	 * Sets the value of the '{@link EFM.Cardinality#getCardinalityMin <em>Cardinality Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Min</em>' attribute.
	 * @see #getCardinalityMin()
	 * @generated
	 */
	void setCardinalityMin(int value);

	/**
	 * Returns the value of the '<em><b>Cardinality Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardinality Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality Max</em>' attribute.
	 * @see #setCardinalityMax(int)
	 * @see EFM.EFMPackage#getCardinality_CardinalityMax()
	 * @model required="true"
	 * @generated
	 */
	int getCardinalityMax();

	/**
	 * Sets the value of the '{@link EFM.Cardinality#getCardinalityMax <em>Cardinality Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality Max</em>' attribute.
	 * @see #getCardinalityMax()
	 * @generated
	 */
	void setCardinalityMax(int value);

	/**
	 * Returns the value of the '<em><b>Config Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config Value</em>' attribute.
	 * @see #setConfigValue(int)
	 * @see EFM.EFMPackage#getCardinality_ConfigValue()
	 * @model
	 * @generated
	 */
	int getConfigValue();

	/**
	 * Sets the value of the '{@link EFM.Cardinality#getConfigValue <em>Config Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Config Value</em>' attribute.
	 * @see #getConfigValue()
	 * @generated
	 */
	void setConfigValue(int value);

} // Cardinality
