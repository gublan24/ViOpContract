package com.abdulaziz.ms.ocv.multiPageEditor;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.OCVPackage;
import com.abdulaziz.ms.OCV.UMLClassDiagram;
import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VOperation;
import com.abdulaziz.ms.ocv.systemOperation.gef.editor.SystemOperationGraphicalEditor;
import com.abdulaziz.ms.ocv.uml.gef.editor.OCVGraphicalEditor;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.ContractGraphicalEditor;

public class OCVMutiPageEditor extends MultiPageEditorPart implements IResourceChangeListener {
	
	private UMLClassDiagram umlClassDiagram;
	private URI resouceLocation;

	public OCVMutiPageEditor() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
	}
	
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		  super.init(site, input);
		  OCVPackage.eINSTANCE.eClass();
		  ResourceSet resourceSet = new ResourceSetImpl();
		  
		  if(input instanceof IFileEditorInput) {
			    IFileEditorInput fileInput = (IFileEditorInput) input;
			    IFile file = fileInput.getFile();				
			    resouceLocation = URI.createURI(file.getLocationURI().toString());
			    Resource resource = null;
				try {
					resource = resourceSet.getResource(resouceLocation, true);
				} catch (Exception e) {
			    	e.printStackTrace();
				}
				readEMFFile(resource);
		  }
		  // the file is empty; create a new uml diagram 
		  if (umlClassDiagram == null) {
			  umlClassDiagram = OCVFactory.eINSTANCE.createUMLClassDiagram();
			  umlClassDiagram.setName("Root Model");
		  }
		  
	}

	private void readEMFFile(Resource resource) {
		if(resource != null && !resource.getContents().isEmpty() && resource.getContents().get(0) instanceof UMLClassDiagram) {
			umlClassDiagram = (UMLClassDiagram) resource.getContents().get(0);	
		}
	}

	private void loadVcContract() {
		for (VOperation vOperation : umlClassDiagram.getSystemOperation().getClassOperations()) {
			if(vOperation.getVcContract() !=null)
			createVContractPage(vOperation.getVcContract(),vOperation.getVcContract().getPageIndex());
		}
	}
	
	@Override
	protected void createPages() {
		createDomainModelPage();
		createSYSPage();
		loadVcContract();
	}

	private void createDomainModelPage() {
		try {
			//GEF editor 
			OCVGraphicalEditor domainModelPageEditor = new OCVGraphicalEditor(umlClassDiagram);
			int index = addPage(domainModelPageEditor, getEditorInput());
			setPageText(index, "Domain Model");
			
			
			
			//gefEditor.getSite()
            /*Object c = getSelectedPage();
            
            if(c != null)
            {
			MenuItem item = new MenuItem(getControl(index).getMenu(), SWT.PUSH);
			item.setText("Hello");
            }
            */
		
	//		this.getControl(index)
			
		
		} catch (PartInitException e) {
			ErrorDialog.openError(getSite().getShell(),
					"Error in creating GEF editor", null, e.getStatus());
		}

	}
	
	
	private void createSYSPage() {
		try {

		
			//GEF editor 
			 SystemOperationGraphicalEditor sysOperationEditor = new SystemOperationGraphicalEditor(umlClassDiagram);
			int index = addPage(sysOperationEditor, getEditorInput());
			setPageText(index, "System Operation");
			
			
			
			getSelectedPage();
		
	//		this.getControl(index)
			
		
		} catch (PartInitException e) {
			ErrorDialog.openError(getSite().getShell(),
					"Error in creating GEF editor", null, e.getStatus());
		}

	}
	
	
	
	private void createVContractPage(VCContract vcContract, int index) {
		try {
			ContractGraphicalEditor gefEditor = new ContractGraphicalEditor(
					vcContract);
			addPage(index, gefEditor, this.getEditorInput());
			setPageText(index, vcContract.getName());
		} catch (PartInitException e) {
			ErrorDialog.openError(getSite().getShell(),
					"Error in creating VContract editor", null, e.getStatus());
		}

	}


	public void createVContractPage(VCContract vcContract) {
		
		
		try {
			ContractGraphicalEditor gefEditor = new ContractGraphicalEditor(vcContract);
			int index = addPage(gefEditor, getEditorInput());
			vcContract.setPageIndex(index);
			setPageText(index, vcContract.getName());
			//this.setActivePage(index);
		} catch (PartInitException e) {
			ErrorDialog.openError(getSite().getShell(),
					"Error in creating VContract editor", null, e.getStatus());
		}

	}

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		IFile file = ((IFileEditorInput) getEditorInput()).getFile();
		save(file, monitor);
		markSaveLocation();
	}

	private void save(IFile file, IProgressMonitor monitor) {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			Resource r = new XMIResourceFactoryImpl().createResource(URI.createURI("tmp"));
			r.getContents().add(umlClassDiagram);
			r.save(out, Collections.EMPTY_MAP);
			if(file.exists()) {
				file.setContents(new ByteArrayInputStream(out.toByteArray()), true, 
						false,
						monitor);
			} else {
				file.create(new ByteArrayInputStream(out.toByteArray()), true, monitor);
			}
		} catch (CoreException ce) {
			ce.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	private void markSaveLocation() {
		for(int idx = 0; idx < getPageCount(); idx++) {
			CommandStack commandStack = (CommandStack) getEditor(idx).getAdapter(CommandStack.class); // caste to CommandStack
			if(null != commandStack) {
				commandStack.markSaveLocation();	
			}
		}
	}

	@Override
	public void doSaveAs() {
		Shell shell = getSite().getWorkbenchWindow().getShell();
		SaveAsDialog dialog = new SaveAsDialog(shell);
		dialog.setOriginalFile(((IFileEditorInput) getEditorInput()).getFile());
		dialog.open();

		IPath path = dialog.getResult();
		if (path != null) {
			final IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
			try {
				new ProgressMonitorDialog(shell).run(false, false, 
						new WorkspaceModifyOperation() { 
							public void execute(final IProgressMonitor monitor) {
								save(file, monitor);
							}
						});
				setInput(new FileEditorInput(file));
				markSaveLocation();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			} catch (InvocationTargetException ite) {
				ite.printStackTrace();
			}
		}
	}

	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}
	
	@Override
	public void dispose() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this);
		
		super.dispose();
	}

	public void setCurrentActivePage(int pageIndex) {
		setActivePage(pageIndex);
		
	}
	public void setPageTitle(int pageIndex, String text) {
		setPageText(pageIndex, text);
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class type) {
		// -----
		super.getAdapter(type);
		
		if (type == ZoomManager.class)
		     return getPartProperty(ZoomManager.class.toString());
		
		return null;
	}

}
