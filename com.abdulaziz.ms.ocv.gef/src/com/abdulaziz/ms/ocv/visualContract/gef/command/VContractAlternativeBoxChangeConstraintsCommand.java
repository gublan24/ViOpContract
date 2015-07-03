package com.abdulaziz.ms.ocv.visualContract.gef.command;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VContractAlternativeBox;

public class VContractAlternativeBoxChangeConstraintsCommand extends Command {

	private Rectangle newConstraint;
	private Rectangle oldConstraint;
	private VContractAlternativeBox vContractAlternativeBox;
	
	@Override 
	public void execute()
	
	{
		oldConstraint = vContractAlternativeBox.getConstaint();
		if(newConstraint !=null)
		{
			vContractAlternativeBox.setConstaint(newConstraint);
		}
		
		
	
		// 
		//vEntity.getVcContract().setName("");
		 
		
	}
	
	@Override
	public void undo()
	{
		if(oldConstraint != null)
			vContractAlternativeBox.setConstaint(oldConstraint);
	}

	public void setNewConstraints(Rectangle newConstraint) {
		this.newConstraint = newConstraint;
	}

	public void setModel(VContractAlternativeBox model) {
this.vContractAlternativeBox = model;
		
	}

	
	

}
