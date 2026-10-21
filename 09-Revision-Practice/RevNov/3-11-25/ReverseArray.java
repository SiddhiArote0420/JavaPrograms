/*.Reverse an Array
Concept: Swap elements from both ends moving toward the center.
 Use Case: Invert order of operations or list of commands.
Example: arr = [10, 20, 30, 40, 50]
Reversed array: [50, 40, 30, 20, 10]
*/

import java.util.*;
public class ReverseArray{
 public static void main(String[] args)
 {
    Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the array size");
	int size = sc.nextInt();
	
	int[] arr = new int[size];
	
	System.out.println("Enter the value array ");
	for(int i=0 ; i<arr.length; i++)
	{
		arr[i] = sc.nextInt();
	}
	
	for(int i=0,j=arr.length-1; i<j; i++,j--)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	for(int i=0 ; i<arr.length; i++)
	{
		System.out.print(arr[i]+" ");
	}
 }
}
	