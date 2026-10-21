/*. Write a program to create an array of size and arrange all values in ascending order?*/

import java.util.*;
public class AsendingArray{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of the array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the value in array");
		for(int i=0 ; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		for(int i=0 ; i<arr.length; i++)
		{    
			for(int j=i+1; j<arr.length; j++)
			{
		        if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Display the Assending Array: ");
		for(int i=0 ; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
	}
}