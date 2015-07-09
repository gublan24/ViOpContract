package com.abdulaziz.ms.ocv.visualContract.gef.editor;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.dnd.TemplateTransferDropTargetListener;
import org.eclipse.gef.requests.CreationFactory;
import org.eclipse.swt.dnd.DropTargetEvent;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.ocv.visualContract.gef.command.VCEntityCreateCommand;

public class VCTemplateTransferDropTargetListener extends TemplateTransferDropTargetListener {  

	public VCTemplateTransferDropTargetListener(EditPartViewer viewer) {
		super(viewer);
	}
				
	@Override
	public void drop(DropTargetEvent event) {
		
		if (event.data instanceof UMLClass){
			UMLClass draggedUMLClass = (UMLClass) event.data;
			Point eventDropLocationPoint = new Point(event.x, event.y);  // <== here the problem, event location does not consider scrolling down or right
			/* Problem comment: 
			 it looks like either the Canvas control doesn't have the size of the window/editor composite or the root figure doesn't have the right size. 
			 */
			final VCInstance newInstance = OCVFactory.eINSTANCE.createVCInstance();

			if (eventDropLocationPoint != null)
				newInstance.setConstraints(new Rectangle(getDropLocation().x , getDropLocation().y,VCEntityCreateCommand.size.height,VCEntityCreateCommand.size.width));

			newInstance.setUmlClass(draggedUMLClass);
			newInstance.setInstanceName("newInstance");

			draggedUMLClass.getVCInstances().add(newInstance);

			this.getCreateRequest().setType(newInstance);
			this.getCreateRequest().setFactory(new CreationFactory() {

				@Override
				public Object getObjectType() {
					return newInstance.getType();
				}

				@Override
				public Object getNewObject() {
					return newInstance;
				}
			});
			CompoundCommand compoundCommand = new CompoundCommand();
			EditPart editpart = getViewer().findObjectAt(getDropLocation());
			setTargetEditPart(editpart);
			//
			compoundCommand.add(editpart.getCommand(getCreateRequest()));
			compoundCommand.execute();

		}
		


	}


}