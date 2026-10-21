/* Write a program to find the maximum value from an integer ArrayList.
Explanation:
 You will learn:
How to compare elements
Store maximum value manually
Logical thinking without built-in methods
*/

import java.util.*;
public class MaxEle{
	public static void main(String[] args)
	{
	 ArrayList<Integer> a = new ArrayList<>();

	  a.add(10);
	  a.add(20);
	  a.add(30);
	  a.add(40);
	  a.add(50);
	  
	  int size = a.size();
	  int max = a.get(0);
	  for(int i=0; i<size; i++)
	  {
	     if(a.get(i) > max)
		 {
		   max = a.get(i);
		 }
	  }
	  System.out.println("Max Element is: "+max);
	}
}
		 