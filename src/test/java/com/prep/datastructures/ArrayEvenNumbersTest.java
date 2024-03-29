package com.prep.datastructures;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayEvenNumbersTest {

    @ParameterizedTest
    @MethodSource("arrayProvider")
    void should_filter_even_numbers(int[] numbers, int[] expectedArry) {
        int[] resultArray = ArrayEvenNumbers.removeEven(numbers);

        assertArrayEquals(expectedArry, resultArray);
    }

    static Stream<Arguments> arrayProvider() {
        return Stream.of(
                Arguments.of((Object) new int[]{1, 2, 4, 5, 10, 6, 3}, (Object) new int[]{1, 5, 3}),
                Arguments.of((Object) new int[]{32, 37, 10, 40, 11, 5}, (Object) new int[]{37, 11, 5})
        );
    }
}