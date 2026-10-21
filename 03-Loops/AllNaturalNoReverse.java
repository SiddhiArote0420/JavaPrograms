//Write a C program to print all natural numbers in reverse (from n to 1).

import java.util.*;
public class AllNaturalNoReverse
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int a = sc.nextInt();
		
		int i=a;
		while(i>=1)
		{
			System.out.println(i);
			i--;
		}
	}
}