/**
 */
package featureModel.impl;

import featureModel.Attribute;
import featureModel.FeatCardinality;
import featureModel.Feature;
import featureModel.FeatureModelPackage;
import featureModel.NodeFeature;

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
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link featureModel.impl.FeatureImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link featureModel.impl.FeatureImpl#getSubFeatures <em>Sub Features</em>}</li>
 *   <li>{@link featureModel.impl.FeatureImpl#getFeatureCardinality <em>Feature Cardinality</em>}</li>
 *   <li>{@link featureModel.impl.FeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link featureModel.impl.FeatureImpl#getNodeFeature <em>Node Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureImpl extends FMElementImpl implements Feature {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getSubFeatures() <em>Sub Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> subFeatures;

	/**
	 * The cached value of the '{@link #getFeatureCardinality() <em>Feature Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureCardinality()
	 * @generated
	 * @ordered
	 */
	protected FeatCardinality featureCardinality;

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
	 * The cached value of the '{@link #getNodeFeature() <em>Node Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<NodeFeature> nodeFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeatureModelPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, FeatureModelPackage.FEATURE__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getSubFeatures() {
		if (subFeatures == null) {
			subFeatures = new EObjectContainmentEList<Feature>(Feature.class, this, FeatureModelPackage.FEATURE__SUB_FEATURES);
		}
		return subFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatCardinality getFeatureCardinality() {
		return featureCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureCardinality(FeatCardinality newFeatureCardinality, NotificationChain msgs) {
		FeatCardinality oldFeatureCardinality = featureCardinality;
		featureCardinality = newFeatureCardinality;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FeatureModelPackage.FEATURE__FEATURE_CARDINALITY, oldFeatureCardinality, newFeatureCardinality);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureCardinality(FeatCardinality newFeatureCardinality) {
		if (newFeatureCardinality != featureCardinality) {
			NotificationChain msgs = null;
			if (featureCardinality != null)
				msgs = ((InternalEObject)featureCardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FeatureModelPackage.FEATURE__FEATURE_CARDINALITY, null, msgs);
			if (newFeatureCardinality != null)
				msgs = ((InternalEObject)newFeatureCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FeatureModelPackage.FEATURE__FEATURE_CARDINALITY, null, msgs);
			msgs = basicSetFeatureCardinality(newFeatureCardinality, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.FEATURE__FEATURE_CARDINALITY, newFeatureCardinality, newFeatureCardinality));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FeatureModelPackage.FEATURE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NodeFeature> getNodeFeature() {
		if (nodeFeature == null) {
			nodeFeature = new EObjectContainmentEList<NodeFeature>(NodeFeature.class, this, FeatureModelPackage.FEATURE__NODE_FEATURE);
		}
		return nodeFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FeatureModelPackage.FEATURE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case FeatureModelPackage.FEATURE__SUB_FEATURES:
				return ((InternalEList<?>)getSubFeatures()).basicRemove(otherEnd, msgs);
			case FeatureModelPackage.FEATURE__FEATURE_CARDINALITY:
				return basicSetFeatureCardinality(null, msgs);
			case FeatureModelPackage.FEATURE__NODE_FEATURE:
				return ((InternalEList<?>)getNodeFeature()).basicRemove(otherEnd, msgs);
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
			case FeatureModelPackage.FEATURE__ATTRIBUTES:
				return getAttributes();
			case FeatureModelPackage.FEATURE__SUB_FEATURES:
				return getSubFeatures();
			case FeatureModelPackage.FEATURE__FEATURE_CARDINALITY:
				return getFeatureCardinality();
			case FeatureModelPackage.FEATURE__NAME:
				return getName();
			case FeatureModelPackage.FEATURE__NODE_FEATURE:
				return getNodeFeature();
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
			case FeatureModelPackage.FEATURE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case FeatureModelPackage.FEATURE__SUB_FEATURES:
				getSubFeatures().clear();
				getSubFeatures().addAll((Collection<? extends Feature>)newValue);
				return;
			case FeatureModelPackage.FEATURE__FEATURE_CARDINALITY:
				setFeatureCardinality((FeatCardinality)newValue);
				return;
			case FeatureModelPackage.FEATURE__NAME:
				setName((String)newValue);
				return;
			case FeatureModelPackage.FEATURE__NODE_FEATURE:
				getNodeFeature().clear();
				getNodeFeature().addAll((Collection<? extends NodeFeature>)newValue);
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
			case FeatureModelPackage.FEATURE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case FeatureModelPackage.FEATURE__SUB_FEATURES:
				getSubFeatures().clear();
				return;
			case FeatureModelPackage.FEATURE__FEATURE_CARDINALITY:
				setFeatureCardinality((FeatCardinality)null);
				return;
			case FeatureModelPackage.FEATURE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FeatureModelPackage.FEATURE__NODE_FEATURE:
				getNodeFeature().clear();
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
			case FeatureModelPackage.FEATURE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case FeatureModelPackage.FEATURE__SUB_FEATURES:
				return subFeatures != null && !subFeatures.isEmpty();
			case FeatureModelPackage.FEATURE__FEATURE_CARDINALITY:
				return featureCardinality != null;
			case FeatureModelPackage.FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FeatureModelPackage.FEATURE__NODE_FEATURE:
				return nodeFeature != null && !nodeFeature.isEmpty();
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

} //FeatureImpl
