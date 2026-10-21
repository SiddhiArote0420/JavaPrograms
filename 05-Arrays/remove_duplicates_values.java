//  Write a java program to remove duplicates values of array.

import java.util.*;
public class remove_duplicates_values{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {1,2,1,5,3,4,5};
		
		int n = arr.length;
		
		// after delete 
		System.out.print("After delete: ");
		for(int i=0 ; i< n ; i++)
		{
			System.out.print( arr[i]+" ");
		}
		System.out.println();
		// main logic
		
		for(int i=0 ; i<n; i++)
		{   
			for(int j=i+1; j<n-1;j++ )
			{
               if(arr[i] == arr[j])
			   { 
				   for (int k = j; k < n - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
				   n--;
				   j--;
			   }
			}
		}
	
		// before delete
		System.out.print("Before delete: ");
		for(int i=0 ; i< n-1 ; i++)
		{
			System.out.print( arr[i]+" ");
		}
	}
}