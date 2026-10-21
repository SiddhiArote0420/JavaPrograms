/*Write a program to reverse a given number using recursion.*/

import java.util.*;
public class ReverseNumber{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		int result = ReverseNo(0,n);
		System.out.println("Reverse Number is :"+result);
		}
		
		public static int ReverseNo(int rev,int n)
		{
			if(n==0)
				return rev;
			
			//return rev*10+(n%10)
			return ReverseNo( rev*10+(n%10),n/10);
		}
}
			