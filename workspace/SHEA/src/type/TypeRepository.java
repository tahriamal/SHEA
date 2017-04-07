/**
 */
package type;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link type.TypeRepository#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see type.TypePackage#getTypeRepository()
 * @model
 * @generated
 */
public interface TypeRepository extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
	 * The list contents are of type {@link type.Value}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference list.
	 * @see type.TypePackage#getTypeRepository_DataTypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Value> getDataTypes();

} // TypeRepository
