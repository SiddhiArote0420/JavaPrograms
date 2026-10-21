//Write a java program to calculate the sum of digits of a number.

import java.util.*;
public class DigitSum
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = ob.nextInt();
		
		int a=0,sum=0;
		while(n!=0)
		{
			
			a = n%10;
			sum = sum+a;
			n = n/10;
			
	
		}
		System.out.println(sum);
	}
}