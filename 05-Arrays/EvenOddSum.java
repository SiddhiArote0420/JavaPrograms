//Write a java program to calculate the sum of even or odd numbers.

import java.util.*;
public class EvenOddSum
{
   public static void main(String x[]){
	   Scanner sc = new Scanner(System.in);
	   
	   int[] arr = new int[5];
	   int odd, even,sumEven=0;
	   
	   	for(int i=0 ; i<arr.length ; i++)
	   {
		   arr[i] = sc.nextInt();
	   }
	   System.out.print("Even Number Sum : ");
	   for(int i=0 ; i<arr.length ; i++)
	   {    
		   if(arr[i]%2==0)
		   {
			   sumEven += arr[i];
		   }
	   }
	   System.out.print(sumEven);
	   
	   System.out.println();
	   System.out.print("Odd Number Sum : ");
	   int sumOdd =0;
	   for(int i=0 ; i<arr.length ; i++)
	   {    
		   if(arr[i]%2!=0)
		   {
			   sumOdd += arr[i];
		   }
	   }
	   System.out.print(sumOdd);
   }
}