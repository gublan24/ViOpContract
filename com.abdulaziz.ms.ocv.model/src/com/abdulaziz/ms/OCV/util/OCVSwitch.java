/**
 */
package com.abdulaziz.ms.OCV.util;

import com.abdulaziz.ms.OCV.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.abdulaziz.ms.OCV.OCVPackage
 * @generated
 */
public class OCVSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OCVPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCVSwitch() {
		if (modelPackage == null) {
			modelPackage = OCVPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OCVPackage.UML_CLASS_DIAGRAM: {
				UMLClassDiagram umlClassDiagram = (UMLClassDiagram)theEObject;
				T result = caseUMLClassDiagram(umlClassDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCVPackage.UML_CLASS: {
				UMLClass umlClass = (UMLClass)theEObject;
				T result = caseUMLClass(umlClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCVPackage.UML_VARIABLE: {
				UMLVariable umlVariable = (UMLVariable)theEObject;
				T result = caseUMLVariable(umlVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCVPackage.UML_LINK: {
				UMLLink umlLink = (UMLLink)theEObject;
				T result = caseUMLLink(umlLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCVPackage.VSYSTEM_OPERATION_DIAGRAM: {
				VSystemOperationDiagram vSystemOperationDiagram = (VSystemOperationDiagram)theEObject;
				T result = caseVSystemOperationDiagram(vSystemOperationDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCVPackage.VOPERATION: {
				VOperation vOperation = (VOperation)theEObject;
				T result = caseVOperation(vOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCVPackage.VC_CONTRACT: {
				VCContract vcContract = (VCContract)theEObject;
				T result = caseVCContract(vcContract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCVPackage.VCONTRACT_CONDITION: {
				VContractCondition vContractCondition = (VContractCondition)theEObject;
				T result = caseVContractCondition(vContractCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCVPackage.VCONTRACT_PRECONDITION: {
				VContractPrecondition vContractPrecondition = (VContractPrecondition)theEObject;
				T result = caseVContractPrecondition(vContractPrecondition);
				if (result == null) result = caseVContractCondition(vContractPrecondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCVPackage.VCONTRACT_POSTCONDITION: {
				VContractPostcondition vContractPostcondition = (VContractPostcondition)theEObject;
				T result = caseVContractPostcondition(vContractPostcondition);
				if (result == null) result = caseVContractCondition(vContractPostcondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCVPackage.VC_LINK: {
				VCLink vcLink = (VCLink)theEObject;
				T result = caseVCLink(vcLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCVPackage.VC_LINK_PRE_POST_CONDITION: {
				VCLinkPrePostCondition vcLinkPrePostCondition = (VCLinkPrePostCondition)theEObject;
				T result = caseVCLinkPrePostCondition(vcLinkPrePostCondition);
				if (result == null) result = caseVCLink(vcLinkPrePostCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCVPackage.VC_ENTITY: {
				VCEntity vcEntity = (VCEntity)theEObject;
				T result = caseVCEntity(vcEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCVPackage.VC_VALUE: {
				VCValue vcValue = (VCValue)theEObject;
				T result = caseVCValue(vcValue);
				if (result == null) result = caseVCEntity(vcValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCVPackage.VC_EQUALITY: {
				VCEquality vcEquality = (VCEquality)theEObject;
				T result = caseVCEquality(vcEquality);
				if (result == null) result = caseVCEntity(vcEquality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCVPackage.VC_INSTANCE: {
				VCInstance vcInstance = (VCInstance)theEObject;
				T result = caseVCInstance(vcInstance);
				if (result == null) result = caseVCEntity(vcInstance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCVPackage.VC_INSTANCE_FIELD: {
				VCInstanceField vcInstanceField = (VCInstanceField)theEObject;
				T result = caseVCInstanceField(vcInstanceField);
				if (result == null) result = caseVCEntity(vcInstanceField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCVPackage.VC_ASSOCIATION: {
				VCAssociation vcAssociation = (VCAssociation)theEObject;
				T result = caseVCAssociation(vcAssociation);
				if (result == null) result = caseVCEntity(vcAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCVPackage.VC_PARAMETER: {
				VCParameter vcParameter = (VCParameter)theEObject;
				T result = caseVCParameter(vcParameter);
				if (result == null) result = caseVCEntity(vcParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCVPackage.VC_OPERATION_BOX: {
				VCOperationBox vcOperationBox = (VCOperationBox)theEObject;
				T result = caseVCOperationBox(vcOperationBox);
				if (result == null) result = caseVCEntity(vcOperationBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCVPackage.VC_RETURN: {
				VCReturn vcReturn = (VCReturn)theEObject;
				T result = caseVCReturn(vcReturn);
				if (result == null) result = caseVCEntity(vcReturn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCVPackage.VC_COLLECTION_BOX: {
				VCCollectionBox vcCollectionBox = (VCCollectionBox)theEObject;
				T result = caseVCCollectionBox(vcCollectionBox);
				if (result == null) result = caseVCEntity(vcCollectionBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCVPackage.VC_LOOP: {
				VCLoop vcLoop = (VCLoop)theEObject;
				T result = caseVCLoop(vcLoop);
				if (result == null) result = caseVCEntity(vcLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCVPackage.VC_ALTERNATIVE_BOX: {
				VCAlternativeBox vcAlternativeBox = (VCAlternativeBox)theEObject;
				T result = caseVCAlternativeBox(vcAlternativeBox);
				if (result == null) result = caseVCEntity(vcAlternativeBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCVPackage.CONDITION_OPTION: {
				ConditionOption conditionOption = (ConditionOption)theEObject;
				T result = caseConditionOption(conditionOption);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OCVPackage.VCONTRACT_ALTERNATIVE_BOX: {
				VContractAlternativeBox vContractAlternativeBox = (VContractAlternativeBox)theEObject;
				T result = caseVContractAlternativeBox(vContractAlternativeBox);
				if (result == null) result = caseVContractCondition(vContractAlternativeBox);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Class Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Class Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLClassDiagram(UMLClassDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLClass(UMLClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLVariable(UMLVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UML Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UML Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLLink(UMLLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VSystem Operation Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VSystem Operation Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVSystemOperationDiagram(VSystemOperationDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VOperation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VOperation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVOperation(VOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VC Contract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VC Contract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVCContract(VCContract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VContract Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VContract Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVContractCondition(VContractCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VContract Precondition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VContract Precondition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVContractPrecondition(VContractPrecondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VContract Postcondition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VContract Postcondition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVContractPostcondition(VContractPostcondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VC Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VC Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVCLink(VCLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VC Link Pre Post Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VC Link Pre Post Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVCLinkPrePostCondition(VCLinkPrePostCondition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VC Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VC Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVCEntity(VCEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VC Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VC Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVCValue(VCValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VC Equality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VC Equality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVCEquality(VCEquality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VC Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VC Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVCInstance(VCInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VC Instance Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VC Instance Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVCInstanceField(VCInstanceField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VC Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VC Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVCAssociation(VCAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VC Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VC Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVCParameter(VCParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VC Operation Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VC Operation Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVCOperationBox(VCOperationBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VC Return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VC Return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVCReturn(VCReturn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VC Alternative Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VC Alternative Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVCAlternativeBox(VCAlternativeBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VC Collection Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VC Collection Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVCCollectionBox(VCCollectionBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VC Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VC Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVCLoop(VCLoop object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionOption(ConditionOption object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VContract Alternative Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VContract Alternative Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVContractAlternativeBox(VContractAlternativeBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OCVSwitch
