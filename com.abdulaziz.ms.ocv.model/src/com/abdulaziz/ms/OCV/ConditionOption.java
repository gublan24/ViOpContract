/**
 */
package com.abdulaziz.ms.OCV;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.ConditionOption#getName <em>Name</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.ConditionOption#getVcContractAlternativeBox <em>Vc Contract Alternative Box</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.ConditionOption#getVcAlternativeBox <em>Vc Alternative Box</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.abdulaziz.ms.OCV.OCVPackage#getConditionOption()
 * @model
 * @generated
 */
public interface ConditionOption extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getConditionOption_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.ConditionOption#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Vc Contract Alternative Box</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.VContractAlternativeBox#getConditionOption <em>Condition Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vc Contract Alternative Box</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vc Contract Alternative Box</em>' containment reference.
	 * @see #setVcContractAlternativeBox(VContractAlternativeBox)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getConditionOption_VcContractAlternativeBox()
	 * @see com.abdulaziz.ms.OCV.VContractAlternativeBox#getConditionOption
	 * @model opposite="conditionOption" containment="true"
	 * @generated
	 */
	VContractAlternativeBox getVcContractAlternativeBox();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.ConditionOption#getVcContractAlternativeBox <em>Vc Contract Alternative Box</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vc Contract Alternative Box</em>' containment reference.
	 * @see #getVcContractAlternativeBox()
	 * @generated
	 */
	void setVcContractAlternativeBox(VContractAlternativeBox value);

	/**
	 * Returns the value of the '<em><b>Vc Alternative Box</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.VCAlternativeBox#getConditinOptions <em>Conditin Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vc Alternative Box</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vc Alternative Box</em>' container reference.
	 * @see #setVcAlternativeBox(VCAlternativeBox)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getConditionOption_VcAlternativeBox()
	 * @see com.abdulaziz.ms.OCV.VCAlternativeBox#getConditinOptions
	 * @model opposite="conditinOptions" transient="false"
	 * @generated
	 */
	VCAlternativeBox getVcAlternativeBox();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.ConditionOption#getVcAlternativeBox <em>Vc Alternative Box</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vc Alternative Box</em>' container reference.
	 * @see #getVcAlternativeBox()
	 * @generated
	 */
	void setVcAlternativeBox(VCAlternativeBox value);

} // ConditionOption
