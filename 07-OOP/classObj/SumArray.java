/* Calculate Sum of Array Elements
Class: ArraySum
Functions:
void inputArray(int arr[])
int calculateSum()
Logic: Traverse array and add all values to sum.
*/

import java.util.*;
class ArraySum{
  int a[];
  public void inputArray(int arr[])
  {
	  this.a = arr;
  }
  
  public int calculateSum(){
	  int sum=0;
	  for(int i=0; i< a.length; i++)
		{
			sum += a[i];
		}
		System.out.println("Sum is:"+sum);
		return sum;
  }
}
public class SumArray{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of Array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		System.out.println("Enter the Value in array");
		for(int i=0; i< arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		ArraySum obj = new ArraySum();
		obj.inputArray(arr);
		obj.calculateSum();
	}
}
		