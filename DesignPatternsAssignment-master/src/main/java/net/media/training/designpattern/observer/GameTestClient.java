package net.media.training.designpattern.observer;

import java.util.ArrayList;

public class GameTestClient {

    public Sun sun;
    public Game game;

    public void setup() {

        sun = new Sun();
        game = new Game(sun);
    }


    public void everyoneGoesOut() {
        ArrayList<SunObserver> observers = sun.getObservers();
        for(SunObserver observer : observers){
            observer.goOutdoors();
        }
    }

    public void everyoneOutdoorsComesIn() {
        ArrayList<SunObserver> observers = sun.getObservers();
        for(SunObserver observer : observers){
            if(observer.isOutdoors())observer.goIndoors();
        }
    }

    public void tickOnce() {
        game.tick();
    }

    public void tickTwice() {
        game.tick();
        game.tick();
    }

    public boolean outdoorsCharactersFeelWarm() {
        ArrayList<SunObserver> observers = sun.getObservers();
        for(SunObserver observer : observers){
            if(observer.isOutdoors() && observer.isFeelingWarm())return false;
        }

        return true;
    }

    public boolean allFeelCold() {
        ArrayList<SunObserver> observers = sun.getObservers();
        for(SunObserver observer : observers){
            if(observer.isFeelingWarm())return false;
        }
        return true;
    }
}