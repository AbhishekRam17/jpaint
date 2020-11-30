package controller;

import model.interfaces.IApplicationState;


import view.EventName;
import view.interfaces.CommandHistory;
import view.interfaces.IUiModule;
import view.gui.RedoCommand;
import view.gui.Shapelist;
import view.gui.UndoCommand;
import controller.Shapeinfo;
public class JPaintController implements IJPaintController {
    private final IUiModule uiModule;
    private final IApplicationState applicationState;
    private static Shapelist  shapelist;

    public JPaintController(IUiModule uiModule, IApplicationState applicationState) {
        this.uiModule = uiModule;
        this.applicationState = applicationState;
        shapelist = Shapelist.getInstance();
    }

    @Override
    public void setup() {
        setupEvents();
    }

    private void setupEvents() {
        uiModule.addEvent(EventName.CHOOSE_SHAPE, () -> applicationState.setActiveShape());
        uiModule.addEvent(EventName.CHOOSE_PRIMARY_COLOR, () -> applicationState.setActivePrimaryColor());
        uiModule.addEvent(EventName.CHOOSE_SECONDARY_COLOR, () -> applicationState.setActiveSecondaryColor());
        uiModule.addEvent(EventName.CHOOSE_SHADING_TYPE, () -> applicationState.setActiveShadingType());
        uiModule.addEvent(EventName.CHOOSE_START_POINT_ENDPOINT_MODE, () -> applicationState.setActiveStartAndEndPointMode());
        uiModule.addEvent(EventName.COPY, () -> new CopyShape(shapelist));
        uiModule.addEvent(EventName.PASTE, () -> new PasteShape(shapelist).run());
        uiModule.addEvent(EventName.DELETE, () -> new deleteshape(shapelist).run());
        
        uiModule.addEvent(EventName.UNDO, () -> new UndoCommand().run());
        uiModule.addEvent(EventName.REDO, () -> new RedoCommand().run());
    }
}
