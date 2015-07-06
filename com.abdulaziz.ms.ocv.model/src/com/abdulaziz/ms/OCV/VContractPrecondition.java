/**
 */
package com.abdulaziz.ms.OCV;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VContract Precondition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.VContractPrecondition#getVcContract <em>Vc Contract</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.abdulaziz.ms.OCV.OCVPackage#getVContractPrecondition()
 * @model
 * @generated
 */
public interface VContractPrecondition extends VContractCondition {
	/**
	 * Returns the value of the '<em><b>Vc Contract</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.VCContract#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vc Contract</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vc Contract</em>' container reference.
	 * @see #setVcContract(VCContract)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVContractPrecondition_VcContract()
	 * @see com.abdulaziz.ms.OCV.VCContract#getPrecondition
	 * @model opposite="precondition" transient="false"
	 * @generated
	 */
	VCContract getVcContract();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VContractPrecondition#getVcContract <em>Vc Contract</em>}' container reference.
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='try\r\n\t\t{\r\n\t\treturn this;\r\n\t\t}\r\n\t\tcatch (UnsupportedOperationException s)\r\n\t\t{\r\n\t\tthrow new UnsupportedOperationException();\r\n\t\t}'"
	 * @generated
	 */
	VContractPrecondition getVContractCondition();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='\t\tvcEntity.setPostcondition(this);\r\n'"
	 * @generated
	 */
	void setVCEntityContract(VCEntity vcEntity);

} // VContractPrecondition
