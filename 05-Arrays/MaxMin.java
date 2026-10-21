//Write a java program to find maximum and minimum number in array.

import java.util.*;
public class MaxMin
{
   public static void main(String x[]){
	   Scanner sc = new Scanner(System.in);
	   
	   int[] arr = new int[5];
	   int min = Integer.MAX_VALUE, max = arr[0];
	   for(int i=0 ; i<arr.length ; i++)
	   {
		   arr[i] = sc.nextInt();
	   }
	   for(int i=0 ; i<arr.length ; i++)
	   {
		   if(arr[i] > max)
		   {
			    max = arr[i];
		   }
		   if(arr[i]<min ){
			    min =arr[i];
		   }
		   
	   }
	   System.out.println("Max Value is :"+max);
	   System.out.println("Min Value is :"+min);
   }
}
	  