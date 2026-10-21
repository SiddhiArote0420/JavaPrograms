/*Shift Array Elements to the Left
 Write a class to create a method to shift all elements in an array one position to the left.
 Explanation: Work with array indexes and element reassignment.
*/


import java.util.*;
class ElementsShift{
    
	public int[] elementsShift(int[] arr, int key)
	{
	  for(int i=0; i< key; i++)
	  {
		  int temp = arr[0];
        for(int j=0; j<arr.length-1; j++)
        {
		   arr[j] = arr[j+1];	
            if(j == arr.length-2)
			    arr[j+1] = temp;
		}
	  }
	   	return arr;		
	}
}

public class ShiftArrayEle{
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
		System.out.println("Enter the Key for shift");
		int key = sc.nextInt();
		
		ElementsShift m = new ElementsShift();
		int result[] = m.elementsShift(arr, key);
		
		System.out.println("Shifted Array");
		for(int i=0; i<result.length ; i++)
		{
			System.out.print(result[i] +" ");
		}
	}
}