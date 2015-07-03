package com.abdulaziz.ms.ocv.uml.gef.editor;


import org.eclipse.gef.palette.ConnectionCreationToolEntry;
import org.eclipse.gef.palette.CreationToolEntry;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.SelectionToolEntry;

import com.abdulaziz.ms.ocv.uml.gef.editor.factory.UMLClassFactory;
import com.abdulaziz.ms.ocv.uml.gef.editor.factory.UMLLinkFactory;

import com.abdulaziz.ms.ocv.uml.gef.util.Icon;
public class OCVEditorPalette extends PaletteRoot {

	PaletteGroup group;
	
	public OCVEditorPalette()
	{
		addGroup();
		addSelectionTool();
		addUMLClassTool();
		addUMLLinkTool();
	}
	private void addGroup()
	{
		group = new PaletteGroup("OCV Controls");
		add(group);
	}
	
	private void addSelectionTool() {
	    SelectionToolEntry entry = new SelectionToolEntry();
	    group.add(entry);
	    setDefaultEntry(entry);
	  }
	
	private void addUMLClassTool()
	{
		
		CreationToolEntry  entry = new CreationToolEntry("Class", "Create UML class", new UMLClassFactory(), new Icon(OCVEditorPalette.class.getResourceAsStream("ocls_class.png")), null);
		group.add(entry);
	}

	private void addUMLLinkTool() {
	    ConnectionCreationToolEntry entry = new ConnectionCreationToolEntry("Association", "Creates a new link", new UMLLinkFactory(UMLLinkFactory.ASSOCIATION_LINK),new Icon(OCVEditorPalette.class.getResourceAsStream("association.png")),null);
	    ConnectionCreationToolEntry entry2 = new ConnectionCreationToolEntry("Inheritance", "Creates a new link", new UMLLinkFactory(UMLLinkFactory.INHERITANCE_LINK), new Icon(OCVEditorPalette.class.getResourceAsStream("inherit.png")), null);
	    ConnectionCreationToolEntry entry3 = new ConnectionCreationToolEntry("Aggregation", "Creates a new link", new UMLLinkFactory(UMLLinkFactory.AGGREGATION_LINK), new Icon(OCVEditorPalette.class.getResourceAsStream("compo2.png")), null);

	    
	    group.add(entry);
	    group.add(entry2);
	    group.add(entry3);
	  }
}
