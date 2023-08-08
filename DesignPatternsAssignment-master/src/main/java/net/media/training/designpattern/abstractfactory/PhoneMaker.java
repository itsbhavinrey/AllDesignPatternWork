package net.media.training.designpattern.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:34:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhoneMaker {

    public Case buildPhone(String phoneType) {

        PhoneFactory factory;
        if (phoneType.equals("Android")) {
           factory = new AndroidFactory();
        } else {
            factory = new iPhoneFactory();
        }
        MotherBoard motherBoard= factory.createMotherBoard();
        Screen screen = factory.createScreen();
        Case phoneCase = factory.createCase();
        phoneCase.attachScreen(screen);
        phoneCase.attachMotherBoard(motherBoard);

        return phoneCase;
    }
}
