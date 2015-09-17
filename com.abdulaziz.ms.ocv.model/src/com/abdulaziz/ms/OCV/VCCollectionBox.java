/**
 */
package com.abdulaziz.ms.OCV;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VC Collection Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.VCCollectionBox#getType <em>Type</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCCollectionBox#getVContractCollectionBox <em>VContract Collection Box</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCCollectionBox()
 * @model
 * @generated
 */
public interface VCCollectionBox extends VCEntity {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCCollectionBox_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCCollectionBox#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>VContract Collection Box</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.VContractCollectionBox#getVcCollectionBox <em>Vc Collection Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VContract Collection Box</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VContract Collection Box</em>' reference.
	 * @see #setVContractCollectionBox(VContractCollectionBox)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCCollectionBox_VContractCollectionBox()
	 * @see com.abdulaziz.ms.OCV.VContractCollectionBox#getVcCollectionBox
	 * @model opposite="vcCollectionBox"
	 * @generated
	 */
	VContractCollectionBox getVContractCollectionBox();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCCollectionBox#getVContractCollectionBox <em>VContract Collection Box</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VContract Collection Box</em>' reference.
	 * @see #getVContractCollectionBox()
	 * @generated
	 */
	void setVContractCollectionBox(VContractCollectionBox value);

} // VCCollectionBox
