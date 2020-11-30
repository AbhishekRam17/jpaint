package view.interfaces;

import java.awt.Graphics2D;

import controller.Point;
import controller.Shapeinfo;

public interface Ishape {

	void doit(Graphics2D g);

	Point getAdjustedEndPoint();

	Point getAdjustedStartPoint();

	int getwidth();

	int getheight();

	void addX(int dx);

	void addY(int dy);

	void moveX(int dx);

	void moveY(int dy);

	

	void lessX(int dx);

	void lessY(int dy);

	

	

	

	



	

	

	

}
