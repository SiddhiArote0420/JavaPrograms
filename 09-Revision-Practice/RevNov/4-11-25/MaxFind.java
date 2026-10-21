/*Write program to create class name as FindMax with two functions
       void setArray(int a[]): this function is used for accept array as parameter
       int getMax(): this function can find the max value from array and return it.
*/

import java.util.*;
public class MaxFind
 {
	 public static void main(String x[])
	 {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the value in array");
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		FindMax m = new FindMax();
		m.setArray(arr);
		int result = m.getMax();
		System.out.println("Max is: "+result);
		
	 }
 }
 
 class FindMax{
	 private int []arr;
	 
	 void setArray(int a[])
	 {
		 this.arr = a;
	 }
	 
	 public int getMax(){
		 int max = Integer.MIN_VALUE;
		 for(int i=0; i<arr.length; i++)
		 {
			if(arr[i] > max)
			{
              max = arr[i];
			}
		 }
        return max;
	 }
 }	 