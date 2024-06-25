package com.sorting;

public class Main {
    public static void printArr(int[] arr) {
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    public static void demoBubbleSort(int[] arr) {
        System.out.println("Bubble sort demo : ");
        System.out.println("Unsorted array : ");
        printArr(arr);
        int bubbleSorted[] = BubbleSort.sortArray(arr);
        System.out.println("Sorted array (unoptimal) :");
        printArr(bubbleSorted);
        System.out.println("Operations done : " + BubbleSort.operations);
        int bubbleSortedOptimal[] = BubbleSort.sortArrayOptimal(arr);
        System.out.println("Sorted array (optimal) :");
        printArr(bubbleSortedOptimal);
        System.out.println("Operations done : " + BubbleSort.operations);
    }

    public static void demoSelectionSort(int[] arr) {
        System.out.println("Selection sort demo : ");
        System.out.println("Unsorted array : ");
        printArr(arr);
        int selectionSorted[] = SelectionSort.sortArray(arr);
        System.out.println("Sorted array : ");
        printArr(selectionSorted);
        System.out.println("Operations done : " + SelectionSort.operations);
    }

    public static void main(String[] args) {
        int arr[] = {1,4,5,3,2,6,9,8,7};

        demoSelectionSort(arr);
    }
}