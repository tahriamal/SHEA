/**
 */
package EFM.impl;

import EFM.Attribute;
import EFM.EFMPackage;
import EFM.FeatCardinality;
import EFM.HostedBy;
import EFM.NodeFeature;
import EFM.NotHostedBy;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link EFM.impl.NodeFeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link EFM.impl.NodeFeatureImpl#getNodeAttributes <em>Node Attributes</em>}</li>
 *   <li>{@link EFM.impl.NodeFeatureImpl#getNodeCardinalities <em>Node Cardinalities</em>}</li>
 *   <li>{@link EFM.impl.NodeFeatureImpl#getHostedBy <em>Hosted By</em>}</li>
 *   <li>{@link EFM.impl.NodeFeatureImpl#getNotHostedBy <em>Not Hosted By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeFeatureImpl extends NodeFeatureElementImpl implements NodeFeature {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNodeAttributes() <em>Node Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> nodeAttributes;

	/**
	 * The cached value of the '{@link #getNodeCardinalities() <em>Node Cardinalities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeCardinalities()
	 * @generated
	 * @ordered
	 */
	protected FeatCardinality nodeCardinalities;

	/**
	 * The cached value of the '{@link #getHostedBy() <em>Hosted By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostedBy()
	 * @generated
	 * @ordered
	 */
	protected HostedBy hostedBy;

	/**
	 * The cached value of the '{@link #getNotHostedBy() <em>Not Hosted By</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotHostedBy()
	 * @generated
	 * @ordered
	 */
	protected NotHostedBy notHostedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EFMPackage.Literals.NODE_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EFMPackage.NODE_FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getNodeAttributes() {
		if (nodeAttributes == null) {
			nodeAttributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, EFMPackage.NODE_FEATURE__NODE_ATTRIBUTES);
		}
		return nodeAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatCardinality getNodeCardinalities() {
		return nodeCardinalities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNodeCardinalities(FeatCardinality newNodeCardinalities, NotificationChain msgs) {
		FeatCardinality oldNodeCardinalities = nodeCardinalities;
		nodeCardinalities = newNodeCardinalities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EFMPackage.NODE_FEATURE__NODE_CARDINALITIES, oldNodeCardinalities, newNodeCardinalities);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeCardinalities(FeatCardinality newNodeCardinalities) {
		if (newNodeCardinalities != nodeCardinalities) {
			NotificationChain msgs = null;
			if (nodeCardinalities != null)
				msgs = ((InternalEObject)nodeCardinalities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EFMPackage.NODE_FEATURE__NODE_CARDINALITIES, null, msgs);
			if (newNodeCardinalities != null)
				msgs = ((InternalEObject)newNodeCardinalities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EFMPackage.NODE_FEATURE__NODE_CARDINALITIES, null, msgs);
			msgs = basicSetNodeCardinalities(newNodeCardinalities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EFMPackage.NODE_FEATURE__NODE_CARDINALITIES, newNodeCardinalities, newNodeCardinalities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostedBy getHostedBy() {
		return hostedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHostedBy(HostedBy newHostedBy, NotificationChain msgs) {
		HostedBy oldHostedBy = hostedBy;
		hostedBy = newHostedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EFMPackage.NODE_FEATURE__HOSTED_BY, oldHostedBy, newHostedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostedBy(HostedBy newHostedBy) {
		if (newHostedBy != hostedBy) {
			NotificationChain msgs = null;
			if (hostedBy != null)
				msgs = ((InternalEObject)hostedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EFMPackage.NODE_FEATURE__HOSTED_BY, null, msgs);
			if (newHostedBy != null)
				msgs = ((InternalEObject)newHostedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EFMPackage.NODE_FEATURE__HOSTED_BY, null, msgs);
			msgs = basicSetHostedBy(newHostedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EFMPackage.NODE_FEATURE__HOSTED_BY, newHostedBy, newHostedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotHostedBy getNotHostedBy() {
		return notHostedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotHostedBy(NotHostedBy newNotHostedBy, NotificationChain msgs) {
		NotHostedBy oldNotHostedBy = notHostedBy;
		notHostedBy = newNotHostedBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EFMPackage.NODE_FEATURE__NOT_HOSTED_BY, oldNotHostedBy, newNotHostedBy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotHostedBy(NotHostedBy newNotHostedBy) {
		if (newNotHostedBy != notHostedBy) {
			NotificationChain msgs = null;
			if (notHostedBy != null)
				msgs = ((InternalEObject)notHostedBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EFMPackage.NODE_FEATURE__NOT_HOSTED_BY, null, msgs);
			if (newNotHostedBy != null)
				msgs = ((InternalEObject)newNotHostedBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EFMPackage.NODE_FEATURE__NOT_HOSTED_BY, null, msgs);
			msgs = basicSetNotHostedBy(newNotHostedBy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EFMPackage.NODE_FEATURE__NOT_HOSTED_BY, newNotHostedBy, newNotHostedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EFMPackage.NODE_FEATURE__NODE_ATTRIBUTES:
				return ((InternalEList<?>)getNodeAttributes()).basicRemove(otherEnd, msgs);
			case EFMPackage.NODE_FEATURE__NODE_CARDINALITIES:
				return basicSetNodeCardinalities(null, msgs);
			case EFMPackage.NODE_FEATURE__HOSTED_BY:
				return basicSetHostedBy(null, msgs);
			case EFMPackage.NODE_FEATURE__NOT_HOSTED_BY:
				return basicSetNotHostedBy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EFMPackage.NODE_FEATURE__NAME:
				return getName();
			case EFMPackage.NODE_FEATURE__NODE_ATTRIBUTES:
				return getNodeAttributes();
			case EFMPackage.NODE_FEATURE__NODE_CARDINALITIES:
				return getNodeCardinalities();
			case EFMPackage.NODE_FEATURE__HOSTED_BY:
				return getHostedBy();
			case EFMPackage.NODE_FEATURE__NOT_HOSTED_BY:
				return getNotHostedBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EFMPackage.NODE_FEATURE__NAME:
				setName((String)newValue);
				return;
			case EFMPackage.NODE_FEATURE__NODE_ATTRIBUTES:
				getNodeAttributes().clear();
				getNodeAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case EFMPackage.NODE_FEATURE__NODE_CARDINALITIES:
				setNodeCardinalities((FeatCardinality)newValue);
				return;
			case EFMPackage.NODE_FEATURE__HOSTED_BY:
				setHostedBy((HostedBy)newValue);
				return;
			case EFMPackage.NODE_FEATURE__NOT_HOSTED_BY:
				setNotHostedBy((NotHostedBy)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EFMPackage.NODE_FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EFMPackage.NODE_FEATURE__NODE_ATTRIBUTES:
				getNodeAttributes().clear();
				return;
			case EFMPackage.NODE_FEATURE__NODE_CARDINALITIES:
				setNodeCardinalities((FeatCardinality)null);
				return;
			case EFMPackage.NODE_FEATURE__HOSTED_BY:
				setHostedBy((HostedBy)null);
				return;
			case EFMPackage.NODE_FEATURE__NOT_HOSTED_BY:
				setNotHostedBy((NotHostedBy)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EFMPackage.NODE_FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EFMPackage.NODE_FEATURE__NODE_ATTRIBUTES:
				return nodeAttributes != null && !nodeAttributes.isEmpty();
			case EFMPackage.NODE_FEATURE__NODE_CARDINALITIES:
				return nodeCardinalities != null;
			case EFMPackage.NODE_FEATURE__HOSTED_BY:
				return hostedBy != null;
			case EFMPackage.NODE_FEATURE__NOT_HOSTED_BY:
				return notHostedBy != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //NodeFeatureImpl
