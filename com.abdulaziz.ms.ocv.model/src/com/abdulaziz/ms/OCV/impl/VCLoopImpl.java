/**
 */
package com.abdulaziz.ms.OCV.impl;

import com.abdulaziz.ms.OCV.OCVPackage;
import com.abdulaziz.ms.OCV.VCLoop;
import com.abdulaziz.ms.OCV.VContractLoopBox;
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
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCLoopImpl#getVcContractLoopBox <em>Vc Contract Loop Box</em>}</li>
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
	 * The cached value of the '{@link #getVcContractLoopBox() <em>Vc Contract Loop Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcContractLoopBox()
	 * @generated
	 * @ordered
	 */
	protected VContractLoopBox vcContractLoopBox;

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
	public VContractLoopBox getVcContractLoopBox() {
		return vcContractLoopBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVcContractLoopBox(VContractLoopBox newVcContractLoopBox, NotificationChain msgs) {
		VContractLoopBox oldVcContractLoopBox = vcContractLoopBox;
		vcContractLoopBox = newVcContractLoopBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OCVPackage.VC_LOOP__VC_CONTRACT_LOOP_BOX, oldVcContractLoopBox, newVcContractLoopBox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVcContractLoopBox(VContractLoopBox newVcContractLoopBox) {
		if (newVcContractLoopBox != vcContractLoopBox) {
			NotificationChain msgs = null;
			if (vcContractLoopBox != null)
				msgs = ((InternalEObject)vcContractLoopBox).eInverseRemove(this, OCVPackage.VCONTRACT_LOOP_BOX__VC_COLLECTION_BOX, VContractLoopBox.class, msgs);
			if (newVcContractLoopBox != null)
				msgs = ((InternalEObject)newVcContractLoopBox).eInverseAdd(this, OCVPackage.VCONTRACT_LOOP_BOX__VC_COLLECTION_BOX, VContractLoopBox.class, msgs);
			msgs = basicSetVcContractLoopBox(newVcContractLoopBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_LOOP__VC_CONTRACT_LOOP_BOX, newVcContractLoopBox, newVcContractLoopBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCVPackage.VC_LOOP__VC_CONTRACT_LOOP_BOX:
				if (vcContractLoopBox != null)
					msgs = ((InternalEObject)vcContractLoopBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OCVPackage.VC_LOOP__VC_CONTRACT_LOOP_BOX, null, msgs);
				return basicSetVcContractLoopBox((VContractLoopBox)otherEnd, msgs);
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
			case OCVPackage.VC_LOOP__VC_CONTRACT_LOOP_BOX:
				return basicSetVcContractLoopBox(null, msgs);
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
			case OCVPackage.VC_LOOP__VC_CONTRACT_LOOP_BOX:
				return getVcContractLoopBox();
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
			case OCVPackage.VC_LOOP__VC_CONTRACT_LOOP_BOX:
				setVcContractLoopBox((VContractLoopBox)newValue);
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
			case OCVPackage.VC_LOOP__VC_CONTRACT_LOOP_BOX:
				setVcContractLoopBox((VContractLoopBox)null);
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
			case OCVPackage.VC_LOOP__VC_CONTRACT_LOOP_BOX:
				return vcContractLoopBox != null;
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
