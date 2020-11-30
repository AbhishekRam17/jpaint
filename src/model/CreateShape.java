package model;

import java.awt.Graphics2D;


import controller.Point;
import controller.Shapeinfo;
import model.shapemaker;
import model.interfaces.Icommand;
import model.persistence.ApplicationState;
import view.gui.Shapelist;

import view.interfaces.CommandHistory;
import view.interfaces.Ishape;
import view.interfaces.Reuncommand;


public class CreateShape implements Ishape, Icommand, Reuncommand {
	private static Shapelist shapelist;
	ApplicationState appstate;
	Shapeinfo shapeinfo;
	Ishape sm;
	Ishape shapemaker;
	ShapeType shapetype;
	
	
	
public CreateShape( ApplicationState as4, Shapeinfo s7){
	
	
	System.out.println("create iniitiate");
	shapelist = Shapelist.getInstance();
	this.appstate = as4;
	this.shapeinfo = s7;
	
	}
@Override
public void run() {
	shapemaker shapemaker = new shapemaker();
	shapetype = shapeinfo.activeShtype;
	System.out.println(shapetype);
	sm = shapemaker.shapemakers(shapeinfo);
	System.out.println(sm);
	shapelist.add(sm);
	CommandHistory.add(this);
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
	for (Ishape shape : shapelist.getList()) {
		 shapelist.deletefunction(shape);}
    }
	

@Override
public void redo() {
	 run();
     }
	
}




