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
 * An implementation of the model object '<em><b>VContract Postcondition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VContractPostconditionImpl#isVCReturnIncluded <em>VC Return Included</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VContractPostconditionImpl#getVcContract <em>Vc Contract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VContractPostconditionImpl extends VContractConditionImpl implements VContractPostcondition {
	/**
	 * The default value of the '{@link #isVCReturnIncluded() <em>VC Return Included</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVCReturnIncluded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VC_RETURN_INCLUDED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isVCReturnIncluded() <em>VC Return Included</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVCReturnIncluded()
	 * @generated
	 * @ordered
	 */
	protected boolean vcReturnIncluded = VC_RETURN_INCLUDED_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VContractPostconditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCVPackage.Literals.VCONTRACT_POSTCONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVCReturnIncluded() {
		return vcReturnIncluded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVCReturnIncluded(boolean newVCReturnIncluded) {
		boolean oldVCReturnIncluded = vcReturnIncluded;
		vcReturnIncluded = newVCReturnIncluded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VCONTRACT_POSTCONDITION__VC_RETURN_INCLUDED, oldVCReturnIncluded, vcReturnIncluded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCContract getVcContract() {
		if (eContainerFeatureID() != OCVPackage.VCONTRACT_POSTCONDITION__VC_CONTRACT) return null;
		return (VCContract)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVcContract(VCContract newVcContract, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVcContract, OCVPackage.VCONTRACT_POSTCONDITION__VC_CONTRACT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVcContract(VCContract newVcContract) {
		if (newVcContract != eInternalContainer() || (eContainerFeatureID() != OCVPackage.VCONTRACT_POSTCONDITION__VC_CONTRACT && newVcContract != null)) {
			if (EcoreUtil.isAncestor(this, newVcContract))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVcContract != null)
				msgs = ((InternalEObject)newVcContract).eInverseAdd(this, OCVPackage.VC_CONTRACT__POSTCONDITION, VCContract.class, msgs);
			msgs = basicSetVcContract(newVcContract, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VCONTRACT_POSTCONDITION__VC_CONTRACT, newVcContract, newVcContract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public VContractPostcondition getVContractCondition() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVCEntityContract(final VCEntity vcEntity) {
				
				vcEntity.setPostcondition(this);
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCVPackage.VCONTRACT_POSTCONDITION__VC_CONTRACT:
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
			case OCVPackage.VCONTRACT_POSTCONDITION__VC_CONTRACT:
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
			case OCVPackage.VCONTRACT_POSTCONDITION__VC_CONTRACT:
				return eInternalContainer().eInverseRemove(this, OCVPackage.VC_CONTRACT__POSTCONDITION, VCContract.class, msgs);
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
			case OCVPackage.VCONTRACT_POSTCONDITION__VC_RETURN_INCLUDED:
				return isVCReturnIncluded();
			case OCVPackage.VCONTRACT_POSTCONDITION__VC_CONTRACT:
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
			case OCVPackage.VCONTRACT_POSTCONDITION__VC_RETURN_INCLUDED:
				setVCReturnIncluded((Boolean)newValue);
				return;
			case OCVPackage.VCONTRACT_POSTCONDITION__VC_CONTRACT:
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
			case OCVPackage.VCONTRACT_POSTCONDITION__VC_RETURN_INCLUDED:
				setVCReturnIncluded(VC_RETURN_INCLUDED_EDEFAULT);
				return;
			case OCVPackage.VCONTRACT_POSTCONDITION__VC_CONTRACT:
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
			case OCVPackage.VCONTRACT_POSTCONDITION__VC_RETURN_INCLUDED:
				return vcReturnIncluded != VC_RETURN_INCLUDED_EDEFAULT;
			case OCVPackage.VCONTRACT_POSTCONDITION__VC_CONTRACT:
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
			case OCVPackage.VCONTRACT_POSTCONDITION___GET_VCONTRACT_CONDITION:
				return getVContractCondition();
			case OCVPackage.VCONTRACT_POSTCONDITION___SET_VC_ENTITY_CONTRACT__VCENTITY:
				setVCEntityContract((VCEntity)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (VCReturnIncluded: ");
		result.append(vcReturnIncluded);
		result.append(')');
		return result.toString();
	}
	
	public VContractPostcondition getPostConditon()
	{
		return this;
	}
	public VContractPrecondition getPreConditon()
	{
		return this.getVcContract().getPrecondition();
	}

} //VContractPostconditionImpl
