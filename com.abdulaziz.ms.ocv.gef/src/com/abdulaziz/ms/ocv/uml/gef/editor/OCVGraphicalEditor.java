package com.abdulaziz.ms.ocv.uml.gef.editor;

import java.util.EventObject;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor.PropertyValueWrapper;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.dnd.TemplateTransferDropTargetListener;
import org.eclipse.gef.editparts.ScalableRootEditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.actions.ZoomInAction;
import org.eclipse.gef.ui.actions.ZoomOutAction;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.gef.ui.properties.UndoablePropertySheetEntry;
import org.eclipse.gef.ui.properties.UndoablePropertySheetPage;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;
import org.eclipse.ui.views.properties.PropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLClassDiagram;
import com.abdulaziz.ms.OCV.provider.OCVItemProviderAdapterFactory;
import com.abdulaziz.ms.ocv.uml.gef.action.UMLClassEditSelectionAction;
import com.abdulaziz.ms.ocv.uml.gef.editor.part.OCVEditPartFactory;

public class OCVGraphicalEditor extends GraphicalEditorWithFlyoutPalette implements ITabbedPropertySheetPageContributor{

	private UMLClassDiagram umlClassDiagram;
	
	public OCVGraphicalEditor(UMLClassDiagram umlClassDiagram) {
		setEditDomain(new DefaultEditDomain(this));
		this.umlClassDiagram = umlClassDiagram;
		this.setPartName("OCVGraphicalEditor");

	}

	@Override
	protected void initializeGraphicalViewer()
	{
		super.initializeGraphicalViewer();
	
		getGraphicalViewer().setContents(umlClassDiagram);
		
		
	}
	
	@Override
	public void commandStackChanged(EventObject event) {
		firePropertyChange(IEditorPart.PROP_DIRTY);
		super.commandStackChanged(event);
	}

	//
	
	private class OCVTemplateTransferDropTargetListener extends
			TemplateTransferDropTargetListener {

		public OCVTemplateTransferDropTargetListener(EditPartViewer viewer) {
			super(viewer);
		}

		@Override
		public void drop(DropTargetEvent event) {
			if (event.data != null) {
				System.out.println("Drop event --> " + event.data.toString());

			}

			try {

				OCVFactory ocvFactory = OCVFactory.eINSTANCE;
				UMLClass newUMLClass = ocvFactory.createUMLClass();
				newUMLClass.setClassName("ClassDrop");
				Point eventDropLocationPoint = this.getDropLocation();
				if (eventDropLocationPoint != null)
					newUMLClass.setConstraints(new Rectangle(eventDropLocationPoint.x, eventDropLocationPoint.y,150, 100));
				if (event.data instanceof UMLClass) {
					UMLClass draggedUMLClass = (UMLClass) event.data;
					newUMLClass.setClassName("Copy of"
							+ draggedUMLClass.getClassName());
					newUMLClass.getClassAttributes().addAll(
							draggedUMLClass.getClassAttributes()); //

				}
				newUMLClass.setUmlDiagram(umlClassDiagram);
			    
			
				//	
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
				umlClass.getClassOperations().add(op);
				
				umlClass.getClassAttributes().add(var);
				/// End of creation of UMLDiagram & classes
				 * 
				 */
				 
				}
				catch(Exception e)
				{
					System.out.print("UMLClass can not be droped here ..." +e.toString());
				}
				
			}
			
			
			
		}
	
	//
	
	@Override
	protected void configureGraphicalViewer()
	{
		super.configureGraphicalViewer();
		getGraphicalViewer().setEditPartFactory(new OCVEditPartFactory());
		getGraphicalViewer().setContextMenu(new OCVGraphicalEditorContextMenuProvider (getGraphicalViewer(),getActionRegistry()));
		
	//	getActionRegistry().registerAction(new DeleteRetargetAction());
	
		getGraphicalViewer().addDropTargetListener( new OCVTemplateTransferDropTargetListener(getGraphicalViewer()));
	
		ZoomManager zoomManager = ((ScalableRootEditPart) getGraphicalViewer().getRootEditPart()).getZoomManager();
	    IAction zoomIn = new ZoomInAction(zoomManager);
	    IAction zoomOut = new ZoomOutAction(zoomManager);
	    getActionRegistry().registerAction(zoomIn);
	    getActionRegistry().registerAction(zoomOut);
		
		
		/*
		 * the code below does not work very well , there is no way to determine the location of the drop event
		 * getGraphicalViewer().addDropTargetListener(
				new TransferDropTargetListener() {
				
			@Override
			public void dropAccept(DropTargetEvent event) {
				if(event.data != null)
				{
				
					System.out.println("DropAccept event --> "+ event.data.toString());
				}				
			}
			
			@Override
			public void drop(DropTargetEvent event) {
				if(event.data != null)
				{
					System.out.println("Drop event --> "+ event.data.toString());
					
				
				}
				
				try{
				UMLClass x = (UMLClass)event.data;
				OCVFactory a = OCVFactory.eINSTANCE;
				UMLClass umlClass = a.createUMLClass();
				
			
				
			 umlClass.setConstraints(new Rectangle(getGraphicalViewer().getControl().getLocation().x,getGraphicalViewer().getControl().getLocation().y ,100, 100));
				umlClass.setUmlDiagram(umlClassDiagram);
			//	umlClass.setClassName((String)x);
				/// End of creation of UMLClass variables and operations

				UMLVariable var = OCVFactory.eINSTANCE.createUMLVariable();
				UMLOperation op = OCVFactory.eINSTANCE.createUMLOperation();
				UMLVariable var2 = OCVFactory.eINSTANCE.createUMLVariable();
				
				var2.setVariableName("Var X");
				var2.setVariableType("Double");
				
				op.getOperationParameters().add(var2);
				var.setVariableName("Var Y");
				var.setVariableType("Int");
				op.setOperationName("operation1");
				umlClass.getClassOperations().add(op);
				
				umlClass.getClassAttributes().add(var);
				/// End of creation of UMLDiagram & classes 
				}
				catch(Exception e)
				{
					
				}
				
			}
			
			@Override
			public void dragOver(DropTargetEvent event) {
				if(event.data != null)
				{
					System.out.println("DragOver event --> "+ event.data.toString());
				}
				
			}
			
			@Override
			public void dragOperationChanged(DropTargetEvent event) {
				if(event.data != null)
				{
					System.out.println("DragOperationChanged event --> "+ event.data.toString());
				}
				
			}
			
			@Override
			public void dragLeave(DropTargetEvent event) {
				if(event.data != null)
				{
					System.out.println("DragLeave event --> "+ event.data.toString());
				}
				
			}
			
			@Override
			public void dragEnter(DropTargetEvent event) {
				if(event.data != null)
				{
					System.out.println("DragEnter event --> "+ event.data.toString());
				}
				
			}
			
			@Override
			public boolean isEnabled(DropTargetEvent event) {
				// TODO Auto-generated method stub
				return true;
			}
			
			@Override
			public Transfer getTransfer() {
				// TODO Auto-generated method stub
				return TemplateTransfer.getInstance();
			}
		});*/
	}

	@Override
	protected PaletteRoot getPaletteRoot() {
		return new OCVEditorPalette();
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void doSaveAs() {
		
	}
	
	@Override public void init(IEditorSite site, IEditorInput input) throws PartInitException {
	    super.init(site, input);
	}
	 
	/*
	  private void loadInput(IEditorInput input) {
	  OCVPackage.eINSTANCE.eClass();
	  umlClassDiagram = OCVFactory.eINSTANCE.createUMLClassDiagram();
	 
	  }
	  
	  */
	  
	  
	  
	  
	  /// property view code 
	PropertySheetPage propertyPage;

	/**
	 * This method implements adapting to {@link IPropertySheetPage}. All other
	 * requests are forwarded to the
	 * {@link GraphicalEditorWithFlyoutPalette#getAdapter(Class) parent}
	 * implementation.
	 */
	
	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class type) {
		// -----
		if (type == ZoomManager.class)
		     return getGraphicalViewer().getProperty(ZoomManager.class.toString());
		
		//---- 
		/*

		if (type == IPropertySheetPage.class)
		{
			TabbedPropertySheetPage propSheet = new TabbedPropertySheetPage(this);
            return propSheet;
		}
		*/
				if (type.equals(IPropertySheetPage.class)) {
			if (propertyPage == null) {
				propertyPage = (UndoablePropertySheetPage) super.getAdapter(type);
				// A new PropertySourceProvider was implemented to fetch the
				// model
				// from the edit part when required. The property source is
				// provided
				// by the generated EMF classes and wrapped by the
				// AdapterFactoryContentProvider
				// to yield standard eclipse interfaces.

				IPropertySourceProvider sourceProvider = new IPropertySourceProvider() {
					IPropertySourceProvider modelPropertySourceProvider = new AdapterFactoryContentProvider(new OCVItemProviderAdapterFactory());
					@Override
					public IPropertySource getPropertySource(Object object) {
						IPropertySource source = null;
						if (object instanceof EditPart) {
							Object model = ((EditPart) object).getModel();
							//if(model instanceof UMLClass)
							//	model = ((UMLClass) model).getClassAttributes().get(0);
							
							source = modelPropertySourceProvider.getPropertySource(model);
							
						} else {
							source = modelPropertySourceProvider
									.getPropertySource(object);
						}

						if (source != null) {
							return new UnwrappingPropertySource(source);
						} else {
							return null;
						}
					}

				};
				
				UndoablePropertySheetEntry root = new UndoablePropertySheetEntry(getCommandStack());
				root.setPropertySourceProvider(sourceProvider);
				propertyPage.setRootEntry(root);
			}
			
			return propertyPage;
		}
	
		return super.getAdapter(type);
	}
	  
	  public class UnwrappingPropertySource implements IPropertySource {
	        
		  private IPropertySource source;
	 
	        public UnwrappingPropertySource(final IPropertySource source) {
	            this.source = source;
	        }
	 
	        @Override
	        public Object getEditableValue() {
	        	
	            Object value = source.getEditableValue();
	            if(value instanceof PropertyValueWrapper) {
	                PropertyValueWrapper wrapper = (PropertyValueWrapper) value;
	                return wrapper.getEditableValue(null);
	            } else {
	                return source.getEditableValue();
	            }
	        }
	 
	        @Override
	        public IPropertyDescriptor[] getPropertyDescriptors() {
	        	return source.getPropertyDescriptors();
	        			
	        	
	    		
	        }
	 
	        @Override
	        public Object getPropertyValue(Object id) {
	            Object value = source.getPropertyValue(id);
	            if(value instanceof PropertyValueWrapper) {
	                PropertyValueWrapper wrapper = (PropertyValueWrapper) value;
	                return wrapper.getEditableValue(null);
	            } else {
	                return source.getPropertyValue(id);
	            }
	        }
	 
	        @Override
	        public boolean isPropertySet(Object id) {
	            return source.isPropertySet(id);
	        }
	 
	        @Override
	        public void resetPropertyValue(Object id) {
	            source.resetPropertyValue(id);
	        }
	 
	        @Override
	        public void setPropertyValue(Object id, Object value) {
	            source.setPropertyValue(id, value);
	        }
	    }

	  
	@Override
	public String getContributorId() {
		return getSite().getId();
	}

	/*
	public UMLClassDiagram getUmlClassDiagram() {
		return umlClassDiagram;
	}
	*/
	
	/*
	
	public GraphicalViewer getGraphicalViewer()
	{
		return getGraphicalViewer();
		
	}
	public ActionRegistry getRegistry()
	{
		return getActionRegistry();
	}
	
	*/
	
	/*
	@SuppressWarnings("unchecked")
	@Override
	protected void createActions()
	{
		 DeleteRetargetAction a = new DeleteRetargetAction();
		 getActionRegistry().registerAction(a);
		 getSelectionActions().add(a.getId());
		super.createActions();
	}
	*/
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.gef.ui.parts.GraphicalEditor#selectionChanged(org.eclipse.ui.IWorkbenchPart, org.eclipse.jface.viewers.ISelection)
	 * http://eclipse.1072660.n5.nabble.com/Multipage-editor-with-GEF-td69357.html
	 */
	
	@SuppressWarnings("unchecked")
	@Override
	protected void createActions() {
	    UMLClassEditSelectionAction action = new UMLClassEditSelectionAction(this);
	    getActionRegistry().registerAction(action);
	    getSelectionActions().add(action.getId());
	    
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
