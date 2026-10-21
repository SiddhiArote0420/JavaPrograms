// Write a java program to take input from array of size 5 and display it.


import java.util.*;
public class DisplayArray
{
   public static void main(String x[]){
	   Scanner sc = new Scanner(System.in);
	 
       int a[] = new int[]{29,54,65,34,87};
	   for(int i=0 ; i<=a.length-1; i++)
	   {
	     System.out.printf("a[%d] = %d\n", i,a[i]);
		
	   }
   }
}   
	   