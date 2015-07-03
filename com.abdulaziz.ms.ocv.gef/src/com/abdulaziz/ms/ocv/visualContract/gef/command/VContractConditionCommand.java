package com.abdulaziz.ms.ocv.visualContract.gef.command;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import com.abdulaziz.ms.OCV.VContractCondition;
import com.abdulaziz.ms.OCV.VContractPostcondition;
import com.abdulaziz.ms.OCV.VContractPrecondition;
import com.abdulaziz.ms.ocv.visualContract.gef.util.VContractUtility;

public class VContractConditionCommand extends Command {

	private VContractPrecondition pre;
	private VContractPostcondition post;
	private Rectangle constraint;
	
	private boolean isPrecondition;
	private VContractCondition model;
	
	
	
	public void setModel(VContractCondition model) {
		this.model = model;
		isPrecondition= false;
		if (model instanceof VContractPrecondition)
		{
			pre = (VContractPrecondition) model;
			post = pre.getVcContract().getPostcondition();
			isPrecondition = true;
		}
		else if (model instanceof VContractPostcondition)
		{
			post = (VContractPostcondition) model;
			pre = post.getVcContract().getPrecondition();
			
		}
		

	

		
				
	}
	
	public void execute()
	{
			model.setConstaint(constraint);
				
	}
	@Override
	public boolean canExecute()
	{
		if(isPrecondition)
		{
			return model.getConstaint().bottom() < post.getConstaint().y;
		}
		
		else 
			
		return  constraint.y() > pre.getConstaint().bottom();
		
	}

	public void setNewConstraints(Rectangle constraint) {
		this.constraint = constraint;
		
	}

}
