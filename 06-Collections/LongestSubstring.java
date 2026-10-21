/* Longest Substring Without Repeating Characters 
Problem: Find the length of longest substring without repeating characters. 
Example: 
Input: "abcabcbb" 
Output: 3*/


import java.util.*;

public class LongestSubstring {

    public static void main(String[] args) {

        String s = "abcabcbb";

        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // If duplicate found, shrink window
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            // add current character
            set.add(ch);

            // update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println(maxLength);
    }
}