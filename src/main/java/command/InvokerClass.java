package command;

import java.util.ArrayList;
import java.util.List;

public class InvokerClass {
    private List<Command> history = new ArrayList();

    public void storeAndExecute(Command command) {
        history.add(command);
        command.execute();
    }

    public Integer historySize() {
        return history.size();
    }

    public void unExecuteLastCommand() {
        history.get(historySize()-1).unExecute();
    }
}
