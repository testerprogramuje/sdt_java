package calculator_demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class AverageCalculatorTest {

    @Test
    void shouldCalculateCorrectAverageForZero() {
        List<Double> numbers = Arrays.asList(0.0);
        assertThat(AverageCalculator.calculateAverage(numbers)).isZero();
    }

    @Test
    void shouldCalculateCorrectAverageForOne() {
        List<Double> numbers = Arrays.asList(1.0);
        assertThat(AverageCalculator.calculateAverage(numbers)).isEqualTo(1.0);
    }

    @Test
    void shouldCalculateCorrectAverageForTwoArguments() {
        List<Double> numbers = Arrays.asList(1.0, 2.0);
        assertThat(AverageCalculator.calculateAverage(numbers)).isEqualTo(1.5);
    }
}