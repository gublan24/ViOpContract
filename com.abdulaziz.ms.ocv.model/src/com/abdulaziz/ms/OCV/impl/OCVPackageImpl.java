/**
 */
package com.abdulaziz.ms.OCV.impl;

import com.abdulaziz.ms.OCV.ConditionOption;
import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.OCVPackage;
import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLClassDiagram;
import com.abdulaziz.ms.OCV.UMLLink;
import com.abdulaziz.ms.OCV.UMLVariable;
import com.abdulaziz.ms.OCV.VCAlternativeBox;
import com.abdulaziz.ms.OCV.VCAssociation;
import com.abdulaziz.ms.OCV.VCCollectionBox;
import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCEquality;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VCInstanceField;
import com.abdulaziz.ms.OCV.VCLink;
import com.abdulaziz.ms.OCV.VCLinkPrePostCondition;
import com.abdulaziz.ms.OCV.VCLoop;
import com.abdulaziz.ms.OCV.VCOperationBox;
import com.abdulaziz.ms.OCV.VCParameter;
import com.abdulaziz.ms.OCV.VCReturn;
import com.abdulaziz.ms.OCV.VCValue;
import com.abdulaziz.ms.OCV.VContractAlternativeBox;
import com.abdulaziz.ms.OCV.VContractCondition;
import com.abdulaziz.ms.OCV.VContractPostcondition;
import com.abdulaziz.ms.OCV.VContractPrecondition;
import com.abdulaziz.ms.OCV.VOperation;
import com.abdulaziz.ms.OCV.VSystemOperationDiagram;
import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OCVPackageImpl extends EPackageImpl implements OCVPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlClassDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass umlLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vSystemOperationDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vcContractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vContractConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vContractPreconditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vContractPostconditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vcLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vcLinkPrePostConditionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vcEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vcValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vcEqualityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vcInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vcInstanceFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vcAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vcParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vcOperationBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vcReturnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vcAlternativeBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vcCollectionBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vcLoopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionOptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vContractAlternativeBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rectangleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType absoluteBendpointEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.abdulaziz.ms.OCV.OCVPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OCVPackageImpl() {
		super(eNS_URI, OCVFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link OCVPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OCVPackage init() {
		if (isInited) return (OCVPackage)EPackage.Registry.INSTANCE.getEPackage(OCVPackage.eNS_URI);

		// Obtain or create and register package
		OCVPackageImpl theOCVPackage = (OCVPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof OCVPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new OCVPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theOCVPackage.createPackageContents();

		// Initialize created meta-data
		theOCVPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOCVPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OCVPackage.eNS_URI, theOCVPackage);
		return theOCVPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLClassDiagram() {
		return umlClassDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLClassDiagram_Classes() {
		return (EReference)umlClassDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLClassDiagram_Links() {
		return (EReference)umlClassDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLClassDiagram_Name() {
		return (EAttribute)umlClassDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLClassDiagram_SystemOperation() {
		return (EReference)umlClassDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLClass() {
		return umlClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLClass_Constraints() {
		return (EAttribute)umlClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLClass_ClassAttributes() {
		return (EReference)umlClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLClass_UmlDiagram() {
		return (EReference)umlClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLClass_IncomingLinks() {
		return (EReference)umlClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLClass_OutgoingLinks() {
		return (EReference)umlClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLClass_ClassName() {
		return (EAttribute)umlClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLClass_VCInstances() {
		return (EReference)umlClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLVariable() {
		return umlVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLVariable_VariableName() {
		return (EAttribute)umlVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLVariable_VariableType() {
		return (EAttribute)umlVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLVariable_UmlClass() {
		return (EReference)umlVariableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLVariable_VOperation() {
		return (EReference)umlVariableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUMLLink() {
		return umlLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLLink_Type() {
		return (EAttribute)umlLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLLink_Name() {
		return (EAttribute)umlLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLLink_SourceMutiplicity() {
		return (EAttribute)umlLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUMLLink_TargetMutiplicity() {
		return (EAttribute)umlLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLLink_Source() {
		return (EReference)umlLinkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLLink_Target() {
		return (EReference)umlLinkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUMLLink_UmlDiagram() {
		return (EReference)umlLinkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVSystemOperationDiagram() {
		return vSystemOperationDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSystemOperationDiagram_ClassOperations() {
		return (EReference)vSystemOperationDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSystemOperationDiagram_Constraints() {
		return (EAttribute)vSystemOperationDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVSystemOperationDiagram_Name() {
		return (EAttribute)vSystemOperationDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVSystemOperationDiagram_UmlDiagram() {
		return (EReference)vSystemOperationDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVOperation() {
		return vOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVOperation_OperationName() {
		return (EAttribute)vOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVOperation_OperationReturnType() {
		return (EAttribute)vOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVOperation_OperationParameters() {
		return (EReference)vOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVOperation_VSystem() {
		return (EReference)vOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVOperation_VcContract() {
		return (EReference)vOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVCContract() {
		return vcContractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVCContract_Name() {
		return (EAttribute)vcContractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVCContract_PageIndex() {
		return (EAttribute)vcContractEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCContract_Precondition() {
		return (EReference)vcContractEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCContract_Postcondition() {
		return (EReference)vcContractEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCContract_UmlOperation() {
		return (EReference)vcContractEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCContract_VcLinks() {
		return (EReference)vcContractEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVContractCondition() {
		return vContractConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVContractCondition_Type() {
		return (EAttribute)vContractConditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVContractCondition_Constaint() {
		return (EAttribute)vContractConditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVContractCondition_VcEntities() {
		return (EReference)vContractConditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVContractCondition__SetVCEntityContract__VCEntity() {
		return vContractConditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVContractPrecondition() {
		return vContractPreconditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVContractPrecondition_VcContract() {
		return (EReference)vContractPreconditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVContractPrecondition__GetVContractCondition() {
		return vContractPreconditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVContractPrecondition__SetVCEntityContract__VCEntity() {
		return vContractPreconditionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVContractPostcondition() {
		return vContractPostconditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVContractPostcondition_VCReturnIncluded() {
		return (EAttribute)vContractPostconditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVContractPostcondition_VcContract() {
		return (EReference)vContractPostconditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVContractPostcondition__GetVContractCondition() {
		return vContractPostconditionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVContractPostcondition__SetVCEntityContract__VCEntity() {
		return vContractPostconditionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVCLink() {
		return vcLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCLink_Source() {
		return (EReference)vcLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCLink_Target() {
		return (EReference)vcLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVCLink_Bendpoints() {
		return (EAttribute)vcLinkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCLink_VcContract() {
		return (EReference)vcLinkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVCLinkPrePostCondition() {
		return vcLinkPrePostConditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVCEntity() {
		return vcEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVCEntity_Name() {
		return (EAttribute)vcEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCEntity_IncomingLinks() {
		return (EReference)vcEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCEntity_OutgoingLinks() {
		return (EReference)vcEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVCEntity_Constraints() {
		return (EAttribute)vcEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCEntity_VcContract() {
		return (EReference)vcEntityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCEntity_Precondition() {
		return (EReference)vcEntityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCEntity_Postcondition() {
		return (EReference)vcEntityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVCEntity__SetVContractCondition__VContractCondition() {
		return vcEntityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVCEntity__GetContractCondition() {
		return vcEntityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVCValue() {
		return vcValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVCValue_Value() {
		return (EAttribute)vcValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVCEquality() {
		return vcEqualityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCEquality_SouceVCEntity() {
		return (EReference)vcEqualityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCEquality_TargetValue() {
		return (EReference)vcEqualityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVCEquality_Meaning() {
		return (EAttribute)vcEqualityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVCEquality_DisplyedText() {
		return (EAttribute)vcEqualityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVCEquality_Notes() {
		return (EAttribute)vcEqualityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVCInstance() {
		return vcInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCInstance_UmlClass() {
		return (EReference)vcInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCInstance_Fields() {
		return (EReference)vcInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVCInstance_InstanceName() {
		return (EAttribute)vcInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVCInstance_Type() {
		return (EAttribute)vcInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVCInstance_Identifier() {
		return (EAttribute)vcInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVCInstance_Notes() {
		return (EAttribute)vcInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVCInstanceField() {
		return vcInstanceFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCInstanceField_VCInstance() {
		return (EReference)vcInstanceFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCInstanceField_UmlClassField() {
		return (EReference)vcInstanceFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVCAssociation() {
		return vcAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCAssociation_FirstInstance() {
		return (EReference)vcAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCAssociation_SecondInstance() {
		return (EReference)vcAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCAssociation_FirstInstanceVariable() {
		return (EReference)vcAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCAssociation_SecondInstanceVariable() {
		return (EReference)vcAssociationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVCParameter() {
		return vcParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCParameter_VCInstance() {
		return (EReference)vcParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCParameter_OperationParameter() {
		return (EReference)vcParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVCOperationBox() {
		return vcOperationBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVCOperationBox_Value() {
		return (EAttribute)vcOperationBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVCReturn() {
		return vcReturnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCReturn_Value() {
		return (EReference)vcReturnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVCAlternativeBox() {
		return vcAlternativeBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVCAlternativeBox_ConditinOptions() {
		return (EReference)vcAlternativeBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVCCollectionBox() {
		return vcCollectionBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVCCollectionBox_Type() {
		return (EAttribute)vcCollectionBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVCLoop() {
		return vcLoopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVCLoop_Iteration() {
		return (EAttribute)vcLoopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionOption() {
		return conditionOptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionOption_Name() {
		return (EAttribute)conditionOptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionOption_VcContractAlternativeBox() {
		return (EReference)conditionOptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionOption_VcAlternativeBox() {
		return (EReference)conditionOptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVContractAlternativeBox() {
		return vContractAlternativeBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVContractAlternativeBox_VCReturnIncluded() {
		return (EAttribute)vContractAlternativeBoxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVContractAlternativeBox_VcContract() {
		return (EReference)vContractAlternativeBoxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVContractAlternativeBox_ConditionOption() {
		return (EReference)vContractAlternativeBoxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVContractAlternativeBox__GetVContractCondition() {
		return vContractAlternativeBoxEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVContractAlternativeBox__SetVCEntityContract__VCEntity() {
		return vContractAlternativeBoxEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRectangle() {
		return rectangleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAbsoluteBendpoint() {
		return absoluteBendpointEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCVFactory getOCVFactory() {
		return (OCVFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		umlClassDiagramEClass = createEClass(UML_CLASS_DIAGRAM);
		createEReference(umlClassDiagramEClass, UML_CLASS_DIAGRAM__CLASSES);
		createEReference(umlClassDiagramEClass, UML_CLASS_DIAGRAM__LINKS);
		createEAttribute(umlClassDiagramEClass, UML_CLASS_DIAGRAM__NAME);
		createEReference(umlClassDiagramEClass, UML_CLASS_DIAGRAM__SYSTEM_OPERATION);

		umlClassEClass = createEClass(UML_CLASS);
		createEAttribute(umlClassEClass, UML_CLASS__CONSTRAINTS);
		createEReference(umlClassEClass, UML_CLASS__CLASS_ATTRIBUTES);
		createEReference(umlClassEClass, UML_CLASS__UML_DIAGRAM);
		createEReference(umlClassEClass, UML_CLASS__INCOMING_LINKS);
		createEReference(umlClassEClass, UML_CLASS__OUTGOING_LINKS);
		createEAttribute(umlClassEClass, UML_CLASS__CLASS_NAME);
		createEReference(umlClassEClass, UML_CLASS__VC_INSTANCES);

		umlVariableEClass = createEClass(UML_VARIABLE);
		createEAttribute(umlVariableEClass, UML_VARIABLE__VARIABLE_NAME);
		createEAttribute(umlVariableEClass, UML_VARIABLE__VARIABLE_TYPE);
		createEReference(umlVariableEClass, UML_VARIABLE__UML_CLASS);
		createEReference(umlVariableEClass, UML_VARIABLE__VOPERATION);

		umlLinkEClass = createEClass(UML_LINK);
		createEAttribute(umlLinkEClass, UML_LINK__TYPE);
		createEAttribute(umlLinkEClass, UML_LINK__NAME);
		createEAttribute(umlLinkEClass, UML_LINK__SOURCE_MUTIPLICITY);
		createEAttribute(umlLinkEClass, UML_LINK__TARGET_MUTIPLICITY);
		createEReference(umlLinkEClass, UML_LINK__SOURCE);
		createEReference(umlLinkEClass, UML_LINK__TARGET);
		createEReference(umlLinkEClass, UML_LINK__UML_DIAGRAM);

		vSystemOperationDiagramEClass = createEClass(VSYSTEM_OPERATION_DIAGRAM);
		createEReference(vSystemOperationDiagramEClass, VSYSTEM_OPERATION_DIAGRAM__CLASS_OPERATIONS);
		createEAttribute(vSystemOperationDiagramEClass, VSYSTEM_OPERATION_DIAGRAM__CONSTRAINTS);
		createEAttribute(vSystemOperationDiagramEClass, VSYSTEM_OPERATION_DIAGRAM__NAME);
		createEReference(vSystemOperationDiagramEClass, VSYSTEM_OPERATION_DIAGRAM__UML_DIAGRAM);

		vOperationEClass = createEClass(VOPERATION);
		createEAttribute(vOperationEClass, VOPERATION__OPERATION_NAME);
		createEAttribute(vOperationEClass, VOPERATION__OPERATION_RETURN_TYPE);
		createEReference(vOperationEClass, VOPERATION__OPERATION_PARAMETERS);
		createEReference(vOperationEClass, VOPERATION__VSYSTEM);
		createEReference(vOperationEClass, VOPERATION__VC_CONTRACT);

		vcContractEClass = createEClass(VC_CONTRACT);
		createEAttribute(vcContractEClass, VC_CONTRACT__NAME);
		createEAttribute(vcContractEClass, VC_CONTRACT__PAGE_INDEX);
		createEReference(vcContractEClass, VC_CONTRACT__PRECONDITION);
		createEReference(vcContractEClass, VC_CONTRACT__POSTCONDITION);
		createEReference(vcContractEClass, VC_CONTRACT__UML_OPERATION);
		createEReference(vcContractEClass, VC_CONTRACT__VC_LINKS);

		vContractConditionEClass = createEClass(VCONTRACT_CONDITION);
		createEAttribute(vContractConditionEClass, VCONTRACT_CONDITION__TYPE);
		createEAttribute(vContractConditionEClass, VCONTRACT_CONDITION__CONSTAINT);
		createEReference(vContractConditionEClass, VCONTRACT_CONDITION__VC_ENTITIES);
		createEOperation(vContractConditionEClass, VCONTRACT_CONDITION___SET_VC_ENTITY_CONTRACT__VCENTITY);

		vContractPreconditionEClass = createEClass(VCONTRACT_PRECONDITION);
		createEReference(vContractPreconditionEClass, VCONTRACT_PRECONDITION__VC_CONTRACT);
		createEOperation(vContractPreconditionEClass, VCONTRACT_PRECONDITION___GET_VCONTRACT_CONDITION);
		createEOperation(vContractPreconditionEClass, VCONTRACT_PRECONDITION___SET_VC_ENTITY_CONTRACT__VCENTITY);

		vContractPostconditionEClass = createEClass(VCONTRACT_POSTCONDITION);
		createEAttribute(vContractPostconditionEClass, VCONTRACT_POSTCONDITION__VC_RETURN_INCLUDED);
		createEReference(vContractPostconditionEClass, VCONTRACT_POSTCONDITION__VC_CONTRACT);
		createEOperation(vContractPostconditionEClass, VCONTRACT_POSTCONDITION___GET_VCONTRACT_CONDITION);
		createEOperation(vContractPostconditionEClass, VCONTRACT_POSTCONDITION___SET_VC_ENTITY_CONTRACT__VCENTITY);

		vcLinkEClass = createEClass(VC_LINK);
		createEReference(vcLinkEClass, VC_LINK__SOURCE);
		createEReference(vcLinkEClass, VC_LINK__TARGET);
		createEAttribute(vcLinkEClass, VC_LINK__BENDPOINTS);
		createEReference(vcLinkEClass, VC_LINK__VC_CONTRACT);

		vcLinkPrePostConditionEClass = createEClass(VC_LINK_PRE_POST_CONDITION);

		vcEntityEClass = createEClass(VC_ENTITY);
		createEAttribute(vcEntityEClass, VC_ENTITY__NAME);
		createEReference(vcEntityEClass, VC_ENTITY__INCOMING_LINKS);
		createEReference(vcEntityEClass, VC_ENTITY__OUTGOING_LINKS);
		createEAttribute(vcEntityEClass, VC_ENTITY__CONSTRAINTS);
		createEReference(vcEntityEClass, VC_ENTITY__VC_CONTRACT);
		createEReference(vcEntityEClass, VC_ENTITY__PRECONDITION);
		createEReference(vcEntityEClass, VC_ENTITY__POSTCONDITION);
		createEOperation(vcEntityEClass, VC_ENTITY___SET_VCONTRACT_CONDITION__VCONTRACTCONDITION);
		createEOperation(vcEntityEClass, VC_ENTITY___GET_CONTRACT_CONDITION);

		vcValueEClass = createEClass(VC_VALUE);
		createEAttribute(vcValueEClass, VC_VALUE__VALUE);

		vcEqualityEClass = createEClass(VC_EQUALITY);
		createEReference(vcEqualityEClass, VC_EQUALITY__SOUCE_VC_ENTITY);
		createEReference(vcEqualityEClass, VC_EQUALITY__TARGET_VALUE);
		createEAttribute(vcEqualityEClass, VC_EQUALITY__MEANING);
		createEAttribute(vcEqualityEClass, VC_EQUALITY__DISPLYED_TEXT);
		createEAttribute(vcEqualityEClass, VC_EQUALITY__NOTES);

		vcInstanceEClass = createEClass(VC_INSTANCE);
		createEReference(vcInstanceEClass, VC_INSTANCE__UML_CLASS);
		createEReference(vcInstanceEClass, VC_INSTANCE__FIELDS);
		createEAttribute(vcInstanceEClass, VC_INSTANCE__INSTANCE_NAME);
		createEAttribute(vcInstanceEClass, VC_INSTANCE__TYPE);
		createEAttribute(vcInstanceEClass, VC_INSTANCE__IDENTIFIER);
		createEAttribute(vcInstanceEClass, VC_INSTANCE__NOTES);

		vcInstanceFieldEClass = createEClass(VC_INSTANCE_FIELD);
		createEReference(vcInstanceFieldEClass, VC_INSTANCE_FIELD__VC_INSTANCE);
		createEReference(vcInstanceFieldEClass, VC_INSTANCE_FIELD__UML_CLASS_FIELD);

		vcAssociationEClass = createEClass(VC_ASSOCIATION);
		createEReference(vcAssociationEClass, VC_ASSOCIATION__FIRST_INSTANCE);
		createEReference(vcAssociationEClass, VC_ASSOCIATION__SECOND_INSTANCE);
		createEReference(vcAssociationEClass, VC_ASSOCIATION__FIRST_INSTANCE_VARIABLE);
		createEReference(vcAssociationEClass, VC_ASSOCIATION__SECOND_INSTANCE_VARIABLE);

		vcParameterEClass = createEClass(VC_PARAMETER);
		createEReference(vcParameterEClass, VC_PARAMETER__VC_INSTANCE);
		createEReference(vcParameterEClass, VC_PARAMETER__OPERATION_PARAMETER);

		vcOperationBoxEClass = createEClass(VC_OPERATION_BOX);
		createEAttribute(vcOperationBoxEClass, VC_OPERATION_BOX__VALUE);

		vcReturnEClass = createEClass(VC_RETURN);
		createEReference(vcReturnEClass, VC_RETURN__VALUE);

		vcAlternativeBoxEClass = createEClass(VC_ALTERNATIVE_BOX);
		createEReference(vcAlternativeBoxEClass, VC_ALTERNATIVE_BOX__CONDITIN_OPTIONS);

		vcCollectionBoxEClass = createEClass(VC_COLLECTION_BOX);
		createEAttribute(vcCollectionBoxEClass, VC_COLLECTION_BOX__TYPE);

		vcLoopEClass = createEClass(VC_LOOP);
		createEAttribute(vcLoopEClass, VC_LOOP__ITERATION);

		conditionOptionEClass = createEClass(CONDITION_OPTION);
		createEAttribute(conditionOptionEClass, CONDITION_OPTION__NAME);
		createEReference(conditionOptionEClass, CONDITION_OPTION__VC_CONTRACT_ALTERNATIVE_BOX);
		createEReference(conditionOptionEClass, CONDITION_OPTION__VC_ALTERNATIVE_BOX);

		vContractAlternativeBoxEClass = createEClass(VCONTRACT_ALTERNATIVE_BOX);
		createEAttribute(vContractAlternativeBoxEClass, VCONTRACT_ALTERNATIVE_BOX__VC_RETURN_INCLUDED);
		createEReference(vContractAlternativeBoxEClass, VCONTRACT_ALTERNATIVE_BOX__VC_CONTRACT);
		createEReference(vContractAlternativeBoxEClass, VCONTRACT_ALTERNATIVE_BOX__CONDITION_OPTION);
		createEOperation(vContractAlternativeBoxEClass, VCONTRACT_ALTERNATIVE_BOX___GET_VCONTRACT_CONDITION);
		createEOperation(vContractAlternativeBoxEClass, VCONTRACT_ALTERNATIVE_BOX___SET_VC_ENTITY_CONTRACT__VCENTITY);

		// Create data types
		rectangleEDataType = createEDataType(RECTANGLE);
		absoluteBendpointEDataType = createEDataType(ABSOLUTE_BENDPOINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vContractPreconditionEClass.getESuperTypes().add(this.getVContractCondition());
		vContractPostconditionEClass.getESuperTypes().add(this.getVContractCondition());
		vcLinkPrePostConditionEClass.getESuperTypes().add(this.getVCLink());
		vcValueEClass.getESuperTypes().add(this.getVCEntity());
		vcEqualityEClass.getESuperTypes().add(this.getVCEntity());
		vcInstanceEClass.getESuperTypes().add(this.getVCEntity());
		vcInstanceFieldEClass.getESuperTypes().add(this.getVCEntity());
		vcAssociationEClass.getESuperTypes().add(this.getVCEntity());
		vcParameterEClass.getESuperTypes().add(this.getVCEntity());
		vcOperationBoxEClass.getESuperTypes().add(this.getVCEntity());
		vcReturnEClass.getESuperTypes().add(this.getVCEntity());
		vcAlternativeBoxEClass.getESuperTypes().add(this.getVCEntity());
		vcCollectionBoxEClass.getESuperTypes().add(this.getVCEntity());
		vcLoopEClass.getESuperTypes().add(this.getVCEntity());
		vContractAlternativeBoxEClass.getESuperTypes().add(this.getVContractCondition());

		// Initialize classes, features, and operations; add parameters
		initEClass(umlClassDiagramEClass, UMLClassDiagram.class, "UMLClassDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUMLClassDiagram_Classes(), this.getUMLClass(), this.getUMLClass_UmlDiagram(), "classes", null, 0, -1, UMLClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLClassDiagram_Links(), this.getUMLLink(), this.getUMLLink_UmlDiagram(), "links", null, 0, -1, UMLClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLClassDiagram_Name(), ecorePackage.getEString(), "name", null, 0, 1, UMLClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLClassDiagram_SystemOperation(), this.getVSystemOperationDiagram(), this.getVSystemOperationDiagram_UmlDiagram(), "systemOperation", null, 0, 1, UMLClassDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlClassEClass, UMLClass.class, "UMLClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUMLClass_Constraints(), this.getRectangle(), "constraints", null, 0, 1, UMLClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLClass_ClassAttributes(), this.getUMLVariable(), this.getUMLVariable_UmlClass(), "classAttributes", null, 0, -1, UMLClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLClass_UmlDiagram(), this.getUMLClassDiagram(), this.getUMLClassDiagram_Classes(), "umlDiagram", null, 0, 1, UMLClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLClass_IncomingLinks(), this.getUMLLink(), this.getUMLLink_Target(), "incomingLinks", null, 0, -1, UMLClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLClass_OutgoingLinks(), this.getUMLLink(), this.getUMLLink_Source(), "outgoingLinks", null, 0, -1, UMLClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLClass_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, UMLClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLClass_VCInstances(), this.getVCInstance(), this.getVCInstance_UmlClass(), "VCInstances", null, 0, -1, UMLClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlVariableEClass, UMLVariable.class, "UMLVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUMLVariable_VariableName(), ecorePackage.getEString(), "variableName", null, 0, 1, UMLVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLVariable_VariableType(), ecorePackage.getEString(), "variableType", null, 0, 1, UMLVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLVariable_UmlClass(), this.getUMLClass(), this.getUMLClass_ClassAttributes(), "umlClass", null, 0, 1, UMLVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLVariable_VOperation(), this.getVOperation(), this.getVOperation_OperationParameters(), "vOperation", null, 0, 1, UMLVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(umlLinkEClass, UMLLink.class, "UMLLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUMLLink_Type(), ecorePackage.getEString(), "type", null, 0, 1, UMLLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLLink_Name(), ecorePackage.getEString(), "name", null, 0, 1, UMLLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLLink_SourceMutiplicity(), ecorePackage.getEString(), "sourceMutiplicity", null, 0, 1, UMLLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUMLLink_TargetMutiplicity(), ecorePackage.getEString(), "targetMutiplicity", null, 0, 1, UMLLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLLink_Source(), this.getUMLClass(), this.getUMLClass_OutgoingLinks(), "source", null, 0, 1, UMLLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLLink_Target(), this.getUMLClass(), this.getUMLClass_IncomingLinks(), "target", null, 0, 1, UMLLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUMLLink_UmlDiagram(), this.getUMLClassDiagram(), this.getUMLClassDiagram_Links(), "umlDiagram", null, 0, 1, UMLLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vSystemOperationDiagramEClass, VSystemOperationDiagram.class, "VSystemOperationDiagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVSystemOperationDiagram_ClassOperations(), this.getVOperation(), null, "classOperations", null, 0, -1, VSystemOperationDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVSystemOperationDiagram_Constraints(), this.getRectangle(), "constraints", null, 0, 1, VSystemOperationDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVSystemOperationDiagram_Name(), ecorePackage.getEString(), "name", "SYSTEM", 0, 1, VSystemOperationDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVSystemOperationDiagram_UmlDiagram(), this.getUMLClassDiagram(), this.getUMLClassDiagram_SystemOperation(), "umlDiagram", null, 0, 1, VSystemOperationDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vOperationEClass, VOperation.class, "VOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVOperation_OperationName(), ecorePackage.getEString(), "operationName", null, 0, 1, VOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVOperation_OperationReturnType(), ecorePackage.getEString(), "operationReturnType", null, 0, 1, VOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVOperation_OperationParameters(), this.getUMLVariable(), this.getUMLVariable_VOperation(), "operationParameters", null, 0, -1, VOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVOperation_VSystem(), this.getVSystemOperationDiagram(), null, "vSystem", null, 0, 1, VOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVOperation_VcContract(), this.getVCContract(), this.getVCContract_UmlOperation(), "vcContract", null, 0, 1, VOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vcContractEClass, VCContract.class, "VCContract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVCContract_Name(), ecorePackage.getEString(), "name", null, 0, 1, VCContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVCContract_PageIndex(), ecorePackage.getEInt(), "pageIndex", null, 0, 1, VCContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVCContract_Precondition(), this.getVContractPrecondition(), this.getVContractPrecondition_VcContract(), "precondition", null, 0, 1, VCContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVCContract_Postcondition(), this.getVContractPostcondition(), this.getVContractPostcondition_VcContract(), "postcondition", null, 0, 1, VCContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVCContract_UmlOperation(), this.getVOperation(), this.getVOperation_VcContract(), "umlOperation", null, 0, 1, VCContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVCContract_VcLinks(), this.getVCLink(), this.getVCLink_VcContract(), "vcLinks", null, 0, -1, VCContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vContractConditionEClass, VContractCondition.class, "VContractCondition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVContractCondition_Type(), ecorePackage.getEString(), "type", "", 0, 1, VContractCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVContractCondition_Constaint(), this.getRectangle(), "constaint", null, 0, 1, VContractCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVContractCondition_VcEntities(), this.getVCEntity(), null, "vcEntities", null, 0, -1, VContractCondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getVContractCondition__SetVCEntityContract__VCEntity(), null, "setVCEntityContract", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVCEntity(), "vcEntity", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vContractPreconditionEClass, VContractPrecondition.class, "VContractPrecondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVContractPrecondition_VcContract(), this.getVCContract(), this.getVCContract_Precondition(), "vcContract", null, 0, 1, VContractPrecondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getVContractPrecondition__GetVContractCondition(), this.getVContractPrecondition(), "getVContractCondition", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVContractPrecondition__SetVCEntityContract__VCEntity(), null, "setVCEntityContract", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVCEntity(), "vcEntity", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vContractPostconditionEClass, VContractPostcondition.class, "VContractPostcondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVContractPostcondition_VCReturnIncluded(), ecorePackage.getEBoolean(), "VCReturnIncluded", null, 0, 1, VContractPostcondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVContractPostcondition_VcContract(), this.getVCContract(), this.getVCContract_Postcondition(), "vcContract", null, 0, 1, VContractPostcondition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getVContractPostcondition__GetVContractCondition(), this.getVContractPostcondition(), "getVContractCondition", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVContractPostcondition__SetVCEntityContract__VCEntity(), null, "setVCEntityContract", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVCEntity(), "vcEntity", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vcLinkEClass, VCLink.class, "VCLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVCLink_Source(), this.getVCEntity(), null, "source", null, 0, 1, VCLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVCLink_Target(), this.getVCEntity(), null, "target", null, 0, 1, VCLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVCLink_Bendpoints(), this.getAbsoluteBendpoint(), "bendpoints", null, 0, -1, VCLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVCLink_VcContract(), this.getVCContract(), this.getVCContract_VcLinks(), "vcContract", null, 0, 1, VCLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vcLinkPrePostConditionEClass, VCLinkPrePostCondition.class, "VCLinkPrePostCondition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vcEntityEClass, VCEntity.class, "VCEntity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVCEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, VCEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVCEntity_IncomingLinks(), this.getVCLink(), null, "incomingLinks", null, 0, -1, VCEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVCEntity_OutgoingLinks(), this.getVCLink(), null, "outgoingLinks", null, 0, -1, VCEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVCEntity_Constraints(), this.getRectangle(), "constraints", null, 0, 1, VCEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVCEntity_VcContract(), this.getVCContract(), null, "vcContract", null, 0, 1, VCEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVCEntity_Precondition(), this.getVContractCondition(), null, "precondition", null, 0, 1, VCEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVCEntity_Postcondition(), this.getVContractCondition(), null, "postcondition", null, 0, 1, VCEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getVCEntity__SetVContractCondition__VContractCondition(), null, "setVContractCondition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVContractCondition(), "vContractCondition", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getVCEntity__GetContractCondition(), this.getVContractCondition(), "getContractCondition", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vcValueEClass, VCValue.class, "VCValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVCValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, VCValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vcEqualityEClass, VCEquality.class, "VCEquality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVCEquality_SouceVCEntity(), this.getVCEntity(), null, "souceVCEntity", null, 0, 1, VCEquality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVCEquality_TargetValue(), this.getVCEquality(), null, "targetValue", null, 0, 1, VCEquality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVCEquality_Meaning(), ecorePackage.getEString(), "meaning", null, 0, 1, VCEquality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVCEquality_DisplyedText(), ecorePackage.getEString(), "displyedText", null, 0, 1, VCEquality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVCEquality_Notes(), ecorePackage.getEString(), "notes", null, 0, 1, VCEquality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vcInstanceEClass, VCInstance.class, "VCInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVCInstance_UmlClass(), this.getUMLClass(), this.getUMLClass_VCInstances(), "umlClass", null, 0, 1, VCInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVCInstance_Fields(), this.getVCInstanceField(), this.getVCInstanceField_VCInstance(), "fields", null, 0, -1, VCInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVCInstance_InstanceName(), ecorePackage.getEString(), "instanceName", null, 0, 1, VCInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVCInstance_Type(), ecorePackage.getEString(), "type", null, 0, 1, VCInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVCInstance_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, VCInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVCInstance_Notes(), ecorePackage.getEString(), "notes", null, 0, 1, VCInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vcInstanceFieldEClass, VCInstanceField.class, "VCInstanceField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVCInstanceField_VCInstance(), this.getVCInstance(), this.getVCInstance_Fields(), "vCInstance", null, 0, 1, VCInstanceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVCInstanceField_UmlClassField(), this.getUMLVariable(), null, "umlClassField", null, 0, 1, VCInstanceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vcAssociationEClass, VCAssociation.class, "VCAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVCAssociation_FirstInstance(), this.getVCInstance(), null, "firstInstance", null, 0, 1, VCAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVCAssociation_SecondInstance(), this.getVCInstance(), null, "secondInstance", null, 0, 1, VCAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVCAssociation_FirstInstanceVariable(), this.getUMLVariable(), null, "firstInstanceVariable", null, 0, 1, VCAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVCAssociation_SecondInstanceVariable(), this.getUMLVariable(), null, "secondInstanceVariable", null, 0, 1, VCAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vcParameterEClass, VCParameter.class, "VCParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVCParameter_VCInstance(), this.getVCInstance(), null, "vCInstance", null, 0, 1, VCParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVCParameter_OperationParameter(), this.getUMLVariable(), null, "operationParameter", null, 0, 1, VCParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vcOperationBoxEClass, VCOperationBox.class, "VCOperationBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVCOperationBox_Value(), ecorePackage.getEString(), "value", null, 0, 1, VCOperationBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vcReturnEClass, VCReturn.class, "VCReturn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVCReturn_Value(), this.getVCEntity(), null, "value", null, 0, 1, VCReturn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vcAlternativeBoxEClass, VCAlternativeBox.class, "VCAlternativeBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVCAlternativeBox_ConditinOptions(), this.getConditionOption(), this.getConditionOption_VcAlternativeBox(), "conditinOptions", null, 0, -1, VCAlternativeBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vcCollectionBoxEClass, VCCollectionBox.class, "VCCollectionBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVCCollectionBox_Type(), ecorePackage.getEString(), "type", null, 0, 1, VCCollectionBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vcLoopEClass, VCLoop.class, "VCLoop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVCLoop_Iteration(), ecorePackage.getEString(), "iteration", null, 0, 1, VCLoop.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionOptionEClass, ConditionOption.class, "ConditionOption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionOption_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConditionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionOption_VcContractAlternativeBox(), this.getVContractAlternativeBox(), this.getVContractAlternativeBox_ConditionOption(), "vcContractAlternativeBox", null, 0, 1, ConditionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionOption_VcAlternativeBox(), this.getVCAlternativeBox(), this.getVCAlternativeBox_ConditinOptions(), "vcAlternativeBox", null, 0, 1, ConditionOption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vContractAlternativeBoxEClass, VContractAlternativeBox.class, "VContractAlternativeBox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVContractAlternativeBox_VCReturnIncluded(), ecorePackage.getEBoolean(), "VCReturnIncluded", null, 0, 1, VContractAlternativeBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVContractAlternativeBox_VcContract(), this.getVCContract(), null, "vcContract", null, 0, 1, VContractAlternativeBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVContractAlternativeBox_ConditionOption(), this.getConditionOption(), this.getConditionOption_VcContractAlternativeBox(), "conditionOption", null, 0, 1, VContractAlternativeBox.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getVContractAlternativeBox__GetVContractCondition(), this.getVContractAlternativeBox(), "getVContractCondition", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVContractAlternativeBox__SetVCEntityContract__VCEntity(), null, "setVCEntityContract", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVCEntity(), "vcEntity", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(rectangleEDataType, Rectangle.class, "Rectangle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(absoluteBendpointEDataType, AbsoluteBendpoint.class, "AbsoluteBendpoint", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //OCVPackageImpl
