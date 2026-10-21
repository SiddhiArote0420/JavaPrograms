/*
Find Missing Number in 1 to N
Problem:
Find a missing number from 1 to N in array of N-1 size.
Example:
Input: [1, 2, 4, 5], N = 5  
Output: 3
*/

import java.util.*;
public class Find_Missing_Number_1toN
{
   public static void main(String x[])
   {
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter the size of array");
	   int n = sc.nextInt();
	   
	   int [] arr = new int[n-1];
	   
	   System.out.println("Enter the values in array");
	   for(int i = 0; i < arr.length ; i++)
	   {
		   arr[i] = sc.nextInt();
	   }
	   
	   boolean flag = false;
	   System.out.print("Missing value : ");
	   for(int i=1 ; i < n; i++)
	   {
		   for (int j=0 ; j<arr.length; j++)
		   {
			  if( i != arr[j] )
			  {
                flag = true;    	
			  }else{
                flag = false;
				break;
			  }	
		   }
		   
           if(flag)
		   {
            System.out.print(i+" ");
		   }
	   }
   }
}   