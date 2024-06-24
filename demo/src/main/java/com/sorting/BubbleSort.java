package com.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static int operations = 0;

    public static int[] sortArray(int[] arr) {
        operations = 0;
        int[] sorted = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - i - 1; j++) {
                int tmp = sorted[j];
                if (sorted[j] > sorted[j+1]) {
                    sorted[j] = sorted[j+1];
                    sorted[j+1] = tmp;
                }
                operations++;
            }
        }

        return sorted;
    }

    public static int[] sortArrayOptimal(int[] arr) {
        operations = 0;
        int[] sorted = Arrays.copyOf(arr, arr.length);
        boolean swapped;
        for (int i = 0; i < sorted.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < sorted.length - i - 1; j++) {
                int tmp = sorted[j];
                if (sorted[j] > sorted[j+1]) {
                    sorted[j] = sorted[j+1];
                    sorted[j+1] = tmp;
                    swapped = true;
                }
                operations++;
            }

            if (!swapped)
                break;
        }

        return sorted;
    }
}
