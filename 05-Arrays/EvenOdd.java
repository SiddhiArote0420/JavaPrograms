// Write a java program to find even and odd number in array.

import java.util.*;
public class EvenOdd
{
   public static void main(String x[]){
	   Scanner sc = new Scanner(System.in);
	   
	   int[] arr = new int[5];
	   int odd, even;
	   	for(int i=0 ; i<arr.length ; i++)
	   {
		   arr[i] = sc.nextInt();
	   }
	   System.out.print("Even Number is : ");
	   for(int i=0 ; i<arr.length ; i++)
	   {    
		   if(arr[i]%2==0)
		   {
			   System.out.print(arr[i]+" ");
		   }
	   }
	   System.out.println();
	   System.out.print("Odd Number is : ");
	   for(int i=0 ; i<arr.length ; i++)
	   {    
		   if(arr[i]%2!=0)
		   {
			   System.out.print(arr[i]+" ");
		   }
	   }
   }
}