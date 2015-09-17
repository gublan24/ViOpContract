/**
 */
package com.abdulaziz.ms.OCV.util;

import com.abdulaziz.ms.OCV.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.abdulaziz.ms.OCV.OCVPackage
 * @generated
 */
public class OCVAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OCVPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCVAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OCVPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCVSwitch<Adapter> modelSwitch =
		new OCVSwitch<Adapter>() {
			@Override
			public Adapter caseUMLClassDiagram(UMLClassDiagram object) {
				return createUMLClassDiagramAdapter();
			}
			@Override
			public Adapter caseUMLClass(UMLClass object) {
				return createUMLClassAdapter();
			}
			@Override
			public Adapter caseUMLVariable(UMLVariable object) {
				return createUMLVariableAdapter();
			}
			@Override
			public Adapter caseUMLLink(UMLLink object) {
				return createUMLLinkAdapter();
			}
			@Override
			public Adapter caseVSystemOperationDiagram(VSystemOperationDiagram object) {
				return createVSystemOperationDiagramAdapter();
			}
			@Override
			public Adapter caseVOperation(VOperation object) {
				return createVOperationAdapter();
			}
			@Override
			public Adapter caseVCContract(VCContract object) {
				return createVCContractAdapter();
			}
			@Override
			public Adapter caseVContractCondition(VContractCondition object) {
				return createVContractConditionAdapter();
			}
			@Override
			public Adapter caseVContractPrecondition(VContractPrecondition object) {
				return createVContractPreconditionAdapter();
			}
			@Override
			public Adapter caseVContractPostcondition(VContractPostcondition object) {
				return createVContractPostconditionAdapter();
			}
			@Override
			public Adapter caseVCLink(VCLink object) {
				return createVCLinkAdapter();
			}
			@Override
			public Adapter caseVCLinkPrePostCondition(VCLinkPrePostCondition object) {
				return createVCLinkPrePostConditionAdapter();
			}
			@Override
			public Adapter caseVCEntity(VCEntity object) {
				return createVCEntityAdapter();
			}
			@Override
			public Adapter caseVCValue(VCValue object) {
				return createVCValueAdapter();
			}
			@Override
			public Adapter caseVCEquality(VCEquality object) {
				return createVCEqualityAdapter();
			}
			@Override
			public Adapter caseVCInstance(VCInstance object) {
				return createVCInstanceAdapter();
			}
			@Override
			public Adapter caseVCInstanceField(VCInstanceField object) {
				return createVCInstanceFieldAdapter();
			}
			@Override
			public Adapter caseVCAssociation(VCAssociation object) {
				return createVCAssociationAdapter();
			}
			@Override
			public Adapter caseVCParameter(VCParameter object) {
				return createVCParameterAdapter();
			}
			@Override
			public Adapter caseVCOperationBox(VCOperationBox object) {
				return createVCOperationBoxAdapter();
			}
			@Override
			public Adapter caseVCReturn(VCReturn object) {
				return createVCReturnAdapter();
			}
			@Override
			public Adapter caseVCCollectionBox(VCCollectionBox object) {
				return createVCCollectionBoxAdapter();
			}
			@Override
			public Adapter caseVCLoop(VCLoop object) {
				return createVCLoopAdapter();
			}
			@Override
			public Adapter caseVCAlternativeBox(VCAlternativeBox object) {
				return createVCAlternativeBoxAdapter();
			}
			@Override
			public Adapter caseConditionOption(ConditionOption object) {
				return createConditionOptionAdapter();
			}
			@Override
			public Adapter caseVContractAlternativeBox(VContractAlternativeBox object) {
				return createVContractAlternativeBoxAdapter();
			}
			@Override
			public Adapter caseVContractCollectionBox(VContractCollectionBox object) {
				return createVContractCollectionBoxAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.UMLClassDiagram <em>UML Class Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.UMLClassDiagram
	 * @generated
	 */
	public Adapter createUMLClassDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.UMLClass <em>UML Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.UMLClass
	 * @generated
	 */
	public Adapter createUMLClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.UMLVariable <em>UML Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.UMLVariable
	 * @generated
	 */
	public Adapter createUMLVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.UMLLink <em>UML Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.UMLLink
	 * @generated
	 */
	public Adapter createUMLLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.VSystemOperationDiagram <em>VSystem Operation Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.VSystemOperationDiagram
	 * @generated
	 */
	public Adapter createVSystemOperationDiagramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.VOperation <em>VOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.VOperation
	 * @generated
	 */
	public Adapter createVOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.VCContract <em>VC Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.VCContract
	 * @generated
	 */
	public Adapter createVCContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.VContractCondition <em>VContract Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.VContractCondition
	 * @generated
	 */
	public Adapter createVContractConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.VContractPrecondition <em>VContract Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.VContractPrecondition
	 * @generated
	 */
	public Adapter createVContractPreconditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.VContractPostcondition <em>VContract Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.VContractPostcondition
	 * @generated
	 */
	public Adapter createVContractPostconditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.VCLink <em>VC Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.VCLink
	 * @generated
	 */
	public Adapter createVCLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.VCLinkPrePostCondition <em>VC Link Pre Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.VCLinkPrePostCondition
	 * @generated
	 */
	public Adapter createVCLinkPrePostConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.VCEntity <em>VC Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.VCEntity
	 * @generated
	 */
	public Adapter createVCEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.VCValue <em>VC Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.VCValue
	 * @generated
	 */
	public Adapter createVCValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.VCEquality <em>VC Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.VCEquality
	 * @generated
	 */
	public Adapter createVCEqualityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.VCInstance <em>VC Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.VCInstance
	 * @generated
	 */
	public Adapter createVCInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.VCInstanceField <em>VC Instance Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.VCInstanceField
	 * @generated
	 */
	public Adapter createVCInstanceFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.VCAssociation <em>VC Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.VCAssociation
	 * @generated
	 */
	public Adapter createVCAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.VCParameter <em>VC Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.VCParameter
	 * @generated
	 */
	public Adapter createVCParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.VCOperationBox <em>VC Operation Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.VCOperationBox
	 * @generated
	 */
	public Adapter createVCOperationBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.VCReturn <em>VC Return</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.VCReturn
	 * @generated
	 */
	public Adapter createVCReturnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.VCAlternativeBox <em>VC Alternative Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.VCAlternativeBox
	 * @generated
	 */
	public Adapter createVCAlternativeBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.VCCollectionBox <em>VC Collection Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.VCCollectionBox
	 * @generated
	 */
	public Adapter createVCCollectionBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.VCLoop <em>VC Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.VCLoop
	 * @generated
	 */
	public Adapter createVCLoopAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.ConditionOption <em>Condition Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.ConditionOption
	 * @generated
	 */
	public Adapter createConditionOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.VContractAlternativeBox <em>VContract Alternative Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.VContractAlternativeBox
	 * @generated
	 */
	public Adapter createVContractAlternativeBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.abdulaziz.ms.OCV.VContractCollectionBox <em>VContract Collection Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.abdulaziz.ms.OCV.VContractCollectionBox
	 * @generated
	 */
	public Adapter createVContractCollectionBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OCVAdapterFactory
