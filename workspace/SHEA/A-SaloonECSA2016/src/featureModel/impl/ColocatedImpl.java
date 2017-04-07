/**
 */
package featureModel.impl;

import featureModel.Colocated;
import featureModel.Feature;
import featureModel.FeatureModelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colocated</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link featureModel.impl.ColocatedImpl#getFrom <em>From</em>}</li>
 *   <li>{@link featureModel.impl.ColocatedImpl#getFromAgain <em>From Again</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColocatedImpl extends FMConstraintImpl implements Colocated {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Feature from;

	/**
	 * The cached value of the '{@link #getFromAgain() <em>From Again</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromAgain()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> fromAgain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColocatedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureModelPackage.Literals.COLOCATED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (Feature)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeatureModelPackage.COLOCATED__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(Feature newFrom) {
		Feature oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.COLOCATED__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFromAgain() {
		if (fromAgain == null) {
			fromAgain = new EObjectResolvingEList<Feature>(Feature.class, this, FeatureModelPackage.COLOCATED__FROM_AGAIN);
		}
		return fromAgain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeatureModelPackage.COLOCATED__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case FeatureModelPackage.COLOCATED__FROM_AGAIN:
				return getFromAgain();
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
			case FeatureModelPackage.COLOCATED__FROM:
				setFrom((Feature)newValue);
				return;
			case FeatureModelPackage.COLOCATED__FROM_AGAIN:
				getFromAgain().clear();
				getFromAgain().addAll((Collection<? extends Feature>)newValue);
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
			case FeatureModelPackage.COLOCATED__FROM:
				setFrom((Feature)null);
				return;
			case FeatureModelPackage.COLOCATED__FROM_AGAIN:
				getFromAgain().clear();
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
			case FeatureModelPackage.COLOCATED__FROM:
				return from != null;
			case FeatureModelPackage.COLOCATED__FROM_AGAIN:
				return fromAgain != null && !fromAgain.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ColocatedImpl
