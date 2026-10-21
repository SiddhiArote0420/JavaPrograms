/* Find Intersection of Two Arrays
 Problem:
Print common elements in two arrays using brute force.
Example:
Input: arr1 = [1, 2, 3], arr2 = [2, 3, 4]  
Output: 2, 3
*/


import java.util.*;
public class Find_Intersection
{  public static void main(String x[])
   {   Scanner xyz  = new Scanner(System.in);
       int arr1[]=new int[7];
	   int arr2[]=new int[5];
	   
	   System.out.println("Enter values in first array");
	   for(int i=0; i<arr1.length; i++)
	   { 
	      arr1[i]=xyz.nextInt();
	   }
	   
	   System.out.println("Enter values in second array");
	   for(int i=0; i<arr2.length; i++)
	   { 
	      arr2[i]=xyz.nextInt();
	   }
	   
	   System.out.println("Entersection is :");
	   for(int i = 0 ; i<arr1.length ; i++)
	   {
		  for(int j = 0 ; j< arr2.length ; j++)
		  {
            if(arr1[i] == arr2[j])
			{
               System.out.print(arr1[i]+" ");
			   break;
			}	
		  }
	   }
   }
}   