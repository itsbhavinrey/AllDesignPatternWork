package net.media.training.designpattern.command;

import java.io.IOException;
import java.util.*;
public class CommandInvoker {
    private List<Command> commandHistory = new ArrayList<>();
    
    public void executeCommand(Command command) throws IOException {
        command.execute();
        commandHistory.add(command);
    }
    
    public void undoLastCommand() {
        if (!commandHistory.isEmpty()) {
            Command lastCommand = commandHistory.remove(commandHistory.size() - 1);
            lastCommand.undo();
        }
    }
}
