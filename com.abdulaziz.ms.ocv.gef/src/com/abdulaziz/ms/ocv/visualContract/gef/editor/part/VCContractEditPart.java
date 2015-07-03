package com.abdulaziz.ms.ocv.visualContract.gef.editor.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.CoordinateListener;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LabeledContainer;
import org.eclipse.draw2d.LayoutListener;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.MouseMotionListener;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;

import com.abdulaziz.ms.OCV.UMLVariable;
import com.abdulaziz.ms.OCV.VCAssociation;
import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCAssociationFigure;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.policy.VContractXYEditPolicy;

public class VCContractEditPart extends AbstractGraphicalEditPart{

	private Adapter adapter;
	
	public VCContractEditPart(){
		
	adapter = new ModelAdapter(); 
	}

	LabeledContainer layer;
	@Override
	protected IFigure createFigure() {
		
		layer = new  LabeledContainer();
		layer.setLabel("");
		layer.setLayoutManager(new FreeformLayout());
		layer.setOpaque(true);
		
		
		return layer;
		
	}
	

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new VContractXYEditPolicy());


	}
	
	public IFigure getVContractFigure()
	{
		return layer;

	}
	
	protected  void refreshVisuals()
	{

		
		VCContract vcContract = (VCContract) getModel();
		String parameters = "()";
		if (vcContract.getUmlOperation().getOperationParameters().size() > 0) {
			parameters = "";
			for (UMLVariable var : vcContract.getUmlOperation().getOperationParameters()) 
			{
				parameters = parameters + " " + var.getVariableName() + ":"+ var.getVariableType() + ",";
			}
			parameters = parameters.substring(0, parameters.lastIndexOf(','));
			parameters = "(" + parameters + " )";
		}
		
		//TODO
		
		layer.setLabel(vcContract.getUmlOperation().getOperationName()+ parameters);
		



	}
	
	@Override
	public List<Object> getModelChildren()
	{
		
		VCContract vcContract = (VCContract) getModel();
		/*String parameters = "()";
		if (vcContract.getVOperationContract().getUmlOperation().getOperationParameters().size() > 0) {
			parameters = "";
			for (UMLVariable var : vcContract.getVOperationContract().getUmlOperation().getOperationParameters()) 
			{
				parameters = parameters + " " + var.getVariableName() + ":"+ var.getVariableType() + ",";
			}
			parameters = parameters.substring(0, parameters.lastIndexOf(','));
			parameters = "(" + parameters + " )";
		}
		
		//TODO
		
		layer.setLabel(vcContract.getVOperationContract().getUmlOperation().getOperationName()+ parameters);
*/
		List<Object> list = new ArrayList<>();
		list.add(vcContract.getPrecondition());
		list.add(vcContract.getPostcondition());
		//list.add(vcContract.getVcLinks());
		



		//return list;
		return Collections.unmodifiableList(list);

	}

	@Override
	public void activate()
	{
		if(! isActive())
		{
			((VCContract)getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}
	
	@Override
	public void deactivate()
	{
		if(isActive())
		{
			((VCContract)getModel()).eAdapters().remove(adapter);
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
		return (VCContract) getModel();
	}

	@Override
	public void setTarget(Notifier newTarget) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isAdapterForType(Object type) {
		return type.equals(VCContract.class);
	}
	}
	

}
