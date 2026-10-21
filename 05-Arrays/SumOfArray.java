//Write a java program to calculate sum of array is size 5.

import java.util.*;
public class SumOfArray
{
   public static void main(String x[]){
	   Scanner sc = new Scanner(System.in);
	   
	   int[ ] arr = new int[5];
	   int sum=0;
	   for (int i=0 ; i < arr.length ; i++)
	   {
		   arr[i] = sc.nextInt();
		   sum = sum + arr[i];
	   }
	   System.out.println("sum is :"+sum);
   }
}
	   