/**
 */
package featureModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureModel.Operation#getFeature <em>Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureModel.FeatureModelPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(Feature)
	 * @see featureModel.FeatureModelPackage#getOperation_Feature()
	 * @model required="true"
	 * @generated
	 */
	Feature getFeature();

	/**
	 * Sets the value of the '{@link featureModel.Operation#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(Feature value);

} // Operation
