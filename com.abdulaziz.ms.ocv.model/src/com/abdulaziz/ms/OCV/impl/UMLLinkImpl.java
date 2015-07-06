/**
 */
package com.abdulaziz.ms.OCV.impl;

import com.abdulaziz.ms.OCV.OCVPackage;
import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLClassDiagram;
import com.abdulaziz.ms.OCV.UMLLink;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>UML Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.UMLLinkImpl#getType <em>Type</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.UMLLinkImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.UMLLinkImpl#getSourceMutiplicity <em>Source Mutiplicity</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.UMLLinkImpl#getTargetMutiplicity <em>Target Mutiplicity</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.UMLLinkImpl#getSource <em>Source</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.UMLLinkImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.UMLLinkImpl#getUmlDiagram <em>Uml Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UMLLinkImpl extends MinimalEObjectImpl.Container implements UMLLink {
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
	 * The default value of the '{@link #getSourceMutiplicity() <em>Source Mutiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMutiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_MUTIPLICITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceMutiplicity() <em>Source Mutiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceMutiplicity()
	 * @generated
	 * @ordered
	 */
	protected String sourceMutiplicity = SOURCE_MUTIPLICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetMutiplicity() <em>Target Mutiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMutiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_MUTIPLICITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetMutiplicity() <em>Target Mutiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetMutiplicity()
	 * @generated
	 * @ordered
	 */
	protected String targetMutiplicity = TARGET_MUTIPLICITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected UMLClass source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected UMLClass target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCVPackage.Literals.UML_LINK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.UML_LINK__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.UML_LINK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceMutiplicity() {
		return sourceMutiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceMutiplicity(String newSourceMutiplicity) {
		String oldSourceMutiplicity = sourceMutiplicity;
		sourceMutiplicity = newSourceMutiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.UML_LINK__SOURCE_MUTIPLICITY, oldSourceMutiplicity, sourceMutiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetMutiplicity() {
		return targetMutiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetMutiplicity(String newTargetMutiplicity) {
		String oldTargetMutiplicity = targetMutiplicity;
		targetMutiplicity = newTargetMutiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.UML_LINK__TARGET_MUTIPLICITY, oldTargetMutiplicity, targetMutiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLClass getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (UMLClass)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCVPackage.UML_LINK__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLClass basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(UMLClass newSource, NotificationChain msgs) {
		UMLClass oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OCVPackage.UML_LINK__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(UMLClass newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, OCVPackage.UML_CLASS__OUTGOING_LINKS, UMLClass.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, OCVPackage.UML_CLASS__OUTGOING_LINKS, UMLClass.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.UML_LINK__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLClass getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (UMLClass)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCVPackage.UML_LINK__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLClass basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(UMLClass newTarget, NotificationChain msgs) {
		UMLClass oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OCVPackage.UML_LINK__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(UMLClass newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, OCVPackage.UML_CLASS__INCOMING_LINKS, UMLClass.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, OCVPackage.UML_CLASS__INCOMING_LINKS, UMLClass.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.UML_LINK__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLClassDiagram getUmlDiagram() {
		if (eContainerFeatureID() != OCVPackage.UML_LINK__UML_DIAGRAM) return null;
		return (UMLClassDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUmlDiagram(UMLClassDiagram newUmlDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUmlDiagram, OCVPackage.UML_LINK__UML_DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlDiagram(UMLClassDiagram newUmlDiagram) {
		if (newUmlDiagram != eInternalContainer() || (eContainerFeatureID() != OCVPackage.UML_LINK__UML_DIAGRAM && newUmlDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newUmlDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUmlDiagram != null)
				msgs = ((InternalEObject)newUmlDiagram).eInverseAdd(this, OCVPackage.UML_CLASS_DIAGRAM__LINKS, UMLClassDiagram.class, msgs);
			msgs = basicSetUmlDiagram(newUmlDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.UML_LINK__UML_DIAGRAM, newUmlDiagram, newUmlDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCVPackage.UML_LINK__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, OCVPackage.UML_CLASS__OUTGOING_LINKS, UMLClass.class, msgs);
				return basicSetSource((UMLClass)otherEnd, msgs);
			case OCVPackage.UML_LINK__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, OCVPackage.UML_CLASS__INCOMING_LINKS, UMLClass.class, msgs);
				return basicSetTarget((UMLClass)otherEnd, msgs);
			case OCVPackage.UML_LINK__UML_DIAGRAM:
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
			case OCVPackage.UML_LINK__SOURCE:
				return basicSetSource(null, msgs);
			case OCVPackage.UML_LINK__TARGET:
				return basicSetTarget(null, msgs);
			case OCVPackage.UML_LINK__UML_DIAGRAM:
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
			case OCVPackage.UML_LINK__UML_DIAGRAM:
				return eInternalContainer().eInverseRemove(this, OCVPackage.UML_CLASS_DIAGRAM__LINKS, UMLClassDiagram.class, msgs);
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
			case OCVPackage.UML_LINK__TYPE:
				return getType();
			case OCVPackage.UML_LINK__NAME:
				return getName();
			case OCVPackage.UML_LINK__SOURCE_MUTIPLICITY:
				return getSourceMutiplicity();
			case OCVPackage.UML_LINK__TARGET_MUTIPLICITY:
				return getTargetMutiplicity();
			case OCVPackage.UML_LINK__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case OCVPackage.UML_LINK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case OCVPackage.UML_LINK__UML_DIAGRAM:
				return getUmlDiagram();
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
			case OCVPackage.UML_LINK__TYPE:
				setType((String)newValue);
				return;
			case OCVPackage.UML_LINK__NAME:
				setName((String)newValue);
				return;
			case OCVPackage.UML_LINK__SOURCE_MUTIPLICITY:
				setSourceMutiplicity((String)newValue);
				return;
			case OCVPackage.UML_LINK__TARGET_MUTIPLICITY:
				setTargetMutiplicity((String)newValue);
				return;
			case OCVPackage.UML_LINK__SOURCE:
				setSource((UMLClass)newValue);
				return;
			case OCVPackage.UML_LINK__TARGET:
				setTarget((UMLClass)newValue);
				return;
			case OCVPackage.UML_LINK__UML_DIAGRAM:
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
			case OCVPackage.UML_LINK__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OCVPackage.UML_LINK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OCVPackage.UML_LINK__SOURCE_MUTIPLICITY:
				setSourceMutiplicity(SOURCE_MUTIPLICITY_EDEFAULT);
				return;
			case OCVPackage.UML_LINK__TARGET_MUTIPLICITY:
				setTargetMutiplicity(TARGET_MUTIPLICITY_EDEFAULT);
				return;
			case OCVPackage.UML_LINK__SOURCE:
				setSource((UMLClass)null);
				return;
			case OCVPackage.UML_LINK__TARGET:
				setTarget((UMLClass)null);
				return;
			case OCVPackage.UML_LINK__UML_DIAGRAM:
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
			case OCVPackage.UML_LINK__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case OCVPackage.UML_LINK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OCVPackage.UML_LINK__SOURCE_MUTIPLICITY:
				return SOURCE_MUTIPLICITY_EDEFAULT == null ? sourceMutiplicity != null : !SOURCE_MUTIPLICITY_EDEFAULT.equals(sourceMutiplicity);
			case OCVPackage.UML_LINK__TARGET_MUTIPLICITY:
				return TARGET_MUTIPLICITY_EDEFAULT == null ? targetMutiplicity != null : !TARGET_MUTIPLICITY_EDEFAULT.equals(targetMutiplicity);
			case OCVPackage.UML_LINK__SOURCE:
				return source != null;
			case OCVPackage.UML_LINK__TARGET:
				return target != null;
			case OCVPackage.UML_LINK__UML_DIAGRAM:
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
		result.append(" (type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(", sourceMutiplicity: ");
		result.append(sourceMutiplicity);
		result.append(", targetMutiplicity: ");
		result.append(targetMutiplicity);
		result.append(')');
		return result.toString();
	}

} //UMLLinkImpl
