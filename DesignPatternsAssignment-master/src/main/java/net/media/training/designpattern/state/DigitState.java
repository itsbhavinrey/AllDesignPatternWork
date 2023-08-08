package net.media.training.designpattern.state;

public class DigitState implements CalculatorState {
    @Override
    public void input(Calculator context, Character c) {
        if (context.isClear(c)) {
            context.clearState();
            context.setState(new DefaultState());
        } else if (context.isError()) {
            // Do nothing if in error state
        } else if (context.isEqualsOperator(c)) {
            // Handle equals operator
        } else if (context.isOperator(c)) {
            context.calculateCurrentValue();
            context.updateCurrentOperator(c);
            context.setState(new OperatorState());
        } else if (context.isDigit(c)) {
            context.appendToCurrentValue(Character.getNumericValue(c));
        }
    }
}
