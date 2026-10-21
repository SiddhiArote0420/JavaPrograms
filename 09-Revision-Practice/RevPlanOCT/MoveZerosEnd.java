/*Move All Zeros to End
Approach: Two Pointers
Example: arr = [0,1,0,3,12] → [1,3,12,0,0]
*/

import java.util.*;
public class MoveZerosEnd{
public static void main(String args[])
 {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the size of array: ");
	 int size = sc.nextInt();
	 
	 int arr[] = new int[size];
	 System.out.println("Enter the value in array: ");
	 for(int i=0;i<arr.length;i++)
	 {
		 arr[i] = sc.nextInt();//0,1,0,3,12
	 }
	 
	 int start=0;
	 int end=arr.length-1;
	 while(start<end)//1<2
	 {
		 if(arr[start]==0)
		 {
			 int temp = arr[start];//0
			 
			 for(int i=start; i<end; i++)
			 {
				 arr[i]=arr[i+1];//1 3 12 0 
			 }
			 arr[end] = temp;//1 3 12 0 0
			 end--;//3 2
		 }else{
			 start++;//2
		 }
	 }
	 for(int i=0;i<arr.length;i++)
	 {
		 System.out.print(arr[i]+" ");
	 }
 }
}