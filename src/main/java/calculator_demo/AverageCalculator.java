package calculator_demo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class AverageCalculator {

    public static double calculateAverage(List<Double> numbers) {
        double average = 0;

        for (Double number : numbers) {
            average += number;
        }

        return average;
    }
}
