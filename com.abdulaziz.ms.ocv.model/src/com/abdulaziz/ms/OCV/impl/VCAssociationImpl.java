/**
 */
package com.abdulaziz.ms.OCV.impl;

import com.abdulaziz.ms.OCV.OCVPackage;
import com.abdulaziz.ms.OCV.UMLVariable;
import com.abdulaziz.ms.OCV.VCAssociation;
import com.abdulaziz.ms.OCV.VCInstance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VC Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCAssociationImpl#getFirstInstance <em>First Instance</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCAssociationImpl#getSecondInstance <em>Second Instance</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCAssociationImpl#getFirstInstanceVariable <em>First Instance Variable</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCAssociationImpl#getSecondInstanceVariable <em>Second Instance Variable</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCAssociationImpl#isDirectional <em>Directional</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCAssociationImpl#getBasedAttribute <em>Based Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VCAssociationImpl extends VCEntityImpl implements VCAssociation {
	/**
	 * The cached value of the '{@link #getFirstInstance() <em>First Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstInstance()
	 * @generated
	 * @ordered
	 */
	protected VCInstance firstInstance;

	/**
	 * The cached value of the '{@link #getSecondInstance() <em>Second Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondInstance()
	 * @generated
	 * @ordered
	 */
	protected VCInstance secondInstance;

	/**
	 * The cached value of the '{@link #getFirstInstanceVariable() <em>First Instance Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstInstanceVariable()
	 * @generated
	 * @ordered
	 */
	protected UMLVariable firstInstanceVariable;

	/**
	 * The cached value of the '{@link #getSecondInstanceVariable() <em>Second Instance Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondInstanceVariable()
	 * @generated
	 * @ordered
	 */
	protected UMLVariable secondInstanceVariable;

	/**
	 * The default value of the '{@link #isDirectional() <em>Directional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirectional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DIRECTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDirectional() <em>Directional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirectional()
	 * @generated
	 * @ordered
	 */
	protected boolean directional = DIRECTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBasedAttribute() <em>Based Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String BASED_ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasedAttribute() <em>Based Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedAttribute()
	 * @generated
	 * @ordered
	 */
	protected String basedAttribute = BASED_ATTRIBUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCVPackage.Literals.VC_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCInstance getFirstInstance() {
		if (firstInstance != null && firstInstance.eIsProxy()) {
			InternalEObject oldFirstInstance = (InternalEObject)firstInstance;
			firstInstance = (VCInstance)eResolveProxy(oldFirstInstance);
			if (firstInstance != oldFirstInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCVPackage.VC_ASSOCIATION__FIRST_INSTANCE, oldFirstInstance, firstInstance));
			}
		}
		return firstInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCInstance basicGetFirstInstance() {
		return firstInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstInstance(VCInstance newFirstInstance) {
		VCInstance oldFirstInstance = firstInstance;
		firstInstance = newFirstInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_ASSOCIATION__FIRST_INSTANCE, oldFirstInstance, firstInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCInstance getSecondInstance() {
		if (secondInstance != null && secondInstance.eIsProxy()) {
			InternalEObject oldSecondInstance = (InternalEObject)secondInstance;
			secondInstance = (VCInstance)eResolveProxy(oldSecondInstance);
			if (secondInstance != oldSecondInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCVPackage.VC_ASSOCIATION__SECOND_INSTANCE, oldSecondInstance, secondInstance));
			}
		}
		return secondInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCInstance basicGetSecondInstance() {
		return secondInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondInstance(VCInstance newSecondInstance) {
		VCInstance oldSecondInstance = secondInstance;
		secondInstance = newSecondInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_ASSOCIATION__SECOND_INSTANCE, oldSecondInstance, secondInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLVariable getFirstInstanceVariable() {
		if (firstInstanceVariable != null && firstInstanceVariable.eIsProxy()) {
			InternalEObject oldFirstInstanceVariable = (InternalEObject)firstInstanceVariable;
			firstInstanceVariable = (UMLVariable)eResolveProxy(oldFirstInstanceVariable);
			if (firstInstanceVariable != oldFirstInstanceVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCVPackage.VC_ASSOCIATION__FIRST_INSTANCE_VARIABLE, oldFirstInstanceVariable, firstInstanceVariable));
			}
		}
		return firstInstanceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLVariable basicGetFirstInstanceVariable() {
		return firstInstanceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstInstanceVariable(UMLVariable newFirstInstanceVariable) {
		UMLVariable oldFirstInstanceVariable = firstInstanceVariable;
		firstInstanceVariable = newFirstInstanceVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_ASSOCIATION__FIRST_INSTANCE_VARIABLE, oldFirstInstanceVariable, firstInstanceVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLVariable getSecondInstanceVariable() {
		if (secondInstanceVariable != null && secondInstanceVariable.eIsProxy()) {
			InternalEObject oldSecondInstanceVariable = (InternalEObject)secondInstanceVariable;
			secondInstanceVariable = (UMLVariable)eResolveProxy(oldSecondInstanceVariable);
			if (secondInstanceVariable != oldSecondInstanceVariable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCVPackage.VC_ASSOCIATION__SECOND_INSTANCE_VARIABLE, oldSecondInstanceVariable, secondInstanceVariable));
			}
		}
		return secondInstanceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLVariable basicGetSecondInstanceVariable() {
		return secondInstanceVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondInstanceVariable(UMLVariable newSecondInstanceVariable) {
		UMLVariable oldSecondInstanceVariable = secondInstanceVariable;
		secondInstanceVariable = newSecondInstanceVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_ASSOCIATION__SECOND_INSTANCE_VARIABLE, oldSecondInstanceVariable, secondInstanceVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDirectional() {
		return directional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirectional(boolean newDirectional) {
		boolean oldDirectional = directional;
		directional = newDirectional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_ASSOCIATION__DIRECTIONAL, oldDirectional, directional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasedAttribute() {
		return basedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasedAttribute(String newBasedAttribute) {
		String oldBasedAttribute = basedAttribute;
		basedAttribute = newBasedAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_ASSOCIATION__BASED_ATTRIBUTE, oldBasedAttribute, basedAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCVPackage.VC_ASSOCIATION__FIRST_INSTANCE:
				if (resolve) return getFirstInstance();
				return basicGetFirstInstance();
			case OCVPackage.VC_ASSOCIATION__SECOND_INSTANCE:
				if (resolve) return getSecondInstance();
				return basicGetSecondInstance();
			case OCVPackage.VC_ASSOCIATION__FIRST_INSTANCE_VARIABLE:
				if (resolve) return getFirstInstanceVariable();
				return basicGetFirstInstanceVariable();
			case OCVPackage.VC_ASSOCIATION__SECOND_INSTANCE_VARIABLE:
				if (resolve) return getSecondInstanceVariable();
				return basicGetSecondInstanceVariable();
			case OCVPackage.VC_ASSOCIATION__DIRECTIONAL:
				return isDirectional();
			case OCVPackage.VC_ASSOCIATION__BASED_ATTRIBUTE:
				return getBasedAttribute();
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
			case OCVPackage.VC_ASSOCIATION__FIRST_INSTANCE:
				setFirstInstance((VCInstance)newValue);
				return;
			case OCVPackage.VC_ASSOCIATION__SECOND_INSTANCE:
				setSecondInstance((VCInstance)newValue);
				return;
			case OCVPackage.VC_ASSOCIATION__FIRST_INSTANCE_VARIABLE:
				setFirstInstanceVariable((UMLVariable)newValue);
				return;
			case OCVPackage.VC_ASSOCIATION__SECOND_INSTANCE_VARIABLE:
				setSecondInstanceVariable((UMLVariable)newValue);
				return;
			case OCVPackage.VC_ASSOCIATION__DIRECTIONAL:
				setDirectional((Boolean)newValue);
				return;
			case OCVPackage.VC_ASSOCIATION__BASED_ATTRIBUTE:
				setBasedAttribute((String)newValue);
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
			case OCVPackage.VC_ASSOCIATION__FIRST_INSTANCE:
				setFirstInstance((VCInstance)null);
				return;
			case OCVPackage.VC_ASSOCIATION__SECOND_INSTANCE:
				setSecondInstance((VCInstance)null);
				return;
			case OCVPackage.VC_ASSOCIATION__FIRST_INSTANCE_VARIABLE:
				setFirstInstanceVariable((UMLVariable)null);
				return;
			case OCVPackage.VC_ASSOCIATION__SECOND_INSTANCE_VARIABLE:
				setSecondInstanceVariable((UMLVariable)null);
				return;
			case OCVPackage.VC_ASSOCIATION__DIRECTIONAL:
				setDirectional(DIRECTIONAL_EDEFAULT);
				return;
			case OCVPackage.VC_ASSOCIATION__BASED_ATTRIBUTE:
				setBasedAttribute(BASED_ATTRIBUTE_EDEFAULT);
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
			case OCVPackage.VC_ASSOCIATION__FIRST_INSTANCE:
				return firstInstance != null;
			case OCVPackage.VC_ASSOCIATION__SECOND_INSTANCE:
				return secondInstance != null;
			case OCVPackage.VC_ASSOCIATION__FIRST_INSTANCE_VARIABLE:
				return firstInstanceVariable != null;
			case OCVPackage.VC_ASSOCIATION__SECOND_INSTANCE_VARIABLE:
				return secondInstanceVariable != null;
			case OCVPackage.VC_ASSOCIATION__DIRECTIONAL:
				return directional != DIRECTIONAL_EDEFAULT;
			case OCVPackage.VC_ASSOCIATION__BASED_ATTRIBUTE:
				return BASED_ATTRIBUTE_EDEFAULT == null ? basedAttribute != null : !BASED_ATTRIBUTE_EDEFAULT.equals(basedAttribute);
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
		result.append(" (directional: ");
		result.append(directional);
		result.append(", basedAttribute: ");
		result.append(basedAttribute);
		result.append(')');
		return result.toString();
	}

} //VCAssociationImpl
