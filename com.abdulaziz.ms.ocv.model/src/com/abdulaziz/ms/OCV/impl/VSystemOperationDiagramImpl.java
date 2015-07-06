/**
 */
package com.abdulaziz.ms.OCV.impl;

import com.abdulaziz.ms.OCV.OCVPackage;
import com.abdulaziz.ms.OCV.UMLClassDiagram;
import com.abdulaziz.ms.OCV.VOperation;
import com.abdulaziz.ms.OCV.VSystemOperationDiagram;

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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSystem Operation Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VSystemOperationDiagramImpl#getClassOperations <em>Class Operations</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VSystemOperationDiagramImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VSystemOperationDiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VSystemOperationDiagramImpl#getUmlDiagram <em>Uml Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VSystemOperationDiagramImpl extends MinimalEObjectImpl.Container implements VSystemOperationDiagram {
	/**
	 * The cached value of the '{@link #getClassOperations() <em>Class Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<VOperation> classOperations;

	/**
	 * The default value of the '{@link #getConstraints() <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected static final Rectangle CONSTRAINTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected Rectangle constraints = CONSTRAINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "SYSTEM";

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VSystemOperationDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCVPackage.Literals.VSYSTEM_OPERATION_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VOperation> getClassOperations() {
		if (classOperations == null) {
			classOperations = new EObjectContainmentEList<VOperation>(VOperation.class, this, OCVPackage.VSYSTEM_OPERATION_DIAGRAM__CLASS_OPERATIONS);
		}
		return classOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rectangle getConstraints() {
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraints(Rectangle newConstraints) {
		Rectangle oldConstraints = constraints;
		constraints = newConstraints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VSYSTEM_OPERATION_DIAGRAM__CONSTRAINTS, oldConstraints, constraints));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VSYSTEM_OPERATION_DIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLClassDiagram getUmlDiagram() {
		if (eContainerFeatureID() != OCVPackage.VSYSTEM_OPERATION_DIAGRAM__UML_DIAGRAM) return null;
		return (UMLClassDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUmlDiagram(UMLClassDiagram newUmlDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUmlDiagram, OCVPackage.VSYSTEM_OPERATION_DIAGRAM__UML_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlDiagram(UMLClassDiagram newUmlDiagram) {
		if (newUmlDiagram != eInternalContainer() || (eContainerFeatureID() != OCVPackage.VSYSTEM_OPERATION_DIAGRAM__UML_DIAGRAM && newUmlDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newUmlDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUmlDiagram != null)
				msgs = ((InternalEObject)newUmlDiagram).eInverseAdd(this, OCVPackage.UML_CLASS_DIAGRAM__SYSTEM_OPERATION, UMLClassDiagram.class, msgs);
			msgs = basicSetUmlDiagram(newUmlDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VSYSTEM_OPERATION_DIAGRAM__UML_DIAGRAM, newUmlDiagram, newUmlDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCVPackage.VSYSTEM_OPERATION_DIAGRAM__UML_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUmlDiagram((UMLClassDiagram)otherEnd, msgs);
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
			case OCVPackage.VSYSTEM_OPERATION_DIAGRAM__CLASS_OPERATIONS:
				return ((InternalEList<?>)getClassOperations()).basicRemove(otherEnd, msgs);
			case OCVPackage.VSYSTEM_OPERATION_DIAGRAM__UML_DIAGRAM:
				return basicSetUmlDiagram(null, msgs);
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
			case OCVPackage.VSYSTEM_OPERATION_DIAGRAM__UML_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, OCVPackage.UML_CLASS_DIAGRAM__SYSTEM_OPERATION, UMLClassDiagram.class, msgs);
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
			case OCVPackage.VSYSTEM_OPERATION_DIAGRAM__CLASS_OPERATIONS:
				return getClassOperations();
			case OCVPackage.VSYSTEM_OPERATION_DIAGRAM__CONSTRAINTS:
				return getConstraints();
			case OCVPackage.VSYSTEM_OPERATION_DIAGRAM__NAME:
				return getName();
			case OCVPackage.VSYSTEM_OPERATION_DIAGRAM__UML_DIAGRAM:
				return getUmlDiagram();
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
			case OCVPackage.VSYSTEM_OPERATION_DIAGRAM__CLASS_OPERATIONS:
				getClassOperations().clear();
				getClassOperations().addAll((Collection<? extends VOperation>)newValue);
				return;
			case OCVPackage.VSYSTEM_OPERATION_DIAGRAM__CONSTRAINTS:
				setConstraints((Rectangle)newValue);
				return;
			case OCVPackage.VSYSTEM_OPERATION_DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case OCVPackage.VSYSTEM_OPERATION_DIAGRAM__UML_DIAGRAM:
				setUmlDiagram((UMLClassDiagram)newValue);
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
			case OCVPackage.VSYSTEM_OPERATION_DIAGRAM__CLASS_OPERATIONS:
				getClassOperations().clear();
				return;
			case OCVPackage.VSYSTEM_OPERATION_DIAGRAM__CONSTRAINTS:
				setConstraints(CONSTRAINTS_EDEFAULT);
				return;
			case OCVPackage.VSYSTEM_OPERATION_DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OCVPackage.VSYSTEM_OPERATION_DIAGRAM__UML_DIAGRAM:
				setUmlDiagram((UMLClassDiagram)null);
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
			case OCVPackage.VSYSTEM_OPERATION_DIAGRAM__CLASS_OPERATIONS:
				return classOperations != null && !classOperations.isEmpty();
			case OCVPackage.VSYSTEM_OPERATION_DIAGRAM__CONSTRAINTS:
				return CONSTRAINTS_EDEFAULT == null ? constraints != null : !CONSTRAINTS_EDEFAULT.equals(constraints);
			case OCVPackage.VSYSTEM_OPERATION_DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OCVPackage.VSYSTEM_OPERATION_DIAGRAM__UML_DIAGRAM:
				return getUmlDiagram() != null;
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
		result.append(" (constraints: ");
		result.append(constraints);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //VSystemOperationDiagramImpl
