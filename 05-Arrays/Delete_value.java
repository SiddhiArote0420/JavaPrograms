/*
 Write a java program to delete value at specific index of array.
Input : 1 2 3 4 5
Index : 2
Output : 1 2 4 5

*/

import java.util.*;
public class Delete_value{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {1,2,3,4,5};
		System.out.println("Enter index to delete: ");
		int index = sc.nextInt();
		
		int n = arr.length;
		
		// after delete 
		System.out.print("After delete: ");
		for(int i=0 ; i< n ; i++)
		{
			System.out.print( arr[i]+" ");
		}
		System.out.println();
		// main logic
		
		for(int i=index ; i < n-1;i++)
		{
			arr[i] = arr[i+1];
		}
		
		// before delete
		System.out.print("Before delete: ");
		for(int i=0 ; i< n-1 ; i++)
		{
			System.out.print( arr[i]+" ");
		}
	}
}
		
		