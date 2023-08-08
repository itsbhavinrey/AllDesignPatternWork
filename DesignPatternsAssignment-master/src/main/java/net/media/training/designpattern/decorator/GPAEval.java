package net.media.training.designpattern.decorator;


public class GPAEval implements Criteria {
    private Criteria decoratedCriteria;

    public GPAEval(Criteria decoratedCriteria) {
        this.decoratedCriteria = decoratedCriteria;
    }

    @Override
    public boolean evaluate(Application theApp) {
        return theApp.getGpa() > 8 && decoratedCriteria.evaluate(theApp);
    }
}
