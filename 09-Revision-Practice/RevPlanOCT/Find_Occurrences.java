/*Write a program to create an array of size 10 and find occurrences of every element in the array?*/

import java.util.*;
public class Find_Occurrences{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of the array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		//enter value in array
		System.out.println("Enter the value in array");
		for(int i=0 ; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//find occurance
		boolean counted[] = new boolean[size];
		for(int i=0; i<arr.length; i++)
		{   
	      if(!counted[i])
		  {
			int count=1;
			for(int j = 0; j<arr.length;j++)
			{   
				if(i != j && arr[i]==arr[j])
				{
					count++;
					counted[j]=true;
				}
					
			}
			System.out.println(arr[i]+" Occurrce "+count+" Times");
		  }
				
		}
			
	}
}