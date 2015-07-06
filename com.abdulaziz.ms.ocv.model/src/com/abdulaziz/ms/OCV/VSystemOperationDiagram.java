/**
 */
package com.abdulaziz.ms.OCV;

import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VSystem Operation Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.VSystemOperationDiagram#getClassOperations <em>Class Operations</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VSystemOperationDiagram#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VSystemOperationDiagram#getName <em>Name</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VSystemOperationDiagram#getUmlDiagram <em>Uml Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.abdulaziz.ms.OCV.OCVPackage#getVSystemOperationDiagram()
 * @model
 * @generated
 */
public interface VSystemOperationDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Class Operations</b></em>' containment reference list.
	 * The list contents are of type {@link com.abdulaziz.ms.OCV.VOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Operations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Operations</em>' containment reference list.
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVSystemOperationDiagram_ClassOperations()
	 * @model containment="true"
	 * @generated
	 */
	EList<VOperation> getClassOperations();

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' attribute.
	 * @see #setConstraints(Rectangle)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVSystemOperationDiagram_Constraints()
	 * @model dataType="com.abdulaziz.ms.OCV.Rectangle"
	 * @generated
	 */
	Rectangle getConstraints();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VSystemOperationDiagram#getConstraints <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' attribute.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(Rectangle value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"SYSTEM"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVSystemOperationDiagram_Name()
	 * @model default="SYSTEM"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VSystemOperationDiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Uml Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.UMLClassDiagram#getSystemOperation <em>System Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Diagram</em>' container reference.
	 * @see #setUmlDiagram(UMLClassDiagram)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVSystemOperationDiagram_UmlDiagram()
	 * @see com.abdulaziz.ms.OCV.UMLClassDiagram#getSystemOperation
	 * @model opposite="systemOperation" transient="false"
	 * @generated
	 */
	UMLClassDiagram getUmlDiagram();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VSystemOperationDiagram#getUmlDiagram <em>Uml Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Diagram</em>' container reference.
	 * @see #getUmlDiagram()
	 * @generated
	 */
	void setUmlDiagram(UMLClassDiagram value);

} // VSystemOperationDiagram
