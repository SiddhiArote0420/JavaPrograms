/*Find Smallest Element in an Array
Write a function findMin(int arr[]) that returns the smallest element in the array.
Call it from main().
*/

import java.util.*;
public class Smallest_Element_in_Array
{
  public static void main(String x[])
  {
     int arr[] = new int[6];
	 
	 Scanner sc = new Scanner(System.in);
	 for(int i=0 ; i<arr.length; i++)
	 {
	    arr[i] = sc.nextInt();
	 }
	
	int result = findMin(arr);
	System.out.println("Smallest element is : "+result);
  }
  public static int findMin(int[] arr)
  {
	  int min = arr[0];
	  for(int i = 1 ; i<arr.length;i++)
	  {
		  if(arr[i] < min)
		  {
			  min = arr[i];
		  }
	  }
	  return min;
  }
}		