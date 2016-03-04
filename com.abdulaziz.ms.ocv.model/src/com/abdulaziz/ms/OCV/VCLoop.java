/**
 */
package com.abdulaziz.ms.OCV;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VC Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.VCLoop#getIteration <em>Iteration</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCLoop#getVcContractLoopBox <em>Vc Contract Loop Box</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCLoop()
 * @model
 * @generated
 */
public interface VCLoop extends VCEntity {
	/**
	 * Returns the value of the '<em><b>Iteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iteration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iteration</em>' attribute.
	 * @see #setIteration(String)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCLoop_Iteration()
	 * @model
	 * @generated
	 */
	String getIteration();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCLoop#getIteration <em>Iteration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iteration</em>' attribute.
	 * @see #getIteration()
	 * @generated
	 */
	void setIteration(String value);

	/**
	 * Returns the value of the '<em><b>Vc Contract Loop Box</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.VContractLoopBox#getVcCollectionBox <em>Vc Collection Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vc Contract Loop Box</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vc Contract Loop Box</em>' containment reference.
	 * @see #setVcContractLoopBox(VContractLoopBox)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCLoop_VcContractLoopBox()
	 * @see com.abdulaziz.ms.OCV.VContractLoopBox#getVcCollectionBox
	 * @model opposite="vcCollectionBox" containment="true"
	 * @generated
	 */
	VContractLoopBox getVcContractLoopBox();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCLoop#getVcContractLoopBox <em>Vc Contract Loop Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vc Contract Loop Box</em>' containment reference.
	 * @see #getVcContractLoopBox()
	 * @generated
	 */
	void setVcContractLoopBox(VContractLoopBox value);

} // VCLoop
