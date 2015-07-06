/**
 */
package com.abdulaziz.ms.OCV;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VContract Postcondition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.VContractPostcondition#isVCReturnIncluded <em>VC Return Included</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VContractPostcondition#getVcContract <em>Vc Contract</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.abdulaziz.ms.OCV.OCVPackage#getVContractPostcondition()
 * @model
 * @generated
 */
public interface VContractPostcondition extends VContractCondition {
	/**
	 * Returns the value of the '<em><b>VC Return Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VC Return Included</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VC Return Included</em>' attribute.
	 * @see #setVCReturnIncluded(boolean)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVContractPostcondition_VCReturnIncluded()
	 * @model
	 * @generated
	 */
	boolean isVCReturnIncluded();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VContractPostcondition#isVCReturnIncluded <em>VC Return Included</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VC Return Included</em>' attribute.
	 * @see #isVCReturnIncluded()
	 * @generated
	 */
	void setVCReturnIncluded(boolean value);

	/**
	 * Returns the value of the '<em><b>Vc Contract</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.VCContract#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vc Contract</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vc Contract</em>' container reference.
	 * @see #setVcContract(VCContract)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVContractPostcondition_VcContract()
	 * @see com.abdulaziz.ms.OCV.VCContract#getPostcondition
	 * @model opposite="postcondition" transient="false"
	 * @generated
	 */
	VCContract getVcContract();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VContractPostcondition#getVcContract <em>Vc Contract</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vc Contract</em>' container reference.
	 * @see #getVcContract()
	 * @generated
	 */
	void setVcContract(VCContract value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	VContractPostcondition getVContractCondition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\r\n\t\tvcEntity.setPostcondition(this);\r\n'"
	 * @generated
	 */
	void setVCEntityContract(VCEntity vcEntity);

} // VContractPostcondition
