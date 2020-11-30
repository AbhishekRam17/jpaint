package view.gui;
import controller.Shapeinfo;
import model.persistence.ApplicationState;
public class addinfo {
	
	
	public addinfo(ApplicationState appstate){
		Shapeinfo shapeinfo = new Shapeinfo(appstate.getActiveShapeType(), appstate.getActiveShapeShadingType(),  appstate.getActivePrimaryColor(), appstate.getActiveSecondaryColor() 
				);
		
		
	}
	}


