/**
 */
package com.abdulaziz.ms.OCV;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.abdulaziz.ms.OCV.OCVPackage
 * @generated
 */
public interface OCVFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OCVFactory eINSTANCE = com.abdulaziz.ms.OCV.impl.OCVFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>UML Class Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UML Class Diagram</em>'.
	 * @generated
	 */
	UMLClassDiagram createUMLClassDiagram();

	/**
	 * Returns a new object of class '<em>UML Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UML Class</em>'.
	 * @generated
	 */
	UMLClass createUMLClass();

	/**
	 * Returns a new object of class '<em>UML Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UML Variable</em>'.
	 * @generated
	 */
	UMLVariable createUMLVariable();

	/**
	 * Returns a new object of class '<em>UML Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UML Link</em>'.
	 * @generated
	 */
	UMLLink createUMLLink();

	/**
	 * Returns a new object of class '<em>VSystem Operation Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VSystem Operation Diagram</em>'.
	 * @generated
	 */
	VSystemOperationDiagram createVSystemOperationDiagram();

	/**
	 * Returns a new object of class '<em>VOperation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VOperation</em>'.
	 * @generated
	 */
	VOperation createVOperation();

	/**
	 * Returns a new object of class '<em>VC Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VC Contract</em>'.
	 * @generated
	 */
	VCContract createVCContract();

	/**
	 * Returns a new object of class '<em>VContract Precondition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VContract Precondition</em>'.
	 * @generated
	 */
	VContractPrecondition createVContractPrecondition();

	/**
	 * Returns a new object of class '<em>VContract Postcondition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VContract Postcondition</em>'.
	 * @generated
	 */
	VContractPostcondition createVContractPostcondition();

	/**
	 * Returns a new object of class '<em>VC Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VC Link</em>'.
	 * @generated
	 */
	VCLink createVCLink();

	/**
	 * Returns a new object of class '<em>VC Link Pre Post Condition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VC Link Pre Post Condition</em>'.
	 * @generated
	 */
	VCLinkPrePostCondition createVCLinkPrePostCondition();

	/**
	 * Returns a new object of class '<em>VC Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VC Value</em>'.
	 * @generated
	 */
	VCValue createVCValue();

	/**
	 * Returns a new object of class '<em>VC Equality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VC Equality</em>'.
	 * @generated
	 */
	VCEquality createVCEquality();

	/**
	 * Returns a new object of class '<em>VC Instance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VC Instance</em>'.
	 * @generated
	 */
	VCInstance createVCInstance();

	/**
	 * Returns a new object of class '<em>VC Instance Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VC Instance Field</em>'.
	 * @generated
	 */
	VCInstanceField createVCInstanceField();

	/**
	 * Returns a new object of class '<em>VC Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VC Association</em>'.
	 * @generated
	 */
	VCAssociation createVCAssociation();

	/**
	 * Returns a new object of class '<em>VC Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VC Parameter</em>'.
	 * @generated
	 */
	VCParameter createVCParameter();

	/**
	 * Returns a new object of class '<em>VC Operation Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VC Operation Box</em>'.
	 * @generated
	 */
	VCOperationBox createVCOperationBox();

	/**
	 * Returns a new object of class '<em>VC Return</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VC Return</em>'.
	 * @generated
	 */
	VCReturn createVCReturn();

	/**
	 * Returns a new object of class '<em>VC Alternative Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VC Alternative Box</em>'.
	 * @generated
	 */
	VCAlternativeBox createVCAlternativeBox();

	/**
	 * Returns a new object of class '<em>VC Collection Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VC Collection Box</em>'.
	 * @generated
	 */
	VCCollectionBox createVCCollectionBox();

	/**
	 * Returns a new object of class '<em>VC Loop</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VC Loop</em>'.
	 * @generated
	 */
	VCLoop createVCLoop();

	/**
	 * Returns a new object of class '<em>Condition Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Option</em>'.
	 * @generated
	 */
	ConditionOption createConditionOption();

	/**
	 * Returns a new object of class '<em>VContract Alternative Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VContract Alternative Box</em>'.
	 * @generated
	 */
	VContractAlternativeBox createVContractAlternativeBox();

	/**
	 * Returns a new object of class '<em>VContract Collection Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VContract Collection Box</em>'.
	 * @generated
	 */
	VContractCollectionBox createVContractCollectionBox();

	/**
	 * Returns a new object of class '<em>VContract Loop Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VContract Loop Box</em>'.
	 * @generated
	 */
	VContractLoopBox createVContractLoopBox();

	/**
	 * Returns a new object of class '<em>VC Association Deletion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>VC Association Deletion</em>'.
	 * @generated
	 */
	VCAssociationDeletion createVCAssociationDeletion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OCVPackage getOCVPackage();

} //OCVFactory
