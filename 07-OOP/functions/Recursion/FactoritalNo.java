/*Write a program to calculate the factorial of a given number using recursion.*/

import java.util.*;
public class FactoritalNo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		
		int result = factNo(n);
		System.out.println("Factorial is :"+result);
		
	}
	public static int factNo(int n)
	{
		
		if(n == 0 || n == 1)
		{
			return 1;
			
		}else
		{
			return n*factNo(n-1);
		}
	}
}

/* 5*4
   4*3
   3*2
   2*1
   1*/