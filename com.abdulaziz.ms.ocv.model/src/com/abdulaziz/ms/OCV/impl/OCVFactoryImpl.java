/**
 */
package com.abdulaziz.ms.OCV.impl;

import com.abdulaziz.ms.OCV.*;
import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OCVFactoryImpl extends EFactoryImpl implements OCVFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OCVFactory init() {
		try {
			OCVFactory theOCVFactory = (OCVFactory)EPackage.Registry.INSTANCE.getEFactory(OCVPackage.eNS_URI);
			if (theOCVFactory != null) {
				return theOCVFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OCVFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCVFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OCVPackage.UML_CLASS_DIAGRAM: return createUMLClassDiagram();
			case OCVPackage.UML_CLASS: return createUMLClass();
			case OCVPackage.UML_VARIABLE: return createUMLVariable();
			case OCVPackage.UML_LINK: return createUMLLink();
			case OCVPackage.VSYSTEM_OPERATION_DIAGRAM: return createVSystemOperationDiagram();
			case OCVPackage.VOPERATION: return createVOperation();
			case OCVPackage.VC_CONTRACT: return createVCContract();
			case OCVPackage.VCONTRACT_PRECONDITION: return createVContractPrecondition();
			case OCVPackage.VCONTRACT_POSTCONDITION: return createVContractPostcondition();
			case OCVPackage.VC_LINK: return createVCLink();
			case OCVPackage.VC_LINK_PRE_POST_CONDITION: return createVCLinkPrePostCondition();
			case OCVPackage.VC_VALUE: return createVCValue();
			case OCVPackage.VC_EQUALITY: return createVCEquality();
			case OCVPackage.VC_INSTANCE: return createVCInstance();
			case OCVPackage.VC_INSTANCE_FIELD: return createVCInstanceField();
			case OCVPackage.VC_ASSOCIATION: return createVCAssociation();
			case OCVPackage.VC_PARAMETER: return createVCParameter();
			case OCVPackage.VC_OPERATION_BOX: return createVCOperationBox();
			case OCVPackage.VC_RETURN: return createVCReturn();
			case OCVPackage.VC_COLLECTION_BOX: return createVCCollectionBox();
			case OCVPackage.VC_LOOP: return createVCLoop();
			case OCVPackage.VC_ALTERNATIVE_BOX: return createVCAlternativeBox();
			case OCVPackage.CONDITION_OPTION: return createConditionOption();
			case OCVPackage.VCONTRACT_ALTERNATIVE_BOX: return createVContractAlternativeBox();
			case OCVPackage.VCONTRACT_COLLECTION_BOX: return createVContractCollectionBox();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OCVPackage.ABSOLUTE_BENDPOINT:
				return createAbsoluteBendpointFromString(eDataType, initialValue);
			case OCVPackage.RECTANGLE:
				return createRectangleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OCVPackage.ABSOLUTE_BENDPOINT:
				return convertAbsoluteBendpointToString(eDataType, instanceValue);
			case OCVPackage.RECTANGLE:
				return convertRectangleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLClassDiagram createUMLClassDiagram() {
		UMLClassDiagramImpl umlClassDiagram = new UMLClassDiagramImpl();
		return umlClassDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLClass createUMLClass() {
		UMLClassImpl umlClass = new UMLClassImpl();
		return umlClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLVariable createUMLVariable() {
		UMLVariableImpl umlVariable = new UMLVariableImpl();
		return umlVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UMLLink createUMLLink() {
		UMLLinkImpl umlLink = new UMLLinkImpl();
		return umlLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VSystemOperationDiagram createVSystemOperationDiagram() {
		VSystemOperationDiagramImpl vSystemOperationDiagram = new VSystemOperationDiagramImpl();
		return vSystemOperationDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VOperation createVOperation() {
		VOperationImpl vOperation = new VOperationImpl();
		return vOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCContract createVCContract() {
		VCContractImpl vcContract = new VCContractImpl();
		return vcContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VContractPrecondition createVContractPrecondition() {
		VContractPreconditionImpl vContractPrecondition = new VContractPreconditionImpl();
		return vContractPrecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VContractPostcondition createVContractPostcondition() {
		VContractPostconditionImpl vContractPostcondition = new VContractPostconditionImpl();
		return vContractPostcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCLink createVCLink() {
		VCLinkImpl vcLink = new VCLinkImpl();
		return vcLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCLinkPrePostCondition createVCLinkPrePostCondition() {
		VCLinkPrePostConditionImpl vcLinkPrePostCondition = new VCLinkPrePostConditionImpl();
		return vcLinkPrePostCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCValue createVCValue() {
		VCValueImpl vcValue = new VCValueImpl();
		return vcValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCEquality createVCEquality() {
		VCEqualityImpl vcEquality = new VCEqualityImpl();
		return vcEquality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCInstance createVCInstance() {
		VCInstanceImpl vcInstance = new VCInstanceImpl();
		return vcInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCInstanceField createVCInstanceField() {
		VCInstanceFieldImpl vcInstanceField = new VCInstanceFieldImpl();
		return vcInstanceField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCAssociation createVCAssociation() {
		VCAssociationImpl vcAssociation = new VCAssociationImpl();
		return vcAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCParameter createVCParameter() {
		VCParameterImpl vcParameter = new VCParameterImpl();
		return vcParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCOperationBox createVCOperationBox() {
		VCOperationBoxImpl vcOperationBox = new VCOperationBoxImpl();
		return vcOperationBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCReturn createVCReturn() {
		VCReturnImpl vcReturn = new VCReturnImpl();
		return vcReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCAlternativeBox createVCAlternativeBox() {
		VCAlternativeBoxImpl vcAlternativeBox = new VCAlternativeBoxImpl();
		return vcAlternativeBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCCollectionBox createVCCollectionBox() {
		VCCollectionBoxImpl vcCollectionBox = new VCCollectionBoxImpl();
		return vcCollectionBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VCLoop createVCLoop() {
		VCLoopImpl vcLoop = new VCLoopImpl();
		return vcLoop;
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionOption createConditionOption() {
		ConditionOptionImpl conditionOption = new ConditionOptionImpl();
		return conditionOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VContractAlternativeBox createVContractAlternativeBox() {
		VContractAlternativeBoxImpl vContractAlternativeBox = new VContractAlternativeBoxImpl();
		return vContractAlternativeBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VContractCollectionBox createVContractCollectionBox() {
		VContractCollectionBoxImpl vContractCollectionBox = new VContractCollectionBoxImpl();
		return vContractCollectionBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbsoluteBendpoint createAbsoluteBendpointFromString(EDataType eDataType, String initialValue) {
		return (AbsoluteBendpoint)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAbsoluteBendpointToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OCVPackage getOCVPackage() {
		return (OCVPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OCVPackage getPackage() {
		return OCVPackage.eINSTANCE;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * Create a <code>Rectangle</code> instance from a <code>String</code>. The expected
	 * representation is "x,y,width,height". Illegal representations will return a null
	 * value. 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Rectangle createRectangleFromString(EDataType eDataType, String initialValue) {
	  if(initialValue == null) {
	    return null;
	  }
	  initialValue.replaceAll("\\s", "");
	  String[] values = initialValue.split(",");
	  if(values.length != 4) {
	    return null;
	  }
	 
	  Rectangle rect = new Rectangle();
	  try {
	    rect.setLocation(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
	    rect.setSize(Integer.parseInt(values[2]), Integer.parseInt(values[3]));
	  } catch(NumberFormatException e) {
	    EcorePlugin.INSTANCE.log(e);
	    rect = null;
	  }
	  return rect;
	}
	 
	/**
	 * <!-- begin-user-doc -->
	 * Convert a <code>Rectangle</code> to a <code>String</code> representation. The
	 * <code>Rectangle</code> is represented as "x,y,width,heigth". 
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	public String convertRectangleToString(EDataType eDataType, Object instanceValue) {
	  if(instanceValue == null) {
	    return null;
	  }
	  Rectangle rect = (Rectangle) instanceValue;
	  return rect.x+","+rect.y+","+rect.width+","+rect.height;
	}

} //OCVFactoryImpl
