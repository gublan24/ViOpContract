/**
 */
package com.abdulaziz.ms.OCV.impl;

import com.abdulaziz.ms.OCV.OCVPackage;
import com.abdulaziz.ms.OCV.UMLVariable;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VCInstanceField;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VC Instance Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCInstanceFieldImpl#getVCInstance <em>VC Instance</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCInstanceFieldImpl#getUmlClassField <em>Uml Class Field</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VCInstanceFieldImpl extends VCEntityImpl implements VCInstanceField {
	/**
	 * The cached value of the '{@link #getVCInstance() <em>VC Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVCInstance()
	 * @generated
	 * @ordered
	 */
	protected VCInstance vCInstance;

	/**
	 * The cached value of the '{@link #getUmlClassField() <em>Uml Class Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlClassField()
	 * @generated
	 * @ordered
	 */
	protected UMLVariable umlClassField;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCInstanceFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCVPackage.Literals.VC_INSTANCE_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCInstance getVCInstance() {
		if (vCInstance != null && vCInstance.eIsProxy()) {
			InternalEObject oldVCInstance = (InternalEObject)vCInstance;
			vCInstance = (VCInstance)eResolveProxy(oldVCInstance);
			if (vCInstance != oldVCInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCVPackage.VC_INSTANCE_FIELD__VC_INSTANCE, oldVCInstance, vCInstance));
			}
		}
		return vCInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCInstance basicGetVCInstance() {
		return vCInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVCInstance(VCInstance newVCInstance, NotificationChain msgs) {
		VCInstance oldVCInstance = vCInstance;
		vCInstance = newVCInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OCVPackage.VC_INSTANCE_FIELD__VC_INSTANCE, oldVCInstance, newVCInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVCInstance(VCInstance newVCInstance) {
		if (newVCInstance != vCInstance) {
			NotificationChain msgs = null;
			if (vCInstance != null)
				msgs = ((InternalEObject)vCInstance).eInverseRemove(this, OCVPackage.VC_INSTANCE__FIELDS, VCInstance.class, msgs);
			if (newVCInstance != null)
				msgs = ((InternalEObject)newVCInstance).eInverseAdd(this, OCVPackage.VC_INSTANCE__FIELDS, VCInstance.class, msgs);
			msgs = basicSetVCInstance(newVCInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_INSTANCE_FIELD__VC_INSTANCE, newVCInstance, newVCInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLVariable getUmlClassField() {
		if (umlClassField != null && umlClassField.eIsProxy()) {
			InternalEObject oldUmlClassField = (InternalEObject)umlClassField;
			umlClassField = (UMLVariable)eResolveProxy(oldUmlClassField);
			if (umlClassField != oldUmlClassField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCVPackage.VC_INSTANCE_FIELD__UML_CLASS_FIELD, oldUmlClassField, umlClassField));
			}
		}
		return umlClassField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLVariable basicGetUmlClassField() {
		return umlClassField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlClassField(UMLVariable newUmlClassField) {
		UMLVariable oldUmlClassField = umlClassField;
		umlClassField = newUmlClassField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_INSTANCE_FIELD__UML_CLASS_FIELD, oldUmlClassField, umlClassField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCVPackage.VC_INSTANCE_FIELD__VC_INSTANCE:
				if (vCInstance != null)
					msgs = ((InternalEObject)vCInstance).eInverseRemove(this, OCVPackage.VC_INSTANCE__FIELDS, VCInstance.class, msgs);
				return basicSetVCInstance((VCInstance)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCVPackage.VC_INSTANCE_FIELD__VC_INSTANCE:
				return basicSetVCInstance(null, msgs);
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
			case OCVPackage.VC_INSTANCE_FIELD__VC_INSTANCE:
				if (resolve) return getVCInstance();
				return basicGetVCInstance();
			case OCVPackage.VC_INSTANCE_FIELD__UML_CLASS_FIELD:
				if (resolve) return getUmlClassField();
				return basicGetUmlClassField();
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
			case OCVPackage.VC_INSTANCE_FIELD__VC_INSTANCE:
				setVCInstance((VCInstance)newValue);
				return;
			case OCVPackage.VC_INSTANCE_FIELD__UML_CLASS_FIELD:
				setUmlClassField((UMLVariable)newValue);
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
			case OCVPackage.VC_INSTANCE_FIELD__VC_INSTANCE:
				setVCInstance((VCInstance)null);
				return;
			case OCVPackage.VC_INSTANCE_FIELD__UML_CLASS_FIELD:
				setUmlClassField((UMLVariable)null);
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
			case OCVPackage.VC_INSTANCE_FIELD__VC_INSTANCE:
				return vCInstance != null;
			case OCVPackage.VC_INSTANCE_FIELD__UML_CLASS_FIELD:
				return umlClassField != null;
		}
		return super.eIsSet(featureID);
	}
	@Override 
	
	/* returns the string name value of UMLVariable 
	 * @generated not 
	 */
	public String getName()
	{
		return getUmlClassField().getVariableName();
	}
	
	


} //VCInstanceFieldImpl
