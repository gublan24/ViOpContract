package com.abdulaziz.ms.ocv.uml.gef.editor.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLClassDiagram;
import com.abdulaziz.ms.ocv.uml.gef.editor.policy.OCVClassComponentEditPolicy;
import com.abdulaziz.ms.ocv.uml.gef.editor.policy.OCVClassGraphicalNodeEditPolicy;
import com.abdulaziz.ms.ocv.uml.gef.editor.policy.UMLClassXYLayoutPolicy;

public class OCVClassDiagramEditPart extends AbstractGraphicalEditPart {

	private OCVClassDiagramAdapter adapter;
	
	public OCVClassDiagramEditPart()
	{
		super();
		adapter = new OCVClassDiagramAdapter();
	}
	
	@Override
	protected IFigure createFigure() {
		FreeformLayer layer  = new FreeformLayer();
		layer.setLayoutManager(new FreeformLayout());
		layer.setBorder(new LineBorder(1));
		return layer;
	}

	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new UMLClassXYLayoutPolicy());
		


	}
	
	@Override
	protected List<Object> getModelChildren()
	{
		List<Object> classList = new ArrayList<Object>(); 
		UMLClassDiagram classDiagram = (UMLClassDiagram) getModel();
		classList.addAll(classDiagram.getClasses());
		//classList.addAll(classDiagram.getLinks()); //  duplicates the link's drawing 

		return classList;
		
	}
	// adapter business 
	
	@Override 
	public void activate()
	{
		if(! isActive())
		{
			((UMLClassDiagram)getModel()).eAdapters().add(adapter);
		}
		super.activate();
	}
	
	@Override
	public void deactivate()
	{
		if(isActive())
		{
			((UMLClassDiagram)getModel()).eAdapters().remove(adapter);
			}
		super.deactivate();
	}
	
	class OCVClassDiagramAdapter implements Adapter{

		@Override
		public void notifyChanged(Notification notification) {
		
			refreshChildren();
			
		}

		@Override
		public Notifier getTarget() {
			
			return (UMLClassDiagram)getModel();
		}

		@Override
		public void setTarget(Notifier newTarget) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean isAdapterForType(Object type) {
			return type.equals(UMLClassDiagram.class);
		}
		
	}

}
