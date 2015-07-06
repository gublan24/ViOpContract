/**
 */
package com.abdulaziz.ms.OCV;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VOperation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.VOperation#getOperationName <em>Operation Name</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VOperation#getOperationReturnType <em>Operation Return Type</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VOperation#getOperationParameters <em>Operation Parameters</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VOperation#getVSystem <em>VSystem</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VOperation#getVcContract <em>Vc Contract</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.abdulaziz.ms.OCV.OCVPackage#getVOperation()
 * @model
 * @generated
 */
public interface VOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Name</em>' attribute.
	 * @see #setOperationName(String)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVOperation_OperationName()
	 * @model
	 * @generated
	 */
	String getOperationName();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VOperation#getOperationName <em>Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Name</em>' attribute.
	 * @see #getOperationName()
	 * @generated
	 */
	void setOperationName(String value);

	/**
	 * Returns the value of the '<em><b>Operation Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Return Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Return Type</em>' attribute.
	 * @see #setOperationReturnType(String)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVOperation_OperationReturnType()
	 * @model
	 * @generated
	 */
	String getOperationReturnType();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VOperation#getOperationReturnType <em>Operation Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Return Type</em>' attribute.
	 * @see #getOperationReturnType()
	 * @generated
	 */
	void setOperationReturnType(String value);

	/**
	 * Returns the value of the '<em><b>Operation Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link com.abdulaziz.ms.OCV.UMLVariable}.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.UMLVariable#getVOperation <em>VOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Parameters</em>' containment reference list.
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVOperation_OperationParameters()
	 * @see com.abdulaziz.ms.OCV.UMLVariable#getVOperation
	 * @model opposite="vOperation" containment="true"
	 * @generated
	 */
	EList<UMLVariable> getOperationParameters();

	/**
	 * Returns the value of the '<em><b>VSystem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VSystem</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VSystem</em>' reference.
	 * @see #setVSystem(VSystemOperationDiagram)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVOperation_VSystem()
	 * @model
	 * @generated
	 */
	VSystemOperationDiagram getVSystem();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VOperation#getVSystem <em>VSystem</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VSystem</em>' reference.
	 * @see #getVSystem()
	 * @generated
	 */
	void setVSystem(VSystemOperationDiagram value);

	/**
	 * Returns the value of the '<em><b>Vc Contract</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.VCContract#getUmlOperation <em>Uml Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vc Contract</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vc Contract</em>' containment reference.
	 * @see #setVcContract(VCContract)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVOperation_VcContract()
	 * @see com.abdulaziz.ms.OCV.VCContract#getUmlOperation
	 * @model opposite="umlOperation" containment="true"
	 * @generated
	 */
	VCContract getVcContract();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VOperation#getVcContract <em>Vc Contract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vc Contract</em>' containment reference.
	 * @see #getVcContract()
	 * @generated
	 */
	void setVcContract(VCContract value);

} // VOperation
