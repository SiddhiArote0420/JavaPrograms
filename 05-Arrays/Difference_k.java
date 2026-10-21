/*3. Count All Pairs with Difference k
 Problem:
Find all pairs (i, j) such that |arr[i] - arr[j]| = k.
Example:
Input: arr = [1, 5, 3, 4, 2], k = 2  
Output: (1,3), (5,3), (3,1), (4,2)

*/

import java.util.*;
public class Difference_k
{
   public static void main(String x[])
   {
	   Scanner sc = new Scanner(System.in);
	   
	   int [] arr = new int[5];
	   
	   System.out.println("Enter the values in array");
	   for(int i = 0; i < arr.length ; i++)
	   {
		   arr[i] = sc.nextInt();
	   }
	   
	   System.out.println("Enter the Diffrence");
	   int k = sc.nextInt();
	   
	   for(int i=0 ; i<arr.length; i++)
	   {
		   for (int j=0 ; j<arr.length; j++)
		   {
			   if(i != j){
				   if(arr[i] > arr[j])
				   { 
			          if(arr[i] - arr[j]==k)
						System.out.print(" ("+ arr[i]+","+arr[j]+") , ");  
                        
				   }else//(arr[i] < arr[j])	
                   {
                       if(arr[j] - arr[i] == k)
						   System.out.print("("+ arr[i]+","+arr[j]+") , ");
                   }
			   
			   }
		   }
	   }
   }
}   
				   
	   