/* . Write a Java program to find the maximum sum of any contiguous subarray of size k from a 
given array. 
Concept tested: Fixed-size sliding window for subarray sums. 
  
 Input: arr = [2, 1, 5, 1, 3, 2], k = 3 
 Output: 9 
 Explanation: Subarray [5,1,3] has the maximum sum = 9 */
 
 import java.util.*;
public class Que8
{
	public static void main(String  x[])
	{
		Scanner sc = new Scanner(System.in);
		
		int arr[]= new int[6];
		
		System.out.println("Enter the value in array");
		for(int i=0 ; i< arr.length ; i++)
		{
			arr[i]= sc.nextInt();
		}
		
		System.out.println("Enter the size of sub array");
		int k = sc.nextInt();
		
		int sum =0;
		int max = Integer.MIN_VALUE;
		for(int i=0 ; i<k; i++)
		{
			sum = sum + arr[i];
			if(sum > max)
			max=sum;
		}
		

		for(int i= k ; i< arr.length ; i++)
		{
			sum = sum +arr[i] - arr[i-k];
			if(sum > max)
			max=sum;
		}
		System.out.println("Max Sum :" + max);
	}
}


