/* Q16. Binary search in a sorted array
Your Task
 _________________________________________________________
You have to create class name as BinarySearch with two methods 
void setArray(int a[]): this function is used for accept array as parameter 
int getIndex(int key): this function accepts a key for search and return index of search element and
returns -1 when the element is not found and show the element at function calling point using index if
index is not -1
*/

import java.util.*;
class BinarySearch{
	int [] a;
	 void setArray(int[] a)
	 {
		 this.a = a;
		 Arrays.sort(a);
	 }
	 
	 int getIndex(int key)
	 {

		 int l = 0;
		 int r = a.length-1;
		 while(l<=r)
		 {
			 int mid = (l+r)/2;
			 
			 if(a[mid] == key)
			 {
				 return mid;
			 }else if(a[mid] < key)
			 {
				 l = mid+1;
			 }else{
				 r = mid-1;
			 }
		 }
		 
		 return -1;
	 }
}		 


public class BinarySearchKey{
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

    BinarySearch r = new BinarySearch();
	r.setArray(arr);
    int  result = r.getIndex(key);
    System.out.println("Key index: "+result);
	
	
 }
} 