/*
Count Pairs with Given Sum
Count how many pairs in an unsorted array sum up to a target using two pointers.
*/

import java.util.*;
public class Count_Pairs_with_Given_Sum
{
   public static void main(String x[])
   {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the size of array");
	   int size = sc.nextInt();
	   
	   int [] arr = new int[size];
	   
	   System.out.println("Enter the values in array");
	   for(int i = 0; i < arr.length ; i++)
	   {
		   arr[i] = sc.nextInt();
	   }
	   System.out.println("Enter target Element");
	   int target = sc.nextInt();
	   
	   // sort array
	   for(int i =0 ; i<arr.length ; i++)
	   {
		   for(int j = i+1 ; j<arr.length; j++)
		   {
			   if(arr[i] > arr[j])
			   {
				   int temp = arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp;
			   }
		   }
	   }
	   
	   int left = 0 , right = arr.length-1,count =0;
	   while(left < right )
	   {
		   if(arr[left] + arr[right] == target)
		   {
			   count++;
			   left++;
               right--;
		   }else if(arr[left] + arr[right] < target)
		   {
			   left++;
		   }else{
			   right--;
		   }
	   }
	   System.out.println("Count is : "+count);
	   
	   
   }
}   