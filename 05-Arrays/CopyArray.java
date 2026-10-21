//Write a java program to copy one array to another array.

import java.util.*;
public class CopyArray
{
   public static void main(String x[]){
	   Scanner sc = new Scanner(System.in);
	   
	   int[] arr = {10,13,15,17,18};
	   int[] copy = new int[arr.length];
	   
	   // copy one array to another
	   int k=0;
        for(int i=0; i<arr.length ; i++)
		{
          copy[k++]	= arr[i];
		}
		// Display second(copied) array
		System.out.print("Copid Array : ");
        for(int i=0 ;i<copy.length ; i++)
		{
          System.out.print(copy[i]+" ");
		}		
   }
}