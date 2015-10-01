/**
 */
package com.abdulaziz.ms.OCV.impl;

import com.abdulaziz.ms.OCV.OCVPackage;
import com.abdulaziz.ms.OCV.VCCollectionBox;
import com.abdulaziz.ms.OCV.VContractCollectionBox;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VContract Collection Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VContractCollectionBoxImpl#getVcCollectionBox <em>Vc Collection Box</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VContractCollectionBoxImpl extends VContractConditionImpl implements VContractCollectionBox {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VContractCollectionBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCVPackage.Literals.VCONTRACT_COLLECTION_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCCollectionBox getVcCollectionBox() {
		if (eContainerFeatureID() != OCVPackage.VCONTRACT_COLLECTION_BOX__VC_COLLECTION_BOX) return null;
		return (VCCollectionBox)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVcCollectionBox(VCCollectionBox newVcCollectionBox, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVcCollectionBox, OCVPackage.VCONTRACT_COLLECTION_BOX__VC_COLLECTION_BOX, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVcCollectionBox(VCCollectionBox newVcCollectionBox) {
		if (newVcCollectionBox != eInternalContainer() || (eContainerFeatureID() != OCVPackage.VCONTRACT_COLLECTION_BOX__VC_COLLECTION_BOX && newVcCollectionBox != null)) {
			if (EcoreUtil.isAncestor(this, newVcCollectionBox))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVcCollectionBox != null)
				msgs = ((InternalEObject)newVcCollectionBox).eInverseAdd(this, OCVPackage.VC_COLLECTION_BOX__VCONTRACT_COLLECTION_BOX, VCCollectionBox.class, msgs);
			msgs = basicSetVcCollectionBox(newVcCollectionBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VCONTRACT_COLLECTION_BOX__VC_COLLECTION_BOX, newVcCollectionBox, newVcCollectionBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCVPackage.VCONTRACT_COLLECTION_BOX__VC_COLLECTION_BOX:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVcCollectionBox((VCCollectionBox)otherEnd, msgs);
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
			case OCVPackage.VCONTRACT_COLLECTION_BOX__VC_COLLECTION_BOX:
				return basicSetVcCollectionBox(null, msgs);
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
			case OCVPackage.VCONTRACT_COLLECTION_BOX__VC_COLLECTION_BOX:
				return eInternalContainer().eInverseRemove(this, OCVPackage.VC_COLLECTION_BOX__VCONTRACT_COLLECTION_BOX, VCCollectionBox.class, msgs);
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
			case OCVPackage.VCONTRACT_COLLECTION_BOX__VC_COLLECTION_BOX:
				return getVcCollectionBox();
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
			case OCVPackage.VCONTRACT_COLLECTION_BOX__VC_COLLECTION_BOX:
				setVcCollectionBox((VCCollectionBox)newValue);
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
			case OCVPackage.VCONTRACT_COLLECTION_BOX__VC_COLLECTION_BOX:
				setVcCollectionBox((VCCollectionBox)null);
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
			case OCVPackage.VCONTRACT_COLLECTION_BOX__VC_COLLECTION_BOX:
				return getVcCollectionBox() != null;
		}
		return super.eIsSet(featureID);
	}

} //VContractCollectionBoxImpl
