package com.abdulaziz.ms.ocv.uml.gef.editor.command;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;

import com.abdulaziz.ms.OCV.OCVFactory;
import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLClassDiagram;
import com.abdulaziz.ms.OCV.UMLVariable;

public class OCVClassCreateCommand extends Command {
	private static final Dimension defaultDimension = new Dimension(150, 100);
	private static String defaultName = "Class";

	private UMLClassDiagram parentUMClassDiagram;
	private UMLClass umlclass;
	private Rectangle classRectangle;

	@Override
	public void execute() {

		// to make the new class name as "Class1", "Class1" and so on
		umlclass.setClassName(defaultName + (parentUMClassDiagram.getClasses().size()+1));

		if (classRectangle != null)
			umlclass.setConstraints(classRectangle);
		umlclass.setUmlDiagram(parentUMClassDiagram);
		
		// -- dummy attribute and operation
		
		
		UMLVariable var = OCVFactory.eINSTANCE.createUMLVariable();
		UMLVariable var2 = OCVFactory.eINSTANCE.createUMLVariable();

		var2.setVariableName("Var2");
		var2.setVariableType("Double");

		var.setVariableName("Attribute1");
		var.setVariableType("Int");
		umlclass.getClassAttributes().add(var);
		//

	
	}
		
		
	

	@Override
	public void undo() {
		umlclass.setUmlDiagram(null);
	}

	public void setUMLClass(UMLClass newUMLClass) {
		this.umlclass = newUMLClass;
	}

	public void setLocation(Point point) {
		classRectangle = new Rectangle();
		classRectangle.setLocation(point);
		classRectangle.setSize(defaultDimension);

	}

	public void setParent(UMLClassDiagram parentUMLClassDiagram) {
		this.parentUMClassDiagram = parentUMLClassDiagram;
	}




	public void setClassName(String string) {
		umlclass.setClassName(defaultName);
	}

}
