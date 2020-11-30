package view.gui;

import model.interfaces.Icommand;
import view.interfaces.CommandHistory;

public class UndoCommand implements Icommand {
    @Override
    public void run() {
        CommandHistory.undo();
    }
}