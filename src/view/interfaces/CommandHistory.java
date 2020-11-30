package view.interfaces;
import java.util.Stack;

public class CommandHistory {
	private static final Stack<Reuncommand> undoStack = new Stack<Reuncommand>();
	private static final Stack<Reuncommand> redoStack = new Stack<Reuncommand>();

	public static void add(Reuncommand cmd) {
		undoStack.push(cmd);
		redoStack.clear();
	}
	
	public static boolean undo() {
		boolean result = !undoStack.empty();
		if (result) {
			Reuncommand c = undoStack.pop();
			redoStack.push(c);
			c.undo();
		}
		return result;
	}

	public static boolean redo() {
		boolean result = !redoStack.empty();
		if (result) {
			Reuncommand c = redoStack.pop();
			undoStack.push(c);
			c.redo();
		}
		return result;
	}


}
