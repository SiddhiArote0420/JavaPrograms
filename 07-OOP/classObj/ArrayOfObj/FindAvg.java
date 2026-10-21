/*Calculate the Average of an Array
o   Write a class to create a method to calculate the average of elements in an integer array.
 Explanation: Practice basic arithmetic operations and array traversal.
*/

import java.util.*;
class CalculateAvg{
   
   public int calAvg(int [] arr){
	   
	   int sum=0;
	   for( int i=0; i<arr.length; i++)
	   {
		 sum +=arr[i];  
	   }
	   
	   int avg = sum/arr.length;
	   return avg;
     
}
}
public class FindAvg{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the value in array");
		for(int i=0; i< arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		CalculateAvg m = new CalculateAvg();
		int result = m.calAvg(arr);
		System.out.println("Max value is: "+ result);
	}
}