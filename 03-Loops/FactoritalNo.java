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

/* = 5 * factorial(4)
   = 5 * (4 * factorial(3))
   = 5 * (4 * (3 * factorial(2)))
   = 5 * (4 * (3 * (2 * factorial(1))))
   = 5 * (4 * (3 * (2 * (1 * factorial(0)))))
   = 5 * (4 * (3 * (2 * (1 * 1))))

   1*/