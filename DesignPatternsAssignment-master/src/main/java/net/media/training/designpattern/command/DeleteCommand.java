package net.media.training.designpattern.command;

import java.io.File;

public class DeleteCommand implements Command {
    private final String fileName;

    public DeleteCommand(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void execute() {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new RuntimeException("File does not exist");
        }

        file.delete();
    }

    @Override
    public void undo() {
        // Since the file is deleted, we cannot undo the delete operation.
        // You can handle this differently based on your requirements.
    }
}
