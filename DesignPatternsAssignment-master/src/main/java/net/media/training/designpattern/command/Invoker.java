package net.media.training.designpattern.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private final List<Command> commands = new ArrayList<>();
    public void addCommand(Command command) {
        commands.add(command);
    }
    public void execute(Command command) {
        commands.add(command);
        command.execute();
    }
}
