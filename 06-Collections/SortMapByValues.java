/* Sort Map by Values 
Problem: Sort map entries based on values. 
Example: 
Input: {1=Z,2=A,3=M} 
Output: {2=A,3=M,1=Z}*/

import java.util.*;

public class SortMapByValues {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Z");
        map.put(2, "A");
        map.put(3, "M");

        System.out.println("Before Sorting: " + map);

        // Convert map to list of entries
        List<Map.Entry<Integer, String>> list =
                new ArrayList<>(map.entrySet());

        // Sort by value
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> e1,
                               Map.Entry<Integer, String> e2) {
                return e1.getValue().compareTo(e2.getValue());
            }
        });

        // Store sorted result in LinkedHashMap (maintains order)
        Map<Integer, String> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<Integer, String> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("After Sorting: " + sortedMap);
    }
}