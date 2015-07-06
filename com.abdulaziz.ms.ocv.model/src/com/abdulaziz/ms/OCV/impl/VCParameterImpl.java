/**
 */
package com.abdulaziz.ms.OCV.impl;

import com.abdulaziz.ms.OCV.OCVPackage;
import com.abdulaziz.ms.OCV.UMLVariable;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VCParameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VC Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCParameterImpl#getVCInstance <em>VC Instance</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCParameterImpl#getOperationParameter <em>Operation Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VCParameterImpl extends VCEntityImpl implements VCParameter {
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
	 * The cached value of the '{@link #getOperationParameter() <em>Operation Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationParameter()
	 * @generated
	 * @ordered
	 */
	protected UMLVariable operationParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCVPackage.Literals.VC_PARAMETER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCVPackage.VC_PARAMETER__VC_INSTANCE, oldVCInstance, vCInstance));
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
	public void setVCInstance(VCInstance newVCInstance) {
		VCInstance oldVCInstance = vCInstance;
		vCInstance = newVCInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_PARAMETER__VC_INSTANCE, oldVCInstance, vCInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLVariable getOperationParameter() {
		if (operationParameter != null && operationParameter.eIsProxy()) {
			InternalEObject oldOperationParameter = (InternalEObject)operationParameter;
			operationParameter = (UMLVariable)eResolveProxy(oldOperationParameter);
			if (operationParameter != oldOperationParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCVPackage.VC_PARAMETER__OPERATION_PARAMETER, oldOperationParameter, operationParameter));
			}
		}
		return operationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLVariable basicGetOperationParameter() {
		return operationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationParameter(UMLVariable newOperationParameter) {
		UMLVariable oldOperationParameter = operationParameter;
		operationParameter = newOperationParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_PARAMETER__OPERATION_PARAMETER, oldOperationParameter, operationParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCVPackage.VC_PARAMETER__VC_INSTANCE:
				if (resolve) return getVCInstance();
				return basicGetVCInstance();
			case OCVPackage.VC_PARAMETER__OPERATION_PARAMETER:
				if (resolve) return getOperationParameter();
				return basicGetOperationParameter();
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
			case OCVPackage.VC_PARAMETER__VC_INSTANCE:
				setVCInstance((VCInstance)newValue);
				return;
			case OCVPackage.VC_PARAMETER__OPERATION_PARAMETER:
				setOperationParameter((UMLVariable)newValue);
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
			case OCVPackage.VC_PARAMETER__VC_INSTANCE:
				setVCInstance((VCInstance)null);
				return;
			case OCVPackage.VC_PARAMETER__OPERATION_PARAMETER:
				setOperationParameter((UMLVariable)null);
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
			case OCVPackage.VC_PARAMETER__VC_INSTANCE:
				return vCInstance != null;
			case OCVPackage.VC_PARAMETER__OPERATION_PARAMETER:
				return operationParameter != null;
		}
		return super.eIsSet(featureID);
	}
	
	
	

} //VCParameterImpl
