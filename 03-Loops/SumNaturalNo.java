//Write a C program to find the sum of all natural numbers between 1 to n.

import java.util.*;
public class SumNaturalNo
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = ob.nextInt();
		int sum =0;
		int i = 1;
		while(i <= n)
		{
			sum = sum+i;
			i++;
		}
		System.out.println(sum);
	}
}