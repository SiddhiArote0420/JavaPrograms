// Write a java program to calculate the product of digits of a number.

import java.util.*;
public class DigitProduct
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = ob.nextInt();
		
		int a=0,mul=1;
		while(n!=0)
		{
			
			a = n%10;
			mul = mul*a;
			n = n/10;
			
	
		}
		System.out.println(mul);
	}
}