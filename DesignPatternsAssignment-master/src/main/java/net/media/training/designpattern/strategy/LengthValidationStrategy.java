package net.media.training.designpattern.strategy;

public class LengthValidationStrategy implements ValidationStrategy {
    private final int allowedLength;

    public LengthValidationStrategy(int allowedLength) {
        this.allowedLength = allowedLength;
    }

    @Override
    public void validate(String value) {
        if (value.length() > allowedLength)
            throw new RuntimeException("Invalid length: " + allowedLength);
    }
}
