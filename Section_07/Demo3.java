// Example for PPT page No.16 —°‘Ò≈≈–Úµ›πÈ≥Ã–Ú

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        // Declare and create the input object
        Scanner input = new Scanner(System.in);

        // Read the length and elements of the array
        int len = input.nextInt();

        int[] array = new int[len];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        // Display the original array
        printArray("original", array);

        // Call the sort method
        selectionSort(array);

        // Display the sorted array
        printArray("Sorted", array);
    }

    // Method for selection sort (original)
    public static void selectionSort(int[] a) {
        // Setup and call the recursive method (overload)
        selectionSort(a, 0, a.length - 1);
    }

    // Method for selection sort (recursive method) (overload)
    public static void selectionSort(int[] arr, int begin, int end) {
        // Check if there only one elements in the series
        if (begin == end) {
            return;
        }

        // Find the minimized number position in the array[begin...end]
        int k = minimized(arr, begin, end);

        if (k != begin) {
            int swap = arr[k];
            arr[k] = arr[begin];
            arr[begin] = swap;
        }

        // Recursive calling
        selectionSort(arr, begin + 1, end);
    }

    // Method for find the minimized number
    public static int minimized(int[] b, int begin, int end) {
        int k = begin;
        int min = b[begin];

        for (int i = begin + 1; i < end + 1; i++) {
            if (min > b[i]) {
                k = i;
                min = b[i];
            }
        }

        return k;
    }

    // Method for display the array
    public static void printArray(String s, int[] a) {
        System.out.println(s);

        for (int k : a) {
            System.out.printf("%4d", k);
        }
        System.out.println();
    }
}