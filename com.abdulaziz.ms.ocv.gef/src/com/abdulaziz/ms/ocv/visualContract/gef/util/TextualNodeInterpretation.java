package com.abdulaziz.ms.ocv.visualContract.gef.util;

import com.abdulaziz.ms.OCV.VCAssociation;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCEquality;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VCInstanceField;
import com.abdulaziz.ms.OCV.VCParameter;
import com.abdulaziz.ms.OCV.VCReturn;
import com.abdulaziz.ms.OCV.VCValue;

public class TextualNodeInterpretation {

	/*
	 * 1: add instance reference to VCInstanceField
	 */
	public String interpretVCReturn(VCReturn vReturn) {
		String interpretation = "The return value is ";
		String sourceVCEntity = "Not Specified Yet...";
		VCEntity vEntity = vReturn.getIncomingLinks().get(0).getSource();
		if (vEntity instanceof VCInstance)
			sourceVCEntity = "the instance: "
					+ ((VCInstance) vEntity).getInstanceName();
		if (vEntity instanceof VCInstanceField) // TODO 1
			sourceVCEntity = "the field: "
					+ ((VCInstanceField) vEntity).getUmlClassField()
							.getVariableName()
					+ " of class: "
					+ ((VCInstanceField) vEntity).getUmlClassField()
							.getUmlClass().getClassName();
		if (vEntity instanceof VCParameter)
			sourceVCEntity = "the parameter: "
					+ ((VCParameter) vEntity).getOperationParameter()
							.getVariableName();
		if (vEntity instanceof VCValue)
			sourceVCEntity = "" + ((VCValue) vEntity).getValue();
		return interpretation + sourceVCEntity;

	}

	public String interpretInstance(VCInstance vcInstance) {
		String interpretation = "Not Specified Yet ...";

		// precondition
		if (vcInstance.getPrecondition() != null) {
			if (vcInstance.getType()
					.equals(VContractUtility.VCINSTANCE_CURRENT))
				interpretation = "There is a current instance "
						+ vcInstance.getInstanceName() + " of class "
						+ vcInstance.getUmlClass().getClassName();
			else if (vcInstance.getType().equals(
					VContractUtility.VCINSTANCE_DATASTORE))
				interpretation = "There is an instance "
						+ vcInstance.getInstanceName() + " of class "
						+ vcInstance.getUmlClass().getClassName()
						+ " retrieved from the datastore";

		}
		// post condition
		else if (vcInstance.getPostcondition() != null) {
			if (vcInstance.getType().equals(
					VContractUtility.VCINSTANCE_DATASTORE))
				interpretation = "An instance " + vcInstance.getInstanceName()
						+ " of class "
						+ vcInstance.getUmlClass().getClassName()
						+ " was retrieved from the datastore";
			else
				interpretation = "An instance " + vcInstance.getInstanceName()
						+ " of class "
						+ vcInstance.getUmlClass().getClassName()
						+ " was created";
		}

		return interpretation;
	}

	public String interpretAssociation(VCAssociation vAssociation) {

		String interpretation = "Not Specified Yet ...";
		if (vAssociation.getIncomingLinks().size() == 2) {

			VCInstance instance1 = (VCInstance) vAssociation.getIncomingLinks()
					.get(0).getSource();
			VCInstance instance2 = (VCInstance) vAssociation.getIncomingLinks()
					.get(1).getSource();
			// pre condition
			if (vAssociation.getPrecondition() != null) {
				if (vAssociation.getFirstInstanceVariable() == null
						&& vAssociation.getSecondInstanceVariable() == null)
					interpretation = instance1.getInstanceName()
							+ " is associated with "
							+ instance2.getInstanceName();
				else
					interpretation = instance1.getInstanceName()
							+ " is associated with "
							+ instance2.getInstanceName()
							+ " based on matching between "
							+ vAssociation.getFirstInstance() + "."
							+ vAssociation.getFirstInstanceVariable()
							+ " and  " + vAssociation.getSecondInstance() + "."
							+ vAssociation.getSecondInstanceVariable();

			}
			// post condition
			else if (vAssociation.getPostcondition() != null) {
				if (vAssociation.getFirstInstanceVariable() == null
						&& vAssociation.getSecondInstanceVariable() == null)
					interpretation = instance1.getInstanceName()
							+ " was associated with "
							+ instance2.getInstanceName();
				else
					interpretation = instance1.getInstanceName()
							+ " was associated with "
							+ instance2.getInstanceName()
							+ " based on matching between "
							+ vAssociation.getFirstInstance().getInstanceName()
							+ "."
							+ vAssociation.getFirstInstanceVariable()
									.getVariableName()
							+ " and  "
							+ vAssociation.getSecondInstance()
									.getInstanceName()
							+ "."
							+ vAssociation.getSecondInstanceVariable()
									.getVariableName();
			}
		}

		return interpretation;

	}

	public String getNodeInterpretation(VCEntity node) {
		switch (node.getClass().getSimpleName()) {
		case "VCValueImpl":
			return getNodeInterpretation((VCValue) node);
		case "VCInstanceFieldImpl":
			return getNodeInterpretation((VCInstanceField) node);
		case "VCParameterImpl":
			return getNodeInterpretation((VCParameter) node);
		}

		return null;
	}

	public String getNodeInterpretation(VCValue node) {

		return node.getValue();
	}

	public String getNodeInterpretation(VCInstanceField node) {

		return node.getUmlClassField().getVariableName();
	}

	public String getNodeInterpretation_postcondition(VCEquality node) {

		return "was " + node.getMeaning();
	}

	public String getNodeInterpretation_precondition(VCEquality node) {
		return "is " + node.getMeaning();
	}

	public String getNodeInterpretation(VCParameter node) {

		return node.getOperationParameter().getVariableName();
	}

}
