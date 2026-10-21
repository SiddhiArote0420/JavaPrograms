/*
Write a java program to find missing value in array.
Input : 1 4 6 7 11 15
Output : 2 3 5 8 9 10 12 13 14
*/


import java.util.*;
public class MissingValue
{
   public static void main(String x[]){
	   Scanner sc = new Scanner(System.in);
	   
	   int[] arr = new int[5];
	   
	   int missingVal;
	   
	   System.out.println("Enter the value in array");
	   	for(int i=0 ; i<arr.length ; i++)
	   {
		   arr[i] = sc.nextInt();
	   }
	  
	   System.out.print("Missing value: ");
	   
	   for(int i=0; i<arr.length-1; i++)
	      {
	        for(int j=arr[i+1] ;j< arr[i+1];j++)
			{
			  System.out.print(j);
			 
		    
	      }
      }

 }
} 

