/**
 */
package com.abdulaziz.ms.OCV.impl;

import com.abdulaziz.ms.OCV.OCVPackage;
import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VContractPostcondition;
import com.abdulaziz.ms.OCV.VContractPrecondition;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VContract Precondition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VContractPreconditionImpl#getVcContract <em>Vc Contract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VContractPreconditionImpl extends VContractConditionImpl implements VContractPrecondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VContractPreconditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCVPackage.Literals.VCONTRACT_PRECONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCContract getVcContract() {
		if (eContainerFeatureID() != OCVPackage.VCONTRACT_PRECONDITION__VC_CONTRACT) return null;
		return (VCContract)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVcContract(VCContract newVcContract, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVcContract, OCVPackage.VCONTRACT_PRECONDITION__VC_CONTRACT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVcContract(VCContract newVcContract) {
		if (newVcContract != eInternalContainer() || (eContainerFeatureID() != OCVPackage.VCONTRACT_PRECONDITION__VC_CONTRACT && newVcContract != null)) {
			if (EcoreUtil.isAncestor(this, newVcContract))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVcContract != null)
				msgs = ((InternalEObject)newVcContract).eInverseAdd(this, OCVPackage.VC_CONTRACT__PRECONDITION, VCContract.class, msgs);
			msgs = basicSetVcContract(newVcContract, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VCONTRACT_PRECONDITION__VC_CONTRACT, newVcContract, newVcContract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public VContractPrecondition getVContractCondition() {
		try {
				return this;
				}
				catch (UnsupportedOperationException s) {
				throw new UnsupportedOperationException();
				}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setVCEntityContract(final VCEntity vcEntity) {
				vcEntity.setPrecondition(this);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCVPackage.VCONTRACT_PRECONDITION__VC_CONTRACT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
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
			case OCVPackage.VCONTRACT_PRECONDITION__VC_CONTRACT:
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
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case OCVPackage.VCONTRACT_PRECONDITION__VC_CONTRACT:
				return eInternalContainer().eInverseRemove(this, OCVPackage.VC_CONTRACT__PRECONDITION, VCContract.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCVPackage.VCONTRACT_PRECONDITION__VC_CONTRACT:
				return getVcContract();
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
			case OCVPackage.VCONTRACT_PRECONDITION__VC_CONTRACT:
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
			case OCVPackage.VCONTRACT_PRECONDITION__VC_CONTRACT:
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
			case OCVPackage.VCONTRACT_PRECONDITION__VC_CONTRACT:
				return getVcContract() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OCVPackage.VCONTRACT_PRECONDITION___GET_VCONTRACT_CONDITION:
				return getVContractCondition();
			case OCVPackage.VCONTRACT_PRECONDITION___SET_VC_ENTITY_CONTRACT__VCENTITY:
				setVCEntityContract((VCEntity)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not 
	 */

	public VContractPostcondition getPostConditon()
	{
		return this.getVcContract().getPostcondition();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not 
	 */
	public VContractPrecondition getPreConditon()
	{
		return this;
	}

} //VContractPreconditionImpl
