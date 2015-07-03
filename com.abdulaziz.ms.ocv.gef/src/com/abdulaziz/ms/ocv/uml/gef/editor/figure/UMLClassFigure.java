package com.abdulaziz.ms.ocv.uml.gef.editor.figure;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;

import com.abdulaziz.ms.OCV.UMLClass;
import com.abdulaziz.ms.OCV.UMLVariable;
import com.abdulaziz.ms.OCV.VOperation;
import com.abdulaziz.ms.OCV.VSystemOperationDiagram;

public class UMLClassFigure extends Figure {

	public ConnectionAnchor connectionAnchor;
	private Label className;
	public CompartmentFigure attributeFigure;
	private CompartmentFigure methodFigure;
	private static Color classColor = new Color(null, 255, 255, 206);
	private static int colorWidth = 1;
	private Font classFont = new Font(null, "Arial", 10, SWT.BOLD);
	private UMLClass umlClass;
	private static Image umlClassNameIcon =new Image(null, UMLClassFigure.class.getResourceAsStream("class_obj.gif")); 

	private VSystemOperationDiagram operation;
	
	public UMLClassFigure() {
		
		ToolbarLayout layout = new ToolbarLayout();
		setLayoutManager(layout);
		setBorder(new LineBorder(ColorConstants.black, colorWidth));
		setBackgroundColor(classColor);
		setOpaque(true);
		attributeFigure = new CompartmentFigure();
		methodFigure = new CompartmentFigure();
		className = new Label();
		className.setIcon(umlClassNameIcon);
		className.setFont(getClassFont());
		add(className);
		add(attributeFigure);
		add(methodFigure);
		
		
	
		
	
	}
	
	public void setClassNameIcon(Image umlClassNameIcon)
	{
		className.setIcon( umlClassNameIcon);
	
	}

	public void setUMLClass(UMLClass umlClass)
	{
		this.umlClass = umlClass;
		className.setText(umlClass.getClassName());

	}

	public CompartmentFigure getAttributesCompartment() {
		return attributeFigure;
	}


	public CompartmentFigure getMethodsCompartment() {
		return methodFigure;
	}

	public String getClassName() {
		return className.getText();
	}

	public void setClassName(String className) {
		this.className.setText(className);
	}

	public void setClassNameLabel(Label className) {
		this.className = className;
	}

	public Font getClassFont() {
		return classFont;
	}

	public void setClassFont(Font classFont) {
		this.classFont = classFont;
	}

	public ConnectionAnchor getConnectionAnchor() {
		if (connectionAnchor == null) {
			connectionAnchor = new ChopboxAnchor(this);
		}
		return connectionAnchor;
	}

	public void removeAttributeFigure()
	{
		if(attributeFigure != null)
		{
			remove(attributeFigure);
		}
		
		
		
	}

	public void updateAttributes() {
		
		removeAttributeFigure();
		attributeFigure = new CompartmentFigure();
		add(attributeFigure);

		for (UMLVariable attribute : umlClass.getClassAttributes()) {
			Label label = new Label();
			label.setIcon(new Image(null, UMLClassFigure.class.getResourceAsStream("field_private_obj.gif")));
			label.setText(attribute.getVariableName() );
			this.getAttributesCompartment().add(label);
		}
	
		
	}
public void updatOperatios() {
		
		if (methodFigure != null) {
			remove(methodFigure);
		}

		methodFigure = new CompartmentFigure();
		add(methodFigure);
		if (operation != null) {
			for (VOperation attribute : operation.getClassOperations()) {
				Label label = new Label();
				label.setIcon(new Image(null, UMLClassFigure.class.getResourceAsStream("methpub_obj.gif")));
				label.setText( attribute.getOperationName());
				methodFigure.add(label);
			}
		}

	}

public VSystemOperationDiagram getOperation() {
	return operation;
}


public void setOperation(VSystemOperationDiagram operation) {
	this.operation = operation;
}
	
	
	
	

}