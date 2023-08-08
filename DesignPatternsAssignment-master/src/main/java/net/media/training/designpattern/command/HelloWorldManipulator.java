package net.media.training.designpattern.command;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;


public class HelloWorldManipulator {

    public void fixManipulate(final String fileName, final String newPath) {
        CommandInvoker invoker =  new CommandInvoker() ;
        Command createCommand = new CreateCommand(fileName, "hello world");
        Command updateCommand = new UpdateCommand(fileName, "new hello world");
        Command moveCommand = new MoveCommand(fileName, newPath);
       
        try {
            invoker.executeCommand(createCommand);
    
            invoker.executeCommand(updateCommand);
            
            invoker.executeCommand(moveCommand);
       
        } catch (Exception e) {
            invoker.undoLastCommand() ;
        }
    }




    public void brokenManipulate(String fileName, String newPath) {
        CommandInvoker invoker =  new CommandInvoker() ;
        Command createCommand = new CreateCommand(fileName, "hello world");
        Command updateCommand = new UpdateCommand(fileName, "new hello world");
        Command moveCommand = new MoveCommand(fileName, newPath);
    
        try {
            invoker.executeCommand(createCommand);
     
            invoker.executeCommand(updateCommand);
  
            invoker.executeCommand(moveCommand);

            invoker.executeCommand(createCommand);

            invoker.executeCommand(createCommand);
        } catch (Exception e) {
            invoker.undoLastCommand() ;
        }


    }
}
