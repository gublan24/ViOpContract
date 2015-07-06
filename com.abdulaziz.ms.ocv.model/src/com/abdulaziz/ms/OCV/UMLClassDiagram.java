/**
 */
package com.abdulaziz.ms.OCV;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Class Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.UMLClassDiagram#getClasses <em>Classes</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.UMLClassDiagram#getLinks <em>Links</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.UMLClassDiagram#getName <em>Name</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.UMLClassDiagram#getSystemOperation <em>System Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.abdulaziz.ms.OCV.OCVPackage#getUMLClassDiagram()
 * @model
 * @generated
 */
public interface UMLClassDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link com.abdulaziz.ms.OCV.UMLClass}.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.UMLClass#getUmlDiagram <em>Uml Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getUMLClassDiagram_Classes()
	 * @see com.abdulaziz.ms.OCV.UMLClass#getUmlDiagram
	 * @model opposite="umlDiagram" containment="true"
	 * @generated
	 */
	EList<UMLClass> getClasses();

	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link com.abdulaziz.ms.OCV.UMLLink}.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.UMLLink#getUmlDiagram <em>Uml Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getUMLClassDiagram_Links()
	 * @see com.abdulaziz.ms.OCV.UMLLink#getUmlDiagram
	 * @model opposite="umlDiagram" containment="true"
	 * @generated
	 */
	EList<UMLLink> getLinks();

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
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getUMLClassDiagram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.UMLClassDiagram#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>System Operation</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.VSystemOperationDiagram#getUmlDiagram <em>Uml Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Operation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Operation</em>' containment reference.
	 * @see #setSystemOperation(VSystemOperationDiagram)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getUMLClassDiagram_SystemOperation()
	 * @see com.abdulaziz.ms.OCV.VSystemOperationDiagram#getUmlDiagram
	 * @model opposite="umlDiagram" containment="true"
	 * @generated
	 */
	VSystemOperationDiagram getSystemOperation();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.UMLClassDiagram#getSystemOperation <em>System Operation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Operation</em>' containment reference.
	 * @see #getSystemOperation()
	 * @generated
	 */
	void setSystemOperation(VSystemOperationDiagram value);

} // UMLClassDiagram
