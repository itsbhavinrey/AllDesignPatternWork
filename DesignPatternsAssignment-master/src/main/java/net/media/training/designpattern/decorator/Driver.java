package net.media.training.designpattern.decorator;

public class Driver {
    public static void main(String[] args) {
        Application application = new Application(9, 1500, 110);
        Criteria criteria = new GPAEval(new GREEval(new TOEFLEval(new EvaluatorDecorator())));
        Registrar reg = new Registrar();
        boolean result = reg.evaluate(application, criteria);
        System.out.println("Application evaluation result: " + result);
    }
}
