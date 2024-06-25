# Sorting algorithms
This is my repository where I implement a variety of sorting algorithms in either Java or C++.
I also keep notes in this README.md about time complexity and other notes about each algorithm.
# Bubble sort
## Description
Bubble sort is probably the simplest sorting algorithm, it involves swapping each adjacent element until the array is sorted. The array is sorted when no more swaps of adjacent elements is needed.
## Visualization :
![bubblesort](bubble_sort.png)
## Time complexity :
O(n^2)
## Space complexity :
O(1) (Its an in-place algorithm)
## Implementation :
It is implemented in [BubbleSort.java](src/main/java/com/sorting/BubbleSort.java) with 2 methods, an optimized one and an unoptimized one.
The difference between the two is that the optimized method stops when there are no swaps done within a pass, while the unoptimized one continues until there are no passes left.