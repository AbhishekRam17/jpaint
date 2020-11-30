package view.gui;
import java.awt.Color;


import java.awt.Graphics2D;

import java.util.ArrayList;

import java.util.List;
import view.interfaces.PaintCanvasBase;
import view.interfaces.Reuncommand;

import model.persistence.ApplicationState;
import view.interfaces.CommandHistory;
import view.interfaces.Ishape;

public class Shapelist implements Reuncommand {
	private static final Shapelist instance  = new Shapelist();
	private final ArrayList<Ishape> gaaralist;
	private final ArrayList<Ishape> selectedlist ;
	private final ArrayList<Ishape> clipboard ;
	ApplicationState appstate;
	PaintCanvas pc = PaintCanvas.getInstance();
	
	private Shapelist( )
	{
		gaaralist = new ArrayList<Ishape>();
		selectedlist = new ArrayList<Ishape>();
		clipboard = new ArrayList<Ishape>();
		
	}
	public static Shapelist getInstance() {
		return instance;
	}
	
	


public void add(Ishape shapes) {
    System.out.println(" adding");
    gaaralist.add(shapes);
    System.out.println(shapes);
    draw();
    
}

public void addselectedlist(Ishape shapes) {
    System.out.println(" adding selected");
    selectedlist.add(shapes);
    System.out.println(shapes);
    System.out.println(selectedlist);
    draw();
    
}
public void addclipboard(Ishape shapes) {
    System.out.println(" adding copied");
    clipboard.add(shapes);
    System.out.println(shapes);
    System.out.println(clipboard);
    
    
}

public ArrayList<Ishape> getSelectedList() {
    return selectedlist;
}
public ArrayList<Ishape> getclipboard() {
    return clipboard;
}

public void delete(Ishape shapes) {
	
	/*for(int i=0; i< gaaralist.size(); i++) {
		if(gaaralist.get(i).equals(shape)) {
			gaaralist.remove(i);
			break;
		}
	} */
	gaaralist.remove(shapes);
	cleanit();
}
public void deletefunction(Ishape shapes) {
	
	
	gaaralist.remove(shapes);
	delete();
	
}
public void deletefunctionz(Ishape shapes) {
	
	
	Graphics2D g = pc.getGraphics2D();
    g.setColor(Color.WHITE);
    
    g.fillRect(0,0, 10000, 100000); 
    
    for(Ishape shapess: gaaralist)
    	
    shapess.doit(g);
}

public ArrayList<Ishape> getList() {
    return gaaralist;
}

public void cleanit() {
	Graphics2D g = pc.getGraphics2D();
    g.setColor(Color.WHITE);
    g.fillRect(0,0, 10000, 100000);
}
public void delete() {
	System.out.println("deleting shape");
    Graphics2D g = pc.getGraphics2D();
    g.setColor(Color.WHITE);
    
    g.fillRect(0,0, 10000, 100000); 
    
    for(Ishape shapes: gaaralist)
    	
    shapes.doit(g);
}







public void draw() {
	System.out.println("draw");
    Graphics2D g = pc.getGraphics2D();
   
    for(Ishape shapes: gaaralist)
    shapes.doit(g);
    CommandHistory.add(this);
}



@Override
public void undo() {
	// TODO Auto-generated method stub
	
}



@Override
public void redo() {
	// TODO Auto-generated method stub
	
}
}