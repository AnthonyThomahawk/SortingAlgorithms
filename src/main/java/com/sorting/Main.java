package com.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

public class Main {
    // This is designed in a neat way, whenever a new Sorting algorithm is added
    // A demo function using its class is made, and then it can be easily added to the menu
    // by adding its demo function name and its name.

    // will add more sorting algorithms in the future
    static String[] methodNames = {"demoBubbleSort", "demoSelectionSort"};
    static String[] names = {"Bubble sort", "Selection sort"};


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

    public static void displayMenu() {
        System.out.println("Welcome to Sorting Algorithms with Java");
        System.out.println("A collection of sorting algorithms by Anthony T.");
        System.out.println("MENU");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i+1) + " - " + names[i]);
        }
        System.out.println("Enter # of choice : ");
    }

    public static int getUserInput() {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = stdin.readLine();
            int selection = Integer.parseInt(input);

            if (selection > names.length || selection < 1) {
                throw new NumberFormatException();
            }

            return selection;
        } catch (IOException e) {
            System.err.println("Cannot read user input, exiting.");
            System.exit(1);
        } catch (NumberFormatException e) {
            System.err.println("Invalid input, exiting.");
            System.exit(1);
        }
        
        return -1;
    }

    public static void invokeSorting(int choice, int arr[]) {
        try {
            Method method = Main.class.getMethod(methodNames[choice-1], int[].class);
            method.invoke(null, arr);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,4,5,3,2,6,9,8,7};

        displayMenu();
        int choice = getUserInput();
        invokeSorting(choice, arr);
    }
}