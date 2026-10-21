/*Q17. Search for a pair with a given sum in an array.
Given an array arr[] of n integers and a target value, the task is to find whether there is a pair of
elements in the array whose sum is equal to target. This problem is a variation of 2Sum problem.
Examples: 
Input: arr[] = [0, -1, 2, -3, 1], target = -2
Output: true
Explanation: There is a pair (1, -3) with the sum equal to given target, 1 + (-3) = -2.
Input: arr[] = [1, -2, 1, 0, 5], target = 0
Output: false
Explanation: There is no pair with sum equals to given target.
*/


import java.util.*;

class FindTargetSumPair {

    boolean checkTarget(int[] arr, int target) {

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i] + arr[j] == target) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                    return true;
                }
            }
        }

        return false;
    }
}

public class TargetPair {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter values in array:");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target sum:");
        int target = sc.nextInt();

        FindTargetSumPair obj = new FindTargetSumPair();

        boolean result = obj.checkTarget(arr, target);

        System.out.println(result);
    }
}
