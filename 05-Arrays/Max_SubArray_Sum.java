/* Find the Maximum Subarray Sum (Brute Force)
 Problem:Find the maximum sum of any subarray.
Example:
Input: [-2, 1,  -3,   4,   -1,  2,  1,   -5.  ,4]  
Output: 6.  (from subarray [4,-1,2,1])
*/


import java.util.*;
public class Max_SubArray_Sum
{
   public static void main(String x[])
   {
	   Scanner sc = new Scanner(System.in);
	   
	   int [] arr = new int[9];
	   
	   System.out.println("Enter the values in array");
	   for(int i = 0; i < arr.length ; i++)
	   {
		   arr[i] = sc.nextInt();
	   }
	   
	   int max = Integer.MIN_VALUE;
	   for(int k = 0; k < arr.length; k++)
	   {
		   for(int i = 0 ; i < arr.length; i++)
		   {  int sum = 0;
			   for(int j = i ; j<=k; j++)
			   {
				   sum += arr[j];
			   }
			   if(max < sum)
			   {
				   max = sum;
			   }
		   }
	   }
	   System.out.println("Max Sum is : "+ max);
   }
}