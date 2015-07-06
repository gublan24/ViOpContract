/**
 */
package com.abdulaziz.ms.OCV;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VC Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.VCParameter#getVCInstance <em>VC Instance</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCParameter#getOperationParameter <em>Operation Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCParameter()
 * @model
 * @generated
 */
public interface VCParameter extends VCEntity {
	/**
	 * Returns the value of the '<em><b>VC Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VC Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VC Instance</em>' reference.
	 * @see #setVCInstance(VCInstance)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCParameter_VCInstance()
	 * @model
	 * @generated
	 */
	VCInstance getVCInstance();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCParameter#getVCInstance <em>VC Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VC Instance</em>' reference.
	 * @see #getVCInstance()
	 * @generated
	 */
	void setVCInstance(VCInstance value);

	/**
	 * Returns the value of the '<em><b>Operation Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Parameter</em>' reference.
	 * @see #setOperationParameter(UMLVariable)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCParameter_OperationParameter()
	 * @model
	 * @generated
	 */
	UMLVariable getOperationParameter();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCParameter#getOperationParameter <em>Operation Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Parameter</em>' reference.
	 * @see #getOperationParameter()
	 * @generated
	 */
	void setOperationParameter(UMLVariable value);

} // VCParameter
