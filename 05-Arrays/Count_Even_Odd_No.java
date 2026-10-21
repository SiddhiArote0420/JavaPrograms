/*
 Count Number of Even and Odd Elements
 Problem:
Count how many even and odd elements are present.
Example:
Input: [1, 2, 3, 4, 5, 6]  
Output: Even: 3, Odd: 3
*/

import java.util.*;
public class Count_Even_Odd_No 
{  public static void main(String x[])
   {   Scanner xyz  = new Scanner(System.in);
       int arr[]=new int[7];
	   
	   System.out.println("Enter values in array");
	   for(int i=0; i<arr.length; i++)
	   { 
	      arr[i]=xyz.nextInt();
	   }
	   
	   int evenCount =0 , oddCount=0;
	   for(int i = 0 ; i<arr.length; i++)
	   {
		   if(arr[i]%2==0)
		   {
			   evenCount++;
		   }else
		   {
			   oddCount++;
		   }
	   }
	   System.out.println(" Even Count : "+evenCount+" Odd Count : "+oddCount);
   }
}
