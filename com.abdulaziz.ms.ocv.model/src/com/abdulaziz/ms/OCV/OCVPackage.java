/**
 */
package com.abdulaziz.ms.OCV;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.abdulaziz.ms.OCV.OCVFactory
 * @model kind="package"
 * @generated
 */
public interface OCVPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "OCV";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.NULL.com/model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "OCV";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OCVPackage eINSTANCE = com.abdulaziz.ms.OCV.impl.OCVPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.UMLClassDiagramImpl <em>UML Class Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.UMLClassDiagramImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getUMLClassDiagram()
	 * @generated
	 */
	int UML_CLASS_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_DIAGRAM__CLASSES = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_DIAGRAM__LINKS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_DIAGRAM__NAME = 2;

	/**
	 * The feature id for the '<em><b>System Operation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_DIAGRAM__SYSTEM_OPERATION = 3;

	/**
	 * The number of structural features of the '<em>UML Class Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_DIAGRAM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>UML Class Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.UMLClassImpl <em>UML Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.UMLClassImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getUMLClass()
	 * @generated
	 */
	int UML_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS__CONSTRAINTS = 0;

	/**
	 * The feature id for the '<em><b>Class Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS__CLASS_ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS__UML_DIAGRAM = 2;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS__INCOMING_LINKS = 3;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS__OUTGOING_LINKS = 4;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS__CLASS_NAME = 5;

	/**
	 * The feature id for the '<em><b>VC Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS__VC_INSTANCES = 6;

	/**
	 * The number of structural features of the '<em>UML Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>UML Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.UMLVariableImpl <em>UML Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.UMLVariableImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getUMLVariable()
	 * @generated
	 */
	int UML_VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_VARIABLE__VARIABLE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Variable Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_VARIABLE__VARIABLE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Uml Class</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_VARIABLE__UML_CLASS = 2;

	/**
	 * The feature id for the '<em><b>VOperation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_VARIABLE__VOPERATION = 3;

	/**
	 * The number of structural features of the '<em>UML Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_VARIABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>UML Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.UMLLinkImpl <em>UML Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.UMLLinkImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getUMLLink()
	 * @generated
	 */
	int UML_LINK = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_LINK__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_LINK__NAME = 1;

	/**
	 * The feature id for the '<em><b>Source Mutiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_LINK__SOURCE_MUTIPLICITY = 2;

	/**
	 * The feature id for the '<em><b>Target Mutiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_LINK__TARGET_MUTIPLICITY = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_LINK__SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_LINK__TARGET = 5;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_LINK__UML_DIAGRAM = 6;

	/**
	 * The number of structural features of the '<em>UML Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_LINK_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>UML Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UML_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.VSystemOperationDiagramImpl <em>VSystem Operation Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.VSystemOperationDiagramImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVSystemOperationDiagram()
	 * @generated
	 */
	int VSYSTEM_OPERATION_DIAGRAM = 4;

	/**
	 * The feature id for the '<em><b>Class Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSYSTEM_OPERATION_DIAGRAM__CLASS_OPERATIONS = 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSYSTEM_OPERATION_DIAGRAM__CONSTRAINTS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSYSTEM_OPERATION_DIAGRAM__NAME = 2;

	/**
	 * The feature id for the '<em><b>Uml Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSYSTEM_OPERATION_DIAGRAM__UML_DIAGRAM = 3;

	/**
	 * The number of structural features of the '<em>VSystem Operation Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSYSTEM_OPERATION_DIAGRAM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>VSystem Operation Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VSYSTEM_OPERATION_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.VOperationImpl <em>VOperation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.VOperationImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVOperation()
	 * @generated
	 */
	int VOPERATION = 5;

	/**
	 * The feature id for the '<em><b>Operation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOPERATION__OPERATION_NAME = 0;

	/**
	 * The feature id for the '<em><b>Operation Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOPERATION__OPERATION_RETURN_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Operation Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOPERATION__OPERATION_PARAMETERS = 2;

	/**
	 * The feature id for the '<em><b>VSystem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOPERATION__VSYSTEM = 3;

	/**
	 * The feature id for the '<em><b>Vc Contract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOPERATION__VC_CONTRACT = 4;

	/**
	 * The feature id for the '<em><b>Vc Contract Collection</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOPERATION__VC_CONTRACT_COLLECTION = 5;

	/**
	 * The number of structural features of the '<em>VOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOPERATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>VOperation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.VCContractImpl <em>VC Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.VCContractImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCContract()
	 * @generated
	 */
	int VC_CONTRACT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_CONTRACT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Page Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_CONTRACT__PAGE_INDEX = 1;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_CONTRACT__PRECONDITION = 2;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_CONTRACT__POSTCONDITION = 3;

	/**
	 * The feature id for the '<em><b>Uml Operation</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_CONTRACT__UML_OPERATION = 4;

	/**
	 * The feature id for the '<em><b>Vc Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_CONTRACT__VC_LINKS = 5;

	/**
	 * The number of structural features of the '<em>VC Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_CONTRACT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>VC Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_CONTRACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.VContractConditionImpl <em>VContract Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.VContractConditionImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVContractCondition()
	 * @generated
	 */
	int VCONTRACT_CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_CONDITION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Constaint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_CONDITION__CONSTAINT = 1;

	/**
	 * The feature id for the '<em><b>Vc Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_CONDITION__VC_ENTITIES = 2;

	/**
	 * The number of structural features of the '<em>VContract Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_CONDITION_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Set VC Entity Contract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_CONDITION___SET_VC_ENTITY_CONTRACT__VCENTITY = 0;

	/**
	 * The number of operations of the '<em>VContract Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_CONDITION_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.VContractPreconditionImpl <em>VContract Precondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.VContractPreconditionImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVContractPrecondition()
	 * @generated
	 */
	int VCONTRACT_PRECONDITION = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_PRECONDITION__TYPE = VCONTRACT_CONDITION__TYPE;

	/**
	 * The feature id for the '<em><b>Constaint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_PRECONDITION__CONSTAINT = VCONTRACT_CONDITION__CONSTAINT;

	/**
	 * The feature id for the '<em><b>Vc Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_PRECONDITION__VC_ENTITIES = VCONTRACT_CONDITION__VC_ENTITIES;

	/**
	 * The feature id for the '<em><b>Vc Contract</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_PRECONDITION__VC_CONTRACT = VCONTRACT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VContract Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_PRECONDITION_FEATURE_COUNT = VCONTRACT_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get VContract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_PRECONDITION___GET_VCONTRACT_CONDITION = VCONTRACT_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set VC Entity Contract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_PRECONDITION___SET_VC_ENTITY_CONTRACT__VCENTITY = VCONTRACT_CONDITION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>VContract Precondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_PRECONDITION_OPERATION_COUNT = VCONTRACT_CONDITION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.VContractPostconditionImpl <em>VContract Postcondition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.VContractPostconditionImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVContractPostcondition()
	 * @generated
	 */
	int VCONTRACT_POSTCONDITION = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_POSTCONDITION__TYPE = VCONTRACT_CONDITION__TYPE;

	/**
	 * The feature id for the '<em><b>Constaint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_POSTCONDITION__CONSTAINT = VCONTRACT_CONDITION__CONSTAINT;

	/**
	 * The feature id for the '<em><b>Vc Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_POSTCONDITION__VC_ENTITIES = VCONTRACT_CONDITION__VC_ENTITIES;

	/**
	 * The feature id for the '<em><b>VC Return Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_POSTCONDITION__VC_RETURN_INCLUDED = VCONTRACT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vc Contract</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_POSTCONDITION__VC_CONTRACT = VCONTRACT_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VContract Postcondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_POSTCONDITION_FEATURE_COUNT = VCONTRACT_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get VContract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_POSTCONDITION___GET_VCONTRACT_CONDITION = VCONTRACT_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set VC Entity Contract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_POSTCONDITION___SET_VC_ENTITY_CONTRACT__VCENTITY = VCONTRACT_CONDITION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>VContract Postcondition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_POSTCONDITION_OPERATION_COUNT = VCONTRACT_CONDITION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.VCLinkImpl <em>VC Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.VCLinkImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCLink()
	 * @generated
	 */
	int VC_LINK = 10;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_LINK__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_LINK__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_LINK__BENDPOINTS = 2;

	/**
	 * The feature id for the '<em><b>Vc Contract</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_LINK__VC_CONTRACT = 3;

	/**
	 * The number of structural features of the '<em>VC Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_LINK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>VC Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.VCLinkPrePostConditionImpl <em>VC Link Pre Post Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.VCLinkPrePostConditionImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCLinkPrePostCondition()
	 * @generated
	 */
	int VC_LINK_PRE_POST_CONDITION = 11;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_LINK_PRE_POST_CONDITION__SOURCE = VC_LINK__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_LINK_PRE_POST_CONDITION__TARGET = VC_LINK__TARGET;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_LINK_PRE_POST_CONDITION__BENDPOINTS = VC_LINK__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Vc Contract</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_LINK_PRE_POST_CONDITION__VC_CONTRACT = VC_LINK__VC_CONTRACT;

	/**
	 * The number of structural features of the '<em>VC Link Pre Post Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_LINK_PRE_POST_CONDITION_FEATURE_COUNT = VC_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>VC Link Pre Post Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_LINK_PRE_POST_CONDITION_OPERATION_COUNT = VC_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.VCEntityImpl <em>VC Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.VCEntityImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCEntity()
	 * @generated
	 */
	int VC_ENTITY = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ENTITY__INCOMING_LINKS = 1;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ENTITY__OUTGOING_LINKS = 2;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ENTITY__CONSTRAINTS = 3;

	/**
	 * The feature id for the '<em><b>Vc Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ENTITY__VC_CONTRACT = 4;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ENTITY__PRECONDITION = 5;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ENTITY__POSTCONDITION = 6;

	/**
	 * The number of structural features of the '<em>VC Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ENTITY_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Set VContract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ENTITY___SET_VCONTRACT_CONDITION__VCONTRACTCONDITION = 0;

	/**
	 * The operation id for the '<em>Get Contract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ENTITY___GET_CONTRACT_CONDITION = 1;

	/**
	 * The number of operations of the '<em>VC Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ENTITY_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.VCValueImpl <em>VC Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.VCValueImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCValue()
	 * @generated
	 */
	int VC_VALUE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_VALUE__NAME = VC_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_VALUE__INCOMING_LINKS = VC_ENTITY__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_VALUE__OUTGOING_LINKS = VC_ENTITY__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_VALUE__CONSTRAINTS = VC_ENTITY__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Vc Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_VALUE__VC_CONTRACT = VC_ENTITY__VC_CONTRACT;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_VALUE__PRECONDITION = VC_ENTITY__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_VALUE__POSTCONDITION = VC_ENTITY__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_VALUE__VALUE = VC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VC Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_VALUE_FEATURE_COUNT = VC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Set VContract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_VALUE___SET_VCONTRACT_CONDITION__VCONTRACTCONDITION = VC_ENTITY___SET_VCONTRACT_CONDITION__VCONTRACTCONDITION;

	/**
	 * The operation id for the '<em>Get Contract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_VALUE___GET_CONTRACT_CONDITION = VC_ENTITY___GET_CONTRACT_CONDITION;

	/**
	 * The number of operations of the '<em>VC Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_VALUE_OPERATION_COUNT = VC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.VCEqualityImpl <em>VC Equality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.VCEqualityImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCEquality()
	 * @generated
	 */
	int VC_EQUALITY = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_EQUALITY__NAME = VC_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_EQUALITY__INCOMING_LINKS = VC_ENTITY__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_EQUALITY__OUTGOING_LINKS = VC_ENTITY__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_EQUALITY__CONSTRAINTS = VC_ENTITY__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Vc Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_EQUALITY__VC_CONTRACT = VC_ENTITY__VC_CONTRACT;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_EQUALITY__PRECONDITION = VC_ENTITY__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_EQUALITY__POSTCONDITION = VC_ENTITY__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Souce VC Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_EQUALITY__SOUCE_VC_ENTITY = VC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_EQUALITY__TARGET_VALUE = VC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Meaning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_EQUALITY__MEANING = VC_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Displyed Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_EQUALITY__DISPLYED_TEXT = VC_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_EQUALITY__NOTES = VC_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>VC Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_EQUALITY_FEATURE_COUNT = VC_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Set VContract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_EQUALITY___SET_VCONTRACT_CONDITION__VCONTRACTCONDITION = VC_ENTITY___SET_VCONTRACT_CONDITION__VCONTRACTCONDITION;

	/**
	 * The operation id for the '<em>Get Contract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_EQUALITY___GET_CONTRACT_CONDITION = VC_ENTITY___GET_CONTRACT_CONDITION;

	/**
	 * The number of operations of the '<em>VC Equality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_EQUALITY_OPERATION_COUNT = VC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.VCInstanceImpl <em>VC Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.VCInstanceImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCInstance()
	 * @generated
	 */
	int VC_INSTANCE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE__NAME = VC_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE__INCOMING_LINKS = VC_ENTITY__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE__OUTGOING_LINKS = VC_ENTITY__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE__CONSTRAINTS = VC_ENTITY__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Vc Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE__VC_CONTRACT = VC_ENTITY__VC_CONTRACT;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE__PRECONDITION = VC_ENTITY__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE__POSTCONDITION = VC_ENTITY__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Uml Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE__UML_CLASS = VC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE__FIELDS = VC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Instance Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE__INSTANCE_NAME = VC_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE__TYPE = VC_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE__IDENTIFIER = VC_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE__NOTES = VC_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>VC Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE_FEATURE_COUNT = VC_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Set VContract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE___SET_VCONTRACT_CONDITION__VCONTRACTCONDITION = VC_ENTITY___SET_VCONTRACT_CONDITION__VCONTRACTCONDITION;

	/**
	 * The operation id for the '<em>Get Contract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE___GET_CONTRACT_CONDITION = VC_ENTITY___GET_CONTRACT_CONDITION;

	/**
	 * The number of operations of the '<em>VC Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE_OPERATION_COUNT = VC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.VCInstanceFieldImpl <em>VC Instance Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.VCInstanceFieldImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCInstanceField()
	 * @generated
	 */
	int VC_INSTANCE_FIELD = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE_FIELD__NAME = VC_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE_FIELD__INCOMING_LINKS = VC_ENTITY__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE_FIELD__OUTGOING_LINKS = VC_ENTITY__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE_FIELD__CONSTRAINTS = VC_ENTITY__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Vc Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE_FIELD__VC_CONTRACT = VC_ENTITY__VC_CONTRACT;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE_FIELD__PRECONDITION = VC_ENTITY__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE_FIELD__POSTCONDITION = VC_ENTITY__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>VC Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE_FIELD__VC_INSTANCE = VC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Uml Class Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE_FIELD__UML_CLASS_FIELD = VC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VC Instance Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE_FIELD_FEATURE_COUNT = VC_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Set VContract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE_FIELD___SET_VCONTRACT_CONDITION__VCONTRACTCONDITION = VC_ENTITY___SET_VCONTRACT_CONDITION__VCONTRACTCONDITION;

	/**
	 * The operation id for the '<em>Get Contract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE_FIELD___GET_CONTRACT_CONDITION = VC_ENTITY___GET_CONTRACT_CONDITION;

	/**
	 * The number of operations of the '<em>VC Instance Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_INSTANCE_FIELD_OPERATION_COUNT = VC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.VCAssociationImpl <em>VC Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.VCAssociationImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCAssociation()
	 * @generated
	 */
	int VC_ASSOCIATION = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ASSOCIATION__NAME = VC_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ASSOCIATION__INCOMING_LINKS = VC_ENTITY__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ASSOCIATION__OUTGOING_LINKS = VC_ENTITY__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ASSOCIATION__CONSTRAINTS = VC_ENTITY__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Vc Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ASSOCIATION__VC_CONTRACT = VC_ENTITY__VC_CONTRACT;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ASSOCIATION__PRECONDITION = VC_ENTITY__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ASSOCIATION__POSTCONDITION = VC_ENTITY__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>First Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ASSOCIATION__FIRST_INSTANCE = VC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Second Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ASSOCIATION__SECOND_INSTANCE = VC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>First Instance Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ASSOCIATION__FIRST_INSTANCE_VARIABLE = VC_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Second Instance Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ASSOCIATION__SECOND_INSTANCE_VARIABLE = VC_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>VC Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ASSOCIATION_FEATURE_COUNT = VC_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Set VContract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ASSOCIATION___SET_VCONTRACT_CONDITION__VCONTRACTCONDITION = VC_ENTITY___SET_VCONTRACT_CONDITION__VCONTRACTCONDITION;

	/**
	 * The operation id for the '<em>Get Contract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ASSOCIATION___GET_CONTRACT_CONDITION = VC_ENTITY___GET_CONTRACT_CONDITION;

	/**
	 * The number of operations of the '<em>VC Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ASSOCIATION_OPERATION_COUNT = VC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.VCParameterImpl <em>VC Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.VCParameterImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCParameter()
	 * @generated
	 */
	int VC_PARAMETER = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_PARAMETER__NAME = VC_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_PARAMETER__INCOMING_LINKS = VC_ENTITY__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_PARAMETER__OUTGOING_LINKS = VC_ENTITY__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_PARAMETER__CONSTRAINTS = VC_ENTITY__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Vc Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_PARAMETER__VC_CONTRACT = VC_ENTITY__VC_CONTRACT;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_PARAMETER__PRECONDITION = VC_ENTITY__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_PARAMETER__POSTCONDITION = VC_ENTITY__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>VC Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_PARAMETER__VC_INSTANCE = VC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_PARAMETER__OPERATION_PARAMETER = VC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VC Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_PARAMETER_FEATURE_COUNT = VC_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Set VContract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_PARAMETER___SET_VCONTRACT_CONDITION__VCONTRACTCONDITION = VC_ENTITY___SET_VCONTRACT_CONDITION__VCONTRACTCONDITION;

	/**
	 * The operation id for the '<em>Get Contract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_PARAMETER___GET_CONTRACT_CONDITION = VC_ENTITY___GET_CONTRACT_CONDITION;

	/**
	 * The number of operations of the '<em>VC Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_PARAMETER_OPERATION_COUNT = VC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.VCOperationBoxImpl <em>VC Operation Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.VCOperationBoxImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCOperationBox()
	 * @generated
	 */
	int VC_OPERATION_BOX = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_OPERATION_BOX__NAME = VC_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_OPERATION_BOX__INCOMING_LINKS = VC_ENTITY__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_OPERATION_BOX__OUTGOING_LINKS = VC_ENTITY__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_OPERATION_BOX__CONSTRAINTS = VC_ENTITY__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Vc Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_OPERATION_BOX__VC_CONTRACT = VC_ENTITY__VC_CONTRACT;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_OPERATION_BOX__PRECONDITION = VC_ENTITY__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_OPERATION_BOX__POSTCONDITION = VC_ENTITY__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_OPERATION_BOX__VALUE = VC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VC Operation Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_OPERATION_BOX_FEATURE_COUNT = VC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Set VContract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_OPERATION_BOX___SET_VCONTRACT_CONDITION__VCONTRACTCONDITION = VC_ENTITY___SET_VCONTRACT_CONDITION__VCONTRACTCONDITION;

	/**
	 * The operation id for the '<em>Get Contract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_OPERATION_BOX___GET_CONTRACT_CONDITION = VC_ENTITY___GET_CONTRACT_CONDITION;

	/**
	 * The number of operations of the '<em>VC Operation Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_OPERATION_BOX_OPERATION_COUNT = VC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.VCReturnImpl <em>VC Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.VCReturnImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCReturn()
	 * @generated
	 */
	int VC_RETURN = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_RETURN__NAME = VC_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_RETURN__INCOMING_LINKS = VC_ENTITY__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_RETURN__OUTGOING_LINKS = VC_ENTITY__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_RETURN__CONSTRAINTS = VC_ENTITY__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Vc Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_RETURN__VC_CONTRACT = VC_ENTITY__VC_CONTRACT;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_RETURN__PRECONDITION = VC_ENTITY__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_RETURN__POSTCONDITION = VC_ENTITY__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_RETURN__VALUE = VC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VC Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_RETURN_FEATURE_COUNT = VC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Set VContract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_RETURN___SET_VCONTRACT_CONDITION__VCONTRACTCONDITION = VC_ENTITY___SET_VCONTRACT_CONDITION__VCONTRACTCONDITION;

	/**
	 * The operation id for the '<em>Get Contract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_RETURN___GET_CONTRACT_CONDITION = VC_ENTITY___GET_CONTRACT_CONDITION;

	/**
	 * The number of operations of the '<em>VC Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_RETURN_OPERATION_COUNT = VC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.VCAlternativeBoxImpl <em>VC Alternative Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.VCAlternativeBoxImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCAlternativeBox()
	 * @generated
	 */
	int VC_ALTERNATIVE_BOX = 23;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.VCCollectionBoxImpl <em>VC Collection Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.VCCollectionBoxImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCCollectionBox()
	 * @generated
	 */
	int VC_COLLECTION_BOX = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_COLLECTION_BOX__NAME = VC_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_COLLECTION_BOX__INCOMING_LINKS = VC_ENTITY__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_COLLECTION_BOX__OUTGOING_LINKS = VC_ENTITY__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_COLLECTION_BOX__CONSTRAINTS = VC_ENTITY__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Vc Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_COLLECTION_BOX__VC_CONTRACT = VC_ENTITY__VC_CONTRACT;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_COLLECTION_BOX__PRECONDITION = VC_ENTITY__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_COLLECTION_BOX__POSTCONDITION = VC_ENTITY__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_COLLECTION_BOX__TYPE = VC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>VContract Collection Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_COLLECTION_BOX__VCONTRACT_COLLECTION_BOX = VC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VC Collection Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_COLLECTION_BOX_FEATURE_COUNT = VC_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Set VContract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_COLLECTION_BOX___SET_VCONTRACT_CONDITION__VCONTRACTCONDITION = VC_ENTITY___SET_VCONTRACT_CONDITION__VCONTRACTCONDITION;

	/**
	 * The operation id for the '<em>Get Contract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_COLLECTION_BOX___GET_CONTRACT_CONDITION = VC_ENTITY___GET_CONTRACT_CONDITION;

	/**
	 * The number of operations of the '<em>VC Collection Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_COLLECTION_BOX_OPERATION_COUNT = VC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.VCLoopImpl <em>VC Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.VCLoopImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCLoop()
	 * @generated
	 */
	int VC_LOOP = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_LOOP__NAME = VC_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_LOOP__INCOMING_LINKS = VC_ENTITY__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_LOOP__OUTGOING_LINKS = VC_ENTITY__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_LOOP__CONSTRAINTS = VC_ENTITY__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Vc Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_LOOP__VC_CONTRACT = VC_ENTITY__VC_CONTRACT;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_LOOP__PRECONDITION = VC_ENTITY__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_LOOP__POSTCONDITION = VC_ENTITY__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Iteration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_LOOP__ITERATION = VC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vc Contract Loop Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_LOOP__VC_CONTRACT_LOOP_BOX = VC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VC Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_LOOP_FEATURE_COUNT = VC_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Set VContract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_LOOP___SET_VCONTRACT_CONDITION__VCONTRACTCONDITION = VC_ENTITY___SET_VCONTRACT_CONDITION__VCONTRACTCONDITION;

	/**
	 * The operation id for the '<em>Get Contract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_LOOP___GET_CONTRACT_CONDITION = VC_ENTITY___GET_CONTRACT_CONDITION;

	/**
	 * The number of operations of the '<em>VC Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_LOOP_OPERATION_COUNT = VC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ALTERNATIVE_BOX__NAME = VC_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ALTERNATIVE_BOX__INCOMING_LINKS = VC_ENTITY__INCOMING_LINKS;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ALTERNATIVE_BOX__OUTGOING_LINKS = VC_ENTITY__OUTGOING_LINKS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ALTERNATIVE_BOX__CONSTRAINTS = VC_ENTITY__CONSTRAINTS;

	/**
	 * The feature id for the '<em><b>Vc Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ALTERNATIVE_BOX__VC_CONTRACT = VC_ENTITY__VC_CONTRACT;

	/**
	 * The feature id for the '<em><b>Precondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ALTERNATIVE_BOX__PRECONDITION = VC_ENTITY__PRECONDITION;

	/**
	 * The feature id for the '<em><b>Postcondition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ALTERNATIVE_BOX__POSTCONDITION = VC_ENTITY__POSTCONDITION;

	/**
	 * The feature id for the '<em><b>Conditin Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ALTERNATIVE_BOX__CONDITIN_OPTIONS = VC_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VC Alternative Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ALTERNATIVE_BOX_FEATURE_COUNT = VC_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Set VContract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ALTERNATIVE_BOX___SET_VCONTRACT_CONDITION__VCONTRACTCONDITION = VC_ENTITY___SET_VCONTRACT_CONDITION__VCONTRACTCONDITION;

	/**
	 * The operation id for the '<em>Get Contract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ALTERNATIVE_BOX___GET_CONTRACT_CONDITION = VC_ENTITY___GET_CONTRACT_CONDITION;

	/**
	 * The number of operations of the '<em>VC Alternative Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VC_ALTERNATIVE_BOX_OPERATION_COUNT = VC_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.ConditionOptionImpl <em>Condition Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.ConditionOptionImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getConditionOption()
	 * @generated
	 */
	int CONDITION_OPTION = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Vc Contract Alternative Box</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPTION__VC_CONTRACT_ALTERNATIVE_BOX = 1;

	/**
	 * The feature id for the '<em><b>Vc Alternative Box</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPTION__VC_ALTERNATIVE_BOX = 2;

	/**
	 * The feature id for the '<em><b>Vc Entity Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPTION__VC_ENTITY_REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Displayed Condition Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPTION__DISPLAYED_CONDITION_STATEMENT = 4;

	/**
	 * The feature id for the '<em><b>Condition Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPTION__CONDITION_VALUE = 5;

	/**
	 * The feature id for the '<em><b>Meaning Of Condition Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPTION__MEANING_OF_CONDITION_STATEMENT = 6;

	/**
	 * The number of structural features of the '<em>Condition Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPTION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Condition Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.VContractAlternativeBoxImpl <em>VContract Alternative Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.VContractAlternativeBoxImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVContractAlternativeBox()
	 * @generated
	 */
	int VCONTRACT_ALTERNATIVE_BOX = 25;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_ALTERNATIVE_BOX__TYPE = VCONTRACT_CONDITION__TYPE;

	/**
	 * The feature id for the '<em><b>Constaint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_ALTERNATIVE_BOX__CONSTAINT = VCONTRACT_CONDITION__CONSTAINT;

	/**
	 * The feature id for the '<em><b>Vc Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_ALTERNATIVE_BOX__VC_ENTITIES = VCONTRACT_CONDITION__VC_ENTITIES;

	/**
	 * The feature id for the '<em><b>VC Return Included</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_ALTERNATIVE_BOX__VC_RETURN_INCLUDED = VCONTRACT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vc Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_ALTERNATIVE_BOX__VC_CONTRACT = VCONTRACT_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condition Option</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_ALTERNATIVE_BOX__CONDITION_OPTION = VCONTRACT_CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VContract Alternative Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_ALTERNATIVE_BOX_FEATURE_COUNT = VCONTRACT_CONDITION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get VContract Condition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_ALTERNATIVE_BOX___GET_VCONTRACT_CONDITION = VCONTRACT_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Set VC Entity Contract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_ALTERNATIVE_BOX___SET_VC_ENTITY_CONTRACT__VCENTITY = VCONTRACT_CONDITION_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>VContract Alternative Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_ALTERNATIVE_BOX_OPERATION_COUNT = VCONTRACT_CONDITION_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.VContractCollectionBoxImpl <em>VContract Collection Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.VContractCollectionBoxImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVContractCollectionBox()
	 * @generated
	 */
	int VCONTRACT_COLLECTION_BOX = 26;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_COLLECTION_BOX__TYPE = VCONTRACT_CONDITION__TYPE;

	/**
	 * The feature id for the '<em><b>Constaint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_COLLECTION_BOX__CONSTAINT = VCONTRACT_CONDITION__CONSTAINT;

	/**
	 * The feature id for the '<em><b>Vc Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_COLLECTION_BOX__VC_ENTITIES = VCONTRACT_CONDITION__VC_ENTITIES;

	/**
	 * The feature id for the '<em><b>Vc Collection Box</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_COLLECTION_BOX__VC_COLLECTION_BOX = VCONTRACT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VContract Collection Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_COLLECTION_BOX_FEATURE_COUNT = VCONTRACT_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Set VC Entity Contract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_COLLECTION_BOX___SET_VC_ENTITY_CONTRACT__VCENTITY = VCONTRACT_CONDITION___SET_VC_ENTITY_CONTRACT__VCENTITY;

	/**
	 * The number of operations of the '<em>VContract Collection Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_COLLECTION_BOX_OPERATION_COUNT = VCONTRACT_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.abdulaziz.ms.OCV.impl.VContractLoopBoxImpl <em>VContract Loop Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.abdulaziz.ms.OCV.impl.VContractLoopBoxImpl
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVContractLoopBox()
	 * @generated
	 */
	int VCONTRACT_LOOP_BOX = 27;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_LOOP_BOX__TYPE = VCONTRACT_CONDITION__TYPE;

	/**
	 * The feature id for the '<em><b>Constaint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_LOOP_BOX__CONSTAINT = VCONTRACT_CONDITION__CONSTAINT;

	/**
	 * The feature id for the '<em><b>Vc Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_LOOP_BOX__VC_ENTITIES = VCONTRACT_CONDITION__VC_ENTITIES;

	/**
	 * The feature id for the '<em><b>Vc Collection Box</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_LOOP_BOX__VC_COLLECTION_BOX = VCONTRACT_CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VContract Loop Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_LOOP_BOX_FEATURE_COUNT = VCONTRACT_CONDITION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Set VC Entity Contract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_LOOP_BOX___SET_VC_ENTITY_CONTRACT__VCENTITY = VCONTRACT_CONDITION___SET_VC_ENTITY_CONTRACT__VCENTITY;

	/**
	 * The number of operations of the '<em>VContract Loop Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VCONTRACT_LOOP_BOX_OPERATION_COUNT = VCONTRACT_CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>Rectangle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getRectangle()
	 * @generated
	 */
	int RECTANGLE = 29;

	/**
	 * The meta object id for the '<em>Absolute Bendpoint</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.AbsoluteBendpoint
	 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getAbsoluteBendpoint()
	 * @generated
	 */
	int ABSOLUTE_BENDPOINT = 28;

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.UMLClassDiagram <em>UML Class Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Class Diagram</em>'.
	 * @see com.abdulaziz.ms.OCV.UMLClassDiagram
	 * @generated
	 */
	EClass getUMLClassDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link com.abdulaziz.ms.OCV.UMLClassDiagram#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Classes</em>'.
	 * @see com.abdulaziz.ms.OCV.UMLClassDiagram#getClasses()
	 * @see #getUMLClassDiagram()
	 * @generated
	 */
	EReference getUMLClassDiagram_Classes();

	/**
	 * Returns the meta object for the containment reference list '{@link com.abdulaziz.ms.OCV.UMLClassDiagram#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see com.abdulaziz.ms.OCV.UMLClassDiagram#getLinks()
	 * @see #getUMLClassDiagram()
	 * @generated
	 */
	EReference getUMLClassDiagram_Links();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.UMLClassDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.abdulaziz.ms.OCV.UMLClassDiagram#getName()
	 * @see #getUMLClassDiagram()
	 * @generated
	 */
	EAttribute getUMLClassDiagram_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.abdulaziz.ms.OCV.UMLClassDiagram#getSystemOperation <em>System Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System Operation</em>'.
	 * @see com.abdulaziz.ms.OCV.UMLClassDiagram#getSystemOperation()
	 * @see #getUMLClassDiagram()
	 * @generated
	 */
	EReference getUMLClassDiagram_SystemOperation();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.UMLClass <em>UML Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Class</em>'.
	 * @see com.abdulaziz.ms.OCV.UMLClass
	 * @generated
	 */
	EClass getUMLClass();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.UMLClass#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints</em>'.
	 * @see com.abdulaziz.ms.OCV.UMLClass#getConstraints()
	 * @see #getUMLClass()
	 * @generated
	 */
	EAttribute getUMLClass_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link com.abdulaziz.ms.OCV.UMLClass#getClassAttributes <em>Class Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class Attributes</em>'.
	 * @see com.abdulaziz.ms.OCV.UMLClass#getClassAttributes()
	 * @see #getUMLClass()
	 * @generated
	 */
	EReference getUMLClass_ClassAttributes();

	/**
	 * Returns the meta object for the container reference '{@link com.abdulaziz.ms.OCV.UMLClass#getUmlDiagram <em>Uml Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Uml Diagram</em>'.
	 * @see com.abdulaziz.ms.OCV.UMLClass#getUmlDiagram()
	 * @see #getUMLClass()
	 * @generated
	 */
	EReference getUMLClass_UmlDiagram();

	/**
	 * Returns the meta object for the reference list '{@link com.abdulaziz.ms.OCV.UMLClass#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Links</em>'.
	 * @see com.abdulaziz.ms.OCV.UMLClass#getIncomingLinks()
	 * @see #getUMLClass()
	 * @generated
	 */
	EReference getUMLClass_IncomingLinks();

	/**
	 * Returns the meta object for the reference list '{@link com.abdulaziz.ms.OCV.UMLClass#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Links</em>'.
	 * @see com.abdulaziz.ms.OCV.UMLClass#getOutgoingLinks()
	 * @see #getUMLClass()
	 * @generated
	 */
	EReference getUMLClass_OutgoingLinks();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.UMLClass#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see com.abdulaziz.ms.OCV.UMLClass#getClassName()
	 * @see #getUMLClass()
	 * @generated
	 */
	EAttribute getUMLClass_ClassName();

	/**
	 * Returns the meta object for the reference list '{@link com.abdulaziz.ms.OCV.UMLClass#getVCInstances <em>VC Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>VC Instances</em>'.
	 * @see com.abdulaziz.ms.OCV.UMLClass#getVCInstances()
	 * @see #getUMLClass()
	 * @generated
	 */
	EReference getUMLClass_VCInstances();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.UMLVariable <em>UML Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Variable</em>'.
	 * @see com.abdulaziz.ms.OCV.UMLVariable
	 * @generated
	 */
	EClass getUMLVariable();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.UMLVariable#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see com.abdulaziz.ms.OCV.UMLVariable#getVariableName()
	 * @see #getUMLVariable()
	 * @generated
	 */
	EAttribute getUMLVariable_VariableName();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.UMLVariable#getVariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Type</em>'.
	 * @see com.abdulaziz.ms.OCV.UMLVariable#getVariableType()
	 * @see #getUMLVariable()
	 * @generated
	 */
	EAttribute getUMLVariable_VariableType();

	/**
	 * Returns the meta object for the container reference '{@link com.abdulaziz.ms.OCV.UMLVariable#getUmlClass <em>Uml Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Uml Class</em>'.
	 * @see com.abdulaziz.ms.OCV.UMLVariable#getUmlClass()
	 * @see #getUMLVariable()
	 * @generated
	 */
	EReference getUMLVariable_UmlClass();

	/**
	 * Returns the meta object for the container reference '{@link com.abdulaziz.ms.OCV.UMLVariable#getVOperation <em>VOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>VOperation</em>'.
	 * @see com.abdulaziz.ms.OCV.UMLVariable#getVOperation()
	 * @see #getUMLVariable()
	 * @generated
	 */
	EReference getUMLVariable_VOperation();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.UMLLink <em>UML Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UML Link</em>'.
	 * @see com.abdulaziz.ms.OCV.UMLLink
	 * @generated
	 */
	EClass getUMLLink();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.UMLLink#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.abdulaziz.ms.OCV.UMLLink#getType()
	 * @see #getUMLLink()
	 * @generated
	 */
	EAttribute getUMLLink_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.UMLLink#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.abdulaziz.ms.OCV.UMLLink#getName()
	 * @see #getUMLLink()
	 * @generated
	 */
	EAttribute getUMLLink_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.UMLLink#getSourceMutiplicity <em>Source Mutiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Mutiplicity</em>'.
	 * @see com.abdulaziz.ms.OCV.UMLLink#getSourceMutiplicity()
	 * @see #getUMLLink()
	 * @generated
	 */
	EAttribute getUMLLink_SourceMutiplicity();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.UMLLink#getTargetMutiplicity <em>Target Mutiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Mutiplicity</em>'.
	 * @see com.abdulaziz.ms.OCV.UMLLink#getTargetMutiplicity()
	 * @see #getUMLLink()
	 * @generated
	 */
	EAttribute getUMLLink_TargetMutiplicity();

	/**
	 * Returns the meta object for the reference '{@link com.abdulaziz.ms.OCV.UMLLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see com.abdulaziz.ms.OCV.UMLLink#getSource()
	 * @see #getUMLLink()
	 * @generated
	 */
	EReference getUMLLink_Source();

	/**
	 * Returns the meta object for the reference '{@link com.abdulaziz.ms.OCV.UMLLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.abdulaziz.ms.OCV.UMLLink#getTarget()
	 * @see #getUMLLink()
	 * @generated
	 */
	EReference getUMLLink_Target();

	/**
	 * Returns the meta object for the container reference '{@link com.abdulaziz.ms.OCV.UMLLink#getUmlDiagram <em>Uml Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Uml Diagram</em>'.
	 * @see com.abdulaziz.ms.OCV.UMLLink#getUmlDiagram()
	 * @see #getUMLLink()
	 * @generated
	 */
	EReference getUMLLink_UmlDiagram();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.VSystemOperationDiagram <em>VSystem Operation Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VSystem Operation Diagram</em>'.
	 * @see com.abdulaziz.ms.OCV.VSystemOperationDiagram
	 * @generated
	 */
	EClass getVSystemOperationDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link com.abdulaziz.ms.OCV.VSystemOperationDiagram#getClassOperations <em>Class Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class Operations</em>'.
	 * @see com.abdulaziz.ms.OCV.VSystemOperationDiagram#getClassOperations()
	 * @see #getVSystemOperationDiagram()
	 * @generated
	 */
	EReference getVSystemOperationDiagram_ClassOperations();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.VSystemOperationDiagram#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints</em>'.
	 * @see com.abdulaziz.ms.OCV.VSystemOperationDiagram#getConstraints()
	 * @see #getVSystemOperationDiagram()
	 * @generated
	 */
	EAttribute getVSystemOperationDiagram_Constraints();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.VSystemOperationDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.abdulaziz.ms.OCV.VSystemOperationDiagram#getName()
	 * @see #getVSystemOperationDiagram()
	 * @generated
	 */
	EAttribute getVSystemOperationDiagram_Name();

	/**
	 * Returns the meta object for the container reference '{@link com.abdulaziz.ms.OCV.VSystemOperationDiagram#getUmlDiagram <em>Uml Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Uml Diagram</em>'.
	 * @see com.abdulaziz.ms.OCV.VSystemOperationDiagram#getUmlDiagram()
	 * @see #getVSystemOperationDiagram()
	 * @generated
	 */
	EReference getVSystemOperationDiagram_UmlDiagram();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.VOperation <em>VOperation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VOperation</em>'.
	 * @see com.abdulaziz.ms.OCV.VOperation
	 * @generated
	 */
	EClass getVOperation();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.VOperation#getOperationName <em>Operation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Name</em>'.
	 * @see com.abdulaziz.ms.OCV.VOperation#getOperationName()
	 * @see #getVOperation()
	 * @generated
	 */
	EAttribute getVOperation_OperationName();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.VOperation#getOperationReturnType <em>Operation Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation Return Type</em>'.
	 * @see com.abdulaziz.ms.OCV.VOperation#getOperationReturnType()
	 * @see #getVOperation()
	 * @generated
	 */
	EAttribute getVOperation_OperationReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link com.abdulaziz.ms.OCV.VOperation#getOperationParameters <em>Operation Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation Parameters</em>'.
	 * @see com.abdulaziz.ms.OCV.VOperation#getOperationParameters()
	 * @see #getVOperation()
	 * @generated
	 */
	EReference getVOperation_OperationParameters();

	/**
	 * Returns the meta object for the reference '{@link com.abdulaziz.ms.OCV.VOperation#getVSystem <em>VSystem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>VSystem</em>'.
	 * @see com.abdulaziz.ms.OCV.VOperation#getVSystem()
	 * @see #getVOperation()
	 * @generated
	 */
	EReference getVOperation_VSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link com.abdulaziz.ms.OCV.VOperation#getVcContract <em>Vc Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vc Contract</em>'.
	 * @see com.abdulaziz.ms.OCV.VOperation#getVcContract()
	 * @see #getVOperation()
	 * @generated
	 */
	EReference getVOperation_VcContract();

	/**
	 * Returns the meta object for the reference list '{@link com.abdulaziz.ms.OCV.VOperation#getVcContractCollection <em>Vc Contract Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vc Contract Collection</em>'.
	 * @see com.abdulaziz.ms.OCV.VOperation#getVcContractCollection()
	 * @see #getVOperation()
	 * @generated
	 */
	EReference getVOperation_VcContractCollection();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.VCContract <em>VC Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VC Contract</em>'.
	 * @see com.abdulaziz.ms.OCV.VCContract
	 * @generated
	 */
	EClass getVCContract();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.VCContract#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.abdulaziz.ms.OCV.VCContract#getName()
	 * @see #getVCContract()
	 * @generated
	 */
	EAttribute getVCContract_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.VCContract#getPageIndex <em>Page Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Index</em>'.
	 * @see com.abdulaziz.ms.OCV.VCContract#getPageIndex()
	 * @see #getVCContract()
	 * @generated
	 */
	EAttribute getVCContract_PageIndex();

	/**
	 * Returns the meta object for the containment reference '{@link com.abdulaziz.ms.OCV.VCContract#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Precondition</em>'.
	 * @see com.abdulaziz.ms.OCV.VCContract#getPrecondition()
	 * @see #getVCContract()
	 * @generated
	 */
	EReference getVCContract_Precondition();

	/**
	 * Returns the meta object for the containment reference '{@link com.abdulaziz.ms.OCV.VCContract#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Postcondition</em>'.
	 * @see com.abdulaziz.ms.OCV.VCContract#getPostcondition()
	 * @see #getVCContract()
	 * @generated
	 */
	EReference getVCContract_Postcondition();

	/**
	 * Returns the meta object for the container reference '{@link com.abdulaziz.ms.OCV.VCContract#getUmlOperation <em>Uml Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Uml Operation</em>'.
	 * @see com.abdulaziz.ms.OCV.VCContract#getUmlOperation()
	 * @see #getVCContract()
	 * @generated
	 */
	EReference getVCContract_UmlOperation();

	/**
	 * Returns the meta object for the containment reference list '{@link com.abdulaziz.ms.OCV.VCContract#getVcLinks <em>Vc Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vc Links</em>'.
	 * @see com.abdulaziz.ms.OCV.VCContract#getVcLinks()
	 * @see #getVCContract()
	 * @generated
	 */
	EReference getVCContract_VcLinks();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.VContractCondition <em>VContract Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VContract Condition</em>'.
	 * @see com.abdulaziz.ms.OCV.VContractCondition
	 * @generated
	 */
	EClass getVContractCondition();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.VContractCondition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.abdulaziz.ms.OCV.VContractCondition#getType()
	 * @see #getVContractCondition()
	 * @generated
	 */
	EAttribute getVContractCondition_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.VContractCondition#getConstaint <em>Constaint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constaint</em>'.
	 * @see com.abdulaziz.ms.OCV.VContractCondition#getConstaint()
	 * @see #getVContractCondition()
	 * @generated
	 */
	EAttribute getVContractCondition_Constaint();

	/**
	 * Returns the meta object for the containment reference list '{@link com.abdulaziz.ms.OCV.VContractCondition#getVcEntities <em>Vc Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vc Entities</em>'.
	 * @see com.abdulaziz.ms.OCV.VContractCondition#getVcEntities()
	 * @see #getVContractCondition()
	 * @generated
	 */
	EReference getVContractCondition_VcEntities();

	/**
	 * Returns the meta object for the '{@link com.abdulaziz.ms.OCV.VContractCondition#setVCEntityContract(com.abdulaziz.ms.OCV.VCEntity) <em>Set VC Entity Contract</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set VC Entity Contract</em>' operation.
	 * @see com.abdulaziz.ms.OCV.VContractCondition#setVCEntityContract(com.abdulaziz.ms.OCV.VCEntity)
	 * @generated
	 */
	EOperation getVContractCondition__SetVCEntityContract__VCEntity();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.VContractPrecondition <em>VContract Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VContract Precondition</em>'.
	 * @see com.abdulaziz.ms.OCV.VContractPrecondition
	 * @generated
	 */
	EClass getVContractPrecondition();

	/**
	 * Returns the meta object for the container reference '{@link com.abdulaziz.ms.OCV.VContractPrecondition#getVcContract <em>Vc Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Vc Contract</em>'.
	 * @see com.abdulaziz.ms.OCV.VContractPrecondition#getVcContract()
	 * @see #getVContractPrecondition()
	 * @generated
	 */
	EReference getVContractPrecondition_VcContract();

	/**
	 * Returns the meta object for the '{@link com.abdulaziz.ms.OCV.VContractPrecondition#getVContractCondition() <em>Get VContract Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get VContract Condition</em>' operation.
	 * @see com.abdulaziz.ms.OCV.VContractPrecondition#getVContractCondition()
	 * @generated
	 */
	EOperation getVContractPrecondition__GetVContractCondition();

	/**
	 * Returns the meta object for the '{@link com.abdulaziz.ms.OCV.VContractPrecondition#setVCEntityContract(com.abdulaziz.ms.OCV.VCEntity) <em>Set VC Entity Contract</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set VC Entity Contract</em>' operation.
	 * @see com.abdulaziz.ms.OCV.VContractPrecondition#setVCEntityContract(com.abdulaziz.ms.OCV.VCEntity)
	 * @generated
	 */
	EOperation getVContractPrecondition__SetVCEntityContract__VCEntity();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.VContractPostcondition <em>VContract Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VContract Postcondition</em>'.
	 * @see com.abdulaziz.ms.OCV.VContractPostcondition
	 * @generated
	 */
	EClass getVContractPostcondition();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.VContractPostcondition#isVCReturnIncluded <em>VC Return Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VC Return Included</em>'.
	 * @see com.abdulaziz.ms.OCV.VContractPostcondition#isVCReturnIncluded()
	 * @see #getVContractPostcondition()
	 * @generated
	 */
	EAttribute getVContractPostcondition_VCReturnIncluded();

	/**
	 * Returns the meta object for the container reference '{@link com.abdulaziz.ms.OCV.VContractPostcondition#getVcContract <em>Vc Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Vc Contract</em>'.
	 * @see com.abdulaziz.ms.OCV.VContractPostcondition#getVcContract()
	 * @see #getVContractPostcondition()
	 * @generated
	 */
	EReference getVContractPostcondition_VcContract();

	/**
	 * Returns the meta object for the '{@link com.abdulaziz.ms.OCV.VContractPostcondition#getVContractCondition() <em>Get VContract Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get VContract Condition</em>' operation.
	 * @see com.abdulaziz.ms.OCV.VContractPostcondition#getVContractCondition()
	 * @generated
	 */
	EOperation getVContractPostcondition__GetVContractCondition();

	/**
	 * Returns the meta object for the '{@link com.abdulaziz.ms.OCV.VContractPostcondition#setVCEntityContract(com.abdulaziz.ms.OCV.VCEntity) <em>Set VC Entity Contract</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set VC Entity Contract</em>' operation.
	 * @see com.abdulaziz.ms.OCV.VContractPostcondition#setVCEntityContract(com.abdulaziz.ms.OCV.VCEntity)
	 * @generated
	 */
	EOperation getVContractPostcondition__SetVCEntityContract__VCEntity();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.VCLink <em>VC Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VC Link</em>'.
	 * @see com.abdulaziz.ms.OCV.VCLink
	 * @generated
	 */
	EClass getVCLink();

	/**
	 * Returns the meta object for the reference '{@link com.abdulaziz.ms.OCV.VCLink#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see com.abdulaziz.ms.OCV.VCLink#getSource()
	 * @see #getVCLink()
	 * @generated
	 */
	EReference getVCLink_Source();

	/**
	 * Returns the meta object for the reference '{@link com.abdulaziz.ms.OCV.VCLink#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see com.abdulaziz.ms.OCV.VCLink#getTarget()
	 * @see #getVCLink()
	 * @generated
	 */
	EReference getVCLink_Target();

	/**
	 * Returns the meta object for the attribute list '{@link com.abdulaziz.ms.OCV.VCLink#getBendpoints <em>Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bendpoints</em>'.
	 * @see com.abdulaziz.ms.OCV.VCLink#getBendpoints()
	 * @see #getVCLink()
	 * @generated
	 */
	EAttribute getVCLink_Bendpoints();

	/**
	 * Returns the meta object for the container reference '{@link com.abdulaziz.ms.OCV.VCLink#getVcContract <em>Vc Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Vc Contract</em>'.
	 * @see com.abdulaziz.ms.OCV.VCLink#getVcContract()
	 * @see #getVCLink()
	 * @generated
	 */
	EReference getVCLink_VcContract();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.VCLinkPrePostCondition <em>VC Link Pre Post Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VC Link Pre Post Condition</em>'.
	 * @see com.abdulaziz.ms.OCV.VCLinkPrePostCondition
	 * @generated
	 */
	EClass getVCLinkPrePostCondition();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.VCEntity <em>VC Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VC Entity</em>'.
	 * @see com.abdulaziz.ms.OCV.VCEntity
	 * @generated
	 */
	EClass getVCEntity();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.VCEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.abdulaziz.ms.OCV.VCEntity#getName()
	 * @see #getVCEntity()
	 * @generated
	 */
	EAttribute getVCEntity_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.abdulaziz.ms.OCV.VCEntity#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Links</em>'.
	 * @see com.abdulaziz.ms.OCV.VCEntity#getIncomingLinks()
	 * @see #getVCEntity()
	 * @generated
	 */
	EReference getVCEntity_IncomingLinks();

	/**
	 * Returns the meta object for the reference list '{@link com.abdulaziz.ms.OCV.VCEntity#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Links</em>'.
	 * @see com.abdulaziz.ms.OCV.VCEntity#getOutgoingLinks()
	 * @see #getVCEntity()
	 * @generated
	 */
	EReference getVCEntity_OutgoingLinks();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.VCEntity#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints</em>'.
	 * @see com.abdulaziz.ms.OCV.VCEntity#getConstraints()
	 * @see #getVCEntity()
	 * @generated
	 */
	EAttribute getVCEntity_Constraints();

	/**
	 * Returns the meta object for the reference '{@link com.abdulaziz.ms.OCV.VCEntity#getVcContract <em>Vc Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vc Contract</em>'.
	 * @see com.abdulaziz.ms.OCV.VCEntity#getVcContract()
	 * @see #getVCEntity()
	 * @generated
	 */
	EReference getVCEntity_VcContract();

	/**
	 * Returns the meta object for the reference '{@link com.abdulaziz.ms.OCV.VCEntity#getPrecondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Precondition</em>'.
	 * @see com.abdulaziz.ms.OCV.VCEntity#getPrecondition()
	 * @see #getVCEntity()
	 * @generated
	 */
	EReference getVCEntity_Precondition();

	/**
	 * Returns the meta object for the reference '{@link com.abdulaziz.ms.OCV.VCEntity#getPostcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Postcondition</em>'.
	 * @see com.abdulaziz.ms.OCV.VCEntity#getPostcondition()
	 * @see #getVCEntity()
	 * @generated
	 */
	EReference getVCEntity_Postcondition();

	/**
	 * Returns the meta object for the '{@link com.abdulaziz.ms.OCV.VCEntity#setVContractCondition(com.abdulaziz.ms.OCV.VContractCondition) <em>Set VContract Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set VContract Condition</em>' operation.
	 * @see com.abdulaziz.ms.OCV.VCEntity#setVContractCondition(com.abdulaziz.ms.OCV.VContractCondition)
	 * @generated
	 */
	EOperation getVCEntity__SetVContractCondition__VContractCondition();

	/**
	 * Returns the meta object for the '{@link com.abdulaziz.ms.OCV.VCEntity#getContractCondition() <em>Get Contract Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contract Condition</em>' operation.
	 * @see com.abdulaziz.ms.OCV.VCEntity#getContractCondition()
	 * @generated
	 */
	EOperation getVCEntity__GetContractCondition();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.VCValue <em>VC Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VC Value</em>'.
	 * @see com.abdulaziz.ms.OCV.VCValue
	 * @generated
	 */
	EClass getVCValue();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.VCValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.abdulaziz.ms.OCV.VCValue#getValue()
	 * @see #getVCValue()
	 * @generated
	 */
	EAttribute getVCValue_Value();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.VCEquality <em>VC Equality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VC Equality</em>'.
	 * @see com.abdulaziz.ms.OCV.VCEquality
	 * @generated
	 */
	EClass getVCEquality();

	/**
	 * Returns the meta object for the reference '{@link com.abdulaziz.ms.OCV.VCEquality#getSouceVCEntity <em>Souce VC Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Souce VC Entity</em>'.
	 * @see com.abdulaziz.ms.OCV.VCEquality#getSouceVCEntity()
	 * @see #getVCEquality()
	 * @generated
	 */
	EReference getVCEquality_SouceVCEntity();

	/**
	 * Returns the meta object for the reference '{@link com.abdulaziz.ms.OCV.VCEquality#getTargetValue <em>Target Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Value</em>'.
	 * @see com.abdulaziz.ms.OCV.VCEquality#getTargetValue()
	 * @see #getVCEquality()
	 * @generated
	 */
	EReference getVCEquality_TargetValue();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.VCEquality#getMeaning <em>Meaning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meaning</em>'.
	 * @see com.abdulaziz.ms.OCV.VCEquality#getMeaning()
	 * @see #getVCEquality()
	 * @generated
	 */
	EAttribute getVCEquality_Meaning();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.VCEquality#getDisplyedText <em>Displyed Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Displyed Text</em>'.
	 * @see com.abdulaziz.ms.OCV.VCEquality#getDisplyedText()
	 * @see #getVCEquality()
	 * @generated
	 */
	EAttribute getVCEquality_DisplyedText();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.VCEquality#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see com.abdulaziz.ms.OCV.VCEquality#getNotes()
	 * @see #getVCEquality()
	 * @generated
	 */
	EAttribute getVCEquality_Notes();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.VCInstance <em>VC Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VC Instance</em>'.
	 * @see com.abdulaziz.ms.OCV.VCInstance
	 * @generated
	 */
	EClass getVCInstance();

	/**
	 * Returns the meta object for the reference '{@link com.abdulaziz.ms.OCV.VCInstance#getUmlClass <em>Uml Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uml Class</em>'.
	 * @see com.abdulaziz.ms.OCV.VCInstance#getUmlClass()
	 * @see #getVCInstance()
	 * @generated
	 */
	EReference getVCInstance_UmlClass();

	/**
	 * Returns the meta object for the reference list '{@link com.abdulaziz.ms.OCV.VCInstance#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fields</em>'.
	 * @see com.abdulaziz.ms.OCV.VCInstance#getFields()
	 * @see #getVCInstance()
	 * @generated
	 */
	EReference getVCInstance_Fields();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.VCInstance#getInstanceName <em>Instance Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Name</em>'.
	 * @see com.abdulaziz.ms.OCV.VCInstance#getInstanceName()
	 * @see #getVCInstance()
	 * @generated
	 */
	EAttribute getVCInstance_InstanceName();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.VCInstance#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.abdulaziz.ms.OCV.VCInstance#getType()
	 * @see #getVCInstance()
	 * @generated
	 */
	EAttribute getVCInstance_Type();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.VCInstance#getIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see com.abdulaziz.ms.OCV.VCInstance#getIdentifier()
	 * @see #getVCInstance()
	 * @generated
	 */
	EAttribute getVCInstance_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.VCInstance#getNotes <em>Notes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Notes</em>'.
	 * @see com.abdulaziz.ms.OCV.VCInstance#getNotes()
	 * @see #getVCInstance()
	 * @generated
	 */
	EAttribute getVCInstance_Notes();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.VCInstanceField <em>VC Instance Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VC Instance Field</em>'.
	 * @see com.abdulaziz.ms.OCV.VCInstanceField
	 * @generated
	 */
	EClass getVCInstanceField();

	/**
	 * Returns the meta object for the reference '{@link com.abdulaziz.ms.OCV.VCInstanceField#getVCInstance <em>VC Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>VC Instance</em>'.
	 * @see com.abdulaziz.ms.OCV.VCInstanceField#getVCInstance()
	 * @see #getVCInstanceField()
	 * @generated
	 */
	EReference getVCInstanceField_VCInstance();

	/**
	 * Returns the meta object for the reference '{@link com.abdulaziz.ms.OCV.VCInstanceField#getUmlClassField <em>Uml Class Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uml Class Field</em>'.
	 * @see com.abdulaziz.ms.OCV.VCInstanceField#getUmlClassField()
	 * @see #getVCInstanceField()
	 * @generated
	 */
	EReference getVCInstanceField_UmlClassField();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.VCAssociation <em>VC Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VC Association</em>'.
	 * @see com.abdulaziz.ms.OCV.VCAssociation
	 * @generated
	 */
	EClass getVCAssociation();

	/**
	 * Returns the meta object for the reference '{@link com.abdulaziz.ms.OCV.VCAssociation#getFirstInstance <em>First Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Instance</em>'.
	 * @see com.abdulaziz.ms.OCV.VCAssociation#getFirstInstance()
	 * @see #getVCAssociation()
	 * @generated
	 */
	EReference getVCAssociation_FirstInstance();

	/**
	 * Returns the meta object for the reference '{@link com.abdulaziz.ms.OCV.VCAssociation#getSecondInstance <em>Second Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second Instance</em>'.
	 * @see com.abdulaziz.ms.OCV.VCAssociation#getSecondInstance()
	 * @see #getVCAssociation()
	 * @generated
	 */
	EReference getVCAssociation_SecondInstance();

	/**
	 * Returns the meta object for the reference '{@link com.abdulaziz.ms.OCV.VCAssociation#getFirstInstanceVariable <em>First Instance Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>First Instance Variable</em>'.
	 * @see com.abdulaziz.ms.OCV.VCAssociation#getFirstInstanceVariable()
	 * @see #getVCAssociation()
	 * @generated
	 */
	EReference getVCAssociation_FirstInstanceVariable();

	/**
	 * Returns the meta object for the reference '{@link com.abdulaziz.ms.OCV.VCAssociation#getSecondInstanceVariable <em>Second Instance Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Second Instance Variable</em>'.
	 * @see com.abdulaziz.ms.OCV.VCAssociation#getSecondInstanceVariable()
	 * @see #getVCAssociation()
	 * @generated
	 */
	EReference getVCAssociation_SecondInstanceVariable();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.VCParameter <em>VC Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VC Parameter</em>'.
	 * @see com.abdulaziz.ms.OCV.VCParameter
	 * @generated
	 */
	EClass getVCParameter();

	/**
	 * Returns the meta object for the reference '{@link com.abdulaziz.ms.OCV.VCParameter#getVCInstance <em>VC Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>VC Instance</em>'.
	 * @see com.abdulaziz.ms.OCV.VCParameter#getVCInstance()
	 * @see #getVCParameter()
	 * @generated
	 */
	EReference getVCParameter_VCInstance();

	/**
	 * Returns the meta object for the reference '{@link com.abdulaziz.ms.OCV.VCParameter#getOperationParameter <em>Operation Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Parameter</em>'.
	 * @see com.abdulaziz.ms.OCV.VCParameter#getOperationParameter()
	 * @see #getVCParameter()
	 * @generated
	 */
	EReference getVCParameter_OperationParameter();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.VCOperationBox <em>VC Operation Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VC Operation Box</em>'.
	 * @see com.abdulaziz.ms.OCV.VCOperationBox
	 * @generated
	 */
	EClass getVCOperationBox();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.VCOperationBox#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.abdulaziz.ms.OCV.VCOperationBox#getValue()
	 * @see #getVCOperationBox()
	 * @generated
	 */
	EAttribute getVCOperationBox_Value();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.VCReturn <em>VC Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VC Return</em>'.
	 * @see com.abdulaziz.ms.OCV.VCReturn
	 * @generated
	 */
	EClass getVCReturn();

	/**
	 * Returns the meta object for the reference '{@link com.abdulaziz.ms.OCV.VCReturn#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see com.abdulaziz.ms.OCV.VCReturn#getValue()
	 * @see #getVCReturn()
	 * @generated
	 */
	EReference getVCReturn_Value();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.VCAlternativeBox <em>VC Alternative Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VC Alternative Box</em>'.
	 * @see com.abdulaziz.ms.OCV.VCAlternativeBox
	 * @generated
	 */
	EClass getVCAlternativeBox();

	/**
	 * Returns the meta object for the containment reference list '{@link com.abdulaziz.ms.OCV.VCAlternativeBox#getConditinOptions <em>Conditin Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditin Options</em>'.
	 * @see com.abdulaziz.ms.OCV.VCAlternativeBox#getConditinOptions()
	 * @see #getVCAlternativeBox()
	 * @generated
	 */
	EReference getVCAlternativeBox_ConditinOptions();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.VCCollectionBox <em>VC Collection Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VC Collection Box</em>'.
	 * @see com.abdulaziz.ms.OCV.VCCollectionBox
	 * @generated
	 */
	EClass getVCCollectionBox();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.VCCollectionBox#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see com.abdulaziz.ms.OCV.VCCollectionBox#getType()
	 * @see #getVCCollectionBox()
	 * @generated
	 */
	EAttribute getVCCollectionBox_Type();

	/**
	 * Returns the meta object for the containment reference '{@link com.abdulaziz.ms.OCV.VCCollectionBox#getVContractCollectionBox <em>VContract Collection Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>VContract Collection Box</em>'.
	 * @see com.abdulaziz.ms.OCV.VCCollectionBox#getVContractCollectionBox()
	 * @see #getVCCollectionBox()
	 * @generated
	 */
	EReference getVCCollectionBox_VContractCollectionBox();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.VCLoop <em>VC Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VC Loop</em>'.
	 * @see com.abdulaziz.ms.OCV.VCLoop
	 * @generated
	 */
	EClass getVCLoop();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.VCLoop#getIteration <em>Iteration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iteration</em>'.
	 * @see com.abdulaziz.ms.OCV.VCLoop#getIteration()
	 * @see #getVCLoop()
	 * @generated
	 */
	EAttribute getVCLoop_Iteration();

	/**
	 * Returns the meta object for the containment reference '{@link com.abdulaziz.ms.OCV.VCLoop#getVcContractLoopBox <em>Vc Contract Loop Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vc Contract Loop Box</em>'.
	 * @see com.abdulaziz.ms.OCV.VCLoop#getVcContractLoopBox()
	 * @see #getVCLoop()
	 * @generated
	 */
	EReference getVCLoop_VcContractLoopBox();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.ConditionOption <em>Condition Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Option</em>'.
	 * @see com.abdulaziz.ms.OCV.ConditionOption
	 * @generated
	 */
	EClass getConditionOption();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.ConditionOption#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.abdulaziz.ms.OCV.ConditionOption#getName()
	 * @see #getConditionOption()
	 * @generated
	 */
	EAttribute getConditionOption_Name();

	/**
	 * Returns the meta object for the containment reference '{@link com.abdulaziz.ms.OCV.ConditionOption#getVcContractAlternativeBox <em>Vc Contract Alternative Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vc Contract Alternative Box</em>'.
	 * @see com.abdulaziz.ms.OCV.ConditionOption#getVcContractAlternativeBox()
	 * @see #getConditionOption()
	 * @generated
	 */
	EReference getConditionOption_VcContractAlternativeBox();

	/**
	 * Returns the meta object for the container reference '{@link com.abdulaziz.ms.OCV.ConditionOption#getVcAlternativeBox <em>Vc Alternative Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Vc Alternative Box</em>'.
	 * @see com.abdulaziz.ms.OCV.ConditionOption#getVcAlternativeBox()
	 * @see #getConditionOption()
	 * @generated
	 */
	EReference getConditionOption_VcAlternativeBox();

	/**
	 * Returns the meta object for the reference '{@link com.abdulaziz.ms.OCV.ConditionOption#getVcEntityReference <em>Vc Entity Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vc Entity Reference</em>'.
	 * @see com.abdulaziz.ms.OCV.ConditionOption#getVcEntityReference()
	 * @see #getConditionOption()
	 * @generated
	 */
	EReference getConditionOption_VcEntityReference();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.ConditionOption#getDisplayedConditionStatement <em>Displayed Condition Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Displayed Condition Statement</em>'.
	 * @see com.abdulaziz.ms.OCV.ConditionOption#getDisplayedConditionStatement()
	 * @see #getConditionOption()
	 * @generated
	 */
	EAttribute getConditionOption_DisplayedConditionStatement();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.ConditionOption#getConditionValue <em>Condition Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Value</em>'.
	 * @see com.abdulaziz.ms.OCV.ConditionOption#getConditionValue()
	 * @see #getConditionOption()
	 * @generated
	 */
	EAttribute getConditionOption_ConditionValue();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.ConditionOption#getMeaningOfConditionStatement <em>Meaning Of Condition Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meaning Of Condition Statement</em>'.
	 * @see com.abdulaziz.ms.OCV.ConditionOption#getMeaningOfConditionStatement()
	 * @see #getConditionOption()
	 * @generated
	 */
	EAttribute getConditionOption_MeaningOfConditionStatement();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.VContractAlternativeBox <em>VContract Alternative Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VContract Alternative Box</em>'.
	 * @see com.abdulaziz.ms.OCV.VContractAlternativeBox
	 * @generated
	 */
	EClass getVContractAlternativeBox();

	/**
	 * Returns the meta object for the attribute '{@link com.abdulaziz.ms.OCV.VContractAlternativeBox#isVCReturnIncluded <em>VC Return Included</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>VC Return Included</em>'.
	 * @see com.abdulaziz.ms.OCV.VContractAlternativeBox#isVCReturnIncluded()
	 * @see #getVContractAlternativeBox()
	 * @generated
	 */
	EAttribute getVContractAlternativeBox_VCReturnIncluded();

	/**
	 * Returns the meta object for the reference '{@link com.abdulaziz.ms.OCV.VContractAlternativeBox#getVcContract <em>Vc Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vc Contract</em>'.
	 * @see com.abdulaziz.ms.OCV.VContractAlternativeBox#getVcContract()
	 * @see #getVContractAlternativeBox()
	 * @generated
	 */
	EReference getVContractAlternativeBox_VcContract();

	/**
	 * Returns the meta object for the container reference '{@link com.abdulaziz.ms.OCV.VContractAlternativeBox#getConditionOption <em>Condition Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Condition Option</em>'.
	 * @see com.abdulaziz.ms.OCV.VContractAlternativeBox#getConditionOption()
	 * @see #getVContractAlternativeBox()
	 * @generated
	 */
	EReference getVContractAlternativeBox_ConditionOption();

	/**
	 * Returns the meta object for the '{@link com.abdulaziz.ms.OCV.VContractAlternativeBox#getVContractCondition() <em>Get VContract Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get VContract Condition</em>' operation.
	 * @see com.abdulaziz.ms.OCV.VContractAlternativeBox#getVContractCondition()
	 * @generated
	 */
	EOperation getVContractAlternativeBox__GetVContractCondition();

	/**
	 * Returns the meta object for the '{@link com.abdulaziz.ms.OCV.VContractAlternativeBox#setVCEntityContract(com.abdulaziz.ms.OCV.VCEntity) <em>Set VC Entity Contract</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set VC Entity Contract</em>' operation.
	 * @see com.abdulaziz.ms.OCV.VContractAlternativeBox#setVCEntityContract(com.abdulaziz.ms.OCV.VCEntity)
	 * @generated
	 */
	EOperation getVContractAlternativeBox__SetVCEntityContract__VCEntity();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.VContractCollectionBox <em>VContract Collection Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VContract Collection Box</em>'.
	 * @see com.abdulaziz.ms.OCV.VContractCollectionBox
	 * @generated
	 */
	EClass getVContractCollectionBox();

	/**
	 * Returns the meta object for the container reference '{@link com.abdulaziz.ms.OCV.VContractCollectionBox#getVcCollectionBox <em>Vc Collection Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Vc Collection Box</em>'.
	 * @see com.abdulaziz.ms.OCV.VContractCollectionBox#getVcCollectionBox()
	 * @see #getVContractCollectionBox()
	 * @generated
	 */
	EReference getVContractCollectionBox_VcCollectionBox();

	/**
	 * Returns the meta object for class '{@link com.abdulaziz.ms.OCV.VContractLoopBox <em>VContract Loop Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VContract Loop Box</em>'.
	 * @see com.abdulaziz.ms.OCV.VContractLoopBox
	 * @generated
	 */
	EClass getVContractLoopBox();

	/**
	 * Returns the meta object for the container reference '{@link com.abdulaziz.ms.OCV.VContractLoopBox#getVcCollectionBox <em>Vc Collection Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Vc Collection Box</em>'.
	 * @see com.abdulaziz.ms.OCV.VContractLoopBox#getVcCollectionBox()
	 * @see #getVContractLoopBox()
	 * @generated
	 */
	EReference getVContractLoopBox_VcCollectionBox();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Rectangle <em>Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rectangle</em>'.
	 * @see org.eclipse.draw2d.geometry.Rectangle
	 * @model instanceClass="org.eclipse.draw2d.geometry.Rectangle"
	 * @generated
	 */
	EDataType getRectangle();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.AbsoluteBendpoint <em>Absolute Bendpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Absolute Bendpoint</em>'.
	 * @see org.eclipse.draw2d.AbsoluteBendpoint
	 * @model instanceClass="org.eclipse.draw2d.AbsoluteBendpoint"
	 * @generated
	 */
	EDataType getAbsoluteBendpoint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OCVFactory getOCVFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.UMLClassDiagramImpl <em>UML Class Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.UMLClassDiagramImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getUMLClassDiagram()
		 * @generated
		 */
		EClass UML_CLASS_DIAGRAM = eINSTANCE.getUMLClassDiagram();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_CLASS_DIAGRAM__CLASSES = eINSTANCE.getUMLClassDiagram_Classes();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_CLASS_DIAGRAM__LINKS = eINSTANCE.getUMLClassDiagram_Links();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_CLASS_DIAGRAM__NAME = eINSTANCE.getUMLClassDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>System Operation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_CLASS_DIAGRAM__SYSTEM_OPERATION = eINSTANCE.getUMLClassDiagram_SystemOperation();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.UMLClassImpl <em>UML Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.UMLClassImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getUMLClass()
		 * @generated
		 */
		EClass UML_CLASS = eINSTANCE.getUMLClass();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_CLASS__CONSTRAINTS = eINSTANCE.getUMLClass_Constraints();

		/**
		 * The meta object literal for the '<em><b>Class Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_CLASS__CLASS_ATTRIBUTES = eINSTANCE.getUMLClass_ClassAttributes();

		/**
		 * The meta object literal for the '<em><b>Uml Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_CLASS__UML_DIAGRAM = eINSTANCE.getUMLClass_UmlDiagram();

		/**
		 * The meta object literal for the '<em><b>Incoming Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_CLASS__INCOMING_LINKS = eINSTANCE.getUMLClass_IncomingLinks();

		/**
		 * The meta object literal for the '<em><b>Outgoing Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_CLASS__OUTGOING_LINKS = eINSTANCE.getUMLClass_OutgoingLinks();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_CLASS__CLASS_NAME = eINSTANCE.getUMLClass_ClassName();

		/**
		 * The meta object literal for the '<em><b>VC Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_CLASS__VC_INSTANCES = eINSTANCE.getUMLClass_VCInstances();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.UMLVariableImpl <em>UML Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.UMLVariableImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getUMLVariable()
		 * @generated
		 */
		EClass UML_VARIABLE = eINSTANCE.getUMLVariable();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_VARIABLE__VARIABLE_NAME = eINSTANCE.getUMLVariable_VariableName();

		/**
		 * The meta object literal for the '<em><b>Variable Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_VARIABLE__VARIABLE_TYPE = eINSTANCE.getUMLVariable_VariableType();

		/**
		 * The meta object literal for the '<em><b>Uml Class</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_VARIABLE__UML_CLASS = eINSTANCE.getUMLVariable_UmlClass();

		/**
		 * The meta object literal for the '<em><b>VOperation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_VARIABLE__VOPERATION = eINSTANCE.getUMLVariable_VOperation();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.UMLLinkImpl <em>UML Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.UMLLinkImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getUMLLink()
		 * @generated
		 */
		EClass UML_LINK = eINSTANCE.getUMLLink();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_LINK__TYPE = eINSTANCE.getUMLLink_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_LINK__NAME = eINSTANCE.getUMLLink_Name();

		/**
		 * The meta object literal for the '<em><b>Source Mutiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_LINK__SOURCE_MUTIPLICITY = eINSTANCE.getUMLLink_SourceMutiplicity();

		/**
		 * The meta object literal for the '<em><b>Target Mutiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UML_LINK__TARGET_MUTIPLICITY = eINSTANCE.getUMLLink_TargetMutiplicity();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_LINK__SOURCE = eINSTANCE.getUMLLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_LINK__TARGET = eINSTANCE.getUMLLink_Target();

		/**
		 * The meta object literal for the '<em><b>Uml Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UML_LINK__UML_DIAGRAM = eINSTANCE.getUMLLink_UmlDiagram();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.VSystemOperationDiagramImpl <em>VSystem Operation Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.VSystemOperationDiagramImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVSystemOperationDiagram()
		 * @generated
		 */
		EClass VSYSTEM_OPERATION_DIAGRAM = eINSTANCE.getVSystemOperationDiagram();

		/**
		 * The meta object literal for the '<em><b>Class Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSYSTEM_OPERATION_DIAGRAM__CLASS_OPERATIONS = eINSTANCE.getVSystemOperationDiagram_ClassOperations();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSYSTEM_OPERATION_DIAGRAM__CONSTRAINTS = eINSTANCE.getVSystemOperationDiagram_Constraints();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VSYSTEM_OPERATION_DIAGRAM__NAME = eINSTANCE.getVSystemOperationDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Uml Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VSYSTEM_OPERATION_DIAGRAM__UML_DIAGRAM = eINSTANCE.getVSystemOperationDiagram_UmlDiagram();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.VOperationImpl <em>VOperation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.VOperationImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVOperation()
		 * @generated
		 */
		EClass VOPERATION = eINSTANCE.getVOperation();

		/**
		 * The meta object literal for the '<em><b>Operation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOPERATION__OPERATION_NAME = eINSTANCE.getVOperation_OperationName();

		/**
		 * The meta object literal for the '<em><b>Operation Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VOPERATION__OPERATION_RETURN_TYPE = eINSTANCE.getVOperation_OperationReturnType();

		/**
		 * The meta object literal for the '<em><b>Operation Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOPERATION__OPERATION_PARAMETERS = eINSTANCE.getVOperation_OperationParameters();

		/**
		 * The meta object literal for the '<em><b>VSystem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOPERATION__VSYSTEM = eINSTANCE.getVOperation_VSystem();

		/**
		 * The meta object literal for the '<em><b>Vc Contract</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOPERATION__VC_CONTRACT = eINSTANCE.getVOperation_VcContract();

		/**
		 * The meta object literal for the '<em><b>Vc Contract Collection</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOPERATION__VC_CONTRACT_COLLECTION = eINSTANCE.getVOperation_VcContractCollection();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.VCContractImpl <em>VC Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.VCContractImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCContract()
		 * @generated
		 */
		EClass VC_CONTRACT = eINSTANCE.getVCContract();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VC_CONTRACT__NAME = eINSTANCE.getVCContract_Name();

		/**
		 * The meta object literal for the '<em><b>Page Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VC_CONTRACT__PAGE_INDEX = eINSTANCE.getVCContract_PageIndex();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_CONTRACT__PRECONDITION = eINSTANCE.getVCContract_Precondition();

		/**
		 * The meta object literal for the '<em><b>Postcondition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_CONTRACT__POSTCONDITION = eINSTANCE.getVCContract_Postcondition();

		/**
		 * The meta object literal for the '<em><b>Uml Operation</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_CONTRACT__UML_OPERATION = eINSTANCE.getVCContract_UmlOperation();

		/**
		 * The meta object literal for the '<em><b>Vc Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_CONTRACT__VC_LINKS = eINSTANCE.getVCContract_VcLinks();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.VContractConditionImpl <em>VContract Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.VContractConditionImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVContractCondition()
		 * @generated
		 */
		EClass VCONTRACT_CONDITION = eINSTANCE.getVContractCondition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCONTRACT_CONDITION__TYPE = eINSTANCE.getVContractCondition_Type();

		/**
		 * The meta object literal for the '<em><b>Constaint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCONTRACT_CONDITION__CONSTAINT = eINSTANCE.getVContractCondition_Constaint();

		/**
		 * The meta object literal for the '<em><b>Vc Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCONTRACT_CONDITION__VC_ENTITIES = eINSTANCE.getVContractCondition_VcEntities();

		/**
		 * The meta object literal for the '<em><b>Set VC Entity Contract</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VCONTRACT_CONDITION___SET_VC_ENTITY_CONTRACT__VCENTITY = eINSTANCE.getVContractCondition__SetVCEntityContract__VCEntity();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.VContractPreconditionImpl <em>VContract Precondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.VContractPreconditionImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVContractPrecondition()
		 * @generated
		 */
		EClass VCONTRACT_PRECONDITION = eINSTANCE.getVContractPrecondition();

		/**
		 * The meta object literal for the '<em><b>Vc Contract</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCONTRACT_PRECONDITION__VC_CONTRACT = eINSTANCE.getVContractPrecondition_VcContract();

		/**
		 * The meta object literal for the '<em><b>Get VContract Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VCONTRACT_PRECONDITION___GET_VCONTRACT_CONDITION = eINSTANCE.getVContractPrecondition__GetVContractCondition();

		/**
		 * The meta object literal for the '<em><b>Set VC Entity Contract</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VCONTRACT_PRECONDITION___SET_VC_ENTITY_CONTRACT__VCENTITY = eINSTANCE.getVContractPrecondition__SetVCEntityContract__VCEntity();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.VContractPostconditionImpl <em>VContract Postcondition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.VContractPostconditionImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVContractPostcondition()
		 * @generated
		 */
		EClass VCONTRACT_POSTCONDITION = eINSTANCE.getVContractPostcondition();

		/**
		 * The meta object literal for the '<em><b>VC Return Included</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCONTRACT_POSTCONDITION__VC_RETURN_INCLUDED = eINSTANCE.getVContractPostcondition_VCReturnIncluded();

		/**
		 * The meta object literal for the '<em><b>Vc Contract</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCONTRACT_POSTCONDITION__VC_CONTRACT = eINSTANCE.getVContractPostcondition_VcContract();

		/**
		 * The meta object literal for the '<em><b>Get VContract Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VCONTRACT_POSTCONDITION___GET_VCONTRACT_CONDITION = eINSTANCE.getVContractPostcondition__GetVContractCondition();

		/**
		 * The meta object literal for the '<em><b>Set VC Entity Contract</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VCONTRACT_POSTCONDITION___SET_VC_ENTITY_CONTRACT__VCENTITY = eINSTANCE.getVContractPostcondition__SetVCEntityContract__VCEntity();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.VCLinkImpl <em>VC Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.VCLinkImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCLink()
		 * @generated
		 */
		EClass VC_LINK = eINSTANCE.getVCLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_LINK__SOURCE = eINSTANCE.getVCLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_LINK__TARGET = eINSTANCE.getVCLink_Target();

		/**
		 * The meta object literal for the '<em><b>Bendpoints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VC_LINK__BENDPOINTS = eINSTANCE.getVCLink_Bendpoints();

		/**
		 * The meta object literal for the '<em><b>Vc Contract</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_LINK__VC_CONTRACT = eINSTANCE.getVCLink_VcContract();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.VCLinkPrePostConditionImpl <em>VC Link Pre Post Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.VCLinkPrePostConditionImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCLinkPrePostCondition()
		 * @generated
		 */
		EClass VC_LINK_PRE_POST_CONDITION = eINSTANCE.getVCLinkPrePostCondition();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.VCEntityImpl <em>VC Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.VCEntityImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCEntity()
		 * @generated
		 */
		EClass VC_ENTITY = eINSTANCE.getVCEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VC_ENTITY__NAME = eINSTANCE.getVCEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Incoming Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_ENTITY__INCOMING_LINKS = eINSTANCE.getVCEntity_IncomingLinks();

		/**
		 * The meta object literal for the '<em><b>Outgoing Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_ENTITY__OUTGOING_LINKS = eINSTANCE.getVCEntity_OutgoingLinks();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VC_ENTITY__CONSTRAINTS = eINSTANCE.getVCEntity_Constraints();

		/**
		 * The meta object literal for the '<em><b>Vc Contract</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_ENTITY__VC_CONTRACT = eINSTANCE.getVCEntity_VcContract();

		/**
		 * The meta object literal for the '<em><b>Precondition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_ENTITY__PRECONDITION = eINSTANCE.getVCEntity_Precondition();

		/**
		 * The meta object literal for the '<em><b>Postcondition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_ENTITY__POSTCONDITION = eINSTANCE.getVCEntity_Postcondition();

		/**
		 * The meta object literal for the '<em><b>Set VContract Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VC_ENTITY___SET_VCONTRACT_CONDITION__VCONTRACTCONDITION = eINSTANCE.getVCEntity__SetVContractCondition__VContractCondition();

		/**
		 * The meta object literal for the '<em><b>Get Contract Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VC_ENTITY___GET_CONTRACT_CONDITION = eINSTANCE.getVCEntity__GetContractCondition();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.VCValueImpl <em>VC Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.VCValueImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCValue()
		 * @generated
		 */
		EClass VC_VALUE = eINSTANCE.getVCValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VC_VALUE__VALUE = eINSTANCE.getVCValue_Value();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.VCEqualityImpl <em>VC Equality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.VCEqualityImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCEquality()
		 * @generated
		 */
		EClass VC_EQUALITY = eINSTANCE.getVCEquality();

		/**
		 * The meta object literal for the '<em><b>Souce VC Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_EQUALITY__SOUCE_VC_ENTITY = eINSTANCE.getVCEquality_SouceVCEntity();

		/**
		 * The meta object literal for the '<em><b>Target Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_EQUALITY__TARGET_VALUE = eINSTANCE.getVCEquality_TargetValue();

		/**
		 * The meta object literal for the '<em><b>Meaning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VC_EQUALITY__MEANING = eINSTANCE.getVCEquality_Meaning();

		/**
		 * The meta object literal for the '<em><b>Displyed Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VC_EQUALITY__DISPLYED_TEXT = eINSTANCE.getVCEquality_DisplyedText();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VC_EQUALITY__NOTES = eINSTANCE.getVCEquality_Notes();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.VCInstanceImpl <em>VC Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.VCInstanceImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCInstance()
		 * @generated
		 */
		EClass VC_INSTANCE = eINSTANCE.getVCInstance();

		/**
		 * The meta object literal for the '<em><b>Uml Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_INSTANCE__UML_CLASS = eINSTANCE.getVCInstance_UmlClass();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_INSTANCE__FIELDS = eINSTANCE.getVCInstance_Fields();

		/**
		 * The meta object literal for the '<em><b>Instance Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VC_INSTANCE__INSTANCE_NAME = eINSTANCE.getVCInstance_InstanceName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VC_INSTANCE__TYPE = eINSTANCE.getVCInstance_Type();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VC_INSTANCE__IDENTIFIER = eINSTANCE.getVCInstance_Identifier();

		/**
		 * The meta object literal for the '<em><b>Notes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VC_INSTANCE__NOTES = eINSTANCE.getVCInstance_Notes();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.VCInstanceFieldImpl <em>VC Instance Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.VCInstanceFieldImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCInstanceField()
		 * @generated
		 */
		EClass VC_INSTANCE_FIELD = eINSTANCE.getVCInstanceField();

		/**
		 * The meta object literal for the '<em><b>VC Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_INSTANCE_FIELD__VC_INSTANCE = eINSTANCE.getVCInstanceField_VCInstance();

		/**
		 * The meta object literal for the '<em><b>Uml Class Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_INSTANCE_FIELD__UML_CLASS_FIELD = eINSTANCE.getVCInstanceField_UmlClassField();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.VCAssociationImpl <em>VC Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.VCAssociationImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCAssociation()
		 * @generated
		 */
		EClass VC_ASSOCIATION = eINSTANCE.getVCAssociation();

		/**
		 * The meta object literal for the '<em><b>First Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_ASSOCIATION__FIRST_INSTANCE = eINSTANCE.getVCAssociation_FirstInstance();

		/**
		 * The meta object literal for the '<em><b>Second Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_ASSOCIATION__SECOND_INSTANCE = eINSTANCE.getVCAssociation_SecondInstance();

		/**
		 * The meta object literal for the '<em><b>First Instance Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_ASSOCIATION__FIRST_INSTANCE_VARIABLE = eINSTANCE.getVCAssociation_FirstInstanceVariable();

		/**
		 * The meta object literal for the '<em><b>Second Instance Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_ASSOCIATION__SECOND_INSTANCE_VARIABLE = eINSTANCE.getVCAssociation_SecondInstanceVariable();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.VCParameterImpl <em>VC Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.VCParameterImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCParameter()
		 * @generated
		 */
		EClass VC_PARAMETER = eINSTANCE.getVCParameter();

		/**
		 * The meta object literal for the '<em><b>VC Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_PARAMETER__VC_INSTANCE = eINSTANCE.getVCParameter_VCInstance();

		/**
		 * The meta object literal for the '<em><b>Operation Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_PARAMETER__OPERATION_PARAMETER = eINSTANCE.getVCParameter_OperationParameter();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.VCOperationBoxImpl <em>VC Operation Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.VCOperationBoxImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCOperationBox()
		 * @generated
		 */
		EClass VC_OPERATION_BOX = eINSTANCE.getVCOperationBox();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VC_OPERATION_BOX__VALUE = eINSTANCE.getVCOperationBox_Value();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.VCReturnImpl <em>VC Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.VCReturnImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCReturn()
		 * @generated
		 */
		EClass VC_RETURN = eINSTANCE.getVCReturn();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_RETURN__VALUE = eINSTANCE.getVCReturn_Value();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.VCAlternativeBoxImpl <em>VC Alternative Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.VCAlternativeBoxImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCAlternativeBox()
		 * @generated
		 */
		EClass VC_ALTERNATIVE_BOX = eINSTANCE.getVCAlternativeBox();

		/**
		 * The meta object literal for the '<em><b>Conditin Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_ALTERNATIVE_BOX__CONDITIN_OPTIONS = eINSTANCE.getVCAlternativeBox_ConditinOptions();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.VCCollectionBoxImpl <em>VC Collection Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.VCCollectionBoxImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCCollectionBox()
		 * @generated
		 */
		EClass VC_COLLECTION_BOX = eINSTANCE.getVCCollectionBox();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VC_COLLECTION_BOX__TYPE = eINSTANCE.getVCCollectionBox_Type();

		/**
		 * The meta object literal for the '<em><b>VContract Collection Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_COLLECTION_BOX__VCONTRACT_COLLECTION_BOX = eINSTANCE.getVCCollectionBox_VContractCollectionBox();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.VCLoopImpl <em>VC Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.VCLoopImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVCLoop()
		 * @generated
		 */
		EClass VC_LOOP = eINSTANCE.getVCLoop();

		/**
		 * The meta object literal for the '<em><b>Iteration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VC_LOOP__ITERATION = eINSTANCE.getVCLoop_Iteration();

		/**
		 * The meta object literal for the '<em><b>Vc Contract Loop Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VC_LOOP__VC_CONTRACT_LOOP_BOX = eINSTANCE.getVCLoop_VcContractLoopBox();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.ConditionOptionImpl <em>Condition Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.ConditionOptionImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getConditionOption()
		 * @generated
		 */
		EClass CONDITION_OPTION = eINSTANCE.getConditionOption();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_OPTION__NAME = eINSTANCE.getConditionOption_Name();

		/**
		 * The meta object literal for the '<em><b>Vc Contract Alternative Box</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_OPTION__VC_CONTRACT_ALTERNATIVE_BOX = eINSTANCE.getConditionOption_VcContractAlternativeBox();

		/**
		 * The meta object literal for the '<em><b>Vc Alternative Box</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_OPTION__VC_ALTERNATIVE_BOX = eINSTANCE.getConditionOption_VcAlternativeBox();

		/**
		 * The meta object literal for the '<em><b>Vc Entity Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_OPTION__VC_ENTITY_REFERENCE = eINSTANCE.getConditionOption_VcEntityReference();

		/**
		 * The meta object literal for the '<em><b>Displayed Condition Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_OPTION__DISPLAYED_CONDITION_STATEMENT = eINSTANCE.getConditionOption_DisplayedConditionStatement();

		/**
		 * The meta object literal for the '<em><b>Condition Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_OPTION__CONDITION_VALUE = eINSTANCE.getConditionOption_ConditionValue();

		/**
		 * The meta object literal for the '<em><b>Meaning Of Condition Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_OPTION__MEANING_OF_CONDITION_STATEMENT = eINSTANCE.getConditionOption_MeaningOfConditionStatement();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.VContractAlternativeBoxImpl <em>VContract Alternative Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.VContractAlternativeBoxImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVContractAlternativeBox()
		 * @generated
		 */
		EClass VCONTRACT_ALTERNATIVE_BOX = eINSTANCE.getVContractAlternativeBox();

		/**
		 * The meta object literal for the '<em><b>VC Return Included</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VCONTRACT_ALTERNATIVE_BOX__VC_RETURN_INCLUDED = eINSTANCE.getVContractAlternativeBox_VCReturnIncluded();

		/**
		 * The meta object literal for the '<em><b>Vc Contract</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCONTRACT_ALTERNATIVE_BOX__VC_CONTRACT = eINSTANCE.getVContractAlternativeBox_VcContract();

		/**
		 * The meta object literal for the '<em><b>Condition Option</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCONTRACT_ALTERNATIVE_BOX__CONDITION_OPTION = eINSTANCE.getVContractAlternativeBox_ConditionOption();

		/**
		 * The meta object literal for the '<em><b>Get VContract Condition</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VCONTRACT_ALTERNATIVE_BOX___GET_VCONTRACT_CONDITION = eINSTANCE.getVContractAlternativeBox__GetVContractCondition();

		/**
		 * The meta object literal for the '<em><b>Set VC Entity Contract</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VCONTRACT_ALTERNATIVE_BOX___SET_VC_ENTITY_CONTRACT__VCENTITY = eINSTANCE.getVContractAlternativeBox__SetVCEntityContract__VCEntity();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.VContractCollectionBoxImpl <em>VContract Collection Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.VContractCollectionBoxImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVContractCollectionBox()
		 * @generated
		 */
		EClass VCONTRACT_COLLECTION_BOX = eINSTANCE.getVContractCollectionBox();

		/**
		 * The meta object literal for the '<em><b>Vc Collection Box</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCONTRACT_COLLECTION_BOX__VC_COLLECTION_BOX = eINSTANCE.getVContractCollectionBox_VcCollectionBox();

		/**
		 * The meta object literal for the '{@link com.abdulaziz.ms.OCV.impl.VContractLoopBoxImpl <em>VContract Loop Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.abdulaziz.ms.OCV.impl.VContractLoopBoxImpl
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getVContractLoopBox()
		 * @generated
		 */
		EClass VCONTRACT_LOOP_BOX = eINSTANCE.getVContractLoopBox();

		/**
		 * The meta object literal for the '<em><b>Vc Collection Box</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VCONTRACT_LOOP_BOX__VC_COLLECTION_BOX = eINSTANCE.getVContractLoopBox_VcCollectionBox();

		/**
		 * The meta object literal for the '<em>Rectangle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Rectangle
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getRectangle()
		 * @generated
		 */
		EDataType RECTANGLE = eINSTANCE.getRectangle();

		/**
		 * The meta object literal for the '<em>Absolute Bendpoint</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.AbsoluteBendpoint
		 * @see com.abdulaziz.ms.OCV.impl.OCVPackageImpl#getAbsoluteBendpoint()
		 * @generated
		 */
		EDataType ABSOLUTE_BENDPOINT = eINSTANCE.getAbsoluteBendpoint();

	}

} //OCVPackage
