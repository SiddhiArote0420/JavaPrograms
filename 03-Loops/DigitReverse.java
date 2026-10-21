// Write a java program to enter a number and print its reverse.

import java.util.*;
public class DigitReverse
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = ob.nextInt();
		
		int a,rev=0;
		while(n!=0)
		{
			
			a = n%10;
			n = n/10;
			rev =rev * 10 + a ;
	
		}
		System.out.println(rev);
	}
}