package com.abdulaziz.ms.ocv.multiPageEditor;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.FileStoreEditorInput;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.MultiPageEditorPart;
import org.eclipse.ui.IFileEditorInput;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.OCVPackage;
import com.abdulaziz.ms.OCV.UMLClassDiagram;
import com.abdulaziz.ms.OCV.VCContract;
import com.abdulaziz.ms.OCV.VOperation;
import com.abdulaziz.ms.ocv.systemOperation.gef.editor.SystemOperationGraphicalEditor;
import com.abdulaziz.ms.ocv.uml.gef.editor.OCVGraphicalEditor;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.ContractGraphicalEditor;
import com.abdulaziz.ms.ocv.visualContract.gef.util.VContractUtility;

public class OCVMutiPageEditor extends MultiPageEditorPart implements
		IResourceChangeListener {
	
	private UMLClassDiagram umlClassDiagram;
	private String resouceFilePath;

	
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		  super.init(site, input);
		  OCVPackage.eINSTANCE.eClass();
		  ResourceSet resourceSet = new ResourceSetImpl();
		  
		  if (input instanceof FileStoreEditorInput)
		  {
			FileStoreEditorInput fileInput = (FileStoreEditorInput) input;
			resouceFilePath = Paths.get(fileInput.getURI()).toString();
			String uri = resouceFilePath;
			Resource resource = null;
			try {
			 resource = resourceSet.getResource(URI.createFileURI(uri), true);
			}
		    catch (Exception e) {
			e.printStackTrace();
			}			
			readEMFFile(resource);

		}
		  
		  else if(input instanceof IFileEditorInput) {
			    IFileEditorInput fileInput = (IFileEditorInput) input;
			    IFile file = fileInput.getFile();				
			    resouceFilePath = Paths.get(file.getLocationURI()).toString();
			    Resource resource = null;
			    String uri = file.getLocationURI().toString();
				try {
			     resource  =resourceSet.getResource(URI.createURI(file.getLocationURI().toString()), true);
			    
				}
			    catch (Exception e) {
			    	
				e.printStackTrace();
				}
			    
				readEMFFile(resource);

			    
		  }
			
		  // the file is empty; create a new uml diagram 
		  if (umlClassDiagram == null) 
		  {
			umlClassDiagram = OCVFactory.eINSTANCE.createUMLClassDiagram();
			umlClassDiagram.setName("Root Model");
			}
		  
		}

	private void readEMFFile(Resource resource) {
		if(resource == null)
			return;
		if((!resource.getContents().isEmpty()) && resource.getContents().get(0) instanceof UMLClassDiagram)
		umlClassDiagram = (UMLClassDiagram) resource.getContents().get(0);
	}

	private void loadVcContract() {
		for (VOperation vOperation : umlClassDiagram.getSystemOperation().getClassOperations()) {
			if(vOperation.getVcContract() !=null)
			createVContractPage(vOperation.getVcContract(),vOperation.getVcContract().getPageIndex());
			
		}
	}
	
	public OCVMutiPageEditor() {
		super();
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this);
		
		
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

		if (resouceFilePath == null || resouceFilePath.trim().length() < 2)
			return;
		monitor.beginTask("saving: " + resouceFilePath, monitor.UNKNOWN);
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> factoryMap = reg.getExtensionToFactoryMap();
		factoryMap.put("mocv", new XMIResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(URI
				.createFileURI(resouceFilePath));
		resource.getContents().add(umlClassDiagram);
		try {
			resource.save(Collections.EMPTY_MAP);

		} catch (IOException e) {
			e.printStackTrace();
		}

		monitor.done();

	}

	@Override
	public void doSaveAs() {
		
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isSaveAsAllowed() {
		return false;
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
	
	public boolean isDirty()
	{
		return true;
		
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
