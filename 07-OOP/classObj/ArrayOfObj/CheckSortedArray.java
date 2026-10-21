/*Check if an Array is Sorted
 Write a class to implement a method to check whether an integer array is sorted in ascending order.
 Explanation: Understand conditions and comparisons in loops.
*/


import java.util.*;
class CheckSorted{
    
	public boolean isSorted(int[] arr)
	{
	  //boolean flag = false;
	  for(int i=0; i< arr.length-1; i++)
	  {
        if(arr[i] > arr[i+1])
		{
		  return false;
		 
	    }
	   			
	  }
	return true;
   }
}

public class CheckSortedArray{
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

		
		CheckSorted m = new CheckSorted();
		boolean result = m.isSorted(arr);
		
		if(result){
		   System.out.println("Array is sorted in asending");
		 }else{
		   System.out.println("Array is not sorted");
		 }
		
	}
}