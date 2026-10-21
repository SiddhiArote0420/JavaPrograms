//Write java program to merge two array and display it.

import java.util.*;
public class ArrayMerge
{
   public static void main(String x[]){
	   Scanner sc = new Scanner(System.in);
	   
	   int i;
	   int[] arr1 = new int[5];
	   int[] arr2 = new int[5];
	   
	   System.out.println("Enter First Array"); 
	   	for( i=0 ; i<arr1.length ; i++)
	   {
		   arr1[i] = sc.nextInt();
	   }
	   System.out.println("Enter second Array"); 
	   for( i=0 ; i<arr2.length ; i++)
	   {
		   arr2[i] = sc.nextInt();
	   }
	   int[] merge = new int [arr1.length+arr2.length];
	   
	   
	   int k=0;
	   
	   for( i = 0 ; i < arr1.length ; i++)
	   {
		   merge[k++] = arr1[i];
	   }
	   
	   for(int j=0;j< arr2.length;j++)
	   {
		   merge[k++] = arr2[j];
	   }
	   
	   for(int j=0;j< merge.length;j++)
	   {
	   System.out.print(merge[j]);
	   }
   }
}
