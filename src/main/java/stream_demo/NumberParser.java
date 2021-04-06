package stream_demo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class NumberParser {

    public static List<Integer> getEvenNumbersGtnFour(List<Integer> number) {
        return number.stream()
                .filter(n -> n % 2 == 0 && n > 3)
                .filter(n -> n > 4)
                .distinct()
                .collect(Collectors.toList());
    }
}
