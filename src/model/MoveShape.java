package model;

import java.awt.Graphics2D;


import controller.Point;

import controller.Shapeinfo;
import model.persistence.ApplicationState;
import view.gui.Shapelist;
import view.interfaces.CommandHistory;
import view.interfaces.Ishape;
import view.interfaces.Reuncommand;

public class MoveShape implements Ishape, Reuncommand {
	ApplicationState appstate;
	private static Shapelist sl;
	Shapeinfo si;
	int d1, d2;
	
	 public MoveShape( ApplicationState as4, Shapeinfo s7) {
	        this.appstate = as4;
	        sl = Shapelist.getInstance();
	        
	        this.si = s7;
	        
	        d1 = si.getendPoint().getX() - si.getstartpoint().getX();
	        d2 = si.getendPoint().getY() - si.getstartpoint().getY();
	        System.out.println(d1);
	        System.out.println(d2);
	        
	        
	        for(Ishape shapemaker: sl.getSelectedList()) {
	        	System.out.println(shapemaker);
	        	
	            sl.delete(shapemaker);
	            shapemaker.addX(d1);
	            shapemaker.addY(d2);
	            sl.add(shapemaker);
	            
	           // CreateShape Create = new CreateShape(sl,appstate, si);
	            CommandHistory.add(this);
	        }
	        
	        
	        
	        
	        
	        
	        
	    }
	 

	 public void redo() {
	        for(Ishape shape: sl.getSelectedList()) {
	            shape.lessX(d1);
	            shape.lessY(d2);
	            sl.add(shape);
	        }
	    }

	    public void undo() {
	    	System.out.println("working");
	        for(Ishape shape: sl.getSelectedList()) {
	            sl.add(shape);
	        }
	    }
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	@Override
	public void doit(Graphics2D g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Point getAdjustedEndPoint() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Point getAdjustedStartPoint() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getwidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getheight() {
		// TODO Auto-generated method stub
		return 0;
	}

























	@Override
	public void addX(int dx) {
		// TODO Auto-generated method stub
		
	}

























	@Override
	public void addY(int dy) {
		// TODO Auto-generated method stub
		
	}




















	@Override
	public void moveX(int dx) {
		// TODO Auto-generated method stub
		
	}




















	@Override
	public void moveY(int dy) {
		// TODO Auto-generated method stub
		
	}


	


	@Override
	public void lessX(int dx) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void lessY(int dy) {
		// TODO Auto-generated method stub
		
	}


}
