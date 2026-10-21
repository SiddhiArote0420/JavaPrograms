/*Find the Second Largest Element in an Array
  Write a class to write a method to find the second largest element in an integer array.
 Explanation: Practice logic building and conditional checks.
*/

import java.util.*;
class SecondHighest{
    
	public int findSecondHigh(int[] arr)
	{
	   int max = Integer.MIN_VALUE;
	   int secondMax = Integer.MIN_VALUE;
	   
	   for(int i=0; i<arr.length ; i++)
	   {
		   if(max < arr[i])
		   {
			   secondMax = max;
			   max = arr[i];
		   }else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
	   }
	   return secondMax;
	}
}

public class SecondLargest{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the value in array");
		for(int i=0; i< arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		SecondHighest m = new SecondHighest();
		int result = m.findSecondHigh(arr);
		
		System.out.println("Second Highest is: "+result);
		
	}
}