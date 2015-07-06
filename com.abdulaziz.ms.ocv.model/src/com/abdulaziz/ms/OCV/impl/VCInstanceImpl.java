/**
 */
package com.abdulaziz.ms.OCV.impl;

import com.abdulaziz.ms.OCV.OCVPackage;
import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VCInstanceField;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VC Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCInstanceImpl#getUmlClass <em>Uml Class</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCInstanceImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCInstanceImpl#getInstanceName <em>Instance Name</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCInstanceImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCInstanceImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCInstanceImpl#getNotes <em>Notes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VCInstanceImpl extends VCEntityImpl implements VCInstance {
	/**
	 * The cached value of the '{@link #getUmlClass() <em>Uml Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlClass()
	 * @generated
	 * @ordered
	 */
	protected UMLClass umlClass;

	/**
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
	protected EList<VCInstanceField> fields;

	/**
	 * The default value of the '{@link #getInstanceName() <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceName()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceName() <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceName()
	 * @generated
	 * @ordered
	 */
	protected String instanceName = INSTANCE_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected String notes = NOTES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCVPackage.Literals.VC_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLClass getUmlClass() {
		if (umlClass != null && umlClass.eIsProxy()) {
			InternalEObject oldUmlClass = (InternalEObject)umlClass;
			umlClass = (UMLClass)eResolveProxy(oldUmlClass);
			if (umlClass != oldUmlClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCVPackage.VC_INSTANCE__UML_CLASS, oldUmlClass, umlClass));
			}
		}
		return umlClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLClass basicGetUmlClass() {
		return umlClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUmlClass(UMLClass newUmlClass, NotificationChain msgs) {
		UMLClass oldUmlClass = umlClass;
		umlClass = newUmlClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OCVPackage.VC_INSTANCE__UML_CLASS, oldUmlClass, newUmlClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlClass(UMLClass newUmlClass) {
		if (newUmlClass != umlClass) {
			NotificationChain msgs = null;
			if (umlClass != null)
				msgs = ((InternalEObject)umlClass).eInverseRemove(this, OCVPackage.UML_CLASS__VC_INSTANCES, UMLClass.class, msgs);
			if (newUmlClass != null)
				msgs = ((InternalEObject)newUmlClass).eInverseAdd(this, OCVPackage.UML_CLASS__VC_INSTANCES, UMLClass.class, msgs);
			msgs = basicSetUmlClass(newUmlClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_INSTANCE__UML_CLASS, newUmlClass, newUmlClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VCInstanceField> getFields() {
		if (fields == null) {
			fields = new EObjectWithInverseResolvingEList<VCInstanceField>(VCInstanceField.class, this, OCVPackage.VC_INSTANCE__FIELDS, OCVPackage.VC_INSTANCE_FIELD__VC_INSTANCE);
		}
		return fields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceName() {
		return instanceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceName(String newInstanceName) {
		String oldInstanceName = instanceName;
		instanceName = newInstanceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_INSTANCE__INSTANCE_NAME, oldInstanceName, instanceName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_INSTANCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_INSTANCE__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(String newNotes) {
		String oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_INSTANCE__NOTES, oldNotes, notes));
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
			case OCVPackage.VC_INSTANCE__UML_CLASS:
				if (umlClass != null)
					msgs = ((InternalEObject)umlClass).eInverseRemove(this, OCVPackage.UML_CLASS__VC_INSTANCES, UMLClass.class, msgs);
				return basicSetUmlClass((UMLClass)otherEnd, msgs);
			case OCVPackage.VC_INSTANCE__FIELDS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFields()).basicAdd(otherEnd, msgs);
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
			case OCVPackage.VC_INSTANCE__UML_CLASS:
				return basicSetUmlClass(null, msgs);
			case OCVPackage.VC_INSTANCE__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
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
			case OCVPackage.VC_INSTANCE__UML_CLASS:
				if (resolve) return getUmlClass();
				return basicGetUmlClass();
			case OCVPackage.VC_INSTANCE__FIELDS:
				return getFields();
			case OCVPackage.VC_INSTANCE__INSTANCE_NAME:
				return getInstanceName();
			case OCVPackage.VC_INSTANCE__TYPE:
				return getType();
			case OCVPackage.VC_INSTANCE__IDENTIFIER:
				return getIdentifier();
			case OCVPackage.VC_INSTANCE__NOTES:
				return getNotes();
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
			case OCVPackage.VC_INSTANCE__UML_CLASS:
				setUmlClass((UMLClass)newValue);
				return;
			case OCVPackage.VC_INSTANCE__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends VCInstanceField>)newValue);
				return;
			case OCVPackage.VC_INSTANCE__INSTANCE_NAME:
				setInstanceName((String)newValue);
				return;
			case OCVPackage.VC_INSTANCE__TYPE:
				setType((String)newValue);
				return;
			case OCVPackage.VC_INSTANCE__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case OCVPackage.VC_INSTANCE__NOTES:
				setNotes((String)newValue);
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
			case OCVPackage.VC_INSTANCE__UML_CLASS:
				setUmlClass((UMLClass)null);
				return;
			case OCVPackage.VC_INSTANCE__FIELDS:
				getFields().clear();
				return;
			case OCVPackage.VC_INSTANCE__INSTANCE_NAME:
				setInstanceName(INSTANCE_NAME_EDEFAULT);
				return;
			case OCVPackage.VC_INSTANCE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OCVPackage.VC_INSTANCE__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case OCVPackage.VC_INSTANCE__NOTES:
				setNotes(NOTES_EDEFAULT);
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
			case OCVPackage.VC_INSTANCE__UML_CLASS:
				return umlClass != null;
			case OCVPackage.VC_INSTANCE__FIELDS:
				return fields != null && !fields.isEmpty();
			case OCVPackage.VC_INSTANCE__INSTANCE_NAME:
				return INSTANCE_NAME_EDEFAULT == null ? instanceName != null : !INSTANCE_NAME_EDEFAULT.equals(instanceName);
			case OCVPackage.VC_INSTANCE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case OCVPackage.VC_INSTANCE__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case OCVPackage.VC_INSTANCE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
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
		result.append(" (instanceName: ");
		result.append(instanceName);
		result.append(", type: ");
		result.append(type);
		result.append(", identifier: ");
		result.append(identifier);
		result.append(", notes: ");
		result.append(notes);
		result.append(')');
		return result.toString();
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not
	 */
	public String getName() {
		return this.getInstanceName();
	}

} //VCInstanceImpl
