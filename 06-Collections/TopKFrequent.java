/*18. Find Top K Frequent Elements 
Problem: Find K most frequent elements using map + sorting. 
Example: 
Input: [1,1,1,2,2,3], k=2 
Output: [1,2]*/

import java.util.*;

public class TopKFrequent {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 2, 3};
        int k = 2;

        // Step 1: Frequency Map
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Convert map to list
        List<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(map.entrySet());

        // Step 3: Sort by frequency (descending)
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> e1,
                               Map.Entry<Integer, Integer> e2) {
                return e2.getValue() - e1.getValue(); // DESC order
            }
        });

        // Step 4: Get top K elements
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            result.add(list.get(i).getKey());
        }

        // Output
        System.out.println(result);
    }
}