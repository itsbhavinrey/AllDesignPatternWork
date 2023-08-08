package net.media.training.designpattern.decorator;

public class TOEFLEval implements Criteria {
    private Criteria decoratedCriteria;

    public TOEFLEval(Criteria decoratedCriteria) {
        this.decoratedCriteria = decoratedCriteria;
    }

    @Override
    public boolean evaluate(Application theApp) {
        return theApp.getToefl() > 100 && decoratedCriteria.evaluate(theApp);
    }
}