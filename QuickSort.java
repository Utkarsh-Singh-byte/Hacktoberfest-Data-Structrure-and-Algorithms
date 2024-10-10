package DSAalgorithm;

import java.util.Scanner;

class Quick_sort1{

    // Swap method to exchange elements in the array
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    // Partition method for quicksort
    public static int partition(int[] arr, int lb, int ub) {
        // Use the first element as the pivot
        int pivot = arr[lb];
        int start = lb;
        int end = ub;

        while (start <= end) {
            // Move the start pointer to the right until an element greater than pivot is found
            while (arr[start]<=pivot)
            {
                start++;
            }
            // Move the end pointer to the left until an element less than or equal to pivot is found
            while (arr[end] > pivot)
            {
                end--;
            }
            // Swap elements if start is still less than end
            if (start <= end) {
                swap(arr, start, end);
            }
        }
        // Swap the pivot element to its correct position
        swap(arr, lb, end);
        return end;
    }

    // QuickSort method
    public static void quick_sort(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int loc = partition(arr, lb, ub);
            quick_sort(arr, lb, loc - 1); // Recursively sort the left part
            quick_sort(arr, loc + 1, ub); // Recursively sort the right part
        }
    }
}

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Call quick_sort on the array
        Quick_sort1.quick_sort(arr, 0, size - 1);

        System.out.println("Sorted Array is:");
        for (int i : arr) {
            System.out.println(i);
        }
        sc.close();
    }
}
