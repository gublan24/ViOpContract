package com.abdulaziz.ms.ocv.systemOperation.gef.editor.part;

import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.gef.editpolicies.GraphicalEditPolicy;

import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.VSystemOperationDiagram;
import com.abdulaziz.ms.ocv.systemOperation.gef.editor.policy.SystemOperationGraphicalNodeEditPolicy;
import com.abdulaziz.ms.ocv.systemOperation.gef.editor.policy.VSystemOperationXYEditPolicy;
import com.abdulaziz.ms.ocv.uml.gef.editor.figure.UMLClassFigure;
import com.abdulaziz.ms.ocv.uml.gef.editor.part.OCVClassDiagramEditPart;
import com.abdulaziz.ms.ocv.uml.gef.editor.policy.OCVClassGraphicalNodeEditPolicy;

public class VSystemOperationEditPart extends AbstractGraphicalEditPart {
private OCVClassAdapter adapter;
	
	public VSystemOperationEditPart()
	{
		super();
		adapter = new OCVClassAdapter();
	}
	@Override
	protected IFigure createFigure() {
		 UMLClassFigure vSystemOperationFigure = new UMLClassFigure();
		 vSystemOperationFigure.setClassNameIcon(null);
		
		return vSystemOperationFigure;
	}

	
	@Override
	protected void createEditPolicies() {
		installEditPolicy(GraphicalEditPolicy.GRAPHICAL_NODE_ROLE, new SystemOperationGraphicalNodeEditPolicy());
	
	}
	
	
	@Override
	protected void refreshVisuals()
	{
		UMLClassFigure classFigure = (UMLClassFigure) getFigure();
		VSystemOperationDiagram systemOperation = (VSystemOperationDiagram) getModel();
		RootSysOperationClassDiagramEditPart umlClassDiagram = (RootSysOperationClassDiagramEditPart) getParent();
		classFigure.setClassName("<<"+ systemOperation.getName() + ">>");
		classFigure.setOperation(systemOperation);
		classFigure.updatOperatios();
		Rectangle layout = systemOperation.getConstraints();
		

		umlClassDiagram.setLayoutConstraint(this,classFigure,layout);
		
		
	}
	
	// --- adapter business
	@Override
	public void activate()
	{
		if(!isActive())
		{
			((VSystemOperationDiagram)getModel()).eAdapters().add(adapter);
		
		}
		super.activate();
		
	}
	@Override 
	public void deactivate()
	{

		if(isActive())
		{
			((VSystemOperationDiagram)getModel()).eAdapters().remove(adapter);
		
		}
		super.deactivate();
	}
	
	
	


	
	public class OCVClassAdapter implements Adapter {
		 
	    // Adapter interface
	    @Override public void notifyChanged(Notification notification) {
	      refreshVisuals();
	
	    }
	 
	    @Override public Notifier getTarget() {
	      return (VSystemOperationDiagram)getModel();
	    }
	 
	    @Override public void setTarget(Notifier newTarget) {
	      // Do nothing.
	    }
	 
	    @Override public boolean isAdapterForType(Object type) {
	      return type.equals(VSystemOperationDiagram.class);
	    }
	  }

}
