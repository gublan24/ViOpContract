/**
 */
package com.abdulaziz.ms.OCV.impl;

import com.abdulaziz.ms.OCV.ConditionOption;
import com.abdulaziz.ms.OCV.OCVPackage;
import com.abdulaziz.ms.OCV.VCAlternativeBox;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VContractAlternativeBox;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.ConditionOptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.ConditionOptionImpl#getVcContractAlternativeBox <em>Vc Contract Alternative Box</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.ConditionOptionImpl#getVcAlternativeBox <em>Vc Alternative Box</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.ConditionOptionImpl#getVcEntityReference <em>Vc Entity Reference</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.ConditionOptionImpl#getDisplayedConditionStatement <em>Displayed Condition Statement</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.ConditionOptionImpl#getConditionValue <em>Condition Value</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.ConditionOptionImpl#getMeaningOfConditionStatement <em>Meaning Of Condition Statement</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.ConditionOptionImpl#getConditionBlock <em>Condition Block</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.ConditionOptionImpl#getResultBlock <em>Result Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionOptionImpl extends MinimalEObjectImpl.Container implements ConditionOption {
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
	 * The cached value of the '{@link #getVcContractAlternativeBox() <em>Vc Contract Alternative Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcContractAlternativeBox()
	 * @generated
	 * @ordered
	 */
	protected VContractAlternativeBox vcContractAlternativeBox;

	/**
	 * The cached value of the '{@link #getVcEntityReference() <em>Vc Entity Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcEntityReference()
	 * @generated
	 * @ordered
	 */
	protected VCEntity vcEntityReference;

	/**
	 * The default value of the '{@link #getDisplayedConditionStatement() <em>Displayed Condition Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayedConditionStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAYED_CONDITION_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayedConditionStatement() <em>Displayed Condition Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayedConditionStatement()
	 * @generated
	 * @ordered
	 */
	protected String displayedConditionStatement = DISPLAYED_CONDITION_STATEMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getConditionValue() <em>Condition Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionValue()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionValue() <em>Condition Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionValue()
	 * @generated
	 * @ordered
	 */
	protected String conditionValue = CONDITION_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeaningOfConditionStatement() <em>Meaning Of Condition Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeaningOfConditionStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String MEANING_OF_CONDITION_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeaningOfConditionStatement() <em>Meaning Of Condition Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeaningOfConditionStatement()
	 * @generated
	 * @ordered
	 */
	protected String meaningOfConditionStatement = MEANING_OF_CONDITION_STATEMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConditionBlock() <em>Condition Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionBlock()
	 * @generated
	 * @ordered
	 */
	protected VContractAlternativeBox conditionBlock;

	/**
	 * The cached value of the '{@link #getResultBlock() <em>Result Block</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultBlock()
	 * @generated
	 * @ordered
	 */
	protected VContractAlternativeBox resultBlock;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionOptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCVPackage.Literals.CONDITION_OPTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.CONDITION_OPTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VContractAlternativeBox getVcContractAlternativeBox() {
		return vcContractAlternativeBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVcContractAlternativeBox(VContractAlternativeBox newVcContractAlternativeBox, NotificationChain msgs) {
		VContractAlternativeBox oldVcContractAlternativeBox = vcContractAlternativeBox;
		vcContractAlternativeBox = newVcContractAlternativeBox;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OCVPackage.CONDITION_OPTION__VC_CONTRACT_ALTERNATIVE_BOX, oldVcContractAlternativeBox, newVcContractAlternativeBox);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVcContractAlternativeBox(VContractAlternativeBox newVcContractAlternativeBox) {
		if (newVcContractAlternativeBox != vcContractAlternativeBox) {
			NotificationChain msgs = null;
			if (vcContractAlternativeBox != null)
				msgs = ((InternalEObject)vcContractAlternativeBox).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OCVPackage.CONDITION_OPTION__VC_CONTRACT_ALTERNATIVE_BOX, null, msgs);
			if (newVcContractAlternativeBox != null)
				msgs = ((InternalEObject)newVcContractAlternativeBox).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OCVPackage.CONDITION_OPTION__VC_CONTRACT_ALTERNATIVE_BOX, null, msgs);
			msgs = basicSetVcContractAlternativeBox(newVcContractAlternativeBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.CONDITION_OPTION__VC_CONTRACT_ALTERNATIVE_BOX, newVcContractAlternativeBox, newVcContractAlternativeBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCAlternativeBox getVcAlternativeBox() {
		if (eContainerFeatureID() != OCVPackage.CONDITION_OPTION__VC_ALTERNATIVE_BOX) return null;
		return (VCAlternativeBox)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVcAlternativeBox(VCAlternativeBox newVcAlternativeBox, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newVcAlternativeBox, OCVPackage.CONDITION_OPTION__VC_ALTERNATIVE_BOX, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVcAlternativeBox(VCAlternativeBox newVcAlternativeBox) {
		if (newVcAlternativeBox != eInternalContainer() || (eContainerFeatureID() != OCVPackage.CONDITION_OPTION__VC_ALTERNATIVE_BOX && newVcAlternativeBox != null)) {
			if (EcoreUtil.isAncestor(this, newVcAlternativeBox))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newVcAlternativeBox != null)
				msgs = ((InternalEObject)newVcAlternativeBox).eInverseAdd(this, OCVPackage.VC_ALTERNATIVE_BOX__CONDITIN_OPTIONS, VCAlternativeBox.class, msgs);
			msgs = basicSetVcAlternativeBox(newVcAlternativeBox, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.CONDITION_OPTION__VC_ALTERNATIVE_BOX, newVcAlternativeBox, newVcAlternativeBox));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCEntity getVcEntityReference() {
		if (vcEntityReference != null && vcEntityReference.eIsProxy()) {
			InternalEObject oldVcEntityReference = (InternalEObject)vcEntityReference;
			vcEntityReference = (VCEntity)eResolveProxy(oldVcEntityReference);
			if (vcEntityReference != oldVcEntityReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCVPackage.CONDITION_OPTION__VC_ENTITY_REFERENCE, oldVcEntityReference, vcEntityReference));
			}
		}
		return vcEntityReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCEntity basicGetVcEntityReference() {
		return vcEntityReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVcEntityReference(VCEntity newVcEntityReference) {
		VCEntity oldVcEntityReference = vcEntityReference;
		vcEntityReference = newVcEntityReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.CONDITION_OPTION__VC_ENTITY_REFERENCE, oldVcEntityReference, vcEntityReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayedConditionStatement() {
		return displayedConditionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayedConditionStatement(String newDisplayedConditionStatement) {
		String oldDisplayedConditionStatement = displayedConditionStatement;
		displayedConditionStatement = newDisplayedConditionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.CONDITION_OPTION__DISPLAYED_CONDITION_STATEMENT, oldDisplayedConditionStatement, displayedConditionStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionValue() {
		return conditionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionValue(String newConditionValue) {
		String oldConditionValue = conditionValue;
		conditionValue = newConditionValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.CONDITION_OPTION__CONDITION_VALUE, oldConditionValue, conditionValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeaningOfConditionStatement() {
		return meaningOfConditionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeaningOfConditionStatement(String newMeaningOfConditionStatement) {
		String oldMeaningOfConditionStatement = meaningOfConditionStatement;
		meaningOfConditionStatement = newMeaningOfConditionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.CONDITION_OPTION__MEANING_OF_CONDITION_STATEMENT, oldMeaningOfConditionStatement, meaningOfConditionStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VContractAlternativeBox getConditionBlock() {
		return conditionBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionBlock(VContractAlternativeBox newConditionBlock, NotificationChain msgs) {
		VContractAlternativeBox oldConditionBlock = conditionBlock;
		conditionBlock = newConditionBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OCVPackage.CONDITION_OPTION__CONDITION_BLOCK, oldConditionBlock, newConditionBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionBlock(VContractAlternativeBox newConditionBlock) {
		if (newConditionBlock != conditionBlock) {
			NotificationChain msgs = null;
			if (conditionBlock != null)
				msgs = ((InternalEObject)conditionBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OCVPackage.CONDITION_OPTION__CONDITION_BLOCK, null, msgs);
			if (newConditionBlock != null)
				msgs = ((InternalEObject)newConditionBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OCVPackage.CONDITION_OPTION__CONDITION_BLOCK, null, msgs);
			msgs = basicSetConditionBlock(newConditionBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.CONDITION_OPTION__CONDITION_BLOCK, newConditionBlock, newConditionBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VContractAlternativeBox getResultBlock() {
		return resultBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultBlock(VContractAlternativeBox newResultBlock, NotificationChain msgs) {
		VContractAlternativeBox oldResultBlock = resultBlock;
		resultBlock = newResultBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OCVPackage.CONDITION_OPTION__RESULT_BLOCK, oldResultBlock, newResultBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultBlock(VContractAlternativeBox newResultBlock) {
		if (newResultBlock != resultBlock) {
			NotificationChain msgs = null;
			if (resultBlock != null)
				msgs = ((InternalEObject)resultBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OCVPackage.CONDITION_OPTION__RESULT_BLOCK, null, msgs);
			if (newResultBlock != null)
				msgs = ((InternalEObject)newResultBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OCVPackage.CONDITION_OPTION__RESULT_BLOCK, null, msgs);
			msgs = basicSetResultBlock(newResultBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.CONDITION_OPTION__RESULT_BLOCK, newResultBlock, newResultBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OCVPackage.CONDITION_OPTION__VC_ALTERNATIVE_BOX:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetVcAlternativeBox((VCAlternativeBox)otherEnd, msgs);
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
			case OCVPackage.CONDITION_OPTION__VC_CONTRACT_ALTERNATIVE_BOX:
				return basicSetVcContractAlternativeBox(null, msgs);
			case OCVPackage.CONDITION_OPTION__VC_ALTERNATIVE_BOX:
				return basicSetVcAlternativeBox(null, msgs);
			case OCVPackage.CONDITION_OPTION__CONDITION_BLOCK:
				return basicSetConditionBlock(null, msgs);
			case OCVPackage.CONDITION_OPTION__RESULT_BLOCK:
				return basicSetResultBlock(null, msgs);
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
			case OCVPackage.CONDITION_OPTION__VC_ALTERNATIVE_BOX:
				return eInternalContainer().eInverseRemove(this, OCVPackage.VC_ALTERNATIVE_BOX__CONDITIN_OPTIONS, VCAlternativeBox.class, msgs);
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
			case OCVPackage.CONDITION_OPTION__NAME:
				return getName();
			case OCVPackage.CONDITION_OPTION__VC_CONTRACT_ALTERNATIVE_BOX:
				return getVcContractAlternativeBox();
			case OCVPackage.CONDITION_OPTION__VC_ALTERNATIVE_BOX:
				return getVcAlternativeBox();
			case OCVPackage.CONDITION_OPTION__VC_ENTITY_REFERENCE:
				if (resolve) return getVcEntityReference();
				return basicGetVcEntityReference();
			case OCVPackage.CONDITION_OPTION__DISPLAYED_CONDITION_STATEMENT:
				return getDisplayedConditionStatement();
			case OCVPackage.CONDITION_OPTION__CONDITION_VALUE:
				return getConditionValue();
			case OCVPackage.CONDITION_OPTION__MEANING_OF_CONDITION_STATEMENT:
				return getMeaningOfConditionStatement();
			case OCVPackage.CONDITION_OPTION__CONDITION_BLOCK:
				return getConditionBlock();
			case OCVPackage.CONDITION_OPTION__RESULT_BLOCK:
				return getResultBlock();
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
			case OCVPackage.CONDITION_OPTION__NAME:
				setName((String)newValue);
				return;
			case OCVPackage.CONDITION_OPTION__VC_CONTRACT_ALTERNATIVE_BOX:
				setVcContractAlternativeBox((VContractAlternativeBox)newValue);
				return;
			case OCVPackage.CONDITION_OPTION__VC_ALTERNATIVE_BOX:
				setVcAlternativeBox((VCAlternativeBox)newValue);
				return;
			case OCVPackage.CONDITION_OPTION__VC_ENTITY_REFERENCE:
				setVcEntityReference((VCEntity)newValue);
				return;
			case OCVPackage.CONDITION_OPTION__DISPLAYED_CONDITION_STATEMENT:
				setDisplayedConditionStatement((String)newValue);
				return;
			case OCVPackage.CONDITION_OPTION__CONDITION_VALUE:
				setConditionValue((String)newValue);
				return;
			case OCVPackage.CONDITION_OPTION__MEANING_OF_CONDITION_STATEMENT:
				setMeaningOfConditionStatement((String)newValue);
				return;
			case OCVPackage.CONDITION_OPTION__CONDITION_BLOCK:
				setConditionBlock((VContractAlternativeBox)newValue);
				return;
			case OCVPackage.CONDITION_OPTION__RESULT_BLOCK:
				setResultBlock((VContractAlternativeBox)newValue);
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
			case OCVPackage.CONDITION_OPTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OCVPackage.CONDITION_OPTION__VC_CONTRACT_ALTERNATIVE_BOX:
				setVcContractAlternativeBox((VContractAlternativeBox)null);
				return;
			case OCVPackage.CONDITION_OPTION__VC_ALTERNATIVE_BOX:
				setVcAlternativeBox((VCAlternativeBox)null);
				return;
			case OCVPackage.CONDITION_OPTION__VC_ENTITY_REFERENCE:
				setVcEntityReference((VCEntity)null);
				return;
			case OCVPackage.CONDITION_OPTION__DISPLAYED_CONDITION_STATEMENT:
				setDisplayedConditionStatement(DISPLAYED_CONDITION_STATEMENT_EDEFAULT);
				return;
			case OCVPackage.CONDITION_OPTION__CONDITION_VALUE:
				setConditionValue(CONDITION_VALUE_EDEFAULT);
				return;
			case OCVPackage.CONDITION_OPTION__MEANING_OF_CONDITION_STATEMENT:
				setMeaningOfConditionStatement(MEANING_OF_CONDITION_STATEMENT_EDEFAULT);
				return;
			case OCVPackage.CONDITION_OPTION__CONDITION_BLOCK:
				setConditionBlock((VContractAlternativeBox)null);
				return;
			case OCVPackage.CONDITION_OPTION__RESULT_BLOCK:
				setResultBlock((VContractAlternativeBox)null);
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
			case OCVPackage.CONDITION_OPTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OCVPackage.CONDITION_OPTION__VC_CONTRACT_ALTERNATIVE_BOX:
				return vcContractAlternativeBox != null;
			case OCVPackage.CONDITION_OPTION__VC_ALTERNATIVE_BOX:
				return getVcAlternativeBox() != null;
			case OCVPackage.CONDITION_OPTION__VC_ENTITY_REFERENCE:
				return vcEntityReference != null;
			case OCVPackage.CONDITION_OPTION__DISPLAYED_CONDITION_STATEMENT:
				return DISPLAYED_CONDITION_STATEMENT_EDEFAULT == null ? displayedConditionStatement != null : !DISPLAYED_CONDITION_STATEMENT_EDEFAULT.equals(displayedConditionStatement);
			case OCVPackage.CONDITION_OPTION__CONDITION_VALUE:
				return CONDITION_VALUE_EDEFAULT == null ? conditionValue != null : !CONDITION_VALUE_EDEFAULT.equals(conditionValue);
			case OCVPackage.CONDITION_OPTION__MEANING_OF_CONDITION_STATEMENT:
				return MEANING_OF_CONDITION_STATEMENT_EDEFAULT == null ? meaningOfConditionStatement != null : !MEANING_OF_CONDITION_STATEMENT_EDEFAULT.equals(meaningOfConditionStatement);
			case OCVPackage.CONDITION_OPTION__CONDITION_BLOCK:
				return conditionBlock != null;
			case OCVPackage.CONDITION_OPTION__RESULT_BLOCK:
				return resultBlock != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated not 
	 */
	@Override
	public String toString() {
		return name;
		/*
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", displayedConditionStatement: ");
		result.append(displayedConditionStatement);
		result.append(", conditionValue: ");
		result.append(conditionValue);
		result.append(", MeaningOfConditionStatement: ");
		result.append(meaningOfConditionStatement);
		result.append(')');
		return result.toString();
		*/
	}

} //ConditionOptionImpl
