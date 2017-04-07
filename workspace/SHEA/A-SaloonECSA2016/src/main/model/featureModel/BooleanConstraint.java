/**
 */
package featureModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureModel.BooleanConstraint#getFrom <em>From</em>}</li>
 *   <li>{@link featureModel.BooleanConstraint#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureModel.FeatureModelPackage#getBooleanConstraint()
 * @model abstract="true"
 * @generated
 */
public interface BooleanConstraint extends FMConstraint {
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
	 * @see featureModel.FeatureModelPackage#getBooleanConstraint_From()
	 * @model required="true"
	 * @generated
	 */
	Feature getFrom();

	/**
	 * Sets the value of the '{@link featureModel.BooleanConstraint#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Feature value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Feature)
	 * @see featureModel.FeatureModelPackage#getBooleanConstraint_To()
	 * @model required="true"
	 * @generated
	 */
	Feature getTo();

	/**
	 * Sets the value of the '{@link featureModel.BooleanConstraint#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Feature value);

} // BooleanConstraint
