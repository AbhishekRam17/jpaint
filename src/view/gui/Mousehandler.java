package view.gui;
import javax.swing.*;


import controller.Shapeinfo;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.persistence.ApplicationState;

import java.awt.*;

import java.awt.event.*;

import java.awt.Component;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import model.persistence.ApplicationState;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.MouseListener;
import view.interfaces.PaintCanvasBase;
import controller.Point;
import model.CreateShape;
import model.MoveShape;
import model.SelectShape;


import javax.swing.JComponent;
import java.awt.*;
import model.StartAndEndPointMode;
import view.gui.addinfo;
public class Mousehandler extends MouseAdapter {
	int y,x2,y2;
	Point StartPoint;
	Point EndPoint;
	private int x = y = x2 = y2 = 0; // 
	PaintCanvasBase pbb;
	ApplicationState as2;
	Mousehandler mb2;
	private static Shapelist s2;
	Shapeinfo s5;
	CreateShape cp;
	addinfo ai;
	SelectShape ss;
	MoveShape mm;

	public Mousehandler(  ApplicationState as3, Shapeinfo s7 ) {
		s2 =  Shapelist.getInstance();
		
		this.as2 = as3;
		
		this.s5=s7;
		
		
	}
	
	



	public void mousePressed(MouseEvent e) {
		StartPoint = new Point(e.getX(), e.getY());
		setStartPoint(e.getX(), e.getY());
		System.out.println("Mousehandler reporting " + "(" + StartPoint.getX() + "," + StartPoint.getY() + ")");
        as2.setstartPoint(StartPoint);
    }
	

   
    public void mouseReleased(MouseEvent e) {
    	
    	 EndPoint = new Point(e.getX(), e.getY());
       
        
        setEndPoint(e.getX(), e.getY());
        as2.setendPoint(EndPoint);
        
        StartAndEndPointMode modeofmouse = as2.getActiveStartAndEndPointMode();
        addinfo ai = new addinfo( as2);
        Shapeinfo shapeinfo = new Shapeinfo(as2.getActiveShapeType(), as2.getActiveShapeShadingType(),  as2.getActivePrimaryColor(), as2.getActiveSecondaryColor() 
				);
        shapeinfo.setstartPoint(StartPoint);
        shapeinfo.setendPoint(EndPoint);
        System.out.println(as2.getActiveSecondaryColor());
        System.out.println(modeofmouse);
      
        if(modeofmouse.equals(modeofmouse.DRAW)) {
        	System.out.println("dRAW MODE IS RUNNING");
        	  cp = new CreateShape( as2, shapeinfo);
        	  cp.run();
        	  
       }
        else if(modeofmouse.equals(modeofmouse.SELECT)) {
        	System.out.println("Select mode is running");
        	ss= new SelectShape( as2, shapeinfo);
        }
        else if(modeofmouse.equals(modeofmouse.MOVE)) {
        	System.out.println("Move mode is running");
        	mm = new MoveShape( as2, shapeinfo);
        }
        
        System.out.println("Mousehandler reporting " + "(" + EndPoint.getX() + "," + EndPoint.getY() + ")");
    }
    
    public void setStartPoint(int x, int y) {
        this.x=x;
        this.y = y;
        
    
    }

    public void setEndPoint(int x, int y) {
        x2 = (x);
        y2 = (y);
        
    }



	

    }
