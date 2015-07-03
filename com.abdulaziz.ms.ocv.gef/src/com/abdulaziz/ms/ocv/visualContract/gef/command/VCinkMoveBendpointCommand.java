package com.abdulaziz.ms.ocv.visualContract.gef.command;

import org.eclipse.draw2d.AbsoluteBendpoint;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.commands.Command;

import com.abdulaziz.ms.OCV.VCLink;

public class VCinkMoveBendpointCommand extends Command {
	
	private VCLink vcLink;
	private int index;
	private AbsoluteBendpoint bendpoint;
	private Point newLocation;
	private Point oldLocation;

	
	@Override
	public boolean canExecute()
	{
		return (vcLink != null && vcLink.getBendpoints().size() > index);
	}
	@Override 
	public void execute()
	{
		bendpoint = vcLink.getBendpoints().get(index);
		oldLocation = bendpoint.getLocation().getCopy();
		bendpoint.setLocation(newLocation);
	}
	
	@Override
	public void undo()
	{
		
		bendpoint.setLocation(oldLocation);

		
	}
	public void setVCLink(VCLink model) {
		vcLink = model;
		
	}

	public void setIndex(int index) {
		this.index = index;
		
	}
	public void setLocation(Point location) {
		newLocation = location;
		
	}



}
