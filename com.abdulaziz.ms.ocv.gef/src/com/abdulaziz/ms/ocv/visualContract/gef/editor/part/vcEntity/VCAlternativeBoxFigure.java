package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FlowLayout;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LabeledContainer;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MouseEvent;
import org.eclipse.draw2d.MouseListener;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.TitleBarBorder;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;

import com.abdulaziz.ms.OCV.ConditionOption;
import com.abdulaziz.ms.ocv.visualContract.gef.editor.figure.VCEntityFigure;
import com.abdulaziz.ms.ocv.visualContract.gef.util.VContractUtility;

public class VCAlternativeBoxFigure extends Figure implements VCEntityFigure {

	private ConnectionAnchor connectionAnchor;
	private String name = " alt";
	private EList<ConditionOption> optionsArrayList;
	private Point xy;
	public VCAlternativeBoxFigure()
	{
	
		setBorder(new LineBorder(ColorConstants.black, 1));
		setOpaque(true);
		GridLayout layoutManager = new GridLayout(1, false);
		layoutManager.marginHeight = 25;
		layoutManager.marginWidth = 1;
		//setLayoutManager(layoutManager);
		setLayoutManager((new FreeformLayout()));
	}
	
	public Point getFigureLocation()
	{
		return xy;
	}
	
	
	@Override
	protected void paintFigure(Graphics graphics)
	{
	
		Rectangle r = getBounds().getCopy();
	    int x = r.x;
	    int y = r.y;
		int x2 =  x+ 15;
		int y2 =y + 20;
		int y3 = y+ 3;
		xy = new Point(x,y2);
	    graphics.drawLine(x, y2, x2,y2); 
	    graphics.drawText(name, x, y3);
	    
	    int y4 = y2-5;
	    int x4 = x2+5;
	    graphics.drawLine(x2, y2, x4,y4); 
	    graphics.drawLine(x4, y, x4,y4); 
 
	    int yPosition = 0;
	    
	    //  TODO : used in the alt wizard 
	    
	    int length = VContractUtility.ALT_INDINTATION_BOX;
	    
	    /*
	    for (int i =0 ; i< optionsArrayList.size(); i++)
	    {
	    	
	    
	    	yPosition =10+y+(length*(1+i));
	    	graphics.drawString(optionsArrayList.get(i).getName(), x+2, yPosition);
	    	// remove
	    	
				
	    	
	    	LabeledContainer figure = new LabeledContainer();
			figure.setLayoutManager(new FreeformLayout());
			
	    	add(figure, new Rectangle(x,yPosition+10,r.getBottomRight().x,
					yPosition+20));
	    	figure.setLabel("--"+i);
	    	
	    	if(i+1 == optionsArrayList.size())
	    		break;
	    	graphics.setLineStyle(SWT.LINE_SOLID	);
	    	graphics.drawLine(x, yPosition+20, r.getBottomRight().x,
					yPosition+20);
	    	
	   
	    }
	*/
	    /*
	    if(optionsArrayList.size() > 1)
	    {
	    Object e = optionsArrayList.get(optionsArrayList.size() - 1);
	    
		for (String option : optionsArrayList) {
			
			graphics.drawText(option, x+2 , y);
			
			Label a = new Label(option);
			this.add(a);
			int lineSeperatorYpoint = 0;
			
			if (!option.equals(e))
				lineSeperatorYpoint = a.getBounds().getBottom().y + 3;
			graphics.drawLine(x, lineSeperatorYpoint, r.getBottomRight().x,
					lineSeperatorYpoint);

		}
	    }
	    else 
	    {
	    	for (String option : optionsArrayList) {
				Label a = new Label(option);
				this.add(a);
	    }
	    }
	    */

	}

	

	@Override
	public ConnectionAnchor getConnectionAnchor() {
		if(connectionAnchor ==null)
		{
			connectionAnchor = new ChopboxAnchor(this);
		}
		return connectionAnchor;
	}

	public void setOptionsArraly(EList<ConditionOption> eList) {
		
		optionsArrayList = eList;
		
		
	}




	@Override
	public String getName() {
		return name ;
	}




	@Override
	public void setName(String name) {
		this.name = name;
		
	}


}
