package net.media.training.designpattern.observer;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 20, 2011
 * Time: 10:13:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class Dog implements SunObserver{
    private Sun sun;
    private boolean outdoors;
    private boolean feelingWarm;
    private boolean feelingTired;
    public Dog(Sun sun){
        this.sun = sun;
    }

    public boolean isFeelingWarm() {
        return feelingWarm;
    }

    public void goOutdoors() {
        outdoors = true;
    }

    public void goIndoors() {
        outdoors = false;
        feelingTired = true;
    }

    public boolean isOutdoors() {
        return outdoors;
    }

    public boolean isFeelingTired() {
        return feelingTired;
    }

    @Override
    public void notifySunRose() {
        feelingWarm = true;
    }

    @Override
    public void notifySunSet() {
        feelingWarm = false;
        if (outdoors)
            feelingTired = true;
    }
}