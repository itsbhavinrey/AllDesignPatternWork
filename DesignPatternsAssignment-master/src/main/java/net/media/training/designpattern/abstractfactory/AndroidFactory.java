package net.media.training.designpattern.abstractfactory;

public class AndroidFactory implements PhoneFactory{

    public MotherBoard createMotherBoard(){
        MotherBoard motherboard = new AndroidMotherBoard();
        motherboard.attachBattery(new Battery());
        motherboard.attachProcessor(new AndroidProcessor());
        return motherboard;
    }

    public Screen createScreen(){
        Screen screen = new AndroidScreen();
        return screen;
    }

    public Case createCase(){
        Case phonecase = new AndroidCase();
        return phonecase;
    }






}