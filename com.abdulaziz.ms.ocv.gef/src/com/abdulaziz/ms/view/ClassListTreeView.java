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
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.ocv.uml.gef.editor.part.OCVClassEditPart;
import com.abdulaziz.ms.ocv.uml.ms.model.UMLDiagramContentProvider;
import com.abdulaziz.ms.ocv.uml.ms.model.UMLDiagramLabelProvider;

public class ClassListTreeView extends ViewPart implements ISelectionListener {

	private TreeViewer treeViewer;
	public ClassListTreeView() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createPartControl(Composite parent) {
		getViewSite().getPage().addSelectionListener(this);  
		
		
		
//		getViewSite().getPage().addPartListener(listener);

		
	
  //      workbenchWindow.getPartService().addPartListener(this);
		
		
		treeViewer = new TreeViewer(parent,SWT.MULTI);
		treeViewer.setContentProvider( new UMLDiagramContentProvider());
		treeViewer.setLabelProvider(new UMLDiagramLabelProvider(treeViewer.getControl().getDisplay()));
		
		
		
		
		// Create the drag source on the tree
		int operations = DND.DROP_MOVE | DND.DROP_COPY;
		Transfer[] transferTypes= new Transfer[] {TemplateTransfer.getInstance()};
		treeViewer.addDragSupport(operations, transferTypes, new DragSourceListener() {
			
			@Override
			public void dragStart(DragSourceEvent event) {
				
				
				event.doit = !treeViewer.getSelection().isEmpty();

				
				/*
				// TreeViewer2 
				event.doit = !treeViewer.getSelection().isEmpty();
			*/
			}
			/*
			 * When the user drops the objects, the dragSetData() method is called to 
			 * convert the selected items before the transfer occurs
			 * (non-Javadoc)
			 * @see org.eclipse.swt.dnd.DragSourceListener#dragSetData(org.eclipse.swt.dnd.DragSourceEvent)
			 */
			@Override
			public void dragSetData(DragSourceEvent event) {
				IStructuredSelection selection =  (IStructuredSelection) treeViewer.getSelection();
				// --- to match GEF drop
				if(TemplateTransfer.getInstance().isSupportedType(event.dataType))
		        event.data = selection.getFirstElement();
				TemplateTransfer.getInstance().setTemplate(selection.getFirstElement());
		        //
		        
		        // to match treeViewer2 textTransfer 
		        /*
				UMLClass uml  = (UMLClass) selection.getFirstElement();
				if (TextTransfer.getInstance().isSupportedType(event.dataType)) {
					
					event.data = uml.getClassName();
				   //   event.data = firstElement.getShortDescription() + " " + firstElement.getLongDescription(); 
				    }
				    */

			}
			
			@Override
			public void dragFinished(DragSourceEvent event) {
				TemplateTransfer.getInstance().setTemplate(null);
			}
		});
		
		/*
		Button updateButton;
		updateButton = new Button(parent, SWT.BOTTOM);
		updateButton.setText("Update");
		updateButton.setBounds(100, 70, 60, 60);
		updateButton.addSelectionListener(new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				treeViewer.setContentProvider(null);
				treeViewer.collapseAll();
				
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		*/
	
	

	}

	@Override
	public void setFocus() {
		treeViewer.getControl().setFocus();
		// TODO Auto-generated method stub

	}
	
	

	
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
	
		if(selection instanceof StructuredSelection)
		{
		StructuredSelection structredSelection = (StructuredSelection) selection;
		Object firstElement = structredSelection.getFirstElement();
		if(firstElement instanceof OCVClassEditPart)
		{  // works when a class has been selected 
			UMLClass umlClass = (UMLClass) ((OCVClassEditPart) firstElement).getModel();
	// update the tree viewer
			treeViewer.setInput(umlClass.getUmlDiagram()); // the root is the UMLDiagram of all classes
			
			
			///----
	
			/*
			OCVMutiPageEditor view = (OCVMutiPageEditor) page.findView("com.abdulaziz.ms.ocv.gef.mutiTabEditor");
			if(view != null)
			view.createVContractPage();
	
			*/
			/// --- 
			

		}
		}
	}

}
