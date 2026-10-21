// remove duplicate using two pointer

import java.util.*;
public class RemoveDuplicateSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sorted array input
        int[] arr = new int[5];
        System.out.println("Enter values in array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Edge case: if array has 0 or 1 element
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        
		Arrays.sort(arr);

        int slow = 0; // points to last unique element

        for (int fast = 1; fast < arr.length; fast++) {
            if (arr[fast] != arr[slow]) {
                slow++;
                arr[slow] = arr[fast];
            }for (int i = 0; i <= slow; i++) {
            System.out.print(arr[i] + " ");
        }
        }

        System.out.print("Array after removing duplicates: ");
        
    }
}
