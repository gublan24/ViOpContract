package com.abdulaziz.ms.ocv.visualContract.gef.editor.part.vcEntity;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.SWT;

import com.abdulaziz.ms.ocv.visualContract.gef.editor.figure.VCEntityFigure;
import com.abdulaziz.ms.ocv.visualContract.gef.util.VContractUtility;

public class VCCollectionBoxFigure extends Figure implements VCEntityFigure {

	private ConnectionAnchor connectionAnchor;
	private String name = "collection";
	public VCCollectionBoxFigure()
	{
	
		 setBorder(new LineBorder(ColorConstants.black, 1));
		 setOpaque(true);
		 XYLayout layout = new XYLayout();
		setLayoutManager(layout);
			
	}
	
	
	
	
	@Override
	protected void paintFigure(Graphics graphics)
	{
	
		Rectangle r = getBounds().getCopy();
		
	    int x = r.x;
	    int y = r.y;
		int x2 =  x+ 55;
		int y2 =y + 20;
		
	    graphics.drawLine(x, y2, x2,y2); 

	    int y4 = y2-5;
	    int x4 = x2+5;
	    graphics.drawLine(x2, y2, x4,y4); 
	    graphics.drawLine(x4, y, x4,y4); 
	    	    		
	    int y3 = y+ 3;
 	    graphics.drawText(name, x+2, y3);

	    
	}

	

	@Override
	public ConnectionAnchor getConnectionAnchor() {
		if(connectionAnchor ==null)
		{
			connectionAnchor = new ChopboxAnchor(this);
		}
		return connectionAnchor;
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
