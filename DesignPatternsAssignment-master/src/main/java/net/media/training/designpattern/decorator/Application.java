package net.media.training.designpattern.decorator;

public class Application {
    private final float gpa;
    private final float gre;
    private final float toefl;

    public Application(float gpa, float gre, float toefl) {
        this.gpa = gpa;
        this.gre = gre;
        this.toefl = toefl;
    }

    public float getGpa() {
        return gpa;
    }

    public float getGre() {
        return gre;
    }

    public float getToefl() {
        return toefl;
    }
}