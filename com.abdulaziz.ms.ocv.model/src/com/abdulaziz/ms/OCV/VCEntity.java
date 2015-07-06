/**
 */
package com.abdulaziz.ms.OCV;

import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VC Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.VCEntity#getName <em>Name</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCEntity#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCEntity#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCEntity#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCEntity#getVcContract <em>Vc Contract</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCEntity#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCEntity#getPostcondition <em>Postcondition</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCEntity()
 * @model abstract="true"
 * @generated
 */
public interface VCEntity extends EObject {
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
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCEntity_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCEntity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Incoming Links</b></em>' reference list.
	 * The list contents are of type {@link com.abdulaziz.ms.OCV.VCLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Links</em>' reference list.
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCEntity_IncomingLinks()
	 * @model
	 * @generated
	 */
	EList<VCLink> getIncomingLinks();

	/**
	 * Returns the value of the '<em><b>Outgoing Links</b></em>' reference list.
	 * The list contents are of type {@link com.abdulaziz.ms.OCV.VCLink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Links</em>' reference list.
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCEntity_OutgoingLinks()
	 * @model
	 * @generated
	 */
	EList<VCLink> getOutgoingLinks();

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
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCEntity_Constraints()
	 * @model dataType="com.abdulaziz.ms.OCV.Rectangle"
	 * @generated
	 */
	Rectangle getConstraints();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCEntity#getConstraints <em>Constraints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' attribute.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(Rectangle value);

	/**
	 * Returns the value of the '<em><b>Vc Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vc Contract</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vc Contract</em>' reference.
	 * @see #setVcContract(VCContract)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCEntity_VcContract()
	 * @model
	 * @generated
	 */
	VCContract getVcContract();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCEntity#getVcContract <em>Vc Contract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vc Contract</em>' reference.
	 * @see #getVcContract()
	 * @generated
	 */
	void setVcContract(VCContract value);

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' reference.
	 * @see #setPrecondition(VContractCondition)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCEntity_Precondition()
	 * @model
	 * @generated
	 */
	VContractCondition getPrecondition();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCEntity#getPrecondition <em>Precondition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' reference.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(VContractCondition value);

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postcondition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcondition</em>' reference.
	 * @see #setPostcondition(VContractCondition)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCEntity_Postcondition()
	 * @model
	 * @generated
	 */
	VContractCondition getPostcondition();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCEntity#getPostcondition <em>Postcondition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postcondition</em>' reference.
	 * @see #getPostcondition()
	 * @generated
	 */
	void setPostcondition(VContractCondition value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='vContractCondition.setVCEntityContract(this);'"
	 * @generated
	 */
	void setVContractCondition(VContractCondition vContractCondition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	VContractCondition getContractCondition();

} // VCEntity
