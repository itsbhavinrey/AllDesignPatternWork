package net.media.training.designpattern.decorator;


//public class GREEval extends CriteriaDecorator {
//    public GREEval(Criteria decoratedCriteria) {
//        super(decoratedCriteria);
//    }
//
//    @Override
//    public boolean evaluate(Application theApp) {
//        return decoratedCriteria.evaluate(theApp) && theApp.getGre() > 1450;
//    }
//}
public class GREEval implements Criteria {
    private Criteria decoratedCriteria;

    public GREEval(Criteria decoratedCriteria) {
        this.decoratedCriteria = decoratedCriteria;
    }

    @Override
    public boolean evaluate(Application theApp) {
        return theApp.getGre() > 1450 && decoratedCriteria.evaluate(theApp);
    }
}