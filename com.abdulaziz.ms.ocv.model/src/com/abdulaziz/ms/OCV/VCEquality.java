/**
 */
package com.abdulaziz.ms.OCV;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VC Equality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.VCEquality#getSouceVCEntity <em>Souce VC Entity</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCEquality#getTargetValue <em>Target Value</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCEquality#getMeaning <em>Meaning</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCEquality#getDisplyedText <em>Displyed Text</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCEquality#getNotes <em>Notes</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCEquality()
 * @model
 * @generated
 */
public interface VCEquality extends VCEntity {
	/**
	 * Returns the value of the '<em><b>Souce VC Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Souce VC Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Souce VC Entity</em>' reference.
	 * @see #setSouceVCEntity(VCEntity)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCEquality_SouceVCEntity()
	 * @model
	 * @generated
	 */
	VCEntity getSouceVCEntity();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCEquality#getSouceVCEntity <em>Souce VC Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Souce VC Entity</em>' reference.
	 * @see #getSouceVCEntity()
	 * @generated
	 */
	void setSouceVCEntity(VCEntity value);

	/**
	 * Returns the value of the '<em><b>Target Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Value</em>' reference.
	 * @see #setTargetValue(VCEquality)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCEquality_TargetValue()
	 * @model
	 * @generated
	 */
	VCEquality getTargetValue();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCEquality#getTargetValue <em>Target Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Value</em>' reference.
	 * @see #getTargetValue()
	 * @generated
	 */
	void setTargetValue(VCEquality value);

	/**
	 * Returns the value of the '<em><b>Meaning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meaning</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meaning</em>' attribute.
	 * @see #setMeaning(String)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCEquality_Meaning()
	 * @model
	 * @generated
	 */
	String getMeaning();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCEquality#getMeaning <em>Meaning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meaning</em>' attribute.
	 * @see #getMeaning()
	 * @generated
	 */
	void setMeaning(String value);

	/**
	 * Returns the value of the '<em><b>Displyed Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displyed Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displyed Text</em>' attribute.
	 * @see #setDisplyedText(String)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCEquality_DisplyedText()
	 * @model
	 * @generated
	 */
	String getDisplyedText();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCEquality#getDisplyedText <em>Displyed Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Displyed Text</em>' attribute.
	 * @see #getDisplyedText()
	 * @generated
	 */
	void setDisplyedText(String value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(String)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCEquality_Notes()
	 * @model
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCEquality#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

} // VCEquality
