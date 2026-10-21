/*
 Check If Array Is Sorted
 Problem:
Determine whether an array is sorted in non-decreasing order.
Example:
Input: [1, 2, 2, 3, 4]  
Output: true

*/

import java.util.*;
public class Check_Array_Is_Sorted
{
   public static void main(String x[])
   {
	   Scanner sc = new Scanner(System.in);
	   
	   int [] arr = new int[5];
	   
	   System.out.println("Enter the values in array");
	   for(int i = 0; i < arr.length ; i++)
	   {
		   arr[i] = sc.nextInt();
	   }
	   
	   boolean flag = false;
	   for(int i=0 ; i<arr.length-1; i++)
	   {
		  if(arr[i] - arr[i+1] <= 0)
		  { 
	       flag = true;
		  }else{
			flag = false;
			break;
		  }
	   }
	   if(flag)
		  { 
	        System.out.println("True");
		  }else{
			System.out.println("False");
		  }
   }
}