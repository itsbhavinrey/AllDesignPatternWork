package net.media.training.designpattern.state;

import java.util.ArrayList;
import java.util.List;


public class Calculator {
    private StringBuilder display;
    private Character lastChar;
    private List<Character> operators = new ArrayList<Character>() {
        {
            add('+');
            add('-');
            add('*');
            add('/');
        }
    };
    private Integer currentValue;
    private Character currentOperator;
    private CalculatorState currentState;

    public String getDisplay() {
        return this.display.toString();
    }

    public Calculator() {
        this.lastChar = null;
        this.display = new StringBuilder();
        this.currentState = new DefaultState();
    }

    public boolean isDigit(Character c) {
        return c >= 48 && c <= 57;
    }

    public boolean isOperator(Character c) {
        return operators.contains(c);
    }

    public boolean isClear(Character c) {
        return c != null && c.equals('c');
    }

    public boolean isError() {
        return "Error".equals(display.toString());
    }

    public boolean isEqualsOperator(Character c) {
        return c != null && c.equals('=');
    }

    public void setState(CalculatorState state) {
        currentState = state;
    }

    public void input(Character c) {
        currentState.input(this, c);
    }

    public void updateCurrentValue(int val) {
        currentValue = val;
        display = new StringBuilder(Integer.toString(val));
    }

    public void updateCurrentOperator(Character op) {
        currentOperator = op;
    }

    public void clearState() {
        lastChar = null;
        currentValue = null;
        currentOperator = null;
        display = new StringBuilder();
        currentState = new DefaultState();
    }

    public void calculateCurrentValue() {
        if (currentValue != null) {
            display = new StringBuilder(Integer.toString(currentValue));
        }
    }

    public void appendToCurrentValue(int digit) {
        if (currentValue == null) {
            currentValue = digit;
        } else {
            currentValue = currentValue * 10 + digit;
        }
        display.append(digit);
    }

    public Integer operate(Integer i1, Integer i2) {
        switch (currentOperator) {
            case '+':
                return i1 + i2;
            case '-':
                return i1 - i2;
            case '*':
                return i1 * i2;
            case '/':
                if (i2 == 0) {
                    display = new StringBuilder("Error");
                    return null;
                }
                return i1 / i2;
        }
        throw new RuntimeException("Invalid operator");
    }

}