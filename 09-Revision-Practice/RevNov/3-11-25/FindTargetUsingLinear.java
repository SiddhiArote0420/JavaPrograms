/*.Search for an Element (Linear Search)
Concept: Traverse array linearly and compare each value with the target.
  
arr = [10, 20, 30, 40, 50]
Enter search key  : 30
Output: value found
Enter search key: 300
Output: value not found */


import java.util.*;
public class FindTargetUsingLinear{
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
	
	System.out.println("Enter the target element ");
	int target = sc.nextInt();
	
	boolean flag = false;
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i] == target)
		{
			flag = true;
			break;
		}
	}
	
	if(flag)
	{
		System.out.println("target is found");
	}else{
		System.out.println("Target are not found");
	}
 }
}
		
	