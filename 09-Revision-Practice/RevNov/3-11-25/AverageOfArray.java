/*Average of Elements
Concept: First compute the sum, then divide by the number of elements.
 arr = [10, 20, 30, 40, 50]
Average of array elements: 30.0
*/


import java.util.*;
public class AverageOfArray{
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
	
	int sum = 0;
	for(int i=0; i<arr.length; i++)
	{
		sum = sum+arr[i];
	}
	
	double avg = (double)sum/arr.length;
	System.out.println("Average is: "+avg);
 }
}