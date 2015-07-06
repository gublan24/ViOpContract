/**
 */
package com.abdulaziz.ms.OCV;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VC Instance Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.VCInstanceField#getVCInstance <em>VC Instance</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCInstanceField#getUmlClassField <em>Uml Class Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCInstanceField()
 * @model
 * @generated
 */
public interface VCInstanceField extends VCEntity {
	/**
	 * Returns the value of the '<em><b>VC Instance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.VCInstance#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VC Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VC Instance</em>' reference.
	 * @see #setVCInstance(VCInstance)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCInstanceField_VCInstance()
	 * @see com.abdulaziz.ms.OCV.VCInstance#getFields
	 * @model opposite="fields"
	 * @generated
	 */
	VCInstance getVCInstance();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCInstanceField#getVCInstance <em>VC Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VC Instance</em>' reference.
	 * @see #getVCInstance()
	 * @generated
	 */
	void setVCInstance(VCInstance value);

	/**
	 * Returns the value of the '<em><b>Uml Class Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Class Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Class Field</em>' reference.
	 * @see #setUmlClassField(UMLVariable)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCInstanceField_UmlClassField()
	 * @model
	 * @generated
	 */
	UMLVariable getUmlClassField();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCInstanceField#getUmlClassField <em>Uml Class Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Class Field</em>' reference.
	 * @see #getUmlClassField()
	 * @generated
	 */
	void setUmlClassField(UMLVariable value);

} // VCInstanceField
