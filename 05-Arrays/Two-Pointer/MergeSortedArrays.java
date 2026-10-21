/*Merge Two Sorted Arrays (No Extra Space)
Merge two sorted arrays in-place using the two-pointer method.

*/

import java.util.*;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int arr1[] = {1, 4, 7, 8, 10};
        int arr2[] = {2, 3, 9};

        int i = arr1.length - 1; // last index of arr1
        int j = 0;               // first index of arr2

        // Compare and swap elements
        while (i >= 0 && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                // swap
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--;
            j++;
        }

        // Sort both arrays again
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Print arrays
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
}
