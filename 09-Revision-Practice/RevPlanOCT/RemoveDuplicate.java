/*Remove Duplicates from Sorted Array
   Approach: Two Pointers (slow/fast)
   Example: arr = [1,1,2,2,3] → [1,2,3]
*/

import java.util.*;
public class RemoveDuplicate{
public static void main(String args[])
 {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the size of array: ");
	 int size = sc.nextInt();
	 
	 int arr[] = new int[size];
	 System.out.println("Enter the value in array: ");
	 for(int i=0;i<arr.length;i++)
	 {
		 arr[i] = sc.nextInt();
	 }
	 
	 //logic
	 // sort arry 
	 for(int i=0; i<arr.length-1 ; i++)
	 {
		 for( int j=i+1; j < arr.length ; j++)
		 {
	     if(arr[i] > arr[j])
		  {
			 int temp = arr[i];
		     arr[i] = arr[j];
			 arr[j]= temp;
		  }
		 }
	 }
	 /*for(int i=0;i<arr.length;i++)
	 {
		 System.out.print(arr[i]+" ");
	 }System.out.println();
	 //remove duplicates
	 for(int i=0 ; i<arr.length-1 ; i++)
	 {
		 if(arr[i]==arr[i+1])
		 {
			 for(int j = i+1; j<arr.length-1;j++)
			 {
				 arr[j] = arr[j+1];
				 if(j+1 == arr.length-1)
				 {
					 arr[arr.length-1] = 0;
				 }
			 }
		 }
	 }
	 for(int i=0;i<arr.length;i++)
	 {
		 System.out.print(arr[i]+" ");
	 }*/
	 
	 //using two pointer
	 int j=arr.length;
	 int start = 0;
	 int end = 1;
	 
	 while(end < j)
	 {
        if(arr[start] == arr[end])
		{
          for(int i=end; i<j-1;i++)
		  {
            arr[i] = arr[i+1];
		  }
         j--;
		}else
		{
			start++;
			end++;
		}
	 }
 	 
	 for(int i=0;i<j;i++)
	 {
		 System.out.print(arr[i]+" ");
	 }
 }
}
