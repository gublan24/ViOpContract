/**
 */
package com.abdulaziz.ms.OCV;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>UML Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.UMLLink#getType <em>Type</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.UMLLink#getName <em>Name</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.UMLLink#getSourceMutiplicity <em>Source Mutiplicity</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.UMLLink#getTargetMutiplicity <em>Target Mutiplicity</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.UMLLink#getSource <em>Source</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.UMLLink#getTarget <em>Target</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.UMLLink#getUmlDiagram <em>Uml Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.abdulaziz.ms.OCV.OCVPackage#getUMLLink()
 * @model
 * @generated
 */
public interface UMLLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getUMLLink_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.UMLLink#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

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
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getUMLLink_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.UMLLink#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Source Mutiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Mutiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Mutiplicity</em>' attribute.
	 * @see #setSourceMutiplicity(String)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getUMLLink_SourceMutiplicity()
	 * @model
	 * @generated
	 */
	String getSourceMutiplicity();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.UMLLink#getSourceMutiplicity <em>Source Mutiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Mutiplicity</em>' attribute.
	 * @see #getSourceMutiplicity()
	 * @generated
	 */
	void setSourceMutiplicity(String value);

	/**
	 * Returns the value of the '<em><b>Target Mutiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Mutiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Mutiplicity</em>' attribute.
	 * @see #setTargetMutiplicity(String)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getUMLLink_TargetMutiplicity()
	 * @model
	 * @generated
	 */
	String getTargetMutiplicity();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.UMLLink#getTargetMutiplicity <em>Target Mutiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Mutiplicity</em>' attribute.
	 * @see #getTargetMutiplicity()
	 * @generated
	 */
	void setTargetMutiplicity(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.UMLClass#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(UMLClass)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getUMLLink_Source()
	 * @see com.abdulaziz.ms.OCV.UMLClass#getOutgoingLinks
	 * @model opposite="outgoingLinks"
	 * @generated
	 */
	UMLClass getSource();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.UMLLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(UMLClass value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.UMLClass#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(UMLClass)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getUMLLink_Target()
	 * @see com.abdulaziz.ms.OCV.UMLClass#getIncomingLinks
	 * @model opposite="incomingLinks"
	 * @generated
	 */
	UMLClass getTarget();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.UMLLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(UMLClass value);

	/**
	 * Returns the value of the '<em><b>Uml Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.UMLClassDiagram#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Diagram</em>' container reference.
	 * @see #setUmlDiagram(UMLClassDiagram)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getUMLLink_UmlDiagram()
	 * @see com.abdulaziz.ms.OCV.UMLClassDiagram#getLinks
	 * @model opposite="links" transient="false"
	 * @generated
	 */
	UMLClassDiagram getUmlDiagram();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.UMLLink#getUmlDiagram <em>Uml Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Diagram</em>' container reference.
	 * @see #getUmlDiagram()
	 * @generated
	 */
	void setUmlDiagram(UMLClassDiagram value);

} // UMLLink
