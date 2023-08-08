package net.media.training.designpattern.strategy;

class AtMostValidationStrategy implements ValidationStrategy {
    private final int max;

    public AtMostValidationStrategy(int max) {
        this.max = max;
    }

    @Override
    public void validate(String value) {
        int intValue = Integer.parseInt(value);
        if (intValue > max)
            throw new RuntimeException("At most check failed: " + intValue);
    }
}
