/**
 */
package com.abdulaziz.ms.OCV;

import org.eclipse.draw2d.geometry.Rectangle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VC Container Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.VCContainerLayer#getType <em>Type</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCContainerLayer#getConstaint <em>Constaint</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCContainerLayer#getVcEntities <em>Vc Entities</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCContainerLayer#getRootVContract <em>Root VContract</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCContainerLayer()
 * @model abstract="true"
 * @generated
 */
public interface VCContainerLayer extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCContainerLayer_Type()
	 * @model default=""
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCContainerLayer#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Constaint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constaint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constaint</em>' attribute.
	 * @see #setConstaint(Rectangle)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCContainerLayer_Constaint()
	 * @model dataType="com.abdulaziz.ms.OCV.Rectangle"
	 * @generated
	 */
	Rectangle getConstaint();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCContainerLayer#getConstaint <em>Constaint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constaint</em>' attribute.
	 * @see #getConstaint()
	 * @generated
	 */
	void setConstaint(Rectangle value);

	/**
	 * Returns the value of the '<em><b>Vc Entities</b></em>' containment reference list.
	 * The list contents are of type {@link com.abdulaziz.ms.OCV.VCEntity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vc Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vc Entities</em>' containment reference list.
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCContainerLayer_VcEntities()
	 * @model containment="true"
	 * @generated
	 */
	EList<VCEntity> getVcEntities();

	/**
	 * Returns the value of the '<em><b>Root VContract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root VContract</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root VContract</em>' reference.
	 * @see #setRootVContract(VCContract)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCContainerLayer_RootVContract()
	 * @model
	 * @generated
	 */
	VCContract getRootVContract();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCContainerLayer#getRootVContract <em>Root VContract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root VContract</em>' reference.
	 * @see #getRootVContract()
	 * @generated
	 */
	void setRootVContract(VCContract value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setVCEntityContract(VCEntity vcEntity);

	VCContainerLayer getPreConditon();

	VCContainerLayer getPostConditon();

} // VCContainerLayer
