/**
 */
package com.abdulaziz.ms.OCV.impl;

import com.abdulaziz.ms.OCV.OCVPackage;
import com.abdulaziz.ms.OCV.UMLVariable;
import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VOperation;
import com.abdulaziz.ms.OCV.VSystemOperationDiagram;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VOperation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VOperationImpl#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VOperationImpl#getOperationReturnType <em>Operation Return Type</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VOperationImpl#getOperationParameters <em>Operation Parameters</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VOperationImpl#getVSystem <em>VSystem</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VOperationImpl#getVcContract <em>Vc Contract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VOperationImpl extends MinimalEObjectImpl.Container implements VOperation {
	/**
	 * The default value of the '{@link #getOperationName() <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationName()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationName() <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationName()
	 * @generated
	 * @ordered
	 */
	protected String operationName = OPERATION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperationReturnType() <em>Operation Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_RETURN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationReturnType() <em>Operation Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationReturnType()
	 * @generated
	 * @ordered
	 */
	protected String operationReturnType = OPERATION_RETURN_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperationParameters() <em>Operation Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLVariable> operationParameters;

	/**
	 * The cached value of the '{@link #getVSystem() <em>VSystem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSystem()
	 * @generated
	 * @ordered
	 */
	protected VSystemOperationDiagram vSystem;

	/**
	 * The cached value of the '{@link #getVcContract() <em>Vc Contract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcContract()
	 * @generated
	 * @ordered
	 */
	protected VCContract vcContract;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCVPackage.Literals.VOPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationName() {
		return operationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationName(String newOperationName) {
		String oldOperationName = operationName;
		operationName = newOperationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VOPERATION__OPERATION_NAME, oldOperationName, operationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationReturnType() {
		return operationReturnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationReturnType(String newOperationReturnType) {
		String oldOperationReturnType = operationReturnType;
		operationReturnType = newOperationReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VOPERATION__OPERATION_RETURN_TYPE, oldOperationReturnType, operationReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UMLVariable> getOperationParameters() {
		if (operationParameters == null) {
			operationParameters = new EObjectContainmentWithInverseEList<UMLVariable>(UMLVariable.class, this, OCVPackage.VOPERATION__OPERATION_PARAMETERS, OCVPackage.UML_VARIABLE__VOPERATION);
		}
		return operationParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSystemOperationDiagram getVSystem() {
		if (vSystem != null && vSystem.eIsProxy()) {
			InternalEObject oldVSystem = (InternalEObject)vSystem;
			vSystem = (VSystemOperationDiagram)eResolveProxy(oldVSystem);
			if (vSystem != oldVSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCVPackage.VOPERATION__VSYSTEM, oldVSystem, vSystem));
			}
		}
		return vSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSystemOperationDiagram basicGetVSystem() {
		return vSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVSystem(VSystemOperationDiagram newVSystem) {
		VSystemOperationDiagram oldVSystem = vSystem;
		vSystem = newVSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VOPERATION__VSYSTEM, oldVSystem, vSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCContract getVcContract() {
		return vcContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVcContract(VCContract newVcContract, NotificationChain msgs) {
		VCContract oldVcContract = vcContract;
		vcContract = newVcContract;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OCVPackage.VOPERATION__VC_CONTRACT, oldVcContract, newVcContract);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVcContract(VCContract newVcContract) {
		if (newVcContract != vcContract) {
			NotificationChain msgs = null;
			if (vcContract != null)
				msgs = ((InternalEObject)vcContract).eInverseRemove(this, OCVPackage.VC_CONTRACT__UML_OPERATION, VCContract.class, msgs);
			if (newVcContract != null)
				msgs = ((InternalEObject)newVcContract).eInverseAdd(this, OCVPackage.VC_CONTRACT__UML_OPERATION, VCContract.class, msgs);
			msgs = basicSetVcContract(newVcContract, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VOPERATION__VC_CONTRACT, newVcContract, newVcContract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCVPackage.VOPERATION__OPERATION_PARAMETERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperationParameters()).basicAdd(otherEnd, msgs);
			case OCVPackage.VOPERATION__VC_CONTRACT:
				if (vcContract != null)
					msgs = ((InternalEObject)vcContract).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OCVPackage.VOPERATION__VC_CONTRACT, null, msgs);
				return basicSetVcContract((VCContract)otherEnd, msgs);
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
			case OCVPackage.VOPERATION__OPERATION_PARAMETERS:
				return ((InternalEList<?>)getOperationParameters()).basicRemove(otherEnd, msgs);
			case OCVPackage.VOPERATION__VC_CONTRACT:
				return basicSetVcContract(null, msgs);
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
			case OCVPackage.VOPERATION__OPERATION_NAME:
				return getOperationName();
			case OCVPackage.VOPERATION__OPERATION_RETURN_TYPE:
				return getOperationReturnType();
			case OCVPackage.VOPERATION__OPERATION_PARAMETERS:
				return getOperationParameters();
			case OCVPackage.VOPERATION__VSYSTEM:
				if (resolve) return getVSystem();
				return basicGetVSystem();
			case OCVPackage.VOPERATION__VC_CONTRACT:
				return getVcContract();
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
			case OCVPackage.VOPERATION__OPERATION_NAME:
				setOperationName((String)newValue);
				return;
			case OCVPackage.VOPERATION__OPERATION_RETURN_TYPE:
				setOperationReturnType((String)newValue);
				return;
			case OCVPackage.VOPERATION__OPERATION_PARAMETERS:
				getOperationParameters().clear();
				getOperationParameters().addAll((Collection<? extends UMLVariable>)newValue);
				return;
			case OCVPackage.VOPERATION__VSYSTEM:
				setVSystem((VSystemOperationDiagram)newValue);
				return;
			case OCVPackage.VOPERATION__VC_CONTRACT:
				setVcContract((VCContract)newValue);
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
			case OCVPackage.VOPERATION__OPERATION_NAME:
				setOperationName(OPERATION_NAME_EDEFAULT);
				return;
			case OCVPackage.VOPERATION__OPERATION_RETURN_TYPE:
				setOperationReturnType(OPERATION_RETURN_TYPE_EDEFAULT);
				return;
			case OCVPackage.VOPERATION__OPERATION_PARAMETERS:
				getOperationParameters().clear();
				return;
			case OCVPackage.VOPERATION__VSYSTEM:
				setVSystem((VSystemOperationDiagram)null);
				return;
			case OCVPackage.VOPERATION__VC_CONTRACT:
				setVcContract((VCContract)null);
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
			case OCVPackage.VOPERATION__OPERATION_NAME:
				return OPERATION_NAME_EDEFAULT == null ? operationName != null : !OPERATION_NAME_EDEFAULT.equals(operationName);
			case OCVPackage.VOPERATION__OPERATION_RETURN_TYPE:
				return OPERATION_RETURN_TYPE_EDEFAULT == null ? operationReturnType != null : !OPERATION_RETURN_TYPE_EDEFAULT.equals(operationReturnType);
			case OCVPackage.VOPERATION__OPERATION_PARAMETERS:
				return operationParameters != null && !operationParameters.isEmpty();
			case OCVPackage.VOPERATION__VSYSTEM:
				return vSystem != null;
			case OCVPackage.VOPERATION__VC_CONTRACT:
				return vcContract != null;
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
		result.append(" (operationName: ");
		result.append(operationName);
		result.append(", operationReturnType: ");
		result.append(operationReturnType);
		result.append(')');
		return result.toString();
	}

} //VOperationImpl
