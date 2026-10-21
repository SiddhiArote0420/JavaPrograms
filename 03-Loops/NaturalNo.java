//.Write a C program to print all natural numbers from 1 to n. - using while loop

import java.util.*;
public class NaturalNo
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = ob.nextInt();
		
		int i = 1;
		while(i <= n)
		{
			System.out.println(i);
			i++;
		}
	}
}
		
		
