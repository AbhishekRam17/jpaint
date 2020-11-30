package controller;
import model.ShapeType;
import model.ShapeShadingType;

import java.awt.Graphics2D;

import model.ShapeColor;
import model.persistence.ApplicationState;
import view.interfaces.Ishape;



public class Shapeinfo implements Ishape {
	public ShapeColor activePcolor;
	public ShapeColor activeScolor;
	public ShapeShadingType activeSStype;
	public ShapeType activeShtype;
	
	public ApplicationState appstate;
	private Point StartPoint;
	private Point EndPoint;
	Shapeinfo si;

	
	
public Shapeinfo(ShapeType s1, ShapeShadingType s2, ShapeColor s3, ShapeColor s4) {
	activeShtype = s1;
	activeSStype=s2;
	activePcolor=s3;
	activeScolor = s4;
	System.out.println(activeShtype);
	
	
}
public void setstartPoint(Point StartPoint) {
    this.StartPoint=StartPoint;
}

public void setendPoint(Point endpoint) {
    this.EndPoint=endpoint;
}

public  Point getstartpoint() {
	return StartPoint;
	
}
public Point getendPoint() {
	return EndPoint;
	
}



public Point getnewStart(){
    int startX = Math.min(StartPoint.getX(), EndPoint.getX());
    int startY = Math.min(StartPoint.getY(), EndPoint.getY());
    return new Point(startX, startY);
}

public Point getnewEnd(){
    int endX = Math.max(StartPoint.getX(), EndPoint.getX());
    int endY = Math.max(StartPoint.getY(), EndPoint.getY());
    return new Point(endX, endY);
}


public int getwidth() {
	int width = Math.abs(StartPoint.getX() - EndPoint .getX());
	return width;
    
}

public int getheight() {
	int height = Math.abs(StartPoint.getY() - EndPoint .getY()); 
	return height;
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
