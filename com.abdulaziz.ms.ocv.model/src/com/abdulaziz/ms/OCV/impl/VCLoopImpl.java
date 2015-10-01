/**
 */
package com.abdulaziz.ms.OCV.impl;

import com.abdulaziz.ms.OCV.OCVPackage;
import com.abdulaziz.ms.OCV.VCLoop;

import com.abdulaziz.ms.OCV.VContractCollectionBox;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VC Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCLoopImpl#getIteration <em>Iteration</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCLoopImpl#getVcContractCollectionBox <em>Vc Contract Collection Box</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VCLoopImpl extends VCEntityImpl implements VCLoop {
	/**
	 * The default value of the '{@link #getIteration() <em>Iteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIteration()
	 * @generated
	 * @ordered
	 */
	protected static final String ITERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIteration() <em>Iteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIteration()
	 * @generated
	 * @ordered
	 */
	protected String iteration = ITERATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVcContractCollectionBox() <em>Vc Contract Collection Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcContractCollectionBox()
	 * @generated
	 * @ordered
	 */
	protected VContractCollectionBox vcContractCollectionBox;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCLoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCVPackage.Literals.VC_LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIteration() {
		return iteration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIteration(String newIteration) {
		String oldIteration = iteration;
		iteration = newIteration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_LOOP__ITERATION, oldIteration, iteration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VContractCollectionBox getVcContractCollectionBox() {
		return vcContractCollectionBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVcContractCollectionBox(VContractCollectionBox newVcContractCollectionBox, NotificationChain msgs) {
		VContractCollectionBox oldVcContractCollectionBox = vcContractCollectionBox;
		vcContractCollectionBox = newVcContractCollectionBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OCVPackage.VC_LOOP__VC_CONTRACT_COLLECTION_BOX, oldVcContractCollectionBox, newVcContractCollectionBox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVcContractCollectionBox(VContractCollectionBox newVcContractCollectionBox) {
		if (newVcContractCollectionBox != vcContractCollectionBox) {
			NotificationChain msgs = null;
			if (vcContractCollectionBox != null)
				msgs = ((InternalEObject)vcContractCollectionBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OCVPackage.VC_LOOP__VC_CONTRACT_COLLECTION_BOX, null, msgs);
			if (newVcContractCollectionBox != null)
				msgs = ((InternalEObject)newVcContractCollectionBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OCVPackage.VC_LOOP__VC_CONTRACT_COLLECTION_BOX, null, msgs);
			msgs = basicSetVcContractCollectionBox(newVcContractCollectionBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_LOOP__VC_CONTRACT_COLLECTION_BOX, newVcContractCollectionBox, newVcContractCollectionBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCVPackage.VC_LOOP__VC_CONTRACT_COLLECTION_BOX:
				return basicSetVcContractCollectionBox(null, msgs);
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
			case OCVPackage.VC_LOOP__ITERATION:
				return getIteration();
			case OCVPackage.VC_LOOP__VC_CONTRACT_COLLECTION_BOX:
				return getVcContractCollectionBox();
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
			case OCVPackage.VC_LOOP__ITERATION:
				setIteration((String)newValue);
				return;
			case OCVPackage.VC_LOOP__VC_CONTRACT_COLLECTION_BOX:
				setVcContractCollectionBox((VContractCollectionBox)newValue);
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
			case OCVPackage.VC_LOOP__ITERATION:
				setIteration(ITERATION_EDEFAULT);
				return;
			case OCVPackage.VC_LOOP__VC_CONTRACT_COLLECTION_BOX:
				setVcContractCollectionBox((VContractCollectionBox)null);
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
			case OCVPackage.VC_LOOP__ITERATION:
				return ITERATION_EDEFAULT == null ? iteration != null : !ITERATION_EDEFAULT.equals(iteration);
			case OCVPackage.VC_LOOP__VC_CONTRACT_COLLECTION_BOX:
				return vcContractCollectionBox != null;
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
		result.append(" (iteration: ");
		result.append(iteration);
		result.append(')');
		return result.toString();
	}

} //VCLoopImpl
