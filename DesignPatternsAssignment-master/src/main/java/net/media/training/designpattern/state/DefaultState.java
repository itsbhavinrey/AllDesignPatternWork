package net.media.training.designpattern.state;


class DefaultState implements CalculatorState {
    @Override
    public void input(Calculator context, Character c) {
        if (context.isClear(c)) {
            context.clearState();
        } else if (context.isError()) {
            // Do nothing if in error state
        } else if (context.isEqualsOperator(c)) {
            // Handle equals operator
        } else if (context.isOperator(c)) {
            context.updateCurrentOperator(c);
            context.setState(new OperatorState());
        } else if (context.isDigit(c)) {
            context.updateCurrentValue(Character.getNumericValue(c));
            context.setState(new DigitState());
        }
    }
}