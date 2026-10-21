/*Q1. Create an ArrayList of integers. Add 5 numbers and display all elements using a loop.
Explanation:
	This helps you understand:
How to declare an ArrayList
How to add elements using add()
How to traverse an ArrayList using for loop
*/

import java.util.*;
public class AddAndDisplayEle{
	public static void main(String[] args)
	{
		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		
		int size = a.size();
		
		for(int i=0; i<size; i++)
		{
			System.out.print(a.get(i)+" ");
		}
	}
}