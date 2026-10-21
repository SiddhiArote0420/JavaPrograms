/* tore N words in a HashMap. Group all anagrams together without using sort(). 
Input: 6 
listen , silent , cat , act , dog , god 
Output: 
Anagram Groups: 
listen silent 
cat act 
dog god 
Description: 
Store the given words in a HashMap. 
 
Do not use: 
• Arrays.sort() 
• Collections.sort() 
• Any built-in anagram checking methods 
Finally, traverse the Map and print groups containing more than one word. 
 
 
 */
 package String;
import java.util.*;

public class SimpleAnagramGroup {

    public static void main(String[] args) {

        String[] words = {"listen", "silent", "cat", "act", "dog", "god"};

        HashMap<String, String> map = new HashMap<>();

        // Loop through each word
        for (int i = 0; i < words.length; i++) {

            int[] freq = new int[26];

            // Count characters
            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].charAt(j);
                freq[ch - 'a']++;
            }

            // Create key from frequency
            String key = "";
            for (int k = 0; k < 26; k++) {
                key = key + freq[k] + "#";
            }

            // Store in HashMap
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + " " + words[i]);
            } else {
                map.put(key, words[i]);
            }
        }

        // Print anagram groups
        System.out.println("Anagram Groups:");
        for (String value : map.values()) {
            if (value.contains(" ")) {
                System.out.println(value);
            }
        }
    }
}
 