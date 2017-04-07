/**
 */
package featureModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Not Hosted By</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureModel.NotHostedBy#getExtF <em>Ext F</em>}</li>
 *   <li>{@link featureModel.NotHostedBy#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureModel.FeatureModelPackage#getNotHostedBy()
 * @model
 * @generated
 */
public interface NotHostedBy extends FMConstraint {
	/**
	 * Returns the value of the '<em><b>Ext F</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ext F</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext F</em>' reference.
	 * @see #setExtF(NodeFeature)
	 * @see featureModel.FeatureModelPackage#getNotHostedBy_ExtF()
	 * @model required="true"
	 * @generated
	 */
	NodeFeature getExtF();

	/**
	 * Sets the value of the '{@link featureModel.NotHostedBy#getExtF <em>Ext F</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext F</em>' reference.
	 * @see #getExtF()
	 * @generated
	 */
	void setExtF(NodeFeature value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference list.
	 * The list contents are of type {@link featureModel.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference list.
	 * @see featureModel.FeatureModelPackage#getNotHostedBy_From()
	 * @model required="true"
	 * @generated
	 */
	EList<Feature> getFrom();

} // NotHostedBy
