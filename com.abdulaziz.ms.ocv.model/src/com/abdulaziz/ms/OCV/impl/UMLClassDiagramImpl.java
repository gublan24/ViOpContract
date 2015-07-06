/**
 */
package com.abdulaziz.ms.OCV.impl;

import com.abdulaziz.ms.OCV.OCVPackage;
import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLClassDiagram;
import com.abdulaziz.ms.OCV.UMLLink;
import com.abdulaziz.ms.OCV.VSystemOperationDiagram;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Class Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.UMLClassDiagramImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.UMLClassDiagramImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.UMLClassDiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.UMLClassDiagramImpl#getSystemOperation <em>System Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UMLClassDiagramImpl extends MinimalEObjectImpl.Container implements UMLClassDiagram {
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLClass> classes;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLLink> links;

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
	 * The cached value of the '{@link #getSystemOperation() <em>System Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemOperation()
	 * @generated
	 * @ordered
	 */
	protected VSystemOperationDiagram systemOperation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLClassDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCVPackage.Literals.UML_CLASS_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UMLClass> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentWithInverseEList<UMLClass>(UMLClass.class, this, OCVPackage.UML_CLASS_DIAGRAM__CLASSES, OCVPackage.UML_CLASS__UML_DIAGRAM);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UMLLink> getLinks() {
		if (links == null) {
			links = new EObjectContainmentWithInverseEList<UMLLink>(UMLLink.class, this, OCVPackage.UML_CLASS_DIAGRAM__LINKS, OCVPackage.UML_LINK__UML_DIAGRAM);
		}
		return links;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.UML_CLASS_DIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSystemOperationDiagram getSystemOperation() {
		return systemOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemOperation(VSystemOperationDiagram newSystemOperation, NotificationChain msgs) {
		VSystemOperationDiagram oldSystemOperation = systemOperation;
		systemOperation = newSystemOperation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OCVPackage.UML_CLASS_DIAGRAM__SYSTEM_OPERATION, oldSystemOperation, newSystemOperation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemOperation(VSystemOperationDiagram newSystemOperation) {
		if (newSystemOperation != systemOperation) {
			NotificationChain msgs = null;
			if (systemOperation != null)
				msgs = ((InternalEObject)systemOperation).eInverseRemove(this, OCVPackage.VSYSTEM_OPERATION_DIAGRAM__UML_DIAGRAM, VSystemOperationDiagram.class, msgs);
			if (newSystemOperation != null)
				msgs = ((InternalEObject)newSystemOperation).eInverseAdd(this, OCVPackage.VSYSTEM_OPERATION_DIAGRAM__UML_DIAGRAM, VSystemOperationDiagram.class, msgs);
			msgs = basicSetSystemOperation(newSystemOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.UML_CLASS_DIAGRAM__SYSTEM_OPERATION, newSystemOperation, newSystemOperation));
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
			case OCVPackage.UML_CLASS_DIAGRAM__CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClasses()).basicAdd(otherEnd, msgs);
			case OCVPackage.UML_CLASS_DIAGRAM__LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLinks()).basicAdd(otherEnd, msgs);
			case OCVPackage.UML_CLASS_DIAGRAM__SYSTEM_OPERATION:
				if (systemOperation != null)
					msgs = ((InternalEObject)systemOperation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OCVPackage.UML_CLASS_DIAGRAM__SYSTEM_OPERATION, null, msgs);
				return basicSetSystemOperation((VSystemOperationDiagram)otherEnd, msgs);
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
			case OCVPackage.UML_CLASS_DIAGRAM__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case OCVPackage.UML_CLASS_DIAGRAM__LINKS:
				return ((InternalEList<?>)getLinks()).basicRemove(otherEnd, msgs);
			case OCVPackage.UML_CLASS_DIAGRAM__SYSTEM_OPERATION:
				return basicSetSystemOperation(null, msgs);
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
			case OCVPackage.UML_CLASS_DIAGRAM__CLASSES:
				return getClasses();
			case OCVPackage.UML_CLASS_DIAGRAM__LINKS:
				return getLinks();
			case OCVPackage.UML_CLASS_DIAGRAM__NAME:
				return getName();
			case OCVPackage.UML_CLASS_DIAGRAM__SYSTEM_OPERATION:
				return getSystemOperation();
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
			case OCVPackage.UML_CLASS_DIAGRAM__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends UMLClass>)newValue);
				return;
			case OCVPackage.UML_CLASS_DIAGRAM__LINKS:
				getLinks().clear();
				getLinks().addAll((Collection<? extends UMLLink>)newValue);
				return;
			case OCVPackage.UML_CLASS_DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case OCVPackage.UML_CLASS_DIAGRAM__SYSTEM_OPERATION:
				setSystemOperation((VSystemOperationDiagram)newValue);
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
			case OCVPackage.UML_CLASS_DIAGRAM__CLASSES:
				getClasses().clear();
				return;
			case OCVPackage.UML_CLASS_DIAGRAM__LINKS:
				getLinks().clear();
				return;
			case OCVPackage.UML_CLASS_DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OCVPackage.UML_CLASS_DIAGRAM__SYSTEM_OPERATION:
				setSystemOperation((VSystemOperationDiagram)null);
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
			case OCVPackage.UML_CLASS_DIAGRAM__CLASSES:
				return classes != null && !classes.isEmpty();
			case OCVPackage.UML_CLASS_DIAGRAM__LINKS:
				return links != null && !links.isEmpty();
			case OCVPackage.UML_CLASS_DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OCVPackage.UML_CLASS_DIAGRAM__SYSTEM_OPERATION:
				return systemOperation != null;
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

} //UMLClassDiagramImpl
