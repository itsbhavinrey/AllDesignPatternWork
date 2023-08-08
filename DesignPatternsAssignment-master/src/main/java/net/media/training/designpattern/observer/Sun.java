package net.media.training.designpattern.observer;

import java.util.*;
/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 20, 2011
 * Time: 9:12:58 PM
 * To change this template use File | Settings | File Templates.
 */


public class Sun {
    private boolean isUp;
    private ArrayList<SunObserver> observers = new ArrayList<>();

    public boolean isUp() {
        return isUp;
    }

    public void addObserver(SunObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(SunObserver observer) {
        observers.remove(observer);
    }

    public void set() {
        isUp = false;
        notifySunSet();
    }

    public void rise() {
        isUp = true;
        notifySunRose();
    }

    private void notifySunRose() {
        for (SunObserver observer : observers) {
            observer.notifySunRose();
        }
    }

    private void notifySunSet() {
        for (SunObserver observer : observers) {
            observer.notifySunSet();
        }
    }

    public ArrayList<SunObserver> getObservers(){
        return observers;
    }
}