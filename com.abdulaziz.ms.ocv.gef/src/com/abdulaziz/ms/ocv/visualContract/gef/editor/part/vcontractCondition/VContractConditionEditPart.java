package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcontractCondition;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VContractCondition;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.policy.VCContractConditionGraphicalNodeRolePolicy;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.policy.VContractConditionXYEditPolicy;
import com.abdulaziz.ms.ocv.visualContract.gef.util.VContractUtility;


public class VContractConditionEditPart extends AbstractGraphicalEditPart
{
	

	private ModelAdapter adapter;
	
	public VContractConditionEditPart()
	{ 
		adapter = new ModelAdapter(); 
	}
	
	

	@Override
	protected void createEditPolicies() {
		
	//	installEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE, new NonResizableEditPolicy()); 
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new VContractConditionXYEditPolicy());

		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new VCContractConditionGraphicalNodeRolePolicy());
		//
		
		
	/*	installEditPolicy(EditPolicy.CONTAINER_ROLE,new ContainerEditPolicy(){
			    @Override protected Command getCreateCommand(CreateRequest request){
			      System.out.println("Create in container canvas");
			      return null;
			    }
			  }
			);
			
			*/
			 
		
	}

	@Override
	public Command getCommand(Request request) {
		// TODO Auto-generated method stub
	
	if(request.getType() instanceof VCInstance)
	{
		System.out.println("- - - - - - - - "+	request.getType());
		VCInstance newInstance = (VCInstance) request.getType();
		addDroppedVCInstance(newInstance);
		
		
	}	
	
		return super.getCommand(request);
	}
	
	
	protected  void addDroppedVCInstance(VCInstance newInstance)
	{
		VContractCondition vcContractCondition = (VContractCondition) getModel();
		newInstance.setType(VContractUtility.VCINSTANCE_RETRIEVED);
		newInstance.setVContractCondition(vcContractCondition);		
		
		vcContractCondition.getVcEntities().add(newInstance);

	}



	@Override
	protected IFigure createFigure() {
		return new VContractConditionFigure();
	}

	@Override 
	protected void refreshVisuals()
	{
		VContractConditionFigure figure = (VContractConditionFigure) this.getFigure();
		VContractCondition vContractCondition = (VContractCondition) getModel();		
		figure.setLabel(vContractCondition.getType());
		figure.setLayout(vContractCondition.getConstaint());
	}

	@Override
	public List<Object> getModelChildren()
	{
		VContractCondition vcContract = (VContractCondition) getModel();
		List<Object> list = new ArrayList<>();
		list.addAll(vcContract.getVcEntities()); 
	//	list.addAll(vcContract.getVcLinks()); 
	
		return list;
		//  return Collections.unmodifiableList(list); // to move all element in the container 

	}
	
	@Override
	public void activate()
	{
		if(! isActive())
		{
			((VContractCondition)getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}
	
	@Override
	public void deactivate()
	{
		if(isActive())
		{
			((VContractCondition)getModel()).eAdapters().remove(adapter);
		}
		super.deactivate();
		
	}

	
	private class ModelAdapter implements Adapter {
	@Override
	public void notifyChanged(Notification notification) {
		refreshChildren();
		refreshVisuals();
		
	}

	@Override
	public Notifier getTarget() {
		return (VContractCondition) getModel();
	}

	@Override
	public void setTarget(Notifier newTarget) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return type.equals(VContractCondition.class);
	}
	}
	
}