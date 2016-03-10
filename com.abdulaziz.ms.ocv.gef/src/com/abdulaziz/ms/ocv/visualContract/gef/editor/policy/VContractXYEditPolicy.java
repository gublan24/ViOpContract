package com.abdulaziz.ms.ocv.visualContract.gef.editor.policy;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gef.requests.CreateRequest;

import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VCEntity;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VContractAlternativeBox;
import com.abdulaziz.ms.OCV.VContractCondition;
import com.abdulaziz.ms.ocv.uml.gef.editor.part.link.OCVLinkEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.command.VCEntityChangeConstraintsCommand;
import com.abdulaziz.ms.ocv.visualContract.gef.command.VCEntityCreateCommandByVContractCondition;
import com.abdulaziz.ms.ocv.visualContract.gef.command.VContractAlternativeBoxChangeConstraintsCommand;
import com.abdulaziz.ms.ocv.visualContract.gef.command.VContractConditionCommand;

public class VContractXYEditPolicy extends XYLayoutEditPolicy {
	
	
	 

	@Override
	protected Command createChangeConstraintCommand(EditPart child, Object constraint)
	{
		Command command = null;
		
		Object model = child.getModel();
		if (model instanceof VContractCondition)
		{
			VContractConditionCommand tempCommand = new VContractConditionCommand();
			tempCommand.setModel((VContractCondition)model);
			tempCommand.setNewConstraints((Rectangle) constraint);
		
			command = tempCommand;
		}
		
		if (model instanceof VCEntity)
		{
			//TODO
			VContractConditionCommand tempCommand = new VContractConditionCommand();
			tempCommand.setModel((VContractCondition)model);
			tempCommand.setNewConstraints((Rectangle) constraint);
		
			command = tempCommand;
		}
		else if (model instanceof VContractAlternativeBox)
		{
			VContractAlternativeBoxChangeConstraintsCommand tempCommand = new VContractAlternativeBoxChangeConstraintsCommand();
			tempCommand.setModel((VContractAlternativeBox) model);
			tempCommand.setNewConstraints((Rectangle) constraint);
			command = tempCommand;
		}
				
		return command;

	}

	@Override
	protected Command getCreateCommand(CreateRequest request) {
		
		Command command = null;
		
		/*
		if(request.getNewObject() instanceof VCEntity)
		{
			command = new VCEntityCreateCommand();
			command.setLocation(request.getLocation());
			//TODO try to add a precondition layer 
			command.setvContract((VCContract) getHost().getModel());
			command.setvEntity((VCEntity)request.getNewObject());
			
		}*/
		return command;
	}
	
	
	

	
	/*
	
	@Override
	  protected Command getMoveChildrenCommand(Request request) {
	      return getChangeConstraintCommand((ChangeBoundsRequest) request);
	  }
	   
	

	  @Override
	  protected Command getResizeChildrenCommand(ChangeBoundsRequest request) {
	      for(Object editPart : request.getEditParts()) {
	          if(editPart instanceof OCVLinkEditPart) {
	              return UnexecutableCommand.INSTANCE;
	          }
	      }
	      return getChangeConstraintCommand(request);
	  }
*/
	  

}
