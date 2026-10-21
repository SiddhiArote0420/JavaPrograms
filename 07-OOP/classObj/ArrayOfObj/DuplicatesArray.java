/* Remove Duplicates in an Array
 Write a class to create a method to identify and remove duplicate elements in an integer array.
 Explanation: Practice nested loops to compare elements.
*/

import java.util.*;
class RemoveDuplicates{
	
	public int[] duplicatesRemove(int[] arr){
		int k=0;
		int[] a = new int[arr.length];
		for(int i=0; i<arr.length ; i++)
		{
			boolean isVisited = false;
			
			
			for(int j=0; j<arr.length;j++)
				{
				 if(!isVisited && i!=j){
					if(arr[i] == arr[j])
					{
						isVisited=true;
					}
				}
			 }
			 if(isVisited == false){
				 a[k] = arr[i];
				 k++;
			 }
		}
		 int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = a[i];
        }

        return result;
	}
}
				
				

public class DuplicatesArray{
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
		
		RemoveDuplicates m = new RemoveDuplicates();
		int[] result = m.duplicatesRemove(arr);
		
		System.out.println("after duplicate remove");
		for(int i=0; i<result.length ; i++)
		{
			System.out.print(result[i] +" ");
		}
	}
}