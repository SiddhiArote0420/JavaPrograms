/*Q13. WAP to create class name as Search with two functions 
 boolean isPresent(int  key,int …value): this function can search the key present in an
array or not if present returns true otherwise return false.
*/

import java.util.*;
class Search{
	int key;
	int arr[];
	
	boolean isPresent(int key, int ...x){
		this.arr = x;
		this.key = key;
		// sort using selection sort
		for(int i=0 ; i< arr.length-1; i++)
		{
			int minIndex = i;
			for(int j=i+1; j<arr.length; j++)
			{
				if( arr[minIndex] > arr[j])
				{
					minIndex = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		
		
		// binary search
		int l = 0, r = arr.length-1;
		while(l <= r)
		{
			int mid = (l+r)/2;
			
			if(arr[mid] == key)
			{
				return true;
			}
			
			if(arr[mid] < key)
			{
				l = mid+1;
			}else{
				r = mid - 1;
			}
		}
		return false;
	}
}
			
	
public class SearchKey{
 public static void main(String args[])
 {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of array");
    int size = sc.nextInt();

    int arr[] = new int[size];

    System.out.println("Enter the vale in array");
	for(int i=0; i<arr.length;i++){
          arr[i] = sc.nextInt();
	}
	
	System.out.println("Enter the searching  key");
    int key = sc.nextInt();

    Search r = new Search();
    boolean result = r.isPresent(key,arr);
	if(result)
	{
		System.out.println("Key is present");
	}else{
		System.out.println("Key not present");
	}
	
 }
} 
	