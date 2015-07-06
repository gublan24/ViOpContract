/**
 */
package com.abdulaziz.ms.OCV;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VC Alternative Box</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.abdulaziz.ms.OCV.VCAlternativeBox#getConditinOptions <em>Conditin Options</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCAlternativeBox()
 * @model
 * @generated
 */
public interface VCAlternativeBox extends VCEntity {
	/**
	 * Returns the value of the '<em><b>Conditin Options</b></em>' containment reference list.
	 * The list contents are of type {@link com.abdulaziz.ms.OCV.ConditionOption}.
	 * It is bidirectional and its opposite is '{@link com.abdulaziz.ms.OCV.ConditionOption#getVcAlternativeBox <em>Vc Alternative Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conditin Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditin Options</em>' containment reference list.
	 * @see com.abdulaziz.ms.OCV.OCVPackage#getVCAlternativeBox_ConditinOptions()
	 * @see com.abdulaziz.ms.OCV.ConditionOption#getVcAlternativeBox
	 * @model opposite="vcAlternativeBox" containment="true"
	 * @generated
	 */
	EList<ConditionOption> getConditinOptions();

} // VCAlternativeBox
