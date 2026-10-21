/*
Write a program in java to count the number of inversion in a given array
Expected Output :
 The given array is : 1 9 6 4 5
 The inversions are: (9, 6) (9, 4) (9, 5) (6, 4) (6, 5)
 The number of inversion can be formed from the array is: 5
*/


import java.util.*;
public class Find_Intersections
{  public static void main(String x[])
   {   Scanner xyz  = new Scanner(System.in);
       int arr[]=new int[7];
	   
	   
	   System.out.println("Enter values in first array");
	   for(int i=0; i<arr.length; i++)
	   { 
	      arr[i]=xyz.nextInt();
	   }
	   
	   System.out.println("The inversions are :");
	   int count =0;
	   for(int i = 0 ; i<arr.length-1 ; i++)
	   {
            if(arr[i] > arr[i+1])
			{
               System.out.print("("+arr[i]+","+arr[i+1]+") ,");
			   count++;
			}			
		}
		 System.out.println("The number of inversion can be formed from the array is: "+count);
	}
}
   