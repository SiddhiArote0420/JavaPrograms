/*
Minimum Sum Subarray of Size K
Find the minimum sum of a subarray with size k.
*/

import java.util.*;
public class Minimum_Sum
{  public static void main(String x[])
   {   
       Scanner xyz  = new Scanner(System.in);
       int arr[]=new int[8];

	   System.out.println("Enter values in array");
	   for(int i=0; i<arr.length; i++)
	   { 
	      arr[i]=xyz.nextInt();
	   }
	   
	   System.out.println("Enter the Size of subarray");
	   int k = xyz.nextInt();
	   
	   int min = Integer.MAX_VALUE;
	   int sum =0;
	   for(int i = 0; i<k; i++)
	   {
		    sum += arr[i];
	   }
	   
	   for(int i = k ; i<arr.length ; i++)
	   {
		   sum = sum + arr[i] - arr[i-k];
		   if(sum < min)
		   {
			   min = sum;
	       }
	   }
	   System.out.println("the minimum sum of a subarray with size "+k +" : "+min);
   }
}
			   
		   
	   