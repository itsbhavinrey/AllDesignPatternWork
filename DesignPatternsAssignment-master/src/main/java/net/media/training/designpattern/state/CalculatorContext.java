package net.media.training.designpattern.state;

public class CalculatorContext {
    private CalculatorState currentState;

    public CalculatorContext() {
        currentState = new DefaultState();
    }

    public void setState(CalculatorState state) {
        currentState = state;
    }

    public void input(Character c) {
        currentState.input(this, c);
    }
}