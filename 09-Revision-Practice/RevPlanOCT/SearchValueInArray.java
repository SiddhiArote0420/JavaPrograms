/*  Write program to create array of size 5 and input search key value and search value in array
and if value found return its index and return -1
*/

import java.util.*;
public class SearchValueInArray{
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
		System.out.println("Enter the Search value");
		int key = sc.nextInt();
		
		//find key value
		boolean flag = false;
		for(int i=0 ; i<arr.length; i++)
		{
			if(arr[i]==key)
			{
				System.out.println("Value present at index: "+i);
				flag = true;
				break;
			}
		}
		if(!flag){
			System.out.println("Value is not found -1 ");
		}
			
		
	}
}

