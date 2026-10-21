/*
Check if Subarray with Given Sum Exists
For a given sum, check if there’s a subarray with that sum using sliding window.
*/

import java.util.*;
public class Given_Sum_Exists
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
	   
	   System.out.println("Enter the Target sum");
	   int target = xyz.nextInt();
	   
	    boolean flag = false;
	   int sum =0;
	   for(int i = 0; i<k; i++)
	   {
		    sum += arr[i];
	   }
	   if(sum == target) {
            flag = true;
        }
	   
	   for(int i = k ; i<arr.length ; i++)
	   {
		   sum = sum + arr[i] - arr[i-k];
		   if(sum == target)
		   {
			   flag = true;
			   break;
	       }
	   }
	   
	   if(flag)
	   {
		   System.out.println("Yes");
	   }else{
		   System.out.println("No");
	   }
   }
}