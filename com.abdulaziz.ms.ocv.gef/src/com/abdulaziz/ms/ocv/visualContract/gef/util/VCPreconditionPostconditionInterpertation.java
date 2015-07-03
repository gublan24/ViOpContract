package com.abdulaziz.ms.ocv.visualContract.gef.util;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import com.abdulaziz.ms.OCV.ConditionOption;
import com.abdulaziz.ms.OCV.VCAlternativeBox;
import com.abdulaziz.ms.OCV.VCAssociation;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCEquality;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VCInstanceField;
import com.abdulaziz.ms.OCV.VCLink;
import com.abdulaziz.ms.OCV.VCParameter;
import com.abdulaziz.ms.OCV.VCValue;
import com.abdulaziz.ms.OCV.VContractAlternativeBox;
import com.abdulaziz.ms.OCV.VContractPostcondition;
import com.abdulaziz.ms.OCV.VContractPrecondition;
import com.abdulaziz.ms.OCV.VCReturn;
import com.abdulaziz.ms.OCV.impl.VCReturnImpl;

public class VCPreconditionPostconditionInterpertation {
	private VContractPostcondition vPostcondition;
	private VContractPrecondition vPrecondition;
	
	private ArrayList<VCInstance> postcondition_instanceList;
	private VCReturn postconditon_vcReurn;
	private ArrayList<VCAssociation> postconditon_associationList;
	
	private TextualNodeInterpretation textualInterpretation;
	private ArrayList<VCInstance> precondition_instanceList;
	private ArrayList<VCAssociation> preconditon_associationList;
	private ArrayList<VCEntity> startNodes;
	private VContractAlternativeBox vcContractAlternativeBox;
	
	public VCPreconditionPostconditionInterpertation(VContractPrecondition vPrecondition , VContractPostcondition vPostcondition)
	{		
		this.vPrecondition = vPrecondition;
		this.vPostcondition = vPostcondition;
		textualInterpretation = new TextualNodeInterpretation();

	}
	
	
	
	public VCPreconditionPostconditionInterpertation(
			VContractAlternativeBox vcContractAlternativeBox) {
		this.vcContractAlternativeBox = vcContractAlternativeBox;
		textualInterpretation = new TextualNodeInterpretation();
	}



	public boolean isStartNode(VCParameter vParameter)
	{
		return vParameter.getIncomingLinks().size() == 0;	
	
	}
	public boolean isStartNode(VCInstanceField vInstanceField)
	{
		boolean result = true;
		for (VCLink vLink : vInstanceField.getIncomingLinks()) {
			if (!(vLink.getSource() instanceof VCInstance))
				return false;
		}
		return result;
	}
	
	public ArrayList<String> getPostCondition_VContractAlternativeBox_TextualInterpretation() {
		return getPostConditionTextualInterpretation(getStartNodeList_postcondition(vcContractAlternativeBox.getVcEntities()));
	}
	
	public ArrayList<String> getPostConditionTextualInterpretation() {
		return getPostConditionTextualInterpretation(getStartNodeList_postcondition(vPostcondition.getVcEntities()));
	}
	public ArrayList<String> getPerConditionTextualInterpretation() {
	
		return getPreConditionTextualInterpretation(getStartNodeList_precondition(vPrecondition.getVcEntities()));
	}
	
	public ArrayList<VCEntity> getStartNodeList_postcondition(EList<VCEntity> vEntities)
	{
		postcondition_instanceList = new ArrayList<>();
		postconditon_associationList = new ArrayList<>();
		return getStartNodes_and_setVCLists(vEntities,postcondition_instanceList,postconditon_associationList);
	}
	public ArrayList<VCEntity> getStartNodeList_precondition(EList<VCEntity> vEntities)
	{
		precondition_instanceList = new ArrayList<>();
		preconditon_associationList = new ArrayList<>();
		return getStartNodes_and_setVCLists(vEntities,precondition_instanceList,preconditon_associationList);
	}
	public ArrayList<VCEntity> getStartNodes_and_setVCLists(EList<VCEntity> vEntities, ArrayList<VCInstance> instanceList, ArrayList<VCAssociation> associationList)
	{
		startNodes = new ArrayList<>();
		for (VCEntity vcEntity : vEntities) {
			
			if (vcEntity instanceof VCParameter) {
				if (isStartNode((VCParameter) vcEntity))
					startNodes.add((VCParameter) vcEntity);
			} else if (vcEntity instanceof VCInstanceField) {
				if (isStartNode((VCInstanceField) vcEntity))
					startNodes.add((VCInstanceField) vcEntity);
			} else if (vcEntity instanceof VCInstance) {
				instanceList.add((VCInstance) vcEntity);
			} else if (vcEntity instanceof VCReturn) {
				this.postconditon_vcReurn = (VCReturn) vcEntity;
			} else if (vcEntity instanceof VCAssociation) {
				associationList.add((VCAssociation) vcEntity);
			}

		}
		return startNodes;
	}
	
	public ArrayList<String> getVCInstancesAndVCAssociations_postcondition()
	{
		ArrayList<String> result = new ArrayList<>();
		if(postcondition_instanceList != null)
		for (VCInstance instance_element : postcondition_instanceList) {
			result.add(textualInterpretation.interpretInstance(instance_element));	
		}
		if(postconditon_associationList != null)
		for (VCAssociation association_element : postconditon_associationList) {
			result.add(textualInterpretation.interpretAssociation(association_element));
		}
		return result;
		
	
	}
	
	public ArrayList<String> getVCInstancesAndVCAssociations_precondition() {
		ArrayList<String> result = new ArrayList<>();
		if(precondition_instanceList != null)
		for (VCInstance instance_element : precondition_instanceList) {
			result.add(textualInterpretation.interpretInstance(instance_element));
		}
		if(preconditon_associationList != null)
		for (VCAssociation association_element : preconditon_associationList) {
			result.add(textualInterpretation.interpretAssociation(association_element));
		}
		return result;

	}
	
	public ArrayList<String> getPostConditionTextualInterpretation(ArrayList<VCEntity> startNodes)
	{
		ArrayList<VCEntity> partialStartNodeList = new ArrayList<>();
		ArrayList <String> interpretation = new ArrayList<>();
		// add instances and associations  
		interpretation.addAll(getVCInstancesAndVCAssociations_postcondition());
		// Interpretation of one level 
		interateOverStartNodes(startNodes, partialStartNodeList,interpretation);	
		//
		interateOverAlternativeBoxNodes(startNodes, partialStartNodeList, interpretation);
			// add Return 
		if(postconditon_vcReurn != null)
				interpretation.add(textualInterpretation.interpretVCReturn(postconditon_vcReurn));

		// add inner nodes that have equalities
		if(partialStartNodeList.size() > 0)
			interpretation.addAll(getPostConditionTextualInterpretation(partialStartNodeList));
		
		return interpretation;		
	}



	private void interateOverStartNodes(ArrayList<VCEntity> startNodes,ArrayList<VCEntity> partialStartNodeList,ArrayList<String> interpretation) {
		for (VCEntity firstNodeVCEntity : startNodes) {
			for (VCLink vLink : firstNodeVCEntity.getOutgoingLinks()) {					
				if (vLink.getTarget() instanceof VCEquality && vLink.getTarget().eContainer().equals(vLink.getSource().eContainer())) // and they are in the same level 
				{
					VCEquality secondNodeVCEquality = (VCEquality) vLink.getTarget();
					for (VCLink secondNodeVCLink : secondNodeVCEquality.getOutgoingLinks()) {
						VCEntity thirdNodeVEntity = secondNodeVCLink.getTarget();
						// 
						String  lineInterpretation = textualInterpretation.getNodeInterpretation(firstNodeVCEntity) + " " +textualInterpretation.getNodeInterpretation_postcondition(secondNodeVCEquality) + " " +textualInterpretation.getNodeInterpretation(thirdNodeVEntity);
						interpretation.add(lineInterpretation);
						if(thirdNodeVEntity.getOutgoingLinks().size() > 0  && ! partialStartNodeList.contains(thirdNodeVEntity) && thirdNodeVEntity.getPostcondition() !=null)
							{ // if it is not leaf node, add as a startNode , not added before , not in precondition
							if (thirdNodeVEntity.getOutgoingLinks().get(0).getTarget() instanceof VCReturn)
								break;
												partialStartNodeList.add(thirdNodeVEntity);		
							}
					}	
				} 
			}	
		}
	}
	//TODO
	private void interateOverAlternativeBoxNodes(ArrayList<VCEntity> startNodes,ArrayList<VCEntity> partialStartNodeList,ArrayList<String> interpretation) {
		
		for (VCEntity firstNodeVCEntity : startNodes) {
			for (VCLink vLink : firstNodeVCEntity.getOutgoingLinks()) {					
				if (vLink.getTarget() instanceof VCAlternativeBox && vLink.getTarget().eContainer().equals(vLink.getSource().eContainer())) // and they are in the same level 
				{
					VCAlternativeBox secondNodeVCAlternativeBox = (VCAlternativeBox) vLink.getTarget();
					for (ConditionOption conditionOption : secondNodeVCAlternativeBox.getConditinOptions()) {
						String  lineInterpretation = "If " + conditionOption.getName() + ": ";
						interpretation.add(lineInterpretation);
						VCPreconditionPostconditionInterpertation mm = new VCPreconditionPostconditionInterpertation(conditionOption.getVcContractAlternativeBox());
						interpretation.addAll(mm.getPostCondition_VContractAlternativeBox_TextualInterpretation());
						interpretation.add("-----------------*-------------");


					}					
				} 
			}	
		}
	}
	
	public ArrayList<String> getPreConditionTextualInterpretation(ArrayList<VCEntity> startNodes)
	{
		
		ArrayList<VCEntity> partialStartNodeList = new ArrayList<>();
		ArrayList <String> interpretation = new ArrayList<>();
		// add instances and associations  
		interpretation.addAll(getVCInstancesAndVCAssociations_precondition());
			for (VCEntity firstNodeVCEntity : startNodes) {
				for (VCLink vLink : firstNodeVCEntity.getOutgoingLinks()) {					
					if (vLink.getTarget() instanceof VCEquality  && vLink.getTarget().eContainer().equals(vLink.getSource().eContainer()))
					{
						VCEquality secondNodeVCEquality = (VCEquality) vLink.getTarget();
						
						for (VCLink secondNodeVCLink : secondNodeVCEquality.getOutgoingLinks()) {
							VCEntity thirdNodeVEntity = secondNodeVCLink.getTarget();
							// 
							String  lineInterpretation = textualInterpretation.getNodeInterpretation(firstNodeVCEntity) + " " +textualInterpretation.getNodeInterpretation_precondition(secondNodeVCEquality) + " " +textualInterpretation.getNodeInterpretation(thirdNodeVEntity);
							interpretation.add(lineInterpretation);
							if(thirdNodeVEntity.getOutgoingLinks().size() > 0  && ! partialStartNodeList.contains(thirdNodeVEntity) && thirdNodeVEntity.getPrecondition() !=null)
								{ // if it is not leaf node, add as a startNode , not added before , not in precondition
													partialStartNodeList.add(thirdNodeVEntity);		
								}
						}	
					}
				}	
			}

		// add inner nodes that have equalities
		if(partialStartNodeList.size() > 0)
			interpretation.addAll(getPostConditionTextualInterpretation(partialStartNodeList));
		return interpretation;		
	}

	

	


}
