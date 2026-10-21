/* Remove Duplicates in an Array
 Write a class to create a method to identify and display duplicate elements in an integer array.
 Explanation: Practice nested loops to compare elements.
*/

import java.util.*;

class RemoveDuplicates {

    public int[] duplicatesRemove(int[] arr) {
        int[] temp = new int[arr.length]; // temporary array to store unique elements
        int k = 0; // counter for unique elements

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            // Check if arr[i] already exists in temp
            for (int j = 0; j < k; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break; // no need to check further
                }
            }

            // If not a duplicate, store it
            if (!isDuplicate) {
                temp[k] = arr[i];
                k++;
            }
        }

        // Create final array of size k
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}

public class DuplicatesCopiesDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the values in array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        RemoveDuplicates m = new RemoveDuplicates();
        int[] result = m.duplicatesRemove(arr);

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
