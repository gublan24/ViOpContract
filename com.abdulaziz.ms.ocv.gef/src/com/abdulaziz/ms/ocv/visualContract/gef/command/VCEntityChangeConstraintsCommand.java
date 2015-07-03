package com.abdulaziz.ms.ocv.visualContract.gef.command;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import com.abdulaziz.ms.OCV.VCEntity;

public class VCEntityChangeConstraintsCommand extends Command {
	
	private Rectangle newConstraint;
	private Rectangle oldConstraint;
	private VCEntity vEntity;
	
	@Override 
	public void execute()
	
	{
		oldConstraint = vEntity.getConstraints();
		if(newConstraint !=null)
		{
			vEntity.setConstraints(newConstraint);
		}
		
		
	
		// 
		//vEntity.getVcContract().setName("");
		 
		
	}
	
	@Override
	public void undo()
	{
		if(oldConstraint != null)
		vEntity.setConstraints(oldConstraint);
	}

	public void setNewConstraints(Rectangle newConstraint) {
		this.newConstraint = newConstraint;
	}

	public void setModel(VCEntity newVCEntity) {
		this.vEntity = newVCEntity;
	}

	

}
