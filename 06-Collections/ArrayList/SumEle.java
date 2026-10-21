/*Q2. Create an ArrayList of integers and calculate the sum of all elements.

	Explanation:
	 This question practices:
Iterating over ArrayList
Performing arithmetic operations
Using get(index) method
*/

import java.util.*;
public class SumEle{
	public static void main(String[] args)
	{
	 ArrayList<Integer> a = new ArrayList<>();

	  a.add(10);
	  a.add(20);
	  a.add(30);
	  a.add(40);
	  a.add(50);
	  
	  int size = a.size();
	  
	  int sum = 0;
	  for(int i = 0; i<size; i++)
	  {
	    sum = sum+(a.get(i));
      }

    System.out.println("Sum of element is: "+sum);
  }
}
  