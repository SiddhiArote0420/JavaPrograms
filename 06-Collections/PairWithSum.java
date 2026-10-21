/*. Find Pair with Given Sum 
Problem: Find pairs in an array whose sum equals a target using map. 
Example: 
Input: [2,7,11,15], target=9 
Output: (2,7) */

import java.util.*;

public class PairWithSum {

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int current = arr[i];
            int required = target - current;

            // check if pair exists
            if (map.containsKey(required)) {
                System.out.println("(" + required + ", " + current + ")");
            }

            // store current element
            map.put(current, i);
        }
    }
}