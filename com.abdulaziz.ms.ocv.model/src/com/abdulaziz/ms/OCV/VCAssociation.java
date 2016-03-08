/**
 */
package com.abdulaziz.ms.OCV;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VC Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.VCAssociation#getFirstInstance <em>First Instance</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCAssociation#getSecondInstance <em>Second Instance</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCAssociation#getFirstInstanceVariable <em>First Instance Variable</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCAssociation#getSecondInstanceVariable <em>Second Instance Variable</em>}</li>
 *   <li>{@link com.abdulaziz.ms.OCV.VCAssociation#isUnidirectional <em>Unidirectional</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCAssociation()
 * @model
 * @generated
 */
public interface VCAssociation extends VCEntity {
	/**
	 * Returns the value of the '<em><b>First Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Instance</em>' reference.
	 * @see #setFirstInstance(VCInstance)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCAssociation_FirstInstance()
	 * @model
	 * @generated
	 */
	VCInstance getFirstInstance();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCAssociation#getFirstInstance <em>First Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Instance</em>' reference.
	 * @see #getFirstInstance()
	 * @generated
	 */
	void setFirstInstance(VCInstance value);

	/**
	 * Returns the value of the '<em><b>Second Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Instance</em>' reference.
	 * @see #setSecondInstance(VCInstance)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCAssociation_SecondInstance()
	 * @model
	 * @generated
	 */
	VCInstance getSecondInstance();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCAssociation#getSecondInstance <em>Second Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Instance</em>' reference.
	 * @see #getSecondInstance()
	 * @generated
	 */
	void setSecondInstance(VCInstance value);

	/**
	 * Returns the value of the '<em><b>First Instance Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Instance Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Instance Variable</em>' reference.
	 * @see #setFirstInstanceVariable(UMLVariable)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCAssociation_FirstInstanceVariable()
	 * @model
	 * @generated
	 */
	UMLVariable getFirstInstanceVariable();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCAssociation#getFirstInstanceVariable <em>First Instance Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Instance Variable</em>' reference.
	 * @see #getFirstInstanceVariable()
	 * @generated
	 */
	void setFirstInstanceVariable(UMLVariable value);

	/**
	 * Returns the value of the '<em><b>Second Instance Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Instance Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Instance Variable</em>' reference.
	 * @see #setSecondInstanceVariable(UMLVariable)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCAssociation_SecondInstanceVariable()
	 * @model
	 * @generated
	 */
	UMLVariable getSecondInstanceVariable();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCAssociation#getSecondInstanceVariable <em>Second Instance Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Instance Variable</em>' reference.
	 * @see #getSecondInstanceVariable()
	 * @generated
	 */
	void setSecondInstanceVariable(UMLVariable value);

	/**
	 * Returns the value of the '<em><b>Unidirectional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unidirectional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unidirectional</em>' attribute.
	 * @see #setUnidirectional(boolean)
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCAssociation_Unidirectional()
	 * @model
	 * @generated
	 */
	boolean isUnidirectional();

	/**
	 * Sets the value of the '{@link com.abdulaziz.ms.OCV.VCAssociation#isUnidirectional <em>Unidirectional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unidirectional</em>' attribute.
	 * @see #isUnidirectional()
	 * @generated
	 */
	void setUnidirectional(boolean value);

} // VCAssociation
