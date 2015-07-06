/**
 */
package com.abdulaziz.ms.OCV;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VC Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.VCContract#getName <em>Name</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCContract#getPageIndex <em>Page Index</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCContract#getPrecondition <em>Precondition</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCContract#getPostcondition <em>Postcondition</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCContract#getUmlOperation <em>Uml Operation</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCContract#getVcLinks <em>Vc Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCContract()
 * @model
 * @generated
 */
public interface VCContract extends EObject {
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
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCContract_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCContract#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Page Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Index</em>' attribute.
	 * @see #setPageIndex(int)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCContract_PageIndex()
	 * @model
	 * @generated
	 */
	int getPageIndex();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCContract#getPageIndex <em>Page Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Index</em>' attribute.
	 * @see #getPageIndex()
	 * @generated
	 */
	void setPageIndex(int value);

	/**
	 * Returns the value of the '<em><b>Precondition</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.VContractPrecondition#getVcContract <em>Vc Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precondition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precondition</em>' containment reference.
	 * @see #setPrecondition(VContractPrecondition)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCContract_Precondition()
	 * @see com.abdulaziz.ms.OCV.VContractPrecondition#getVcContract
	 * @model opposite="vcContract" containment="true"
	 * @generated
	 */
	VContractPrecondition getPrecondition();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCContract#getPrecondition <em>Precondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precondition</em>' containment reference.
	 * @see #getPrecondition()
	 * @generated
	 */
	void setPrecondition(VContractPrecondition value);

	/**
	 * Returns the value of the '<em><b>Postcondition</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.VContractPostcondition#getVcContract <em>Vc Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Postcondition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Postcondition</em>' containment reference.
	 * @see #setPostcondition(VContractPostcondition)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCContract_Postcondition()
	 * @see com.abdulaziz.ms.OCV.VContractPostcondition#getVcContract
	 * @model opposite="vcContract" containment="true"
	 * @generated
	 */
	VContractPostcondition getPostcondition();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCContract#getPostcondition <em>Postcondition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Postcondition</em>' containment reference.
	 * @see #getPostcondition()
	 * @generated
	 */
	void setPostcondition(VContractPostcondition value);

	/**
	 * Returns the value of the '<em><b>Uml Operation</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.VOperation#getVcContract <em>Vc Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Operation</em>' container reference.
	 * @see #setUmlOperation(VOperation)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCContract_UmlOperation()
	 * @see com.abdulaziz.ms.OCV.VOperation#getVcContract
	 * @model opposite="vcContract" transient="false"
	 * @generated
	 */
	VOperation getUmlOperation();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCContract#getUmlOperation <em>Uml Operation</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Operation</em>' container reference.
	 * @see #getUmlOperation()
	 * @generated
	 */
	void setUmlOperation(VOperation value);

	/**
	 * Returns the value of the '<em><b>Vc Links</b></em>' containment reference list.
	 * The list contents are of type {@link com.abdulaziz.ms.OCV.VCLink}.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.VCLink#getVcContract <em>Vc Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vc Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vc Links</em>' containment reference list.
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCContract_VcLinks()
	 * @see com.abdulaziz.ms.OCV.VCLink#getVcContract
	 * @model opposite="vcContract" containment="true"
	 * @generated
	 */
	EList<VCLink> getVcLinks();

} // VCContract
