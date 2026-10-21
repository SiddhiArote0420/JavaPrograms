//Write a C program to print a multiplication table of any number.

import java.util.*;
public class MulTable
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = ob.nextInt();
		
		int mul;
		int i = 1;
		while(i <= 10)
		{
			mul = i*n;
			System.out.println(mul);
			i++;
		}
		
	}
}