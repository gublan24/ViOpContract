package com.abdulaziz.ms.ocv.visualContract.gef.action;

import java.io.InputStream;
import java.util.List;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.ui.actions.SelectionAction;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.ui.IWorkbenchPart;

import com.abdulaziz.ms.OCV.VCAssociationDeletion;
import com.abdulaziz.ms.ocv.uml.gef.editor.figure.UMLClassFigure;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCAssociationEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCAttributeEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCDeleteAssociationEditPart;

public class VCAssociationDeletionUpdateSelectionAction extends SelectionAction {
	
	public final static String UPDATE_VC_ASSOCIATION_DELETION = "Association Deletion";
	public final static String REQ_UPDATE_VC_ASSOCIATION_DELETION = "UpdateVCAssociationDele";
	//private final static InputStream iconInputStream = VCAssociationDeletionUpdateSelectionAction.class.getResourceAsStream("field_private_obj.gif");
	Request request;
	
	public VCAssociationDeletionUpdateSelectionAction(IWorkbenchPart part) {
		super(part);
		setId(UPDATE_VC_ASSOCIATION_DELETION);
		setText(UPDATE_VC_ASSOCIATION_DELETION);
		request = new Request(REQ_UPDATE_VC_ASSOCIATION_DELETION);
		/*
		setImageDescriptor(new ImageDescriptor() {
			
			@Override
			public ImageData getImageData() {
				return new ImageData(iconInputStream);
			}
		});
		*/
	}

	

	@Override
	public void run()
	{
		@SuppressWarnings("unchecked")
		List <EditPart> selectedObjectsEditPart = getSelectedObjects();
		CompoundCommand compoundCommand = new CompoundCommand();
		
		for(EditPart editPart: selectedObjectsEditPart)
		{
			compoundCommand.add(editPart.getCommand(request));
		}
		
		execute(compoundCommand);
	}
	@Override
	protected boolean calculateEnabled() {
		
		 if(getSelectedObjects().isEmpty()) {
	            return false;
	        }
	        for(Object selectedObject : getSelectedObjects()) {
	            if(!(selectedObject instanceof VCDeleteAssociationEditPart))
	                return false;
	            
	        }
		return true;
	}

}
