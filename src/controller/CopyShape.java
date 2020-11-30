package controller;

import java.awt.Graphics2D;

import model.persistence.ApplicationState;
import view.gui.Shapelist;
import view.interfaces.Ishape;

public class CopyShape implements Ishape {
		ApplicationState appstate;
		private static Shapelist sl;
		Shapeinfo si;
		int d1, d2;
		
		 public CopyShape(Shapelist s4) {
		        
		        this.sl = Shapelist.getInstance();
		        
		        
		        for(Ishape shape: sl.getSelectedList()) {
		            sl.addclipboard(shape);
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
