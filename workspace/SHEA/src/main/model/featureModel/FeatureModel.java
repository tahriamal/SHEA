/**
 */
package featureModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureModel.FeatureModel#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link featureModel.FeatureModel#getRootFeature <em>Root Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureModel.FeatureModelPackage#getFeatureModel()
 * @model
 * @generated
 */
public interface FeatureModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference list.
	 * The list contents are of type {@link featureModel.FMConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference list.
	 * @see featureModel.FeatureModelPackage#getFeatureModel_Constraints()
	 * @model containment="true"
	 * @generated
	 */
	EList<FMConstraint> getConstraints();

	/**
	 * Returns the value of the '<em><b>Root Feature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Feature</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Feature</em>' containment reference.
	 * @see #setRootFeature(Feature)
	 * @see featureModel.FeatureModelPackage#getFeatureModel_RootFeature()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Feature getRootFeature();

	/**
	 * Sets the value of the '{@link featureModel.FeatureModel#getRootFeature <em>Root Feature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Feature</em>' containment reference.
	 * @see #getRootFeature()
	 * @generated
	 */
	void setRootFeature(Feature value);

} // FeatureModel
