package net.media.training.designpattern.command;

import java.io.IOException;

public interface Command {
    void execute() throws IOException;
    void undo();
}
