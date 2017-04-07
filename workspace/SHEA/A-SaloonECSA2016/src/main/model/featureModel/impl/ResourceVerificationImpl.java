/**
 */
package featureModel.impl;

import featureModel.Attribute;
import featureModel.FeatureModelPackage;
import featureModel.ResourceVerification;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Verification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link featureModel.impl.ResourceVerificationImpl#getFromAtt <em>From Att</em>}</li>
 *   <li>{@link featureModel.impl.ResourceVerificationImpl#getExtF <em>Ext F</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResourceVerificationImpl extends FMConstraintImpl implements ResourceVerification {
	/**
	 * The cached value of the '{@link #getFromAtt() <em>From Att</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromAtt()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> fromAtt;

	/**
	 * The cached value of the '{@link #getExtF() <em>Ext F</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtF()
	 * @generated
	 * @ordered
	 */
	protected Attribute extF;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceVerificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureModelPackage.Literals.RESOURCE_VERIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getFromAtt() {
		if (fromAtt == null) {
			fromAtt = new EObjectResolvingEList<Attribute>(Attribute.class, this, FeatureModelPackage.RESOURCE_VERIFICATION__FROM_ATT);
		}
		return fromAtt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getExtF() {
		if (extF != null && extF.eIsProxy()) {
			InternalEObject oldExtF = (InternalEObject)extF;
			extF = (Attribute)eResolveProxy(oldExtF);
			if (extF != oldExtF) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeatureModelPackage.RESOURCE_VERIFICATION__EXT_F, oldExtF, extF));
			}
		}
		return extF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetExtF() {
		return extF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtF(Attribute newExtF) {
		Attribute oldExtF = extF;
		extF = newExtF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.RESOURCE_VERIFICATION__EXT_F, oldExtF, extF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeatureModelPackage.RESOURCE_VERIFICATION__FROM_ATT:
				return getFromAtt();
			case FeatureModelPackage.RESOURCE_VERIFICATION__EXT_F:
				if (resolve) return getExtF();
				return basicGetExtF();
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
			case FeatureModelPackage.RESOURCE_VERIFICATION__FROM_ATT:
				getFromAtt().clear();
				getFromAtt().addAll((Collection<? extends Attribute>)newValue);
				return;
			case FeatureModelPackage.RESOURCE_VERIFICATION__EXT_F:
				setExtF((Attribute)newValue);
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
			case FeatureModelPackage.RESOURCE_VERIFICATION__FROM_ATT:
				getFromAtt().clear();
				return;
			case FeatureModelPackage.RESOURCE_VERIFICATION__EXT_F:
				setExtF((Attribute)null);
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
			case FeatureModelPackage.RESOURCE_VERIFICATION__FROM_ATT:
				return fromAtt != null && !fromAtt.isEmpty();
			case FeatureModelPackage.RESOURCE_VERIFICATION__EXT_F:
				return extF != null;
		}
		return super.eIsSet(featureID);
	}

} //ResourceVerificationImpl
