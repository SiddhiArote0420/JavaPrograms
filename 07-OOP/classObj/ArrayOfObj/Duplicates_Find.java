/*  Find Duplicates in an Array
   Write a class to create a method to identify and display duplicate elements in an integer array.
 Explanation: Practice nested loops to compare elements.
*/

import java.util.*;
class FindDuplicates{
	
	public int[] duplicatesFind(int[] arr){
		int k=0;
		int[] a = new int[arr.length];
		for(int i=0; i<arr.length ; i++)
		{
			for(int j=i+1; j<arr.length;j++)
				{
				 if(i!=j){
					if(arr[i] == arr[j])
					{   
					    a[k]= arr[i];
						k++;
						break;
					}
				  }
			    }
		}
		 int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = a[i];
        }

        return result;
	}
}
				
				

public class Duplicates_Find{
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
		
		FindDuplicates m = new FindDuplicates();
		int[] result = m.duplicatesFind(arr);
		
		System.out.println("duplicates in array");
		for(int i=0; i<result.length ; i++)
		{
			System.out.print(result[i] +" ");
		}
	}
}