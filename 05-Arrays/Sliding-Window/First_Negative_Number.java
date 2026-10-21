/*
Find First Negative Number in Every Window of Size K
For each window of size k, find the first negative number.

*/

import java.util.*;
public class First_Negative_Number
{  public static void main(String x[])
   {   
       Scanner xyz  = new Scanner(System.in);
	   System.out.println("Enter the Size of array");
	   int size = xyz.nextInt();
	   
       int arr[]=new int[size];

	   System.out.println("Enter values in array");
	   for(int i=0; i<arr.length; i++)
	   { 
	      arr[i]=xyz.nextInt();
	   }
	   
	   System.out.println("Enter the Size of subarray");
	   int k = xyz.nextInt();
	   
	   for(int i = 0 ; i <= size-k ; i++){
		   
		   for(int j=i ; j<k+i; j++)
		   {
			   if(arr[j] < 0)
			   {
				    System.out.print(arr[j]+" ");           
				   break;
			   }
		   }   
	   }
   }
}
	   