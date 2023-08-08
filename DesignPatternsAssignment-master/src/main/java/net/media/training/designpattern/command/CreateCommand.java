package net.media.training.designpattern.command;
import java.io.*;
public class CreateCommand implements Command {
    private String fileName;
    private String content;
    
    public CreateCommand(String fileName, String content) {
        this.fileName = fileName;
        this.content = content;
    }
    
    @Override
    public void execute() {
        create(fileName, content);
    }
    
    @Override
    public void undo() {
        delete(fileName);
    }
    
    private void create(String fileName, String content) {
        File file = new File(fileName);
        if (file.exists())
            throw new RuntimeException("File already exist");
        try {
            file.createNewFile();
            PrintWriter writer = new PrintWriter(file);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    private void delete(String fileName) {
        File file = new File(fileName);
        file.delete();
    }
}