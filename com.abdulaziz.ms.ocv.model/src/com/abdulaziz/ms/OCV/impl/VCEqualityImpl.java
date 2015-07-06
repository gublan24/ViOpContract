/**
 */
package com.abdulaziz.ms.OCV.impl;

import com.abdulaziz.ms.OCV.OCVPackage;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCEquality;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VC Equality</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCEqualityImpl#getSouceVCEntity <em>Souce VC Entity</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCEqualityImpl#getTargetValue <em>Target Value</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCEqualityImpl#getMeaning <em>Meaning</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCEqualityImpl#getDisplyedText <em>Displyed Text</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.impl.VCEqualityImpl#getNotes <em>Notes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VCEqualityImpl extends VCEntityImpl implements VCEquality {
	/**
	 * The cached value of the '{@link #getSouceVCEntity() <em>Souce VC Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSouceVCEntity()
	 * @generated
	 * @ordered
	 */
	protected VCEntity souceVCEntity;

	/**
	 * The cached value of the '{@link #getTargetValue() <em>Target Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetValue()
	 * @generated
	 * @ordered
	 */
	protected VCEquality targetValue;

	/**
	 * The default value of the '{@link #getMeaning() <em>Meaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeaning()
	 * @generated
	 * @ordered
	 */
	protected static final String MEANING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeaning() <em>Meaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeaning()
	 * @generated
	 * @ordered
	 */
	protected String meaning = MEANING_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplyedText() <em>Displyed Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplyedText()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLYED_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplyedText() <em>Displyed Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplyedText()
	 * @generated
	 * @ordered
	 */
	protected String displyedText = DISPLYED_TEXT_EDEFAULT;

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
	protected VCEqualityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OCVPackage.Literals.VC_EQUALITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCEntity getSouceVCEntity() {
		if (souceVCEntity != null && souceVCEntity.eIsProxy()) {
			InternalEObject oldSouceVCEntity = (InternalEObject)souceVCEntity;
			souceVCEntity = (VCEntity)eResolveProxy(oldSouceVCEntity);
			if (souceVCEntity != oldSouceVCEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCVPackage.VC_EQUALITY__SOUCE_VC_ENTITY, oldSouceVCEntity, souceVCEntity));
			}
		}
		return souceVCEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCEntity basicGetSouceVCEntity() {
		return souceVCEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSouceVCEntity(VCEntity newSouceVCEntity) {
		VCEntity oldSouceVCEntity = souceVCEntity;
		souceVCEntity = newSouceVCEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_EQUALITY__SOUCE_VC_ENTITY, oldSouceVCEntity, souceVCEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCEquality getTargetValue() {
		if (targetValue != null && targetValue.eIsProxy()) {
			InternalEObject oldTargetValue = (InternalEObject)targetValue;
			targetValue = (VCEquality)eResolveProxy(oldTargetValue);
			if (targetValue != oldTargetValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OCVPackage.VC_EQUALITY__TARGET_VALUE, oldTargetValue, targetValue));
			}
		}
		return targetValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCEquality basicGetTargetValue() {
		return targetValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetValue(VCEquality newTargetValue) {
		VCEquality oldTargetValue = targetValue;
		targetValue = newTargetValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_EQUALITY__TARGET_VALUE, oldTargetValue, targetValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMeaning() {
		return meaning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeaning(String newMeaning) {
		String oldMeaning = meaning;
		meaning = newMeaning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_EQUALITY__MEANING, oldMeaning, meaning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplyedText() {
		return displyedText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplyedText(String newDisplyedText) {
		String oldDisplyedText = displyedText;
		displyedText = newDisplyedText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_EQUALITY__DISPLYED_TEXT, oldDisplyedText, displyedText));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OCVPackage.VC_EQUALITY__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OCVPackage.VC_EQUALITY__SOUCE_VC_ENTITY:
				if (resolve) return getSouceVCEntity();
				return basicGetSouceVCEntity();
			case OCVPackage.VC_EQUALITY__TARGET_VALUE:
				if (resolve) return getTargetValue();
				return basicGetTargetValue();
			case OCVPackage.VC_EQUALITY__MEANING:
				return getMeaning();
			case OCVPackage.VC_EQUALITY__DISPLYED_TEXT:
				return getDisplyedText();
			case OCVPackage.VC_EQUALITY__NOTES:
				return getNotes();
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
			case OCVPackage.VC_EQUALITY__SOUCE_VC_ENTITY:
				setSouceVCEntity((VCEntity)newValue);
				return;
			case OCVPackage.VC_EQUALITY__TARGET_VALUE:
				setTargetValue((VCEquality)newValue);
				return;
			case OCVPackage.VC_EQUALITY__MEANING:
				setMeaning((String)newValue);
				return;
			case OCVPackage.VC_EQUALITY__DISPLYED_TEXT:
				setDisplyedText((String)newValue);
				return;
			case OCVPackage.VC_EQUALITY__NOTES:
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
			case OCVPackage.VC_EQUALITY__SOUCE_VC_ENTITY:
				setSouceVCEntity((VCEntity)null);
				return;
			case OCVPackage.VC_EQUALITY__TARGET_VALUE:
				setTargetValue((VCEquality)null);
				return;
			case OCVPackage.VC_EQUALITY__MEANING:
				setMeaning(MEANING_EDEFAULT);
				return;
			case OCVPackage.VC_EQUALITY__DISPLYED_TEXT:
				setDisplyedText(DISPLYED_TEXT_EDEFAULT);
				return;
			case OCVPackage.VC_EQUALITY__NOTES:
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
			case OCVPackage.VC_EQUALITY__SOUCE_VC_ENTITY:
				return souceVCEntity != null;
			case OCVPackage.VC_EQUALITY__TARGET_VALUE:
				return targetValue != null;
			case OCVPackage.VC_EQUALITY__MEANING:
				return MEANING_EDEFAULT == null ? meaning != null : !MEANING_EDEFAULT.equals(meaning);
			case OCVPackage.VC_EQUALITY__DISPLYED_TEXT:
				return DISPLYED_TEXT_EDEFAULT == null ? displyedText != null : !DISPLYED_TEXT_EDEFAULT.equals(displyedText);
			case OCVPackage.VC_EQUALITY__NOTES:
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
		result.append(" (meaning: ");
		result.append(meaning);
		result.append(", displyedText: ");
		result.append(displyedText);
		result.append(", notes: ");
		result.append(notes);
		result.append(')');
		return result.toString();
	}

} //VCEqualityImpl
