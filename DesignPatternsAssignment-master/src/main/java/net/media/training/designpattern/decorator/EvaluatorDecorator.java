package net.media.training.designpattern.decorator;

public class EvaluatorDecorator implements Criteria {
    @Override
    public boolean evaluate(Application theApp) {
        return true;  // true
    }
}