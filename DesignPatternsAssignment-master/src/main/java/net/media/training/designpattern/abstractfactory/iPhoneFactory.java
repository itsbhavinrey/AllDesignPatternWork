package net.media.training.designpattern.abstractfactory;

public class iPhoneFactory implements PhoneFactory {

    public MotherBoard createMotherBoard(){
        MotherBoard motherboard = new IphoneMotherBoard();
        motherboard.attachBattery(new Battery());
        motherboard.attachProcessor(new IphoneProcessor());
        return motherboard;
    }

    public Screen createScreen(){
        Screen screen = new IphoneScreen();
        return screen;
    }

    public Case createCase(){
        Case phonecase = new IphoneCase();
        return phonecase;
    }






}
