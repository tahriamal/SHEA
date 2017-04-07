/**
 */
package featureModel.impl;

import featureModel.Feature;
import featureModel.FeatureModelPackage;
import featureModel.NodeFeature;
import featureModel.NotHostedBy;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Not Hosted By</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link featureModel.impl.NotHostedByImpl#getExtF <em>Ext F</em>}</li>
 *   <li>{@link featureModel.impl.NotHostedByImpl#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotHostedByImpl extends FMConstraintImpl implements NotHostedBy {
	/**
	 * The cached value of the '{@link #getExtF() <em>Ext F</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtF()
	 * @generated
	 * @ordered
	 */
	protected NodeFeature extF;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> from;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotHostedByImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureModelPackage.Literals.NOT_HOSTED_BY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeFeature getExtF() {
		if (extF != null && extF.eIsProxy()) {
			InternalEObject oldExtF = (InternalEObject)extF;
			extF = (NodeFeature)eResolveProxy(oldExtF);
			if (extF != oldExtF) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FeatureModelPackage.NOT_HOSTED_BY__EXT_F, oldExtF, extF));
			}
		}
		return extF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeFeature basicGetExtF() {
		return extF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtF(NodeFeature newExtF) {
		NodeFeature oldExtF = extF;
		extF = newExtF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.NOT_HOSTED_BY__EXT_F, oldExtF, extF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFrom() {
		if (from == null) {
			from = new EObjectResolvingEList<Feature>(Feature.class, this, FeatureModelPackage.NOT_HOSTED_BY__FROM);
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeatureModelPackage.NOT_HOSTED_BY__EXT_F:
				if (resolve) return getExtF();
				return basicGetExtF();
			case FeatureModelPackage.NOT_HOSTED_BY__FROM:
				return getFrom();
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
			case FeatureModelPackage.NOT_HOSTED_BY__EXT_F:
				setExtF((NodeFeature)newValue);
				return;
			case FeatureModelPackage.NOT_HOSTED_BY__FROM:
				getFrom().clear();
				getFrom().addAll((Collection<? extends Feature>)newValue);
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
			case FeatureModelPackage.NOT_HOSTED_BY__EXT_F:
				setExtF((NodeFeature)null);
				return;
			case FeatureModelPackage.NOT_HOSTED_BY__FROM:
				getFrom().clear();
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
			case FeatureModelPackage.NOT_HOSTED_BY__EXT_F:
				return extF != null;
			case FeatureModelPackage.NOT_HOSTED_BY__FROM:
				return from != null && !from.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NotHostedByImpl
