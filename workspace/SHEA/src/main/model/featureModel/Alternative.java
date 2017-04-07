/**
 */
package featureModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link featureModel.Alternative#getVariants <em>Variants</em>}</li>
 * </ul>
 * </p>
 *
 * @see featureModel.FeatureModelPackage#getAlternative()
 * @model
 * @generated
 */
public interface Alternative extends Feature {
	/**
	 * Returns the value of the '<em><b>Variants</b></em>' containment reference list.
	 * The list contents are of type {@link featureModel.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variants</em>' containment reference list.
	 * @see featureModel.FeatureModelPackage#getAlternative_Variants()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Feature> getVariants();

} // Alternative
