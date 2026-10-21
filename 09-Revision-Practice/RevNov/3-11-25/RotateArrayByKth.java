/*.Right Rotate an Array by 1 or K Positions
Concept: Shift elements to the right and bring the last to front.
 Use Case: Buffer manipulation.
Input: arr = [10, 20, 30, 40, 50]
Right rotated array by 2 positions: [40, 50, 10, 20, 30]
*/

import java.util.*;
public class RotateArrayByKth{
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
	System.out.println("Enter the kth position for roation ");
	int k = sc.nextInt();
	
	int count=0;
	while(count!=k)
	{
		int temp = arr[arr.length-1];
		for(int j=arr.length-2; j>=0; j--)
		{
			arr[j+1]=arr[j];
		}
		arr[0]=temp;
		count++;
	}
	//display
	for(int i=0 ; i<arr.length; i++)
	{
		System.out.print(arr[i]+" ");
	}
 }
}