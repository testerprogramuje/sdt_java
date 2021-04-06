package stream_demo;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;


class NumberParserTest {

    @Test
    void shouldReturnValidList() {
        List<Integer> numbersToParse = IntStream.range(0, 10).boxed().collect(Collectors.toList());
        assertThat(NumberParser.getEvenNumbersGtnFour(numbersToParse)).containsExactly(6, 8, 10);
    }
}