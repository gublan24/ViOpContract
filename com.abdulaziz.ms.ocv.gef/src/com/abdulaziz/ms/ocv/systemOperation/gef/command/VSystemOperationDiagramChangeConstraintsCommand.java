package com.abdulaziz.ms.ocv.systemOperation.gef.command;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VSystemOperationDiagram;

public class VSystemOperationDiagramChangeConstraintsCommand extends Command {
	
	private Rectangle newConstraint;
	private Rectangle oldConstraint;
	private VSystemOperationDiagram vSystemOperation;
	
	@Override 
	public void execute()
	
	{
		oldConstraint = vSystemOperation.getConstraints();
		if(newConstraint !=null)
		{
			vSystemOperation.setConstraints(newConstraint);
		}
		
		// 
		 
		
	}
	
	@Override
	public void undo()
	{
		if(oldConstraint != null)
		vSystemOperation.setConstraints(oldConstraint);
	}

	public void setNewConstraints(Rectangle newConstraint) {
		this.newConstraint = newConstraint;
	}

	public void setModel(VSystemOperationDiagram newyVstemOperatio) {
		this.vSystemOperation = newyVstemOperatio;
	}

	

}
