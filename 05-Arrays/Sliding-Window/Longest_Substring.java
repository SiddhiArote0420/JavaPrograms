/* Longest Substring Without Repeating Characters
   Return the length of the longest substring with all unique characters.
*/

import java.util.*;

public class Longest_Substring
{
   public static void main(String x[])
   {
	   Scanner sc = new Scanner(System.in);  // Scanner (not used in this code)

	   String s = "siddhiarote";   // Input string
	   
	   boolean visited[] = new boolean[26];  // Track visited characters (a–z)

	   int start = 0;   // Start index of longest substring
	   int end = 0;     // End index of longest substring
	   int max = 0;     // Length of longest substring
	   
	   int left = 0 , right = 0;   // Sliding window pointers

	   // Traverse the string using right pointer
	   while(right < s.length()){
		   
		   int rightIndex = s.charAt(right) - 'a';  // Current character index (0–25)
		   
		   // If duplicate char found → move left until duplicate removed
		   while(visited[rightIndex] == true){
			   int leftIndex = s.charAt(left) - 'a';
			   visited[leftIndex] = false;   // Remove left char from window
			   left++;                       // Move left pointer
		   }

		   visited[rightIndex] = true;       // Mark current char as visited

		   int curlen = right - left + 1;    // Current window length

		   // Update longest substring if current is larger
		   if(curlen > max){
			   max = curlen;
			   start = left;
			   end = right;
		   }

		   right++;   // Expand window
	   }

	   // Print longest substring
	   System.out.println(s.substring(start, end+1));

	   /* Another way to print substring character by character
	   for(int i = start ; i <= end ; i++){
		   System.out.print(s.charAt(i));
	   }
	   */
   }
}
