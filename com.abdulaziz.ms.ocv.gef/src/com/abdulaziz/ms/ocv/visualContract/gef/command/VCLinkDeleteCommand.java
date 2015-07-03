package com.abdulaziz.ms.ocv.visualContract.gef.command;

import org.eclipse.gef.commands.Command;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCInstanceField;
import com.abdulaziz.ms.OCV.VCLink;
import com.abdulaziz.ms.OCV.impl.VCLinkImpl;
import com.abdulaziz.ms.ocv.visualContract.gef.command.vc.VCInstanceFieldModifyCommand;

public class VCLinkDeleteCommand extends Command {

	private VCLink vcLink;
	private VCLink oldVCLink;
	private VCEntity source;
	private VCEntity target;
	private String linkType;
	private VCContract vcContract;
	
	

	public void setLink(VCLink model) {
		vcLink = model;
		
	}
	
	@Override 
	public void execute()
	{
		vcContract = vcLink.getVcContract();
		vcContract.getVcLinks().remove(vcLink);
		linkType = vcLink.getClass().getSimpleName();
		source = vcLink.getSource();
		target = vcLink.getTarget();
		source.getOutgoingLinks().remove(vcLink);
		target.getIncomingLinks().remove(vcLink);
		vcLink = null;
	}
	
	public void undo()
	{
		//TODO no implemetation for prepostLink
		if(linkType.equals("VCLinkImpl")) 
		oldVCLink = OCVFactory.eINSTANCE.createVCLink();
		else 
			oldVCLink = OCVFactory.eINSTANCE.createVCLinkPrePostCondition();

		
		source.getOutgoingLinks().add(oldVCLink);
		target.getIncomingLinks().add(oldVCLink);
		
	}

}
