package com.sorting;

public class SelectionSort {
    public static int operations = 0;

    public static int[] sortArray(int[] arr) {
        operations = 0;
        int min, ind;

        for (int i = 0; i < arr.length; i++) {
            // find min in non sorted part of the array
            min = arr[i];
            ind = i;
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    ind = j;
                }
                operations++;
            }

            // place min at the beginning of the array
            int tmp = arr[i];
            arr[i] = arr[ind];
            arr[ind] = tmp;
        }

        return arr;
    }
}
