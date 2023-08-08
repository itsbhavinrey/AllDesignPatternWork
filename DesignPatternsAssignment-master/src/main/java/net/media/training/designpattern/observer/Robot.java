package net.media.training.designpattern.observer;

/**
 * Created by IntelliJ IDEA.
 * User: joelrosario
 * Date: Jul 20, 2011
 * Time: 10:16:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class Robot implements SunObserver{
    private Sun sun;
    private boolean outdoors;
    private boolean feelingWarm;
    private boolean feelingTired;
    public Robot(Sun sun){
        this.sun = sun;
    }

    public boolean isOutdoors() {
        return outdoors;
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

    public void goOutdoors() {
        outdoors = true;
    }

    public void goIndoors() {
        outdoors = false;
    }

    public boolean isFeelingWarm() {
        return feelingWarm;
    }

    public boolean isFeelingTired() {
        return feelingTired;
    }
}
