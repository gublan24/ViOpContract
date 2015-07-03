package com.abdulaziz.ms.ocv.visualContract.gef.editor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.dnd.TemplateTransferDropTargetListener;
import org.eclipse.gef.editparts.ScalableRootEditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.actions.ZoomInAction;
import org.eclipse.gef.ui.actions.ZoomOutAction;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLClassDiagram;
import com.abdulaziz.ms.OCV.VCAssociation;
import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VCInstance;
import com.abdulaziz.ms.OCV.VOperation;
import com.abdulaziz.ms.ocv.uml.gef.editor.OCVGraphicalEditorContextMenuProvider;
import com.abdulaziz.ms.ocv.visualContract.gef.action.GenerateOperationContractAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.UpdateEqualitySelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.UpdateVCAlternativeSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.UpdateVCCollectionSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.UpdateVCInstanceFieldSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.UpdateVCLoopSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.UpdateVCParameterSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.UpdateVCValueSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.VCAssociationUpdateSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.VCAttributeUpdateSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.UpdateVCInstanceSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.command.VCEntityCreateCommand;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.ContractEditPartFactory;

import org.eclipse.swt.widgets.Group;

public class ContractGraphicalEditor extends GraphicalEditorWithFlyoutPalette {
	
	private VCContract vcContract;
	/*
	public ContractGraphicalEditor ()
	{
		setEditDomain( new DefaultEditDomain(this));
		this.setPartName(this.getClass().getName());
		loadInput();
	}
	*/
	
	
	@Override public void init(IEditorSite site, IEditorInput input) throws PartInitException {
	    super.init(site, input);
	 	  }

	
	public ContractGraphicalEditor (VCContract vcContract)
	{	
		setEditDomain( new DefaultEditDomain(this));
		this.setPartName(this.getClass().getName());
		this.vcContract = vcContract;
		
		
		
		
		
		
	

	}
/*
	private VCContract loadInput() {
		vcContract = OCVFactory.eINSTANCE.createVCContract();
		VCInstance vInstance = OCVFactory.eINSTANCE.createVCInstance();
		VCAssociation vAssociation = OCVFactory.eINSTANCE.createVCAssociation();
		vAssociation.setVcContract(vcContract);
		vInstance.setVcContract(vcContract);
		return vcContract;
	}
	*/
/*
	private class VCTemplateTransferDropTargetListener extends
			TemplateTransferDropTargetListener {

		public VCTemplateTransferDropTargetListener(EditPartViewer viewer) {
			super(viewer);
		}

		@Override
		public void drop(DropTargetEvent event) {
		
			if (event.data instanceof UMLClass) {
				
					UMLClass draggedUMLClass = (UMLClass) event.data;

					boolean ss = vcContract.getUmlOperation().getVSystem().getUmlDiagram().getClasses().contains(draggedUMLClass);
					VCInstance newInstance = OCVFactory.eINSTANCE.createVCInstance();					


					Point eventDropLocationPoint = this.getDropLocation();
					if (eventDropLocationPoint != null)
						newInstance.setConstraints(new Rectangle(eventDropLocationPoint.x,eventDropLocationPoint.y, VCEntityCreateCommand.size.height, VCEntityCreateCommand.size.width));

					newInstance.setUmlClass(draggedUMLClass);
					newInstance.setName("new instance of "	+ draggedUMLClass.getClassName());
					
					draggedUMLClass.getVCInstances().add(newInstance);					

					
					newInstance.setVcContract(vcContract);
//					draggedUMLClass.setUmlDiagram(null);
					
					//TODO does not work !!! 
					

				
			}

		}

	}

//
*/
	@Override
	protected PaletteRoot getPaletteRoot() {
		return new VContractGraphicalEditorPalette() ;
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		
	}
	
	protected void createGraphicalViewer(Composite parent) {
		GraphicalViewer viewer = new ScrollingGraphicalViewer();
		viewer.createControl(parent);
		setGraphicalViewer(viewer);
		configureGraphicalViewer();
		hookGraphicalViewer();
		initializeGraphicalViewer();
	}

	@Override
	public void configureGraphicalViewer()
	{
		super.configureGraphicalViewer();
		getGraphicalViewer().setEditPartFactory(new ContractEditPartFactory());
	   ScrollingGraphicalViewer viewer=(ScrollingGraphicalViewer)getGraphicalViewer();
		 
	  
	   viewer.addDropTargetListener(new VCTemplateTransferDropTargetListener(this.getGraphicalViewer()));
	 


		ZoomManager zoomManager = 
				((ScalableRootEditPart) getGraphicalViewer().getRootEditPart()).getZoomManager();
	    IAction zoomIn = new ZoomInAction(zoomManager);
	    IAction zoomOut = new ZoomOutAction(zoomManager);
	    getActionRegistry().registerAction(zoomIn);
	    getActionRegistry().registerAction(zoomOut);
		getGraphicalViewer().setContextMenu(new VContractGraphicalEditorContextMenuProvider (getGraphicalViewer(),getActionRegistry()));
		

	//	getGraphicalViewer().addDropTargetListener(new VCTemplateTransferDropTargetListener(getGraphicalViewer()));
	}

	
	@Override
	protected void initializeGraphicalViewer()
	{
		super.initializeGraphicalViewer();
	
		getGraphicalViewer().setContents(vcContract);
		
		
	}
	

	@SuppressWarnings("unchecked")
	@Override
	protected void createActions() {
		
	    VCAttributeUpdateSelectionAction action = new VCAttributeUpdateSelectionAction(this);
	    getActionRegistry().registerAction(action);
	    getSelectionActions().add(action.getId());
	    VCAssociationUpdateSelectionAction action2 = new VCAssociationUpdateSelectionAction(this);
	    getActionRegistry().registerAction(action2);
	    getSelectionActions().add(action2.getId());
	    UpdateVCInstanceSelectionAction action3 = new UpdateVCInstanceSelectionAction(this);
	    getActionRegistry().registerAction(action3);
	    getSelectionActions().add(action3.getId());
	    UpdateEqualitySelectionAction action4 = new UpdateEqualitySelectionAction(this);
	    UpdateVCAlternativeSelectionAction action5 = new UpdateVCAlternativeSelectionAction(this);
	    UpdateVCCollectionSelectionAction action6 = new UpdateVCCollectionSelectionAction(this);
	    UpdateVCInstanceFieldSelectionAction action7 = new UpdateVCInstanceFieldSelectionAction(this);
	    UpdateVCInstanceSelectionAction action8 = new UpdateVCInstanceSelectionAction(this);
	    UpdateVCLoopSelectionAction action9 = new UpdateVCLoopSelectionAction(this);
	    UpdateVCParameterSelectionAction action10 = new UpdateVCParameterSelectionAction(this);
	    UpdateVCValueSelectionAction action11 = new UpdateVCValueSelectionAction(this);
	    
	    GenerateOperationContractAction action12 = new GenerateOperationContractAction(this);
	
		getActionRegistry().registerAction(action4);
		getSelectionActions().add(action4.getId());
		getActionRegistry().registerAction(action5);
		getSelectionActions().add(action5.getId());
		getActionRegistry().registerAction(action6);
		getSelectionActions().add(action6.getId());
		getActionRegistry().registerAction(action7);
		getSelectionActions().add(action7.getId());
		getActionRegistry().registerAction(action8);
		getSelectionActions().add(action8.getId());
		getActionRegistry().registerAction(action9);
		getSelectionActions().add(action9.getId());
		getActionRegistry().registerAction(action10);
		getSelectionActions().add(action10.getId());
		getActionRegistry().registerAction(action11);
		getSelectionActions().add(action11.getId());
		getActionRegistry().registerAction(action12);
		getSelectionActions().add(action12.getId());

	 
	    super.createActions();
	}
	
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) 
    { 
        // If not the active editor, ignore selection changed. 
        // if (this.equals(getSite().getPage().getActiveEditor())) 
            updateActions(getSelectionActions()); 
    } 
}
