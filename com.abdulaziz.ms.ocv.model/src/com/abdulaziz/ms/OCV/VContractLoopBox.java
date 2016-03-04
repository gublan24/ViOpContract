/**
 */
package com.abdulaziz.ms.OCV;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VContract Loop Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.VContractLoopBox#getVcCollectionBox <em>Vc Collection Box</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.abdulaziz.ms.OCV.OCVPackage#getVContractLoopBox()
 * @model
 * @generated
 */
public interface VContractLoopBox extends VContractCondition {
	/**
	 * Returns the value of the '<em><b>Vc Collection Box</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.VCLoop#getVcContractLoopBox <em>Vc Contract Loop Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vc Collection Box</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vc Collection Box</em>' container reference.
	 * @see #setVcCollectionBox(VCLoop)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVContractLoopBox_VcCollectionBox()
	 * @see com.abdulaziz.ms.OCV.VCLoop#getVcContractLoopBox
	 * @model opposite="vcContractLoopBox" transient="false"
	 * @generated
	 */
	VCLoop getVcCollectionBox();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VContractLoopBox#getVcCollectionBox <em>Vc Collection Box</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vc Collection Box</em>' container reference.
	 * @see #getVcCollectionBox()
	 * @generated
	 */
	void setVcCollectionBox(VCLoop value);

} // VContractLoopBox
