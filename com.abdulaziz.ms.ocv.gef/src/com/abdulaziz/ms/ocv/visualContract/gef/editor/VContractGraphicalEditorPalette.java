package com.abdulaziz.ms.ocv.visualContract.gef.editor;

import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.SelectionToolEntry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.ImageData;

import com.abdulaziz.ms.ocv.uml.gef.util.Icon;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.figure.VCEntityFigure;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCInstanceFigure;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity.VCReturnFigure;
import com.abdulaziz.ms.ocv.visualContract.gef.factory.VCAlterBox;
import com.abdulaziz.ms.ocv.visualContract.gef.factory.VCAssociationCreationFactory;
import com.abdulaziz.ms.ocv.visualContract.gef.factory.VCAssociationDeletionFactory;
import com.abdulaziz.ms.ocv.visualContract.gef.factory.VCCollectionBoxFactory;
import com.abdulaziz.ms.ocv.visualContract.gef.factory.VCEqaulityFactory;
import com.abdulaziz.ms.ocv.visualContract.gef.factory.VCInstanceFactory;
import com.abdulaziz.ms.ocv.visualContract.gef.factory.VCInstanceFieldFactory;
import com.abdulaziz.ms.ocv.visualContract.gef.factory.VCLinkFactory;
import com.abdulaziz.ms.ocv.visualContract.gef.factory.VCLoopBoxFactory;
import com.abdulaziz.ms.ocv.visualContract.gef.factory.VCOperationBoxFactory;
import com.abdulaziz.ms.ocv.visualContract.gef.factory.VCParameterFactory;
import com.abdulaziz.ms.ocv.visualContract.gef.factory.VCReturnFactory;
import com.abdulaziz.ms.ocv.visualContract.gef.factory.VCValueFactory;

public class VContractGraphicalEditorPalette extends PaletteRoot {

	PaletteGroup group;
	 
	  public VContractGraphicalEditorPalette() {
	    addGroup();
	    addSelectionTool();
	    addVContactTool();

	  }
	 
	  private void addSelectionTool() {
	
	    SelectionToolEntry entry = new SelectionToolEntry();
	    group.add(entry);
	    setDefaultEntry(entry);
	  }
	 
	  private void addGroup() {
	    group = new PaletteGroup("VContact Controls");
	    add(group);
	  }
	 
	private void addVContactTool() {
		
		CreationToolEntry operationContractParameterCTE = new CreationToolEntry(
				"Primitive Parameter", "Operation Parameter",
				new VCParameterFactory(), new Icon(VContractGraphicalEditorPalette.class.getResourceAsStream("parameter_icon.png")), null);
		group.add(operationContractParameterCTE);

		CreationToolEntry equalityCTE = new CreationToolEntry("Comparator ",
				"creating new equality  ", new VCEqaulityFactory(), new Icon(VContractGraphicalEditorPalette.class.getResourceAsStream("equal_icon.png")), null);
		group.add(equalityCTE);

		/*
		CreationToolEntry operationBox = new CreationToolEntry("Operation Box",
				"", new VCOperationBoxFactory(), null, null);
		group.add(operationBox);
		*/

		CreationToolEntry instanceFieldCTE = new CreationToolEntry(
				"Instance Field", "", new VCInstanceFieldFactory(),  new Icon(VContractGraphicalEditorPalette.class.getResourceAsStream("instanceField_icon.png")), null);
		group.add(instanceFieldCTE);

		CreationToolEntry valueCTE = new CreationToolEntry("Value", "",
				new VCValueFactory(), new Icon(VContractGraphicalEditorPalette.class.getResourceAsStream("value_icon.png")), null);
		group.add(valueCTE);

		CreationToolEntry associationCreationEntry = new CreationToolEntry(
				"Asscoiation Creation", "creating new association ",
				new VCAssociationCreationFactory(), new Icon(VContractGraphicalEditorPalette.class.getResourceAsStream("association_icon.png")), null);
		group.add(associationCreationEntry);
		CreationToolEntry associationDeletionEntry = new CreationToolEntry(
				"Asscoiation Deletion -", "---",
				new VCAssociationDeletionFactory(), null, null);
		group.add(associationDeletionEntry);
		
		
		CreationToolEntry operationReturnEntry = new CreationToolEntry(
				"Operation Return ", "", new VCReturnFactory(), new Icon(VContractGraphicalEditorPalette.class.getResourceAsStream("return_icon.png")), null);
		group.add(operationReturnEntry);
		
		CreationToolEntry alternativeCTE = new CreationToolEntry(
				"Alternative", "", new VCAlterBox(),   new Icon(VContractGraphicalEditorPalette.class.getResourceAsStream("alt_icon.png")), null);
		group.add(alternativeCTE);

		CreationToolEntry collectionCTE = new CreationToolEntry(
				"Collection ", "", new VCCollectionBoxFactory(),  new Icon(VContractGraphicalEditorPalette.class.getResourceAsStream("col_icon.png")), null);
		group.add(collectionCTE);
		
		CreationToolEntry loopCTE = new CreationToolEntry(
				"Loop ", "", new VCLoopBoxFactory(),  new Icon(VContractGraphicalEditorPalette.class.getResourceAsStream("loop_icon.png")), null);
		group.add(loopCTE);

		ConnectionCreationToolEntry linkCreationEntry = new ConnectionCreationToolEntry(
				"Connect", "Add link between objects", new VCLinkFactory(),new Icon(VContractGraphicalEditorPalette.class.getResourceAsStream("arrow_icon.png")), null);

		group.add(linkCreationEntry);

	    
	  }
}
