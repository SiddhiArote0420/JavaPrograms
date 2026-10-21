/*
Write a program in java to find the maximum repeating number in a given array.
The array range is [0..n-1] and the elements are in the range [0..k-1] and k<=n..
 Expected Output:
 The given array is:
 2 3 3 5 3 4 1 7 7 7 7
 The maximum repeating number is: 7

*/

import java.util.*;
public class Find_The_Maximum_Repeating_Number
{  public static void main(String x[])
   {   Scanner xyz  = new Scanner(System.in);
       int arr[]=new int[11];
	   
	   
	   System.out.println("Enter values in array");
	   for(int i=0; i<arr.length; i++)
	   { 
	      arr[i]=xyz.nextInt();
	   }
	   int val=0;
	   int max = 0;
	   for(int i = 0 ; i<arr.length ; i++)
	   {
		   int count = 0;
		   for(int j = 0 ; j < arr.length; j++){
			   if(i!=j){
            if(arr[i] == arr[j])
			{
			   count++;
			}	
		   }
		   }
           if(count > max )
		   {
              max = count;
			   val = arr[i];
		   }
		   		   
		}
		System.out.println("The maximum repeating number is: "+val);
   }
}