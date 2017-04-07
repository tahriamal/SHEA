/**
 */
package EFM.impl;

import EFM.Cardinality;
import EFM.EFMPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cardinality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link EFM.impl.CardinalityImpl#getCardinalityMin <em>Cardinality Min</em>}</li>
 *   <li>{@link EFM.impl.CardinalityImpl#getCardinalityMax <em>Cardinality Max</em>}</li>
 *   <li>{@link EFM.impl.CardinalityImpl#getConfigValue <em>Config Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CardinalityImpl extends MinimalEObjectImpl.Container implements Cardinality {
	/**
	 * The default value of the '{@link #getCardinalityMin() <em>Cardinality Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalityMin()
	 * @generated
	 * @ordered
	 */
	protected static final int CARDINALITY_MIN_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCardinalityMin() <em>Cardinality Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalityMin()
	 * @generated
	 * @ordered
	 */
	protected int cardinalityMin = CARDINALITY_MIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardinalityMax() <em>Cardinality Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalityMax()
	 * @generated
	 * @ordered
	 */
	protected static final int CARDINALITY_MAX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCardinalityMax() <em>Cardinality Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardinalityMax()
	 * @generated
	 * @ordered
	 */
	protected int cardinalityMax = CARDINALITY_MAX_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfigValue() <em>Config Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigValue()
	 * @generated
	 * @ordered
	 */
	protected static final int CONFIG_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConfigValue() <em>Config Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigValue()
	 * @generated
	 * @ordered
	 */
	protected int configValue = CONFIG_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardinalityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EFMPackage.Literals.CARDINALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCardinalityMin() {
		return cardinalityMin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalityMin(int newCardinalityMin) {
		int oldCardinalityMin = cardinalityMin;
		cardinalityMin = newCardinalityMin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EFMPackage.CARDINALITY__CARDINALITY_MIN, oldCardinalityMin, cardinalityMin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCardinalityMax() {
		return cardinalityMax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardinalityMax(int newCardinalityMax) {
		int oldCardinalityMax = cardinalityMax;
		cardinalityMax = newCardinalityMax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EFMPackage.CARDINALITY__CARDINALITY_MAX, oldCardinalityMax, cardinalityMax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConfigValue() {
		return configValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigValue(int newConfigValue) {
		int oldConfigValue = configValue;
		configValue = newConfigValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EFMPackage.CARDINALITY__CONFIG_VALUE, oldConfigValue, configValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EFMPackage.CARDINALITY__CARDINALITY_MIN:
				return getCardinalityMin();
			case EFMPackage.CARDINALITY__CARDINALITY_MAX:
				return getCardinalityMax();
			case EFMPackage.CARDINALITY__CONFIG_VALUE:
				return getConfigValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EFMPackage.CARDINALITY__CARDINALITY_MIN:
				setCardinalityMin((Integer)newValue);
				return;
			case EFMPackage.CARDINALITY__CARDINALITY_MAX:
				setCardinalityMax((Integer)newValue);
				return;
			case EFMPackage.CARDINALITY__CONFIG_VALUE:
				setConfigValue((Integer)newValue);
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
			case EFMPackage.CARDINALITY__CARDINALITY_MIN:
				setCardinalityMin(CARDINALITY_MIN_EDEFAULT);
				return;
			case EFMPackage.CARDINALITY__CARDINALITY_MAX:
				setCardinalityMax(CARDINALITY_MAX_EDEFAULT);
				return;
			case EFMPackage.CARDINALITY__CONFIG_VALUE:
				setConfigValue(CONFIG_VALUE_EDEFAULT);
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
			case EFMPackage.CARDINALITY__CARDINALITY_MIN:
				return cardinalityMin != CARDINALITY_MIN_EDEFAULT;
			case EFMPackage.CARDINALITY__CARDINALITY_MAX:
				return cardinalityMax != CARDINALITY_MAX_EDEFAULT;
			case EFMPackage.CARDINALITY__CONFIG_VALUE:
				return configValue != CONFIG_VALUE_EDEFAULT;
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
		result.append(" (cardinalityMin: ");
		result.append(cardinalityMin);
		result.append(", cardinalityMax: ");
		result.append(cardinalityMax);
		result.append(", configValue: ");
		result.append(configValue);
		result.append(')');
		return result.toString();
	}

} //CardinalityImpl
