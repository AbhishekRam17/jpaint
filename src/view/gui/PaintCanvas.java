package view.gui;

import view.interfaces.PaintCanvasBase;

import javax.swing.JComponent;
import java.awt.*;

public class PaintCanvas extends PaintCanvasBase {
private static final PaintCanvas instance = new PaintCanvas();
	
	private PaintCanvas() { }
	
    public Graphics2D getGraphics2D() {
        return (Graphics2D)getGraphics();
    }
    
    public static PaintCanvas getInstance() {
    	return instance;
    }
  
}
