package net.media.training.designpattern.observer;

public interface SunObserver {
    void notifySunRose();
    void notifySunSet();



///////// this methods are needed here to make GameTestClient and SunTestClient to work
///////// or other idea would be to use Character interface to add them there to try out GameTestClient
    boolean isFeelingTired();
    boolean isFeelingWarm();
    void goOutdoors();
    void goIndoors();
    boolean isOutdoors();

}
