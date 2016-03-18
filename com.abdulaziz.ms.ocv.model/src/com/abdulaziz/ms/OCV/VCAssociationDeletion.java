/**
 */
package com.abdulaziz.ms.OCV;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VC Association Deletion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.VCAssociationDeletion#isDirectional <em>Directional</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCAssociationDeletion()
 * @model
 * @generated
 */
public interface VCAssociationDeletion extends VCEntity {

	/**
	 * Returns the value of the '<em><b>Directional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Directional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Directional</em>' attribute.
	 * @see #setDirectional(boolean)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCAssociationDeletion_Directional()
	 * @model
	 * @generated
	 */
	boolean isDirectional();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCAssociationDeletion#isDirectional <em>Directional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Directional</em>' attribute.
	 * @see #isDirectional()
	 * @generated
	 */
	void setDirectional(boolean value);
} // VCAssociationDeletion
