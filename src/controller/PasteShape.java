package controller;

import java.awt.Graphics2D;

import model.interfaces.Icommand;
import model.persistence.ApplicationState;
import view.gui.Shapelist;
import view.interfaces.CommandHistory;
import view.interfaces.Ishape;
import view.interfaces.Reuncommand;


	public class PasteShape implements Ishape, Reuncommand, Icommand {
		ApplicationState appstate;
		private static Shapelist sl;
		Shapeinfo si;
		int d1, d2;
		
		 public PasteShape(Shapelist s4) {
		       
		        sl = Shapelist.getInstance();
		        
		        
		        
		        d1 = 300;
		        d2 = 300;
		        System.out.println(d1);
		        System.out.println(d2);
		        
		        
		       
		 }
		 @Override
		 public void run() {
			 for(Ishape shapemaker: sl.getclipboard()) {
		        	System.out.println(shapemaker);
		        	
		            
		            shapemaker.addX(d1);
		            shapemaker.addY(d2);
		            sl.add(shapemaker);
		            CommandHistory.add(this);
		           // CreateShape Create = new CreateShape(sl,appstate, si);
		          
		        }
		        }

		 @Override
		    public void undo() {

	            for (Ishape shape : sl.getclipboard()) {
	                sl.delete(shape);
	            }
		    }

		    @Override
		    public void redo() {
		    	System.out.println("redo working paste");
		    	 for (Ishape shape : sl.getclipboard()) {
		                sl.add(shape);}
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