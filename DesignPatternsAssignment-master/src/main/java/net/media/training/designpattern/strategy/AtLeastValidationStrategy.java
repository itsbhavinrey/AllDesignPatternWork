package net.media.training.designpattern.strategy;

public class AtLeastValidationStrategy implements ValidationStrategy {
        private final int min;
        public AtLeastValidationStrategy(int min) {
            this.min = min;
        }

        @Override
        public void validate(String value) {
            int intValue = Integer.parseInt(value);
            if (intValue < min)
                throw new RuntimeException("At least check failed: " + intValue);
        }
}
