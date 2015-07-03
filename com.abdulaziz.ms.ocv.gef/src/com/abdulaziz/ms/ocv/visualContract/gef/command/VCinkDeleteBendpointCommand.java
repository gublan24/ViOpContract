package com.abdulaziz.ms.ocv.visualContract.gef.command;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;
import org.eclipse.swt.widgets.Link;

import com.abdulaziz.ms.OCV.VCLink;

public class VCinkDeleteBendpointCommand extends Command{
	
	private VCLink vcLink;
	private int index;
	private AbsoluteBendpoint bendpoint;

	
	@Override
	public boolean canExecute()
	{
		return (vcLink != null && vcLink.getBendpoints().size() > index);
	}
	@Override 
	public void execute()
	{
		bendpoint = vcLink.getBendpoints().get(index);
		vcLink.getBendpoints().remove(index);
	}
	
	@Override
	public void undo()
	{
		vcLink.getBendpoints().add(index, bendpoint);
	}
	public void setVCLink(VCLink model) {
		vcLink = model;
		
	}



	public void setIndex(int index) {
		this.index = index;
		
	}

}
