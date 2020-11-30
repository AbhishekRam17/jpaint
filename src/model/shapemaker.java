package model;

import view.gui.DrawEllipse;


import view.gui.DrawRectangle;
import view.gui.DrawTriangle;
import view.gui.Shapelist;

import view.interfaces.Ishape;
import model.persistence.ApplicationState;
import controller.Shapeinfo;
public class shapemaker  {
	
	
	ApplicationState appstate;
	Shapeinfo shapeinfo;
	Shapelist shapelist;
	ShapeType shapetype;
	
	Ishape shapemaker= null;
	Ishape ash;
	

	public   Ishape shapemakers(Shapeinfo s3) {
		
		this.shapeinfo = s3;
		
		this.shapetype =shapeinfo.activeShtype;
		
		System.out.println(shapetype);
			System.out.println("hello");
			switch(shapetype) {
	    	case RECTANGLE:
	    		System.out.println("rect");
	    		shapemaker = new DrawRectangle(shapeinfo);
	    		break;
	    	case ELLIPSE:
	    		System.out.println("eclipse");
	    		shapemaker = new DrawEllipse(shapeinfo);
	    		break;
	    	case TRIANGLE:
	    		System.out.println("tri");
	    		shapemaker = new DrawTriangle(shapeinfo);
	    		break;
	    	}

	        return shapemaker;
	    }


	        
	    
	public void addX(int dx) {
		shapeinfo.getnewStart().setX(shapeinfo.getnewStart().getX() + dx);
		shapeinfo.getnewEnd().setX(shapeinfo.getnewEnd().getX() + dx);
		}

		public void addY(int dy) {
			shapeinfo.getnewStart().setY( shapeinfo.getnewStart().getY() + dy);
			shapeinfo.getnewEnd().setY(shapeinfo.getnewEnd().getY() + dy);
		}
		
	}
		
	
