package net.media.training.designpattern.strategy;

public class NotEmptyValidationStrategy implements ValidationStrategy {
    @Override
    public void validate(String value) {
        if (value == null || value.length() == 0)
            throw new RuntimeException("Not empty check failed for value: " + value);
    }
}
