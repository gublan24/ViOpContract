/**
 */
package com.abdulaziz.ms.OCV.impl;

import com.abdulaziz.ms.OCV.ConditionOption;
import com.abdulaziz.ms.OCV.OCVPackage;
import com.abdulaziz.ms.OCV.VCAlternativeBox;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VC Alternative Box</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCAlternativeBoxImpl#getConditinOptions <em>Conditin Options</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VCAlternativeBoxImpl extends VCEntityImpl implements VCAlternativeBox {
	/**
	 * The cached value of the '{@link #getConditinOptions() <em>Conditin Options</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditinOptions()
	 * @generated
	 * @ordered
	 */
	protected EList<ConditionOption> conditinOptions;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCAlternativeBoxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCVPackage.Literals.VC_ALTERNATIVE_BOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConditionOption> getConditinOptions() {
		if (conditinOptions == null) {
			conditinOptions = new EObjectContainmentWithInverseEList<ConditionOption>(ConditionOption.class, this, OCVPackage.VC_ALTERNATIVE_BOX__CONDITIN_OPTIONS, OCVPackage.CONDITION_OPTION__VC_ALTERNATIVE_BOX);
		}
		return conditinOptions;
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
			case OCVPackage.VC_ALTERNATIVE_BOX__CONDITIN_OPTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConditinOptions()).basicAdd(otherEnd, msgs);
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
			case OCVPackage.VC_ALTERNATIVE_BOX__CONDITIN_OPTIONS:
				return ((InternalEList<?>)getConditinOptions()).basicRemove(otherEnd, msgs);
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
			case OCVPackage.VC_ALTERNATIVE_BOX__CONDITIN_OPTIONS:
				return getConditinOptions();
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
			case OCVPackage.VC_ALTERNATIVE_BOX__CONDITIN_OPTIONS:
				getConditinOptions().clear();
				getConditinOptions().addAll((Collection<? extends ConditionOption>)newValue);
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
			case OCVPackage.VC_ALTERNATIVE_BOX__CONDITIN_OPTIONS:
				getConditinOptions().clear();
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
			case OCVPackage.VC_ALTERNATIVE_BOX__CONDITIN_OPTIONS:
				return conditinOptions != null && !conditinOptions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VCAlternativeBoxImpl
