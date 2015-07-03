package com.abdulaziz.ms.ocv.visualContract.gef.command;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCInstance;

public class VCEntityCreateCommand extends Command {

	
	private static final String defualtName = "<...>";
	public static final Dimension size = new Dimension(120, 100);

	private VCContract vContract;
	private VCEntity vEntity;
	private Point location;
/*
	@Override
	public void execute() {
		vEntity.setName(defualtName);
		if (vEntity.getConstraints() == null) {
			vEntity.setConstraints(new Rectangle(location, size));
		}
		else
			vEntity.setConstraints(vEntity.getConstraints().setBounds(location,size));
		vEntity.setVcContract(vContract);

	}

	public void undo() {
		vEntity.setVcContract(null);
	}

	public void setvContract(VCContract vContract) {
		this.vContract = vContract;
	}

	public void setvEntity(VCEntity vEntity) {
		this.vEntity = vEntity;
	}

	public void setLocation(Point location) {
		this.location = location;
	}
*/
}
