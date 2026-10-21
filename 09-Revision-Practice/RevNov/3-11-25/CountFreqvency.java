/*Count Frequency of Each Element
Concept: Use nested loops or a hash map to count how often each number appears.
 Example:  arr = [4, 5, 6, 4, 5, 7, 4]
Output:
Element 4 occurs 3 times 
Element 5 occurs 2 times 
Element 6 occurs 1 time 
Element 7 occurs 1 time 
*/

import java.util.*;
public class CountFreqvency{
 public static void main(String[] args)
 {
    Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the array size");
	int size = sc.nextInt();
	
	int[] arr = new int[size];
	
	System.out.println("Enter the value array ");
	for(int i=0 ; i<arr.length; i++)
	{
		arr[i] = sc.nextInt();
	}
	
	boolean isVisited[] = new boolean[size];
	for(int i=0; i<arr.length; i++)
	{
		if(isVisited[i])
			 continue;
		 
		int count=1;
		for(int j=i+1; j<arr.length; j++)
		{
			if(arr[i] == arr[j])
			{
				isVisited[j] = true;
				count++;
			}
		}
	   
			System.out.println(arr[i]+" Occurce "+count+" Times");
	}
 }
}
			