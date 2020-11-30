package view.gui;

import model.interfaces.Icommand;
import view.interfaces.CommandHistory;

public class RedoCommand implements Icommand {
    @Override
    public void run() {
        CommandHistory.redo();
    }
}