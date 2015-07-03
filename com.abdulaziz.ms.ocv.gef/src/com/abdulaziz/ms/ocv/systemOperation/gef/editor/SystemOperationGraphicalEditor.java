package com.abdulaziz.ms.ocv.systemOperation.gef.editor;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.UMLClassDiagram;
import com.abdulaziz.ms.OCV.VOperation;
import com.abdulaziz.ms.OCV.VSystemOperationDiagram;
import com.abdulaziz.ms.OCV.impl.OCVFactoryImpl;
import com.abdulaziz.ms.ocv.systemOperation.gef.action.EditSystemOperationSelectionAction;
import com.abdulaziz.ms.ocv.systemOperation.gef.editor.part.SysOperationEditPartFactory;
import com.abdulaziz.ms.ocv.uml.gef.editor.OCVGraphicalEditorContextMenuProvider;
import com.abdulaziz.ms.ocv.visualContract.gef.action.VCAssociationUpdateSelectionAction;
import com.abdulaziz.ms.ocv.visualContract.gef.action.VCAttributeUpdateSelectionAction;

public class SystemOperationGraphicalEditor extends GraphicalEditorWithFlyoutPalette{

	private UMLClassDiagram umlClassDiagram;
	
	/*
	public SystemOperationGraphicalEditor()
	{
		setEditDomain(new DefaultEditDomain(this));
		this.setPartName(this.getClass().getName());
		
	}
	*/
	public SystemOperationGraphicalEditor(UMLClassDiagram umlClassDiagram)
	{
		setEditDomain(new DefaultEditDomain(this));
		this.setPartName(this.getClass().getName());
		this.umlClassDiagram = umlClassDiagram;
		
	}
	@Override public void init(IEditorSite site, IEditorInput input) throws PartInitException {
	    super.init(site, input);
	 	  }
	@Override 
	protected void configureGraphicalViewer()
	{
		super.configureGraphicalViewer();
		getGraphicalViewer().setEditPartFactory(new SysOperationEditPartFactory());
		getGraphicalViewer().setContextMenu(new  SystemOperationContextMenuProvider(getGraphicalViewer(),getActionRegistry()));


	}
	@Override
	protected void initializeGraphicalViewer() {
		VSystemOperationDiagram systemOperation;
		if (umlClassDiagram.getSystemOperation() != null)
			systemOperation = umlClassDiagram.getSystemOperation();
		else {
			systemOperation = OCVFactory.eINSTANCE.createVSystemOperationDiagram();
			systemOperation.setConstraints(new Rectangle(208, 20, 230, 232));
			umlClassDiagram.setSystemOperation(systemOperation);

			// dummy operation
			VOperation b = OCVFactory.eINSTANCE.createVOperation();
			b.setOperationName("calculateTotal");
			b.setOperationReturnType("Integer");
			b.setVSystem(systemOperation);
			systemOperation.getClassOperations().add(b);

		}
	
		
		
		getGraphicalViewer().setContents(umlClassDiagram);
		
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		
	}
	public UMLClassDiagram getClassDiagram() {
		return umlClassDiagram;
	}
	public void setClassDiagram(UMLClassDiagram classDiagram) {
	//	this.umlClassDiagram = classDiagram;
	}
	@Override
	protected PaletteRoot getPaletteRoot() {
		// TODO Auto-generated method stub
		return null;
	}
	@SuppressWarnings("unchecked")
	@Override
	protected void createActions() {
		
	  
	    EditSystemOperationSelectionAction action = new EditSystemOperationSelectionAction(this);
	    getActionRegistry().registerAction(action);
	    getSelectionActions().add(action.getId());
	 
	    super.createActions();
	}
	
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) 
    { 
     
            updateActions(getSelectionActions()); 
    } 
	




}
