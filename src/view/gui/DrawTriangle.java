package view.gui;



import java.awt.Color;
import java.awt.Graphics2D;
import java.util.EnumMap;

import controller.Point;
import controller.Shapeinfo;
import model.ShapeColor;
import model.ShapeShadingType;
import model.ShapeType;
import model.colorenum;
import model.persistence.ApplicationState;
import view.interfaces.Ishape;

public class DrawTriangle implements Ishape {
	Shapeinfo shapeinfo;
	Point StartPoint;
	Point EndPoint;
	ApplicationState as2;
	ShapeShadingType sshadingtype;
	ShapeType shapetype;
	Color primarycolor;
	Color secondarycolor;
	int width;
	int height;
	int tp;
	int gg = 3;
	
	Point x,y;
	private final EnumMap<ShapeColor, Color> colorMap;
	
	
	public  DrawTriangle(Shapeinfo shapeinfo)
	
	{
		this.shapeinfo = shapeinfo;
		this.StartPoint=shapeinfo.getstartpoint();
		this.EndPoint = shapeinfo.getendPoint();
		this.sshadingtype=shapeinfo.activeSStype;
		this.shapetype = shapeinfo.activeShtype;
		this.colorMap = colorenum.getInstance().getcolorenum();
		this.primarycolor =colorMap.get(shapeinfo.activePcolor);
		this.secondarycolor = colorMap.get(shapeinfo.activeScolor);
		System.out.println(primarycolor);
		System.out.println(sshadingtype);
		x = shapeinfo.getnewStart();
		y = shapeinfo.getnewEnd();
		width = shapeinfo.getwidth();
		height = shapeinfo.getheight();
		
	}
 public void doit(Graphics2D g) {
	 System.out.println("help me");
	 int x = shapeinfo.getnewStart().getX();
	 int y = shapeinfo.getnewStart().getY();
	 int x1 = shapeinfo.getnewEnd().getX();
	 int y1 = shapeinfo.getnewEnd().getY();
	
     width = x1-x;
     height=y1-y;
     tp = (x1) + ((x1-x)/2);
     
     
     int[] xp = {x, tp, x1};
 	int[] yp = {y1, y, y1};
     
     
     if (sshadingtype.equals(ShapeShadingType.OUTLINE)) {
         g.setColor(primarycolor);
         g.drawPolygon(xp, yp, gg);
         
     } else if (sshadingtype.equals(ShapeShadingType.FILLED_IN)) {
         g.setColor(primarycolor);
         
         g.fillPolygon(xp, yp, gg);
     } else if (sshadingtype.equals(ShapeShadingType.OUTLINE_AND_FILLED_IN)) {
         g.setColor(primarycolor);
       
         g.fillPolygon(xp, yp, gg);
         g.setColor(secondarycolor);
         g.drawPolygon(xp, yp, gg);
     }
     }
 @Override
 public Point getAdjustedStartPoint() {
		return x;
	}

	@Override
	public Point getAdjustedEndPoint() {
		return y;
	}
	@Override
	public int getwidth() {
		// TODO Auto-generated method stub
		return width;
	}
	@Override
	public int getheight() {
		// TODO Auto-generated method stub
		return height;
	}
	@Override
	public void addX(int dx) {
		x.setX(x.getX() + dx);
		
		y.setX(y.getX() + dx);
		StartPoint.setX(StartPoint.getX() + dx);
		EndPoint.setY(EndPoint.getX() + dx);
	}
	@Override
	public void addY(int dy) {
		x.setY(x.getY() + dy);
		y.setY(y.getY() + dy);
		StartPoint.setY(StartPoint.getY() + dy);
		EndPoint.setY(EndPoint.getY() + dy);
	}
	@Override
	public void moveX(int dx) {
		x.setX(x.getX() + dx);
		
		y.setX(y.getX() + dx);
	}
	@Override
	public void moveY(int dy) {
		x.setY(x.getY() + dy);
		y.setY(y.getY() + dy);
	}
	 @Override
	    public void lessX(int dx) {
		 x.setX(x.getX() - dx);
			
			y.setX(y.getX() - dx);
			StartPoint.setX(StartPoint.getX() - dx);
			EndPoint.setY(EndPoint.getX() - dx);
	    }

	    @Override
	    public void lessY(int dy) {
	    	x.setY(x.getY() - dy);
			y.setY(y.getY() - dy);
			StartPoint.setY(StartPoint.getY() - dy);
			EndPoint.setY(EndPoint.getY() - dy);
	    }
 
 
 }
