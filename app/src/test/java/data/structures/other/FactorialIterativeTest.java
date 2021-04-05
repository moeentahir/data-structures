package data.structures.other;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FactorialIterativeTest {
    private static Stream<Arguments> factorialValues() {
        return Stream.of(
                Arguments.of(0, 1),
                Arguments.of(1, 1),
                Arguments.of(2, 2),
                Arguments.of(3, 6),
                Arguments.of(4, 24)
        );
    }

    @ParameterizedTest(name = "{index} Factorial of {0} is {1}")
    @MethodSource("factorialValues")
    void factorial_when3IsPassed_shouldReturn6(int number, int expected) {
        int actual = FactorialIterative.compute(number);

        assertEquals(expected, actual);
    }
}