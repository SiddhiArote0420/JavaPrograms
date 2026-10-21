/*Move All Zeros to End
Approach: Two Pointers
Example: arr = [0,1,0,3,12] → [1,3,12,0,0]
*/

import java.util.Scanner;

public class MoveAllZeroToEnd {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[5];
        System.out.println("Enter the values in array:");
        for(int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        
        int start = 0; // position to place next non-zero
        int end = arr.length - 1; // last index (used to fill zeros)
        
        // Move all non-zero elements to the front
        for (int i = 0; i <= end; i++) {
            if (arr[i] != 0) {
                if (i != start) {
                    int temp = arr[start];
                    arr[start] = arr[i];
                    arr[i] = temp;
                }
                start++;
            }
        }
        
        // Print the array
        System.out.println("Array after moving zeros to end:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
