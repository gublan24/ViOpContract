package com.abdulaziz.ms.ocv.uml.gef.editor.part;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.jface.viewers.TextCellEditor;

import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLLink;
import com.abdulaziz.ms.OCV.UMLVariable;
import com.abdulaziz.ms.ocv.uml.gef.editor.command.OCVClassDeleteCommand;
import com.abdulaziz.ms.ocv.uml.gef.editor.figure.UMLClassFigure;
import com.abdulaziz.ms.ocv.uml.gef.editor.policy.OCVClassComponentEditPolicy;
import com.abdulaziz.ms.ocv.uml.gef.editor.policy.OCVClassGraphicalNodeEditPolicy;

public class OCVClassEditPart extends AbstractGraphicalEditPart implements NodeEditPart{

	private OCVClassAdapter adapter;
	
	public OCVClassEditPart()
	{
		super();
		adapter = new OCVClassAdapter();
	}
	@Override
	protected IFigure createFigure() {
		return new UMLClassFigure();
	}

	
	@Override
	protected void createEditPolicies() {
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new OCVClassGraphicalNodeEditPolicy());
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new OCVClassComponentEditPolicy());
	
	}
	
	
	@Override
	protected void refreshVisuals()
	{
		UMLClassFigure classFigure = (UMLClassFigure) getFigure();
		UMLClass umlClass = (UMLClass) getModel();
		OCVClassDiagramEditPart umlClassDiagram = (OCVClassDiagramEditPart) getParent();
		
		classFigure.setUMLClass(umlClass);
		classFigure.updateAttributes();
		Rectangle layout = umlClass.getConstraints();
		umlClassDiagram.setLayoutConstraint(this,classFigure,layout);
		
		
	}
	
	// --- adapter business
	@Override
	public void activate()
	{
		if(!isActive())
		{
			((UMLClass)getModel()).eAdapters().add(adapter);
		
		}
		super.activate();
		
	}
	@Override 
	public void deactivate()
	{

		if(isActive())
		{
			((UMLClass)getModel()).eAdapters().remove(adapter);
		
		}
		super.deactivate();
	}
	
	
	
	@Override
	protected List<UMLLink> getModelSourceConnections() {
		UMLClass model = (UMLClass) getModel();
		return model.getOutgoingLinks();
	}

	@Override
	protected List<UMLLink> getModelTargetConnections() {
		UMLClass model = (UMLClass) getModel();
	
		return model.getIncomingLinks() ;
	}

	@Override
	public ConnectionAnchor getSourceConnectionAnchor(
			ConnectionEditPart connection) {
		return ((UMLClassFigure) getFigure()).getConnectionAnchor();
	}
	@Override
	public ConnectionAnchor getTargetConnectionAnchor(
			ConnectionEditPart connection) {
		
		return ((UMLClassFigure) getFigure()).getConnectionAnchor();
	}
	@Override
	public ConnectionAnchor getSourceConnectionAnchor(Request request) {
		
		return ((UMLClassFigure) getFigure()).getConnectionAnchor();
	}
	@Override
	public ConnectionAnchor getTargetConnectionAnchor(Request request) {
		return ((UMLClassFigure) getFigure()).getConnectionAnchor();
	}
	public class OCVClassAdapter implements Adapter {
		 
	    // Adapter interface
	    @Override public void notifyChanged(Notification notification) {
	      refreshVisuals();
	      refreshSourceConnections();
	      refreshTargetConnections();
	    }
	 
	    @Override public Notifier getTarget() {
	      return (UMLClass)getModel();
	    }
	 
	    @Override public void setTarget(Notifier newTarget) {
	      // Do nothing.
	    }
	 
	    @Override public boolean isAdapterForType(Object type) {
	      return type.equals(UMLClass.class);
	    }
	  }

}
