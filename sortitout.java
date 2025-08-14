// SortItOut.java
// Simple Bubble Sort in Java
// Compile: javac SortItOut.java
// Run: java SortItOut

import java.util.Arrays;

public class sortitout {
    // Bubble sort implementation
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // already sorted
        }
    }

    public static void main(String[] args) {
        int[] numbers = {42, 5, 13, 8, 29, 1, 17};

        System.out.println("Before sorting: " + Arrays.toString(numbers));
        bubbleSort(numbers);
        System.out.println("After sorting:  " + Arrays.toString(numbers));
    }
}
