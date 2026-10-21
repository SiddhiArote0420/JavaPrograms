/*Sort an Array (Bubble Sort)
  Write a class to implement a method to sort an integer array using bubble sort.
 Explanation: Learn basic sorting algorithms and their implementation.
*/

import java.util.*;
class BubbleSort{
	public int[] sortArray(int[] arr)
	{
		for(int i=0; i< arr.length-1;i++)
		{   boolean flag = false;
			for(int j=0; j < (arr.length-1)-i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
				    arr[j+1] = temp;
					flag = true;
				}
			}
			if(!flag)
			{
					break;
			}
		}
		return arr;
	}
}
		
public class SortArray{
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
		
		BubbleSort m = new BubbleSort();
		int[] result = m.sortArray(arr);
		
		System.out.println("Sorted Array");
		for(int i=0; i<result.length ; i++)
		{
			System.out.print(result[i] +" ");
		}
	}
}