/**
 */
package com.abdulaziz.ms.OCV.impl;

import com.abdulaziz.ms.OCV.ConditionOption;
import com.abdulaziz.ms.OCV.OCVPackage;
import com.abdulaziz.ms.OCV.VCAlternativeBox;
import com.abdulaziz.ms.OCV.VContractAlternativeBox;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.ConditionOptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.ConditionOptionImpl#getVcContractAlternativeBox <em>Vc Contract Alternative Box</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.ConditionOptionImpl#getVcAlternativeBox <em>Vc Alternative Box</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionOptionImpl extends MinimalEObjectImpl.Container implements ConditionOption {
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
	 * The cached value of the '{@link #getVcContractAlternativeBox() <em>Vc Contract Alternative Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcContractAlternativeBox()
	 * @generated
	 * @ordered
	 */
	protected VContractAlternativeBox vcContractAlternativeBox;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCVPackage.Literals.CONDITION_OPTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.CONDITION_OPTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VContractAlternativeBox getVcContractAlternativeBox() {
		return vcContractAlternativeBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVcContractAlternativeBox(VContractAlternativeBox newVcContractAlternativeBox, NotificationChain msgs) {
		VContractAlternativeBox oldVcContractAlternativeBox = vcContractAlternativeBox;
		vcContractAlternativeBox = newVcContractAlternativeBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OCVPackage.CONDITION_OPTION__VC_CONTRACT_ALTERNATIVE_BOX, oldVcContractAlternativeBox, newVcContractAlternativeBox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVcContractAlternativeBox(VContractAlternativeBox newVcContractAlternativeBox) {
		if (newVcContractAlternativeBox != vcContractAlternativeBox) {
			NotificationChain msgs = null;
			if (vcContractAlternativeBox != null)
				msgs = ((InternalEObject)vcContractAlternativeBox).eInverseRemove(this, OCVPackage.VCONTRACT_ALTERNATIVE_BOX__CONDITION_OPTION, VContractAlternativeBox.class, msgs);
			if (newVcContractAlternativeBox != null)
				msgs = ((InternalEObject)newVcContractAlternativeBox).eInverseAdd(this, OCVPackage.VCONTRACT_ALTERNATIVE_BOX__CONDITION_OPTION, VContractAlternativeBox.class, msgs);
			msgs = basicSetVcContractAlternativeBox(newVcContractAlternativeBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.CONDITION_OPTION__VC_CONTRACT_ALTERNATIVE_BOX, newVcContractAlternativeBox, newVcContractAlternativeBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCAlternativeBox getVcAlternativeBox() {
		if (eContainerFeatureID() != OCVPackage.CONDITION_OPTION__VC_ALTERNATIVE_BOX) return null;
		return (VCAlternativeBox)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVcAlternativeBox(VCAlternativeBox newVcAlternativeBox, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVcAlternativeBox, OCVPackage.CONDITION_OPTION__VC_ALTERNATIVE_BOX, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVcAlternativeBox(VCAlternativeBox newVcAlternativeBox) {
		if (newVcAlternativeBox != eInternalContainer() || (eContainerFeatureID() != OCVPackage.CONDITION_OPTION__VC_ALTERNATIVE_BOX && newVcAlternativeBox != null)) {
			if (EcoreUtil.isAncestor(this, newVcAlternativeBox))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVcAlternativeBox != null)
				msgs = ((InternalEObject)newVcAlternativeBox).eInverseAdd(this, OCVPackage.VC_ALTERNATIVE_BOX__CONDITIN_OPTIONS, VCAlternativeBox.class, msgs);
			msgs = basicSetVcAlternativeBox(newVcAlternativeBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.CONDITION_OPTION__VC_ALTERNATIVE_BOX, newVcAlternativeBox, newVcAlternativeBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCVPackage.CONDITION_OPTION__VC_CONTRACT_ALTERNATIVE_BOX:
				if (vcContractAlternativeBox != null)
					msgs = ((InternalEObject)vcContractAlternativeBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OCVPackage.CONDITION_OPTION__VC_CONTRACT_ALTERNATIVE_BOX, null, msgs);
				return basicSetVcContractAlternativeBox((VContractAlternativeBox)otherEnd, msgs);
			case OCVPackage.CONDITION_OPTION__VC_ALTERNATIVE_BOX:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVcAlternativeBox((VCAlternativeBox)otherEnd, msgs);
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
			case OCVPackage.CONDITION_OPTION__VC_CONTRACT_ALTERNATIVE_BOX:
				return basicSetVcContractAlternativeBox(null, msgs);
			case OCVPackage.CONDITION_OPTION__VC_ALTERNATIVE_BOX:
				return basicSetVcAlternativeBox(null, msgs);
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
			case OCVPackage.CONDITION_OPTION__VC_ALTERNATIVE_BOX:
				return eInternalContainer().eInverseRemove(this, OCVPackage.VC_ALTERNATIVE_BOX__CONDITIN_OPTIONS, VCAlternativeBox.class, msgs);
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
			case OCVPackage.CONDITION_OPTION__NAME:
				return getName();
			case OCVPackage.CONDITION_OPTION__VC_CONTRACT_ALTERNATIVE_BOX:
				return getVcContractAlternativeBox();
			case OCVPackage.CONDITION_OPTION__VC_ALTERNATIVE_BOX:
				return getVcAlternativeBox();
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
			case OCVPackage.CONDITION_OPTION__NAME:
				setName((String)newValue);
				return;
			case OCVPackage.CONDITION_OPTION__VC_CONTRACT_ALTERNATIVE_BOX:
				setVcContractAlternativeBox((VContractAlternativeBox)newValue);
				return;
			case OCVPackage.CONDITION_OPTION__VC_ALTERNATIVE_BOX:
				setVcAlternativeBox((VCAlternativeBox)newValue);
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
			case OCVPackage.CONDITION_OPTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OCVPackage.CONDITION_OPTION__VC_CONTRACT_ALTERNATIVE_BOX:
				setVcContractAlternativeBox((VContractAlternativeBox)null);
				return;
			case OCVPackage.CONDITION_OPTION__VC_ALTERNATIVE_BOX:
				setVcAlternativeBox((VCAlternativeBox)null);
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
			case OCVPackage.CONDITION_OPTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OCVPackage.CONDITION_OPTION__VC_CONTRACT_ALTERNATIVE_BOX:
				return vcContractAlternativeBox != null;
			case OCVPackage.CONDITION_OPTION__VC_ALTERNATIVE_BOX:
				return getVcAlternativeBox() != null;
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

} //ConditionOptionImpl
