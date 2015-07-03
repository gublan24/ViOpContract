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

import com.abdulaziz.ms.ocv.uml.gef.editor.figure.UMLClassFigure;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCAssociationEditPart;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCAttributeEditPart;

public class VCAssociationUpdateSelectionAction extends SelectionAction {
	
	public final static String UPDATE_VC_ASSOCIATION = "Update Association";
	public final static String REQ_UPDATE_VC_ASSOCIATION = "UpdateVCAssociation";
	private final static InputStream iconInputStream = VCAssociationUpdateSelectionAction.class.getResourceAsStream("field_private_obj.gif");
	Request request;
	
	public VCAssociationUpdateSelectionAction(IWorkbenchPart part) {
		super(part);
		setId(UPDATE_VC_ASSOCIATION);
		setText(UPDATE_VC_ASSOCIATION);
		request = new Request(REQ_UPDATE_VC_ASSOCIATION);
		setImageDescriptor(new ImageDescriptor() {
			
			@Override
			public ImageData getImageData() {
				return new ImageData(iconInputStream);
			}
		});
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
	            if(!(selectedObject instanceof VCAssociationEditPart))
	                return false;
	            
	        }
		return true;
	}

}
