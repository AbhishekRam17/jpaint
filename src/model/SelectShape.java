
package model;

import java.awt.Graphics2D;


import controller.Point;
import controller.Shapeinfo;

import model.interfaces.Icommand;
import model.persistence.ApplicationState;
import view.gui.Shapelist;

import view.interfaces.CommandHistory;
import view.interfaces.Ishape;
import view.interfaces.Reuncommand;


public class SelectShape implements Ishape, Icommand, Reuncommand {
	private static Shapelist shapelist;
	ApplicationState appstate;
	Shapeinfo shapeinfo;
	Ishape sm;
	Ishape shapemaker;
	ShapeType shapetype;
	int newx, newy;
	int width, height;
	
	
public SelectShape( ApplicationState as4, Shapeinfo s7){
	
	
	System.out.println("select iniitiate");
	shapelist = Shapelist.getInstance();
	this.appstate = as4;
	this.shapeinfo = s7;
	newx= shapeinfo.getnewStart().getX();
	newy= shapeinfo.getnewEnd().getY();
	width = shapeinfo.getwidth();
	height = shapeinfo.getheight();	
	
	
	for (Ishape shapemaker : shapelist.getList()) {
		
		//collision detection copied from discussion boards
	
        if (shapemaker.getAdjustedStartPoint().getX() < newx + width &&
        		shapemaker.getAdjustedStartPoint().getX() + shapemaker.getwidth() > newx &&
        		shapemaker.getAdjustedStartPoint().getY() < newy + height &&
        		shapemaker.getAdjustedStartPoint().getY() + shapemaker.getheight() > newy) {
        	shapelist.addselectedlist(shapemaker);
        	CommandHistory.add(this);
            System.out.println("the shape selected is " + shapemaker.toString());
          
        }
   
	
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



@Override
public void undo() {
	// TODO Auto-generated method stub
	
}



@Override
public void redo() {
	// TODO Auto-generated method stub
	
}



@Override
public void run() {
	// TODO Auto-generated method stub
	
}
}