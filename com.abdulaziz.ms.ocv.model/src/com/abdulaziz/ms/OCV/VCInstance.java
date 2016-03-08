/**
 */
package com.abdulaziz.ms.OCV;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VC Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.VCInstance#getUmlClass <em>Uml Class</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCInstance#getFields <em>Fields</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCInstance#getInstanceName <em>Instance Name</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCInstance#getType <em>Type</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCInstance#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCInstance#getNotes <em>Notes</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCInstance#isDeleted <em>Deleted</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCInstance#isCollection <em>Collection</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCInstance()
 * @model
 * @generated
 */
public interface VCInstance extends VCEntity {
	/**
	 * Returns the value of the '<em><b>Uml Class</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.UMLClass#getVCInstances <em>VC Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Class</em>' reference.
	 * @see #setUmlClass(UMLClass)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCInstance_UmlClass()
	 * @see com.abdulaziz.ms.OCV.UMLClass#getVCInstances
	 * @model opposite="VCInstances"
	 * @generated
	 */
	UMLClass getUmlClass();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCInstance#getUmlClass <em>Uml Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Class</em>' reference.
	 * @see #getUmlClass()
	 * @generated
	 */
	void setUmlClass(UMLClass value);

	/**
	 * Returns the value of the '<em><b>Fields</b></em>' reference list.
	 * The list contents are of type {@link com.abdulaziz.ms.OCV.VCInstanceField}.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.VCInstanceField#getVCInstance <em>VC Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fields</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fields</em>' reference list.
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCInstance_Fields()
	 * @see com.abdulaziz.ms.OCV.VCInstanceField#getVCInstance
	 * @model opposite="vCInstance"
	 * @generated
	 */
	EList<VCInstanceField> getFields();

	/**
	 * Returns the value of the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Name</em>' attribute.
	 * @see #setInstanceName(String)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCInstance_InstanceName()
	 * @model
	 * @generated
	 */
	String getInstanceName();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCInstance#getInstanceName <em>Instance Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Name</em>' attribute.
	 * @see #getInstanceName()
	 * @generated
	 */
	void setInstanceName(String value);

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
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCInstance_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCInstance#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCInstance_Identifier()
	 * @model
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCInstance#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(String)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCInstance_Notes()
	 * @model
	 * @generated
	 */
	String getNotes();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCInstance#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(String value);

	/**
	 * Returns the value of the '<em><b>Collection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection</em>' attribute.
	 * @see #setCollection(boolean)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCInstance_Collection()
	 * @model
	 * @generated
	 */
	boolean isCollection();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCInstance#isCollection <em>Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection</em>' attribute.
	 * @see #isCollection()
	 * @generated
	 */
	void setCollection(boolean value);

	/**
	 * Returns the value of the '<em><b>Deleted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deleted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deleted</em>' attribute.
	 * @see #setDeleted(boolean)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCInstance_Deleted()
	 * @model
	 * @generated
	 */
	boolean isDeleted();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCInstance#isDeleted <em>Deleted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deleted</em>' attribute.
	 * @see #isDeleted()
	 * @generated
	 */
	void setDeleted(boolean value);

} // VCInstance
