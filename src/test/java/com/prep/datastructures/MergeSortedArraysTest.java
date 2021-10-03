package com.prep.datastructures;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArraysTest {

    @ParameterizedTest
    @MethodSource("arrayProvider")
    void should_merge_and_sort_arrays(int[] arr1, int[] arr2, int[] expected) {
        int[] result = MergeSortedArrays.mergeArrays(arr1, arr2);

        assertArrayEquals(expected, result);
    }

    static Stream<Arguments> arrayProvider() {

        return Stream.of(
                Arguments.of(new int[]{1, 3, 4, 5}, new int[]{2, 6, 7, 8}, new int[]{1, 2, 3, 4, 5, 6, 7, 8}),
                Arguments.of(new int[]{1, 3, 3, 4, 4, 5}, new int[]{3, 5, 6, 7, 8}, new int[]{1, 3, 3, 3, 4, 4, 5, 5, 6, 7, 8})
        );
    }
}