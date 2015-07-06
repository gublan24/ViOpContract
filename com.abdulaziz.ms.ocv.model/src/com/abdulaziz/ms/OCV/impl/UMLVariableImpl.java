/**
 */
package com.abdulaziz.ms.OCV.impl;

import com.abdulaziz.ms.OCV.OCVPackage;
import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLVariable;
import com.abdulaziz.ms.OCV.VOperation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.UMLVariableImpl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.UMLVariableImpl#getVariableType <em>Variable Type</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.UMLVariableImpl#getUmlClass <em>Uml Class</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.UMLVariableImpl#getVOperation <em>VOperation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UMLVariableImpl extends MinimalEObjectImpl.Container implements UMLVariable {
	/**
	 * The default value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected String variableName = VARIABLE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVariableType() <em>Variable Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableType()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableType() <em>Variable Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableType()
	 * @generated
	 * @ordered
	 */
	protected String variableType = VARIABLE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCVPackage.Literals.UML_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariableName() {
		return variableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableName(String newVariableName) {
		String oldVariableName = variableName;
		variableName = newVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.UML_VARIABLE__VARIABLE_NAME, oldVariableName, variableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariableType() {
		return variableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableType(String newVariableType) {
		String oldVariableType = variableType;
		variableType = newVariableType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.UML_VARIABLE__VARIABLE_TYPE, oldVariableType, variableType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLClass getUmlClass() {
		if (eContainerFeatureID() != OCVPackage.UML_VARIABLE__UML_CLASS) return null;
		return (UMLClass)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUmlClass(UMLClass newUmlClass, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUmlClass, OCVPackage.UML_VARIABLE__UML_CLASS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlClass(UMLClass newUmlClass) {
		if (newUmlClass != eInternalContainer() || (eContainerFeatureID() != OCVPackage.UML_VARIABLE__UML_CLASS && newUmlClass != null)) {
			if (EcoreUtil.isAncestor(this, newUmlClass))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUmlClass != null)
				msgs = ((InternalEObject)newUmlClass).eInverseAdd(this, OCVPackage.UML_CLASS__CLASS_ATTRIBUTES, UMLClass.class, msgs);
			msgs = basicSetUmlClass(newUmlClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.UML_VARIABLE__UML_CLASS, newUmlClass, newUmlClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VOperation getVOperation() {
		if (eContainerFeatureID() != OCVPackage.UML_VARIABLE__VOPERATION) return null;
		return (VOperation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVOperation(VOperation newVOperation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVOperation, OCVPackage.UML_VARIABLE__VOPERATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVOperation(VOperation newVOperation) {
		if (newVOperation != eInternalContainer() || (eContainerFeatureID() != OCVPackage.UML_VARIABLE__VOPERATION && newVOperation != null)) {
			if (EcoreUtil.isAncestor(this, newVOperation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVOperation != null)
				msgs = ((InternalEObject)newVOperation).eInverseAdd(this, OCVPackage.VOPERATION__OPERATION_PARAMETERS, VOperation.class, msgs);
			msgs = basicSetVOperation(newVOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.UML_VARIABLE__VOPERATION, newVOperation, newVOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCVPackage.UML_VARIABLE__UML_CLASS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUmlClass((UMLClass)otherEnd, msgs);
			case OCVPackage.UML_VARIABLE__VOPERATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVOperation((VOperation)otherEnd, msgs);
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
			case OCVPackage.UML_VARIABLE__UML_CLASS:
				return basicSetUmlClass(null, msgs);
			case OCVPackage.UML_VARIABLE__VOPERATION:
				return basicSetVOperation(null, msgs);
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
			case OCVPackage.UML_VARIABLE__UML_CLASS:
				return eInternalContainer().eInverseRemove(this, OCVPackage.UML_CLASS__CLASS_ATTRIBUTES, UMLClass.class, msgs);
			case OCVPackage.UML_VARIABLE__VOPERATION:
				return eInternalContainer().eInverseRemove(this, OCVPackage.VOPERATION__OPERATION_PARAMETERS, VOperation.class, msgs);
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
			case OCVPackage.UML_VARIABLE__VARIABLE_NAME:
				return getVariableName();
			case OCVPackage.UML_VARIABLE__VARIABLE_TYPE:
				return getVariableType();
			case OCVPackage.UML_VARIABLE__UML_CLASS:
				return getUmlClass();
			case OCVPackage.UML_VARIABLE__VOPERATION:
				return getVOperation();
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
			case OCVPackage.UML_VARIABLE__VARIABLE_NAME:
				setVariableName((String)newValue);
				return;
			case OCVPackage.UML_VARIABLE__VARIABLE_TYPE:
				setVariableType((String)newValue);
				return;
			case OCVPackage.UML_VARIABLE__UML_CLASS:
				setUmlClass((UMLClass)newValue);
				return;
			case OCVPackage.UML_VARIABLE__VOPERATION:
				setVOperation((VOperation)newValue);
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
			case OCVPackage.UML_VARIABLE__VARIABLE_NAME:
				setVariableName(VARIABLE_NAME_EDEFAULT);
				return;
			case OCVPackage.UML_VARIABLE__VARIABLE_TYPE:
				setVariableType(VARIABLE_TYPE_EDEFAULT);
				return;
			case OCVPackage.UML_VARIABLE__UML_CLASS:
				setUmlClass((UMLClass)null);
				return;
			case OCVPackage.UML_VARIABLE__VOPERATION:
				setVOperation((VOperation)null);
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
			case OCVPackage.UML_VARIABLE__VARIABLE_NAME:
				return VARIABLE_NAME_EDEFAULT == null ? variableName != null : !VARIABLE_NAME_EDEFAULT.equals(variableName);
			case OCVPackage.UML_VARIABLE__VARIABLE_TYPE:
				return VARIABLE_TYPE_EDEFAULT == null ? variableType != null : !VARIABLE_TYPE_EDEFAULT.equals(variableType);
			case OCVPackage.UML_VARIABLE__UML_CLASS:
				return getUmlClass() != null;
			case OCVPackage.UML_VARIABLE__VOPERATION:
				return getVOperation() != null;
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
		result.append(" (variableName: ");
		result.append(variableName);
		result.append(", variableType: ");
		result.append(variableType);
		result.append(')');
		return result.toString();
	}

} //UMLVariableImpl
