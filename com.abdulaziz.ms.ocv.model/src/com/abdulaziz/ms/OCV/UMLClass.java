/**
 */
package com.abdulaziz.ms.OCV;

import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.UMLClass#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.UMLClass#getClassAttributes <em>Class Attributes</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.UMLClass#getUmlDiagram <em>Uml Diagram</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.UMLClass#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.UMLClass#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.UMLClass#getClassName <em>Class Name</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.UMLClass#getVCInstances <em>VC Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.abdulaziz.ms.OCV.OCVPackage#getUMLClass()
 * @model
 * @generated
 */
public interface UMLClass extends EObject {
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
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getUMLClass_Constraints()
	 * @model dataType="com.abdulaziz.ms.OCV.Rectangle"
	 * @generated
	 */
	Rectangle getConstraints();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.UMLClass#getConstraints <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' attribute.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(Rectangle value);

	/**
	 * Returns the value of the '<em><b>Class Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link com.abdulaziz.ms.OCV.UMLVariable}.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.UMLVariable#getUmlClass <em>Uml Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Attributes</em>' containment reference list.
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getUMLClass_ClassAttributes()
	 * @see com.abdulaziz.ms.OCV.UMLVariable#getUmlClass
	 * @model opposite="umlClass" containment="true"
	 * @generated
	 */
	EList<UMLVariable> getClassAttributes();

	/**
	 * Returns the value of the '<em><b>Uml Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.UMLClassDiagram#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Diagram</em>' container reference.
	 * @see #setUmlDiagram(UMLClassDiagram)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getUMLClass_UmlDiagram()
	 * @see com.abdulaziz.ms.OCV.UMLClassDiagram#getClasses
	 * @model opposite="classes" transient="false"
	 * @generated
	 */
	UMLClassDiagram getUmlDiagram();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.UMLClass#getUmlDiagram <em>Uml Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Diagram</em>' container reference.
	 * @see #getUmlDiagram()
	 * @generated
	 */
	void setUmlDiagram(UMLClassDiagram value);

	/**
	 * Returns the value of the '<em><b>Incoming Links</b></em>' reference list.
	 * The list contents are of type {@link com.abdulaziz.ms.OCV.UMLLink}.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.UMLLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Links</em>' reference list.
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getUMLClass_IncomingLinks()
	 * @see com.abdulaziz.ms.OCV.UMLLink#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<UMLLink> getIncomingLinks();

	/**
	 * Returns the value of the '<em><b>Outgoing Links</b></em>' reference list.
	 * The list contents are of type {@link com.abdulaziz.ms.OCV.UMLLink}.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.UMLLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Links</em>' reference list.
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getUMLClass_OutgoingLinks()
	 * @see com.abdulaziz.ms.OCV.UMLLink#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<UMLLink> getOutgoingLinks();

	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getUMLClass_ClassName()
	 * @model
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.UMLClass#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>VC Instances</b></em>' reference list.
	 * The list contents are of type {@link com.abdulaziz.ms.OCV.VCInstance}.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.VCInstance#getUmlClass <em>Uml Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VC Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VC Instances</em>' reference list.
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getUMLClass_VCInstances()
	 * @see com.abdulaziz.ms.OCV.VCInstance#getUmlClass
	 * @model opposite="umlClass"
	 * @generated
	 */
	EList<VCInstance> getVCInstances();

} // UMLClass
