package command;

import java.util.Iterator;
import java.util.Stack;

public class MacroCommand implements Command {
    private Stack<Command> commands = new Stack<>();

    @Override
    public void execute() {
        Iterator it = commands.iterator();
        while (it.hasNext()) {
            ((Command)it.next()).execute();
        }
    }
}
