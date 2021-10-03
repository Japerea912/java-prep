package com.prep.datastructures;

import java.util.Arrays;

public class MergeSortedArrays {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = Arrays.copyOf(arr1, arr1.length + arr2.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);

        return quicksort(result, 0, result.length - 1);
    }

    private static int[] quicksort(int[] array, int low, int high) {
        if (low < high) {
            int partIndex = partition(array, low, high);
            quicksort(array, low, partIndex - 1);
            quicksort(array, partIndex + 1, high);
        }
        return array;
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }
}
