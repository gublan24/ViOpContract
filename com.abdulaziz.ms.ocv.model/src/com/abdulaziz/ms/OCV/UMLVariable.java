/**
 */
package com.abdulaziz.ms.OCV;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.UMLVariable#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.UMLVariable#getVariableType <em>Variable Type</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.UMLVariable#getUmlClass <em>Uml Class</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.UMLVariable#getVOperation <em>VOperation</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.abdulaziz.ms.OCV.OCVPackage#getUMLVariable()
 * @model
 * @generated
 */
public interface UMLVariable extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Name</em>' attribute.
	 * @see #setVariableName(String)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getUMLVariable_VariableName()
	 * @model
	 * @generated
	 */
	String getVariableName();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.UMLVariable#getVariableName <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' attribute.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(String value);

	/**
	 * Returns the value of the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Type</em>' attribute.
	 * @see #setVariableType(String)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getUMLVariable_VariableType()
	 * @model
	 * @generated
	 */
	String getVariableType();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.UMLVariable#getVariableType <em>Variable Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Type</em>' attribute.
	 * @see #getVariableType()
	 * @generated
	 */
	void setVariableType(String value);

	/**
	 * Returns the value of the '<em><b>Uml Class</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.UMLClass#getClassAttributes <em>Class Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Class</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Class</em>' container reference.
	 * @see #setUmlClass(UMLClass)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getUMLVariable_UmlClass()
	 * @see com.abdulaziz.ms.OCV.UMLClass#getClassAttributes
	 * @model opposite="classAttributes" transient="false"
	 * @generated
	 */
	UMLClass getUmlClass();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.UMLVariable#getUmlClass <em>Uml Class</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Class</em>' container reference.
	 * @see #getUmlClass()
	 * @generated
	 */
	void setUmlClass(UMLClass value);

	/**
	 * Returns the value of the '<em><b>VOperation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.VOperation#getOperationParameters <em>Operation Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VOperation</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VOperation</em>' container reference.
	 * @see #setVOperation(VOperation)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getUMLVariable_VOperation()
	 * @see com.abdulaziz.ms.OCV.VOperation#getOperationParameters
	 * @model opposite="operationParameters" transient="false"
	 * @generated
	 */
	VOperation getVOperation();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.UMLVariable#getVOperation <em>VOperation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VOperation</em>' container reference.
	 * @see #getVOperation()
	 * @generated
	 */
	void setVOperation(VOperation value);

} // UMLVariable
