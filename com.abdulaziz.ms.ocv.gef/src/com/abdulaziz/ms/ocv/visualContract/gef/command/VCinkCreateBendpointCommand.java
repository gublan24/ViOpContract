package com.abdulaziz.ms.ocv.visualContract.gef.command;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import com.abdulaziz.ms.OCV.VCLink;

public class VCinkCreateBendpointCommand extends Command {

	private VCLink vcLink;
	private int index;
	private AbsoluteBendpoint bendpoint;

	@Override 
	public void execute()
	{
		vcLink.getBendpoints().add(index,bendpoint);
		
	}
	
	@Override
	public void undo()
	{
		vcLink.getBendpoints().remove(index);
	}
	public void setVCLink(VCLink model) {
		vcLink = model;
		
	}

	public void setLocation(Point point) {
		bendpoint =  new AbsoluteBendpoint(point);
	}

	public void setIndex(int index) {
		this.index = index;
		
	}

}
