package com.prep.datastructures;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindNumbersAddToNTest {

    @ParameterizedTest
    @MethodSource("arrayProvider")
    void should_find_pair_of_numbers(int[] arr1, int[] arr2, int[] expected) {
        int[] result = MergeSortedArrays.mergeArrays(arr1, arr2);

        assertArrayEquals(expected, result);
    }

    static Stream<Arguments> arrayProvider() {

        return Stream.of(
                Arguments.of(new int[]{1, 21, 3, 14, 5, 60, 7, 6}, 81, new int[]{21, 60}),
                Arguments.of(new int[]{9, 4, 7, 2, 6}, 17, new int[]{1, 3, 3, 3, 4, 4, 5, 5, 6, 7, 8})
        );
    }
}