/**
 */
package com.abdulaziz.ms.OCV.impl;

import com.abdulaziz.ms.OCV.OCVPackage;
import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCLink;
import com.abdulaziz.ms.OCV.VContractCondition;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VC Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCEntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCEntityImpl#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCEntityImpl#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCEntityImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCEntityImpl#getVcContract <em>Vc Contract</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCEntityImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCEntityImpl#getPostcondition <em>Postcondition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class VCEntityImpl extends MinimalEObjectImpl.Container implements VCEntity {
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
	 * The cached value of the '{@link #getIncomingLinks() <em>Incoming Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<VCLink> incomingLinks;

	/**
	 * The cached value of the '{@link #getOutgoingLinks() <em>Outgoing Links</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<VCLink> outgoingLinks;

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
	 * The cached value of the '{@link #getVcContract() <em>Vc Contract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcContract()
	 * @generated
	 * @ordered
	 */
	protected VCContract vcContract;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected VContractCondition precondition;

	/**
	 * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected VContractCondition postcondition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCEntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCVPackage.Literals.VC_ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VCLink> getIncomingLinks() {
		if (incomingLinks == null) {
			incomingLinks = new EObjectResolvingEList<VCLink>(VCLink.class, this, OCVPackage.VC_ENTITY__INCOMING_LINKS);
		}
		return incomingLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VCLink> getOutgoingLinks() {
		if (outgoingLinks == null) {
			outgoingLinks = new EObjectResolvingEList<VCLink>(VCLink.class, this, OCVPackage.VC_ENTITY__OUTGOING_LINKS);
		}
		return outgoingLinks;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_ENTITY__CONSTRAINTS, oldConstraints, constraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCContract getVcContract() {
		if (vcContract != null && vcContract.eIsProxy()) {
			InternalEObject oldVcContract = (InternalEObject)vcContract;
			vcContract = (VCContract)eResolveProxy(oldVcContract);
			if (vcContract != oldVcContract) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCVPackage.VC_ENTITY__VC_CONTRACT, oldVcContract, vcContract));
			}
		}
		return vcContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCContract basicGetVcContract() {
		return vcContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVcContract(VCContract newVcContract) {
		VCContract oldVcContract = vcContract;
		vcContract = newVcContract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_ENTITY__VC_CONTRACT, oldVcContract, vcContract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VContractCondition getPrecondition() {
		if (precondition != null && precondition.eIsProxy()) {
			InternalEObject oldPrecondition = (InternalEObject)precondition;
			precondition = (VContractCondition)eResolveProxy(oldPrecondition);
			if (precondition != oldPrecondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCVPackage.VC_ENTITY__PRECONDITION, oldPrecondition, precondition));
			}
		}
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VContractCondition basicGetPrecondition() {
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecondition(VContractCondition newPrecondition) {
		VContractCondition oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_ENTITY__PRECONDITION, oldPrecondition, precondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VContractCondition getPostcondition() {
		if (postcondition != null && postcondition.eIsProxy()) {
			InternalEObject oldPostcondition = (InternalEObject)postcondition;
			postcondition = (VContractCondition)eResolveProxy(oldPostcondition);
			if (postcondition != oldPostcondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCVPackage.VC_ENTITY__POSTCONDITION, oldPostcondition, postcondition));
			}
		}
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VContractCondition basicGetPostcondition() {
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostcondition(VContractCondition newPostcondition) {
		VContractCondition oldPostcondition = postcondition;
		postcondition = newPostcondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_ENTITY__POSTCONDITION, oldPostcondition, postcondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVContractCondition(final VContractCondition vContractCondition) {
		vContractCondition.setVCEntityContract(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public VContractCondition getContractCondition() {
		// TODO: implement this method
		if(getPrecondition() !=null)
			return getPrecondition();
		else if (getPostcondition() != null)
		return this.getPostcondition();
		return null;
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCVPackage.VC_ENTITY__NAME:
				return getName();
			case OCVPackage.VC_ENTITY__INCOMING_LINKS:
				return getIncomingLinks();
			case OCVPackage.VC_ENTITY__OUTGOING_LINKS:
				return getOutgoingLinks();
			case OCVPackage.VC_ENTITY__CONSTRAINTS:
				return getConstraints();
			case OCVPackage.VC_ENTITY__VC_CONTRACT:
				if (resolve) return getVcContract();
				return basicGetVcContract();
			case OCVPackage.VC_ENTITY__PRECONDITION:
				if (resolve) return getPrecondition();
				return basicGetPrecondition();
			case OCVPackage.VC_ENTITY__POSTCONDITION:
				if (resolve) return getPostcondition();
				return basicGetPostcondition();
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
			case OCVPackage.VC_ENTITY__NAME:
				setName((String)newValue);
				return;
			case OCVPackage.VC_ENTITY__INCOMING_LINKS:
				getIncomingLinks().clear();
				getIncomingLinks().addAll((Collection<? extends VCLink>)newValue);
				return;
			case OCVPackage.VC_ENTITY__OUTGOING_LINKS:
				getOutgoingLinks().clear();
				getOutgoingLinks().addAll((Collection<? extends VCLink>)newValue);
				return;
			case OCVPackage.VC_ENTITY__CONSTRAINTS:
				setConstraints((Rectangle)newValue);
				return;
			case OCVPackage.VC_ENTITY__VC_CONTRACT:
				setVcContract((VCContract)newValue);
				return;
			case OCVPackage.VC_ENTITY__PRECONDITION:
				setPrecondition((VContractCondition)newValue);
				return;
			case OCVPackage.VC_ENTITY__POSTCONDITION:
				setPostcondition((VContractCondition)newValue);
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
			case OCVPackage.VC_ENTITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OCVPackage.VC_ENTITY__INCOMING_LINKS:
				getIncomingLinks().clear();
				return;
			case OCVPackage.VC_ENTITY__OUTGOING_LINKS:
				getOutgoingLinks().clear();
				return;
			case OCVPackage.VC_ENTITY__CONSTRAINTS:
				setConstraints(CONSTRAINTS_EDEFAULT);
				return;
			case OCVPackage.VC_ENTITY__VC_CONTRACT:
				setVcContract((VCContract)null);
				return;
			case OCVPackage.VC_ENTITY__PRECONDITION:
				setPrecondition((VContractCondition)null);
				return;
			case OCVPackage.VC_ENTITY__POSTCONDITION:
				setPostcondition((VContractCondition)null);
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
			case OCVPackage.VC_ENTITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OCVPackage.VC_ENTITY__INCOMING_LINKS:
				return incomingLinks != null && !incomingLinks.isEmpty();
			case OCVPackage.VC_ENTITY__OUTGOING_LINKS:
				return outgoingLinks != null && !outgoingLinks.isEmpty();
			case OCVPackage.VC_ENTITY__CONSTRAINTS:
				return CONSTRAINTS_EDEFAULT == null ? constraints != null : !CONSTRAINTS_EDEFAULT.equals(constraints);
			case OCVPackage.VC_ENTITY__VC_CONTRACT:
				return vcContract != null;
			case OCVPackage.VC_ENTITY__PRECONDITION:
				return precondition != null;
			case OCVPackage.VC_ENTITY__POSTCONDITION:
				return postcondition != null;
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
			case OCVPackage.VC_ENTITY___SET_VCONTRACT_CONDITION__VCONTRACTCONDITION:
				setVContractCondition((VContractCondition)arguments.get(0));
				return null;
			case OCVPackage.VC_ENTITY___GET_CONTRACT_CONDITION:
				return getContractCondition();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", constraints: ");
		result.append(constraints);
		result.append(')');
		return result.toString();
	}

} //VCEntityImpl
