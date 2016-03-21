/**
 */
package com.abdulaziz.ms.OCV.impl;

import com.abdulaziz.ms.OCV.ConditionOption;
import com.abdulaziz.ms.OCV.OCVPackage;
import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VContractAlternativeBox;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VContract Alternative Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VContractAlternativeBoxImpl#isVCReturnIncluded <em>VC Return Included</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VContractAlternativeBoxImpl#getVcContract <em>Vc Contract</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VContractAlternativeBoxImpl#getConditionOption <em>Condition Option</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VContractAlternativeBoxImpl extends VContractConditionImpl implements VContractAlternativeBox {
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
	 * The cached value of the '{@link #getVcContract() <em>Vc Contract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcContract()
	 * @generated
	 * @ordered
	 */
	protected VCContract vcContract;

	/**
	 * The cached value of the '{@link #getConditionOption() <em>Condition Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionOption()
	 * @generated
	 * @ordered
	 */
	protected ConditionOption conditionOption;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VContractAlternativeBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCVPackage.Literals.VCONTRACT_ALTERNATIVE_BOX;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VCONTRACT_ALTERNATIVE_BOX__VC_RETURN_INCLUDED, oldVCReturnIncluded, vcReturnIncluded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCContract getVcContract() {
		if (vcContract != null && vcContract.eIsProxy()) {
			InternalEObject oldVcContract = (InternalEObject)vcContract;
			vcContract = (VCContract)eResolveProxy(oldVcContract);
			if (vcContract != oldVcContract) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCVPackage.VCONTRACT_ALTERNATIVE_BOX__VC_CONTRACT, oldVcContract, vcContract));
			}
		}
		return vcContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCContract basicGetVcContract() {
		return vcContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVcContract(VCContract newVcContract) {
		VCContract oldVcContract = vcContract;
		vcContract = newVcContract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VCONTRACT_ALTERNATIVE_BOX__VC_CONTRACT, oldVcContract, vcContract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionOption getConditionOption() {
		if (conditionOption != null && conditionOption.eIsProxy()) {
			InternalEObject oldConditionOption = (InternalEObject)conditionOption;
			conditionOption = (ConditionOption)eResolveProxy(oldConditionOption);
			if (conditionOption != oldConditionOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCVPackage.VCONTRACT_ALTERNATIVE_BOX__CONDITION_OPTION, oldConditionOption, conditionOption));
			}
		}
		return conditionOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionOption basicGetConditionOption() {
		return conditionOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionOption(ConditionOption newConditionOption) {
		ConditionOption oldConditionOption = conditionOption;
		conditionOption = newConditionOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VCONTRACT_ALTERNATIVE_BOX__CONDITION_OPTION, oldConditionOption, conditionOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VContractAlternativeBox getVContractCondition() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCVPackage.VCONTRACT_ALTERNATIVE_BOX__VC_RETURN_INCLUDED:
				return isVCReturnIncluded();
			case OCVPackage.VCONTRACT_ALTERNATIVE_BOX__VC_CONTRACT:
				if (resolve) return getVcContract();
				return basicGetVcContract();
			case OCVPackage.VCONTRACT_ALTERNATIVE_BOX__CONDITION_OPTION:
				if (resolve) return getConditionOption();
				return basicGetConditionOption();
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
			case OCVPackage.VCONTRACT_ALTERNATIVE_BOX__VC_RETURN_INCLUDED:
				setVCReturnIncluded((Boolean)newValue);
				return;
			case OCVPackage.VCONTRACT_ALTERNATIVE_BOX__VC_CONTRACT:
				setVcContract((VCContract)newValue);
				return;
			case OCVPackage.VCONTRACT_ALTERNATIVE_BOX__CONDITION_OPTION:
				setConditionOption((ConditionOption)newValue);
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
			case OCVPackage.VCONTRACT_ALTERNATIVE_BOX__VC_RETURN_INCLUDED:
				setVCReturnIncluded(VC_RETURN_INCLUDED_EDEFAULT);
				return;
			case OCVPackage.VCONTRACT_ALTERNATIVE_BOX__VC_CONTRACT:
				setVcContract((VCContract)null);
				return;
			case OCVPackage.VCONTRACT_ALTERNATIVE_BOX__CONDITION_OPTION:
				setConditionOption((ConditionOption)null);
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
			case OCVPackage.VCONTRACT_ALTERNATIVE_BOX__VC_RETURN_INCLUDED:
				return vcReturnIncluded != VC_RETURN_INCLUDED_EDEFAULT;
			case OCVPackage.VCONTRACT_ALTERNATIVE_BOX__VC_CONTRACT:
				return vcContract != null;
			case OCVPackage.VCONTRACT_ALTERNATIVE_BOX__CONDITION_OPTION:
				return conditionOption != null;
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
			case OCVPackage.VCONTRACT_ALTERNATIVE_BOX___GET_VCONTRACT_CONDITION:
				return getVContractCondition();
			case OCVPackage.VCONTRACT_ALTERNATIVE_BOX___SET_VC_ENTITY_CONTRACT__VCENTITY:
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

} //VContractAlternativeBoxImpl
