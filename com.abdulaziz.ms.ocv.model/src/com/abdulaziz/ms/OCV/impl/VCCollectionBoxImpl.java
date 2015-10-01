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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VC Collection Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCCollectionBoxImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCCollectionBoxImpl#getVContractCollectionBox <em>VContract Collection Box</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VCCollectionBoxImpl extends VCEntityImpl implements VCCollectionBox {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVContractCollectionBox() <em>VContract Collection Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVContractCollectionBox()
	 * @generated
	 * @ordered
	 */
	protected VContractCollectionBox vContractCollectionBox;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCCollectionBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCVPackage.Literals.VC_COLLECTION_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_COLLECTION_BOX__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VContractCollectionBox getVContractCollectionBox() {
		return vContractCollectionBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVContractCollectionBox(VContractCollectionBox newVContractCollectionBox, NotificationChain msgs) {
		VContractCollectionBox oldVContractCollectionBox = vContractCollectionBox;
		vContractCollectionBox = newVContractCollectionBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OCVPackage.VC_COLLECTION_BOX__VCONTRACT_COLLECTION_BOX, oldVContractCollectionBox, newVContractCollectionBox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVContractCollectionBox(VContractCollectionBox newVContractCollectionBox) {
		if (newVContractCollectionBox != vContractCollectionBox) {
			NotificationChain msgs = null;
			if (vContractCollectionBox != null)
				msgs = ((InternalEObject)vContractCollectionBox).eInverseRemove(this, OCVPackage.VCONTRACT_COLLECTION_BOX__VC_COLLECTION_BOX, VContractCollectionBox.class, msgs);
			if (newVContractCollectionBox != null)
				msgs = ((InternalEObject)newVContractCollectionBox).eInverseAdd(this, OCVPackage.VCONTRACT_COLLECTION_BOX__VC_COLLECTION_BOX, VContractCollectionBox.class, msgs);
			msgs = basicSetVContractCollectionBox(newVContractCollectionBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_COLLECTION_BOX__VCONTRACT_COLLECTION_BOX, newVContractCollectionBox, newVContractCollectionBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCVPackage.VC_COLLECTION_BOX__VCONTRACT_COLLECTION_BOX:
				if (vContractCollectionBox != null)
					msgs = ((InternalEObject)vContractCollectionBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OCVPackage.VC_COLLECTION_BOX__VCONTRACT_COLLECTION_BOX, null, msgs);
				return basicSetVContractCollectionBox((VContractCollectionBox)otherEnd, msgs);
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
			case OCVPackage.VC_COLLECTION_BOX__VCONTRACT_COLLECTION_BOX:
				return basicSetVContractCollectionBox(null, msgs);
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
			case OCVPackage.VC_COLLECTION_BOX__TYPE:
				return getType();
			case OCVPackage.VC_COLLECTION_BOX__VCONTRACT_COLLECTION_BOX:
				return getVContractCollectionBox();
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
			case OCVPackage.VC_COLLECTION_BOX__TYPE:
				setType((String)newValue);
				return;
			case OCVPackage.VC_COLLECTION_BOX__VCONTRACT_COLLECTION_BOX:
				setVContractCollectionBox((VContractCollectionBox)newValue);
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
			case OCVPackage.VC_COLLECTION_BOX__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OCVPackage.VC_COLLECTION_BOX__VCONTRACT_COLLECTION_BOX:
				setVContractCollectionBox((VContractCollectionBox)null);
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
			case OCVPackage.VC_COLLECTION_BOX__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case OCVPackage.VC_COLLECTION_BOX__VCONTRACT_COLLECTION_BOX:
				return vContractCollectionBox != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //VCCollectionBoxImpl
