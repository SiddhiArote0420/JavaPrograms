/*Write a program to count the number of digits in a given number using recursion.*/

import java.util.*;
public class CountNoOfDigit{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter digit");
		int n = sc.nextInt();
		
		
		int result = CountDigit(n,0);
	     
		System.out.println("Number of digit is : " +result);
	}
	
	public static int CountDigit(int n,int count)
	{
		if(n==0){
			return count;
		}
		
		 return CountDigit(n/10, count+1);
		 
		
	}
}