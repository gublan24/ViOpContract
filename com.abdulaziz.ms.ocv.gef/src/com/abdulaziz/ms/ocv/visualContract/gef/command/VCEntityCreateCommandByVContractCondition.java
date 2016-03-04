package com.abdulaziz.ms.ocv.visualContract.gef.command;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VContractCollectionBox;
import com.abdulaziz.ms.OCV.VContractCondition;
import com.abdulaziz.ms.OCV.VContractLoopBox;
import com.abdulaziz.ms.OCV.VContractPostcondition;
import com.abdulaziz.ms.ocv.visualContract.gef.util.VCEntitiesRulesManager;
import com.abdulaziz.ms.ocv.visualContract.gef.util.VContractUtility;

public class VCEntityCreateCommandByVContractCondition extends Command {

	private VContractCondition vContractCondition;
	private VCEntity vEntity;
	private Point location;

	
	@Override
	public boolean canExecute()
	{
			return VCEntitiesRulesManager.checkAddEntityRules(vContractCondition, vEntity);
	}
	
	@Override
	public void execute() {
	
		vEntity.setName(VContractUtility.VCEnity_DEFAULT_LABEL);
		if (vEntity.getConstraints() == null) {
			vEntity.setConstraints(new Rectangle(location, VContractUtility.VCEntity_DEFAULT_SIZE));
		}
		else
			vEntity.setConstraints(new Rectangle (location,vEntity.getConstraints().getSize()));
		if ( !((vContractCondition instanceof VContractCollectionBox) || ((vContractCondition instanceof VContractLoopBox))))
		vEntity.setVContractCondition(vContractCondition);
		vContractCondition.getVcEntities().add(vEntity);
		VCEntitiesRulesManager.applyAddEntityRules(vContractCondition, vEntity);
		

	}

	public void undo() {
		
		//TODO 
		vContractCondition.getVcEntities().remove(vEntity);
		VCEntitiesRulesManager.applyDeleteVCEntityRules(vContractCondition, vEntity);

		vEntity = null;

		
	}

	public void setvContractCondition(VContractCondition vContractCondition) {
		this.vContractCondition = vContractCondition;
	}

	public void setvEntity(VCEntity vEntity) {
		this.vEntity = vEntity;
	}

	public void setLocation(Point location) {
		this.location = location;
	}

}
