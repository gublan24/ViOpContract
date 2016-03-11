package com.abdulaziz.ms.ocv.visualContract.gef.command;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLClassDiagram;
import com.abdulaziz.ms.OCV.UMLLink;
import com.abdulaziz.ms.OCV.VCAssociation;
import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VCLink;
import com.abdulaziz.ms.OCV.VCLinkPrePostCondition;
import com.abdulaziz.ms.OCV.VCValue;
import com.abdulaziz.ms.OCV.impl.VCValueImpl;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition.VContractConditionEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.util.VCLinkRulesManager;

public class VCLinkCreateCommand extends Command {
	
	VCLink vLink;
	VCEntity source;
	VCEntity target;
	VCContract vcContract;
	private VContractConditionEditPart sourceVContractConditionEditPart;
	private VContractConditionEditPart targetVcontractConditionEditPart;
	
	
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#execute()
	 *  
	 *  checks whether the link is connecting pre-element with post-element, and vice-versa  
	 */
	@Override
	public void execute()
	{
		
		if (!VCLinkRulesManager.isTargetAcceptSource(source, target))
			return;

		if (!VCLinkRulesManager.isTargetAcceptLink(target))
			return;
		
		addLinkAsPrePostConditionLink();
		
		if (source instanceof VCAssociation && target instanceof VCInstance) 
		{
			((VCAssociation)source).setSecondInstance((VCInstance) target);
			/*
			vLink.setSource(target);
			vLink.setTarget(source);
			target.getOutgoingLinks().add(vLink);
			source.getIncomingLinks().add(vLink);
			*/

		} 
		if (target instanceof VCAssociation && source instanceof VCInstance) 
		{
			((VCAssociation)target).setFirstInstance((VCInstance) source);
			

		} 
		
		
		
		{
			vLink.setSource(source);
			vLink.setTarget(target);
			source.getOutgoingLinks().add(vLink);
			target.getIncomingLinks().add(vLink);
		}
		
		EObject eContainer = source.eContainer();
		while(! (eContainer instanceof VCContract))
		{
			eContainer = eContainer.eContainer();
		}
		vcContract = (VCContract) eContainer;
		vcContract.getVcLinks().add(vLink);
		vLink.setVcContract(vcContract);
		
			
		
	}



	public void addLinkAsPrePostConditionLink() {
		if(!(sourceVContractConditionEditPart.equals(targetVcontractConditionEditPart)))
			vLink = OCVFactory.eINSTANCE.createVCLinkPrePostCondition();
	}
	
	

	@Override
	public boolean canExecute()
	{
		
		
		return source != null && target != null && vLink != null && !(target.equals(source));
		
	}
	
	@Override
	public void undo()
	{
		
		vLink.getSource().getOutgoingLinks().remove(vLink);
		vLink.setSource(null);
		vLink.getTarget().getIncomingLinks().remove(vLink);
		vLink.setTarget(null);
	//	vLink.setVcContract(null);
	}
	
	
	public void setVCLink(VCLink vLink) {
		this.vLink = vLink;
	}
	public void setSource(VCEntity source) {
		this.source = source;
	}
	public void setTarget(VCEntity target) {
		this.target = target;
	}
	public void setVcContract(VCContract vcContract) {
		this.vcContract = vcContract;
	}

	public void setSourceParentEditPart(VContractConditionEditPart parentVcontractConditionEditPart) {
		sourceVContractConditionEditPart = parentVcontractConditionEditPart;
		
	}

	public void setTargetParentEditPart(VContractConditionEditPart parentVcontractConditionEditPart) {
		targetVcontractConditionEditPart = parentVcontractConditionEditPart;
		
	}
	
	/*
	if(target instanceof VCAssociation)
	{
		return target.getIncomingLinks().size() <2;
	}
	else if(target instanceof VCAttribute)
	{
		
		return (source instanceof VCInstance);
	}
	
	public static boolean isLinkExist(UMLClassDiagram classDiagram,UMLClass umlClassA, UMLClass umlClassB)
{
	boolean result = false ;
	EList<UMLLink> m = classDiagram.getLinks();
	for (UMLLink link : m) {
		if (link.getTarget().equals(umlClassA) && link.getSource().equals(umlClassB)
				||
				link.getTarget().equals(umlClassB) && link.getSource().equals(umlClassA)) {
			
			result = true;
			break;
		}

	}
	return result;
	
}

private boolean checkDomianDiagramDirectLink() {

	if (!(target.getIncomingLinks().get(0).getSource() instanceof VCInstance && target.getIncomingLinks().get(1).getSource()instanceof VCInstance ))
		return false;
	
		
	VCInstance source0 = (VCInstance) target.getIncomingLinks().get(0).getSource();
	VCInstance source1 = (VCInstance) target.getIncomingLinks().get(1).getSource();

	return isLinkExist(source0.getUmlClass().getUmlDiagram(), source0.getUmlClass(), source1.getUmlClass());
}
	*/
	

}
