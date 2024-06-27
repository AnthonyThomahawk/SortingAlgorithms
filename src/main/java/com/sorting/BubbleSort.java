package com.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static int operations = 0;

    public static int[] sortArray(int[] arr) {
        operations = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int tmp = arr[j];
                if (arr[j] > arr[j+1]) {
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
                operations++;
            }
        }

        return arr;
    }

    public static int[] sortArrayOptimal(int[] arr) {
        operations = 0;
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                int tmp = arr[j];
                if (arr[j] > arr[j+1]) {
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    swapped = true;
                }
                operations++;
            }

            if (!swapped)
                break;
        }

        return arr;
    }
}
