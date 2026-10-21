import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] arr = {"eat", "tea", "tan", "ate"};

        // Map: sorted word → list of anagrams
        Map<String, List<String>> map = new HashMap<>();

        for (String word : arr) {

            // step 1: convert to char array
            char[] ch = word.toCharArray();

            // step 2: sort characters
            Arrays.sort(ch);

            // step 3: convert back to string (key)
            String key = new String(ch);

            // step 4: group in map
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }

        // print result
        System.out.println(map.values());
    }
}


/* Check Anagram Using Map 
Problem: Check if two strings are anagrams using frequency logic. 
Example: 
Input: "listen", "silent" 
Output: True*/

/*import java.util.*;

public class CheckAnagram {

    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        boolean result = isAnagram(s1, s2);

        System.out.println(result);
    }

    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        // frequency for first string
        for (char ch : s1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        // frequency for second string
        for (char ch : s2.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        // compare both maps
        return map1.equals(map2);
    }
}*/