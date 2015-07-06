/**
 */
package com.abdulaziz.ms.OCV.impl;

import com.abdulaziz.ms.OCV.OCVPackage;
import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLClassDiagram;
import com.abdulaziz.ms.OCV.UMLLink;
import com.abdulaziz.ms.OCV.UMLVariable;
import com.abdulaziz.ms.OCV.VCInstance;
import java.util.Collection;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.UMLClassImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.UMLClassImpl#getClassAttributes <em>Class Attributes</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.UMLClassImpl#getUmlDiagram <em>Uml Diagram</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.UMLClassImpl#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.UMLClassImpl#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.UMLClassImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.UMLClassImpl#getVCInstances <em>VC Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UMLClassImpl extends MinimalEObjectImpl.Container implements UMLClass {
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
	 * The cached value of the '{@link #getClassAttributes() <em>Class Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLVariable> classAttributes;

	/**
	 * The cached value of the '{@link #getIncomingLinks() <em>Incoming Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLLink> incomingLinks;

	/**
	 * The cached value of the '{@link #getOutgoingLinks() <em>Outgoing Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<UMLLink> outgoingLinks;

	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVCInstances() <em>VC Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVCInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<VCInstance> vcInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCVPackage.Literals.UML_CLASS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.UML_CLASS__CONSTRAINTS, oldConstraints, constraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UMLVariable> getClassAttributes() {
		if (classAttributes == null) {
			classAttributes = new EObjectContainmentWithInverseEList<UMLVariable>(UMLVariable.class, this, OCVPackage.UML_CLASS__CLASS_ATTRIBUTES, OCVPackage.UML_VARIABLE__UML_CLASS);
		}
		return classAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLClassDiagram getUmlDiagram() {
		if (eContainerFeatureID() != OCVPackage.UML_CLASS__UML_DIAGRAM) return null;
		return (UMLClassDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUmlDiagram(UMLClassDiagram newUmlDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUmlDiagram, OCVPackage.UML_CLASS__UML_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlDiagram(UMLClassDiagram newUmlDiagram) {
		if (newUmlDiagram != eInternalContainer() || (eContainerFeatureID() != OCVPackage.UML_CLASS__UML_DIAGRAM && newUmlDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newUmlDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUmlDiagram != null)
				msgs = ((InternalEObject)newUmlDiagram).eInverseAdd(this, OCVPackage.UML_CLASS_DIAGRAM__CLASSES, UMLClassDiagram.class, msgs);
			msgs = basicSetUmlDiagram(newUmlDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.UML_CLASS__UML_DIAGRAM, newUmlDiagram, newUmlDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UMLLink> getIncomingLinks() {
		if (incomingLinks == null) {
			incomingLinks = new EObjectWithInverseResolvingEList<UMLLink>(UMLLink.class, this, OCVPackage.UML_CLASS__INCOMING_LINKS, OCVPackage.UML_LINK__TARGET);
		}
		return incomingLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UMLLink> getOutgoingLinks() {
		if (outgoingLinks == null) {
			outgoingLinks = new EObjectWithInverseResolvingEList<UMLLink>(UMLLink.class, this, OCVPackage.UML_CLASS__OUTGOING_LINKS, OCVPackage.UML_LINK__SOURCE);
		}
		return outgoingLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.UML_CLASS__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VCInstance> getVCInstances() {
		if (vcInstances == null) {
			vcInstances = new EObjectWithInverseResolvingEList<VCInstance>(VCInstance.class, this, OCVPackage.UML_CLASS__VC_INSTANCES, OCVPackage.VC_INSTANCE__UML_CLASS);
		}
		return vcInstances;
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
			case OCVPackage.UML_CLASS__CLASS_ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClassAttributes()).basicAdd(otherEnd, msgs);
			case OCVPackage.UML_CLASS__UML_DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUmlDiagram((UMLClassDiagram)otherEnd, msgs);
			case OCVPackage.UML_CLASS__INCOMING_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingLinks()).basicAdd(otherEnd, msgs);
			case OCVPackage.UML_CLASS__OUTGOING_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingLinks()).basicAdd(otherEnd, msgs);
			case OCVPackage.UML_CLASS__VC_INSTANCES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVCInstances()).basicAdd(otherEnd, msgs);
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
			case OCVPackage.UML_CLASS__CLASS_ATTRIBUTES:
				return ((InternalEList<?>)getClassAttributes()).basicRemove(otherEnd, msgs);
			case OCVPackage.UML_CLASS__UML_DIAGRAM:
				return basicSetUmlDiagram(null, msgs);
			case OCVPackage.UML_CLASS__INCOMING_LINKS:
				return ((InternalEList<?>)getIncomingLinks()).basicRemove(otherEnd, msgs);
			case OCVPackage.UML_CLASS__OUTGOING_LINKS:
				return ((InternalEList<?>)getOutgoingLinks()).basicRemove(otherEnd, msgs);
			case OCVPackage.UML_CLASS__VC_INSTANCES:
				return ((InternalEList<?>)getVCInstances()).basicRemove(otherEnd, msgs);
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
			case OCVPackage.UML_CLASS__UML_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, OCVPackage.UML_CLASS_DIAGRAM__CLASSES, UMLClassDiagram.class, msgs);
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
			case OCVPackage.UML_CLASS__CONSTRAINTS:
				return getConstraints();
			case OCVPackage.UML_CLASS__CLASS_ATTRIBUTES:
				return getClassAttributes();
			case OCVPackage.UML_CLASS__UML_DIAGRAM:
				return getUmlDiagram();
			case OCVPackage.UML_CLASS__INCOMING_LINKS:
				return getIncomingLinks();
			case OCVPackage.UML_CLASS__OUTGOING_LINKS:
				return getOutgoingLinks();
			case OCVPackage.UML_CLASS__CLASS_NAME:
				return getClassName();
			case OCVPackage.UML_CLASS__VC_INSTANCES:
				return getVCInstances();
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
			case OCVPackage.UML_CLASS__CONSTRAINTS:
				setConstraints((Rectangle)newValue);
				return;
			case OCVPackage.UML_CLASS__CLASS_ATTRIBUTES:
				getClassAttributes().clear();
				getClassAttributes().addAll((Collection<? extends UMLVariable>)newValue);
				return;
			case OCVPackage.UML_CLASS__UML_DIAGRAM:
				setUmlDiagram((UMLClassDiagram)newValue);
				return;
			case OCVPackage.UML_CLASS__INCOMING_LINKS:
				getIncomingLinks().clear();
				getIncomingLinks().addAll((Collection<? extends UMLLink>)newValue);
				return;
			case OCVPackage.UML_CLASS__OUTGOING_LINKS:
				getOutgoingLinks().clear();
				getOutgoingLinks().addAll((Collection<? extends UMLLink>)newValue);
				return;
			case OCVPackage.UML_CLASS__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case OCVPackage.UML_CLASS__VC_INSTANCES:
				getVCInstances().clear();
				getVCInstances().addAll((Collection<? extends VCInstance>)newValue);
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
			case OCVPackage.UML_CLASS__CONSTRAINTS:
				setConstraints(CONSTRAINTS_EDEFAULT);
				return;
			case OCVPackage.UML_CLASS__CLASS_ATTRIBUTES:
				getClassAttributes().clear();
				return;
			case OCVPackage.UML_CLASS__UML_DIAGRAM:
				setUmlDiagram((UMLClassDiagram)null);
				return;
			case OCVPackage.UML_CLASS__INCOMING_LINKS:
				getIncomingLinks().clear();
				return;
			case OCVPackage.UML_CLASS__OUTGOING_LINKS:
				getOutgoingLinks().clear();
				return;
			case OCVPackage.UML_CLASS__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case OCVPackage.UML_CLASS__VC_INSTANCES:
				getVCInstances().clear();
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
			case OCVPackage.UML_CLASS__CONSTRAINTS:
				return CONSTRAINTS_EDEFAULT == null ? constraints != null : !CONSTRAINTS_EDEFAULT.equals(constraints);
			case OCVPackage.UML_CLASS__CLASS_ATTRIBUTES:
				return classAttributes != null && !classAttributes.isEmpty();
			case OCVPackage.UML_CLASS__UML_DIAGRAM:
				return getUmlDiagram() != null;
			case OCVPackage.UML_CLASS__INCOMING_LINKS:
				return incomingLinks != null && !incomingLinks.isEmpty();
			case OCVPackage.UML_CLASS__OUTGOING_LINKS:
				return outgoingLinks != null && !outgoingLinks.isEmpty();
			case OCVPackage.UML_CLASS__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
			case OCVPackage.UML_CLASS__VC_INSTANCES:
				return vcInstances != null && !vcInstances.isEmpty();
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
		result.append(", className: ");
		result.append(className);
		result.append(')');
		return result.toString();
	}

} //UMLClassImpl
