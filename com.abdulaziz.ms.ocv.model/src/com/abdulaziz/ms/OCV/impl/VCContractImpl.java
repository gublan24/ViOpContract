/**
 */
package com.abdulaziz.ms.OCV.impl;

import com.abdulaziz.ms.OCV.OCVPackage;
import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VCLink;
import com.abdulaziz.ms.OCV.VContractPostcondition;
import com.abdulaziz.ms.OCV.VContractPrecondition;
import com.abdulaziz.ms.OCV.VOperation;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VC Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCContractImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCContractImpl#getPageIndex <em>Page Index</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCContractImpl#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCContractImpl#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCContractImpl#getUmlOperation <em>Uml Operation</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCContractImpl#getVcLinks <em>Vc Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VCContractImpl extends MinimalEObjectImpl.Container implements VCContract {
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
	 * The default value of the '{@link #getPageIndex() <em>Page Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int PAGE_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPageIndex() <em>Page Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageIndex()
	 * @generated
	 * @ordered
	 */
	protected int pageIndex = PAGE_INDEX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrecondition() <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecondition()
	 * @generated
	 * @ordered
	 */
	protected VContractPrecondition precondition;

	/**
	 * The cached value of the '{@link #getPostcondition() <em>Postcondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostcondition()
	 * @generated
	 * @ordered
	 */
	protected VContractPostcondition postcondition;

	/**
	 * The cached value of the '{@link #getVcLinks() <em>Vc Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<VCLink> vcLinks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VCContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCVPackage.Literals.VC_CONTRACT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_CONTRACT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPageIndex() {
		return pageIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageIndex(int newPageIndex) {
		int oldPageIndex = pageIndex;
		pageIndex = newPageIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_CONTRACT__PAGE_INDEX, oldPageIndex, pageIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VContractPrecondition getPrecondition() {
		return precondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecondition(VContractPrecondition newPrecondition, NotificationChain msgs) {
		VContractPrecondition oldPrecondition = precondition;
		precondition = newPrecondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OCVPackage.VC_CONTRACT__PRECONDITION, oldPrecondition, newPrecondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecondition(VContractPrecondition newPrecondition) {
		if (newPrecondition != precondition) {
			NotificationChain msgs = null;
			if (precondition != null)
				msgs = ((InternalEObject)precondition).eInverseRemove(this, OCVPackage.VCONTRACT_PRECONDITION__VC_CONTRACT, VContractPrecondition.class, msgs);
			if (newPrecondition != null)
				msgs = ((InternalEObject)newPrecondition).eInverseAdd(this, OCVPackage.VCONTRACT_PRECONDITION__VC_CONTRACT, VContractPrecondition.class, msgs);
			msgs = basicSetPrecondition(newPrecondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_CONTRACT__PRECONDITION, newPrecondition, newPrecondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VContractPostcondition getPostcondition() {
		return postcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPostcondition(VContractPostcondition newPostcondition, NotificationChain msgs) {
		VContractPostcondition oldPostcondition = postcondition;
		postcondition = newPostcondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OCVPackage.VC_CONTRACT__POSTCONDITION, oldPostcondition, newPostcondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostcondition(VContractPostcondition newPostcondition) {
		if (newPostcondition != postcondition) {
			NotificationChain msgs = null;
			if (postcondition != null)
				msgs = ((InternalEObject)postcondition).eInverseRemove(this, OCVPackage.VCONTRACT_POSTCONDITION__VC_CONTRACT, VContractPostcondition.class, msgs);
			if (newPostcondition != null)
				msgs = ((InternalEObject)newPostcondition).eInverseAdd(this, OCVPackage.VCONTRACT_POSTCONDITION__VC_CONTRACT, VContractPostcondition.class, msgs);
			msgs = basicSetPostcondition(newPostcondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_CONTRACT__POSTCONDITION, newPostcondition, newPostcondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VOperation getUmlOperation() {
		if (eContainerFeatureID() != OCVPackage.VC_CONTRACT__UML_OPERATION) return null;
		return (VOperation)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUmlOperation(VOperation newUmlOperation, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newUmlOperation, OCVPackage.VC_CONTRACT__UML_OPERATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlOperation(VOperation newUmlOperation) {
		if (newUmlOperation != eInternalContainer() || (eContainerFeatureID() != OCVPackage.VC_CONTRACT__UML_OPERATION && newUmlOperation != null)) {
			if (EcoreUtil.isAncestor(this, newUmlOperation))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newUmlOperation != null)
				msgs = ((InternalEObject)newUmlOperation).eInverseAdd(this, OCVPackage.VOPERATION__VC_CONTRACT, VOperation.class, msgs);
			msgs = basicSetUmlOperation(newUmlOperation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_CONTRACT__UML_OPERATION, newUmlOperation, newUmlOperation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VCLink> getVcLinks() {
		if (vcLinks == null) {
			vcLinks = new EObjectContainmentWithInverseEList<VCLink>(VCLink.class, this, OCVPackage.VC_CONTRACT__VC_LINKS, OCVPackage.VC_LINK__VC_CONTRACT);
		}
		return vcLinks;
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
			case OCVPackage.VC_CONTRACT__PRECONDITION:
				if (precondition != null)
					msgs = ((InternalEObject)precondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OCVPackage.VC_CONTRACT__PRECONDITION, null, msgs);
				return basicSetPrecondition((VContractPrecondition)otherEnd, msgs);
			case OCVPackage.VC_CONTRACT__POSTCONDITION:
				if (postcondition != null)
					msgs = ((InternalEObject)postcondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OCVPackage.VC_CONTRACT__POSTCONDITION, null, msgs);
				return basicSetPostcondition((VContractPostcondition)otherEnd, msgs);
			case OCVPackage.VC_CONTRACT__UML_OPERATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetUmlOperation((VOperation)otherEnd, msgs);
			case OCVPackage.VC_CONTRACT__VC_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVcLinks()).basicAdd(otherEnd, msgs);
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
			case OCVPackage.VC_CONTRACT__PRECONDITION:
				return basicSetPrecondition(null, msgs);
			case OCVPackage.VC_CONTRACT__POSTCONDITION:
				return basicSetPostcondition(null, msgs);
			case OCVPackage.VC_CONTRACT__UML_OPERATION:
				return basicSetUmlOperation(null, msgs);
			case OCVPackage.VC_CONTRACT__VC_LINKS:
				return ((InternalEList<?>)getVcLinks()).basicRemove(otherEnd, msgs);
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
			case OCVPackage.VC_CONTRACT__UML_OPERATION:
				return eInternalContainer().eInverseRemove(this, OCVPackage.VOPERATION__VC_CONTRACT, VOperation.class, msgs);
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
			case OCVPackage.VC_CONTRACT__NAME:
				return getName();
			case OCVPackage.VC_CONTRACT__PAGE_INDEX:
				return getPageIndex();
			case OCVPackage.VC_CONTRACT__PRECONDITION:
				return getPrecondition();
			case OCVPackage.VC_CONTRACT__POSTCONDITION:
				return getPostcondition();
			case OCVPackage.VC_CONTRACT__UML_OPERATION:
				return getUmlOperation();
			case OCVPackage.VC_CONTRACT__VC_LINKS:
				return getVcLinks();
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
			case OCVPackage.VC_CONTRACT__NAME:
				setName((String)newValue);
				return;
			case OCVPackage.VC_CONTRACT__PAGE_INDEX:
				setPageIndex((Integer)newValue);
				return;
			case OCVPackage.VC_CONTRACT__PRECONDITION:
				setPrecondition((VContractPrecondition)newValue);
				return;
			case OCVPackage.VC_CONTRACT__POSTCONDITION:
				setPostcondition((VContractPostcondition)newValue);
				return;
			case OCVPackage.VC_CONTRACT__UML_OPERATION:
				setUmlOperation((VOperation)newValue);
				return;
			case OCVPackage.VC_CONTRACT__VC_LINKS:
				getVcLinks().clear();
				getVcLinks().addAll((Collection<? extends VCLink>)newValue);
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
			case OCVPackage.VC_CONTRACT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OCVPackage.VC_CONTRACT__PAGE_INDEX:
				setPageIndex(PAGE_INDEX_EDEFAULT);
				return;
			case OCVPackage.VC_CONTRACT__PRECONDITION:
				setPrecondition((VContractPrecondition)null);
				return;
			case OCVPackage.VC_CONTRACT__POSTCONDITION:
				setPostcondition((VContractPostcondition)null);
				return;
			case OCVPackage.VC_CONTRACT__UML_OPERATION:
				setUmlOperation((VOperation)null);
				return;
			case OCVPackage.VC_CONTRACT__VC_LINKS:
				getVcLinks().clear();
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
			case OCVPackage.VC_CONTRACT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OCVPackage.VC_CONTRACT__PAGE_INDEX:
				return pageIndex != PAGE_INDEX_EDEFAULT;
			case OCVPackage.VC_CONTRACT__PRECONDITION:
				return precondition != null;
			case OCVPackage.VC_CONTRACT__POSTCONDITION:
				return postcondition != null;
			case OCVPackage.VC_CONTRACT__UML_OPERATION:
				return getUmlOperation() != null;
			case OCVPackage.VC_CONTRACT__VC_LINKS:
				return vcLinks != null && !vcLinks.isEmpty();
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
		result.append(", pageIndex: ");
		result.append(pageIndex);
		result.append(')');
		return result.toString();
	}

} //VCContractImpl
