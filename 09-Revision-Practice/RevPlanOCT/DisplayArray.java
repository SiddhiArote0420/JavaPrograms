/*  Write a program to create an array of size 5 and display its value?*/

import java.util.*;
public class DisplayArray{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		int size = 5;
		int arr[] = new int[size];
		System.out.println("Enter the value in array");
		for(int i=0 ; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Display the value in array: ");
		for(int i=0 ; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
	}
}