package com.abdulaziz.ms.view;

import org.eclipse.gef.dnd.TemplateTransfer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.DragSourceListener;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.DropTargetListener;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLClassDiagram;
import com.abdulaziz.ms.OCV.UMLVariable;
import com.abdulaziz.ms.ocv.uml.gef.editor.part.OCVClassEditPart;
import com.abdulaziz.ms.ocv.uml.ms.model.UMLDiagramContentProvider;
import com.abdulaziz.ms.ocv.uml.ms.model.UMLDiagramLabelProvider;

public class TreeView2 extends ViewPart implements ISelectionListener{

	private TreeViewer treeViewer;
	private UMLClassDiagram umlDiagram;

	public TreeView2() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		getViewSite().getPage().addSelectionListener(this);  

		treeViewer = new TreeViewer(parent,SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		treeViewer.setContentProvider( new UMLDiagramContentProvider());
		treeViewer.setLabelProvider(new UMLDiagramLabelProvider());
		/// create UMLDiagram & classes 
		OCVFactory a = OCVFactory.eINSTANCE;
		umlDiagram = a.createUMLClassDiagram();
		UMLClass umlClass = a.createUMLClass();
		umlClass.setUmlDiagram(umlDiagram);
		umlClass.setClassName("DummyClass");
		//--
		UMLVariable var = OCVFactory.eINSTANCE.createUMLVariable();
		/*
		UMLOperation op = OCVFactory.eINSTANCE.createUMLOperation();
		UMLVariable var2 = OCVFactory.eINSTANCE.createUMLVariable();
		
		var2.setVariableName("Var X");
		var2.setVariableType("Double");
		
		op.getOperationParameters().add(var2);
		var.setVariableName("Var Y");
		var.setVariableType("Int");
		op.setOperationName("operation1");
		
		umlClass.getClassAttributes().add(var);
		*/
		/// End of creation of UMLDiagram & classes 
		
		treeViewer.setInput(umlDiagram); // the root is the UMLDiagram of all classes

		int operations = DND.DROP_MOVE | DND.DROP_COPY;
		Transfer[] transferTypes = new Transfer[]{TemplateTransfer.getInstance()};
		treeViewer.addDropSupport(operations, transferTypes, new DropTargetListener() {
			
			@Override
			public void dropAccept(DropTargetEvent event) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void drop(DropTargetEvent event) {

				Object x = event.data;
				OCVFactory a = OCVFactory.eINSTANCE;
				UMLClass umlClass = a.createUMLClass();
				umlClass.setUmlDiagram(umlDiagram);
			//	umlClass.setClassName((String)x);
				/// End of creation of UMLClass variables and operations

				/*
				UMLVariable var = OCVFactory.eINSTANCE.createUMLVariable();
				UMLOperation op = OCVFactory.eINSTANCE.createUMLOperation();
				UMLVariable var2 = OCVFactory.eINSTANCE.createUMLVariable();
				
				var2.setVariableName("Var X");
				var2.setVariableType("Double");
				
				op.getOperationParameters().add(var2);
				var.setVariableName("Var Y");
				var.setVariableType("Int");
				op.setOperationName("operation1");
				
				
				umlClass.getClassAttributes().add(var);*/
				/// End of creation of UMLDiagram & classes 
				
				/// - ---- - 
				treeViewer.setInput(umlDiagram); // the root is the UMLDiagram of all classes

			}
			
			@Override
			public void dragOver(DropTargetEvent event) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void dragOperationChanged(DropTargetEvent event) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void dragLeave(DropTargetEvent event) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void dragEnter(DropTargetEvent event) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	@Override
	public void setFocus() {
		treeViewer.getControl().setFocus();
		// TODO Auto-generated method stub

	}
	
	

	
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
	
		StructuredSelection structredSelection = (StructuredSelection) selection;
		Object firstElement = structredSelection.getFirstElement();
		if(firstElement instanceof OCVClassEditPart)
		{  // works when a class has been selected 
			//UMLClass umlClass = (UMLClass) ((OCVClassEditPart) firstElement).getModel();
	// update the tree viewer
			

			
		}
	}

}