/**
 */
package com.abdulaziz.ms.OCV.impl;

import com.abdulaziz.ms.OCV.OCVPackage;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VContractCondition;
import com.abdulaziz.ms.OCV.VContractPostcondition;
import com.abdulaziz.ms.OCV.VContractPrecondition;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VContract Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VContractConditionImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VContractConditionImpl#getConstaint <em>Constaint</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VContractConditionImpl#getVcEntities <em>Vc Entities</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VContractConditionImpl extends MinimalEObjectImpl.Container implements VContractCondition {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "";

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
	 * The default value of the '{@link #getConstaint() <em>Constaint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstaint()
	 * @generated
	 * @ordered
	 */
	protected static final Rectangle CONSTAINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstaint() <em>Constaint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstaint()
	 * @generated
	 * @ordered
	 */
	protected Rectangle constaint = CONSTAINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVcEntities() <em>Vc Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<VCEntity> vcEntities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VContractConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCVPackage.Literals.VCONTRACT_CONDITION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VCONTRACT_CONDITION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle getConstaint() {
		return constaint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstaint(Rectangle newConstaint) {
		Rectangle oldConstaint = constaint;
		constaint = newConstaint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VCONTRACT_CONDITION__CONSTAINT, oldConstaint, constaint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VCEntity> getVcEntities() {
		if (vcEntities == null) {
			vcEntities = new EObjectContainmentEList<VCEntity>(VCEntity.class, this, OCVPackage.VCONTRACT_CONDITION__VC_ENTITIES);
		}
		return vcEntities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVCEntityContract(VCEntity vcEntity) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCVPackage.VCONTRACT_CONDITION__VC_ENTITIES:
				return ((InternalEList<?>)getVcEntities()).basicRemove(otherEnd, msgs);
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
			case OCVPackage.VCONTRACT_CONDITION__TYPE:
				return getType();
			case OCVPackage.VCONTRACT_CONDITION__CONSTAINT:
				return getConstaint();
			case OCVPackage.VCONTRACT_CONDITION__VC_ENTITIES:
				return getVcEntities();
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
			case OCVPackage.VCONTRACT_CONDITION__TYPE:
				setType((String)newValue);
				return;
			case OCVPackage.VCONTRACT_CONDITION__CONSTAINT:
				setConstaint((Rectangle)newValue);
				return;
			case OCVPackage.VCONTRACT_CONDITION__VC_ENTITIES:
				getVcEntities().clear();
				getVcEntities().addAll((Collection<? extends VCEntity>)newValue);
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
			case OCVPackage.VCONTRACT_CONDITION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OCVPackage.VCONTRACT_CONDITION__CONSTAINT:
				setConstaint(CONSTAINT_EDEFAULT);
				return;
			case OCVPackage.VCONTRACT_CONDITION__VC_ENTITIES:
				getVcEntities().clear();
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
			case OCVPackage.VCONTRACT_CONDITION__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case OCVPackage.VCONTRACT_CONDITION__CONSTAINT:
				return CONSTAINT_EDEFAULT == null ? constaint != null : !CONSTAINT_EDEFAULT.equals(constaint);
			case OCVPackage.VCONTRACT_CONDITION__VC_ENTITIES:
				return vcEntities != null && !vcEntities.isEmpty();
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
			case OCVPackage.VCONTRACT_CONDITION___SET_VC_ENTITY_CONTRACT__VCENTITY:
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
		result.append(" (type: ");
		result.append(type);
		result.append(", constaint: ");
		result.append(constaint);
		result.append(')');
		return result.toString();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not 
	 */
	public VContractPostcondition getPostConditon()
	{
		return null;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public VContractPrecondition getPreConditon()
	{
		return null;
	}

} //VContractConditionImpl
