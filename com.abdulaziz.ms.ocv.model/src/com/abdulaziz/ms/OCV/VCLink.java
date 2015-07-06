/**
 */
package com.abdulaziz.ms.OCV;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VC Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.VCLink#getSource <em>Source</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCLink#getTarget <em>Target</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCLink#getBendpoints <em>Bendpoints</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCLink#getVcContract <em>Vc Contract</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCLink()
 * @model
 * @generated
 */
public interface VCLink extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(VCEntity)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCLink_Source()
	 * @model
	 * @generated
	 */
	VCEntity getSource();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(VCEntity value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(VCEntity)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCLink_Target()
	 * @model
	 * @generated
	 */
	VCEntity getTarget();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(VCEntity value);

	/**
	 * Returns the value of the '<em><b>Bendpoints</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.draw2d.AbsoluteBendpoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bendpoints</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bendpoints</em>' attribute list.
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCLink_Bendpoints()
	 * @model dataType="com.abdulaziz.ms.OCV.AbsoluteBendpoint"
	 * @generated
	 */
	EList<AbsoluteBendpoint> getBendpoints();

	/**
	 * Returns the value of the '<em><b>Vc Contract</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.VCContract#getVcLinks <em>Vc Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vc Contract</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vc Contract</em>' container reference.
	 * @see #setVcContract(VCContract)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCLink_VcContract()
	 * @see com.abdulaziz.ms.OCV.VCContract#getVcLinks
	 * @model opposite="vcLinks" transient="false"
	 * @generated
	 */
	VCContract getVcContract();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCLink#getVcContract <em>Vc Contract</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vc Contract</em>' container reference.
	 * @see #getVcContract()
	 * @generated
	 */
	void setVcContract(VCContract value);

} // VCLink
