/**
 */
package com.abdulaziz.ms.OCV;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VContract Alternative Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.VContractAlternativeBox#isVCReturnIncluded <em>VC Return Included</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VContractAlternativeBox#getVcContract <em>Vc Contract</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VContractAlternativeBox#getConditionOption <em>Condition Option</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.abdulaziz.ms.OCV.OCVPackage#getVContractAlternativeBox()
 * @model
 * @generated
 */
public interface VContractAlternativeBox extends VContractCondition {
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
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVContractAlternativeBox_VCReturnIncluded()
	 * @model
	 * @generated
	 */
	boolean isVCReturnIncluded();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VContractAlternativeBox#isVCReturnIncluded <em>VC Return Included</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VC Return Included</em>' attribute.
	 * @see #isVCReturnIncluded()
	 * @generated
	 */
	void setVCReturnIncluded(boolean value);

	/**
	 * Returns the value of the '<em><b>Vc Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vc Contract</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vc Contract</em>' reference.
	 * @see #setVcContract(VCContract)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVContractAlternativeBox_VcContract()
	 * @model
	 * @generated
	 */
	VCContract getVcContract();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VContractAlternativeBox#getVcContract <em>Vc Contract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vc Contract</em>' reference.
	 * @see #getVcContract()
	 * @generated
	 */
	void setVcContract(VCContract value);

	/**
	 * Returns the value of the '<em><b>Condition Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Option</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Option</em>' reference.
	 * @see #setConditionOption(ConditionOption)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVContractAlternativeBox_ConditionOption()
	 * @model
	 * @generated
	 */
	ConditionOption getConditionOption();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VContractAlternativeBox#getConditionOption <em>Condition Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Option</em>' reference.
	 * @see #getConditionOption()
	 * @generated
	 */
	void setConditionOption(ConditionOption value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	VContractAlternativeBox getVContractCondition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\t\r\n\t\tvcEntity.setPostcondition(this);\r\n'"
	 * @generated
	 */
	void setVCEntityContract(VCEntity vcEntity);

} // VContractAlternativeBox
