// Write a java program to find the sum of the first and last digit of a number.

import java.util.*;
public class SumOfFirst_last
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n= ob.nextInt();
		
		int temp = n;
		int first,count=0;
		
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		n=temp;
		first = n/((int)(Math.pow(10, --count)));
		n=n%10;
		n=n+first;
		System.out.println(n);
	}
}
		