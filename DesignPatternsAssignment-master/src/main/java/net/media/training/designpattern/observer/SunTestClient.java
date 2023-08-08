package net.media.training.designpattern.observer;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 21, 2011
 * Time: 9:06:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class SunTestClient {
    private final Person person;
    private final Cat cat;
    private final Dog dog;
    private final Robot robot;
    private final ArrayList<SunObserver> observers;

//    private boolean personWentOut = false;
//    private boolean robotWentOut = false;
//    private boolean catWentOut;
//    private boolean dogWentOut;
    private Sun sun;

    public SunTestClient() {
        this.sun = new Sun();
        this.person = new Person(this.sun);
        this.cat = new Cat(this.sun);
        this.dog = new Dog(this.sun);
        this.robot = new Robot(this.sun);


        sun.addObserver(person);
        sun.addObserver(cat);
        sun.addObserver(dog);
        sun.addObserver(robot);
        this.observers = sun.getObservers();

    }

    public void aFewCharactersGoOutdoors() {
        person.goOutdoors();
        robot.goOutdoors();
//        personWentOut = true;
//        robotWentOut = true;
    }

    public void aFewOtherCharactersGoOutdoors() {
        cat.goOutdoors();
        dog.goOutdoors();
//        catWentOut = true;
//        dogWentOut = true;
    }

    public void sunRise() {
        sun.rise();
    }

    public void sunSet() {
        sun.set();
    }

    public boolean charactersWhoWereOutAreFeelTired() {
        for(SunObserver observer : observers){
            if(observer.isOutdoors() && !observer.isFeelingTired())return false;
        }
        return true;
    }

    public boolean outdoorsCharactersFeelWarm() {
        for(SunObserver observer : observers){
            if(observer.isOutdoors() && !observer.isFeelingWarm())return false;
            else if(!robot.isOutdoors() && robot.isFeelingWarm())return false;
        }
        return true;

    }
}
