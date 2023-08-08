package net.media.training.designpattern.command;

import java.io.*;
public class UpdateCommand implements Command {
    private String fileName;
    private String newContent;
    private String oldContent;
    
    public UpdateCommand(String fileName, String newContent) {
        this.fileName = fileName;
        this.newContent = newContent;
    }
    
    @Override
    public void execute() throws IOException {
        oldContent = getContentFromFile(fileName);
        update(fileName, newContent);
    }
    
    @Override
    public void undo() {
        update(fileName, oldContent);
    }
    
    private String getContentFromFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
        String aLine;
        String theContent = "";
        while ((aLine = reader.readLine()) != null) {
            theContent += aLine;
        }
        reader.close();
        return theContent;
    }
    
    private void update(String fileName, String content) {
        File file = new File(fileName);
        if (!file.exists())
            throw new RuntimeException("File: " + fileName + " does not exist");
        try {

            PrintWriter writer = new PrintWriter(file);
            writer.write(content);
            writer.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}