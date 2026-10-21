/* 11. Write a program to create an array of size 5 and find max value?*/

import java.util.*;
public class FindMaxInArray{
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
		
		int max = Integer.MIN_VALUE;
		for(int i=0 ; i<arr.length; i++)
		{
			if(max < arr[i])
				max = arr[i];
		}
		System.out.println("Max is: "+max);
	}
}