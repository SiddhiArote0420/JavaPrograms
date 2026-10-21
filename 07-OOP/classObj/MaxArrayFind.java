/* Find Maximum Element in Array
Class: ArrayMax
Functions:
void inputArray(int arr[]) → take array input
int findMax() → display maximum element
int findMin() → display minimum element
*/

import java.util.*;
class ArrayMax{
	int a[];
	void inputArray(int arr[])
	{
		this.a=arr;
	}
	
	//find max
	int findMax(){
		int max = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(max < a[i])
				max = a[i];
		}
		System.out.println("Max is: "+max);
		return max;
	}
	
	//find minimum
	int findMin(){
		int min = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(min > a[i])
				min = a[i];
		}
		System.out.println("Min is: "+min);
		return min;
	}
}
public class MaxArrayFind{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the Value in array");
		for(int i=0; i< arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		ArrayMax obj = new ArrayMax();
		obj.inputArray(arr);
		obj.findMax();
		obj.findMin();
}
}