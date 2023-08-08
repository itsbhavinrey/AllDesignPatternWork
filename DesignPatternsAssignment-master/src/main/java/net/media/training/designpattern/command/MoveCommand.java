package net.media.training.designpattern.command;

import java.io.*;
public class MoveCommand implements Command {
    private String source;
    private String destination;
    
    public MoveCommand(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }
    
    @Override
    public void execute() {
        move(source, destination);
    }
    
    @Override
    public void undo() {
        move(destination, source);
    }
    

        private void move(String source, String destination) {
            File file = new File(source);
            if (!file.exists())
                throw new RuntimeException("File does not exist");
            if (!file.renameTo(new File(destination)))
                throw new RuntimeException("Rename failed");
        }

}
