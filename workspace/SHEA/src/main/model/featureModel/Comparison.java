/**
 */
package featureModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureModel.Comparison#getFrom <em>From</em>}</li>
 *   <li>{@link featureModel.Comparison#getTo <em>To</em>}</li>
 *   <li>{@link featureModel.Comparison#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureModel.FeatureModelPackage#getComparison()
 * @model
 * @generated
 */
public interface Comparison extends FMConstraint {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(FMElement)
	 * @see featureModel.FeatureModelPackage#getComparison_From()
	 * @model required="true"
	 * @generated
	 */
	FMElement getFrom();

	/**
	 * Sets the value of the '{@link featureModel.Comparison#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(FMElement value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(FMElement)
	 * @see featureModel.FeatureModelPackage#getComparison_To()
	 * @model required="true"
	 * @generated
	 */
	FMElement getTo();

	/**
	 * Sets the value of the '{@link featureModel.Comparison#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(FMElement value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link featureModel.ComparisonOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see featureModel.ComparisonOperator
	 * @see #setType(ComparisonOperator)
	 * @see featureModel.FeatureModelPackage#getComparison_Type()
	 * @model required="true"
	 * @generated
	 */
	ComparisonOperator getType();

	/**
	 * Sets the value of the '{@link featureModel.Comparison#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see featureModel.ComparisonOperator
	 * @see #getType()
	 * @generated
	 */
	void setType(ComparisonOperator value);

} // Comparison
