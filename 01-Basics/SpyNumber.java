// Write a java program to Check Number Is Spy Number or Not.
//Example :	 A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.

import java.util.*;
public class SpyNumber
{
	public static void main(String x[])
	{
		Scanner checkSpy = new Scanner(System.in);
		
		System.out.println("Enter the three number :");
		int n = checkSpy.nextInt();
		
		int n1 = n%10;
		n = n/10;
		
		int n2 = n%10;
		n = n/10;
	    
		int n3 = n%10;
		n = n/10;
		
		int n4 = n;
		
		int sum = n1+n2+n3+n4;
		int product = n1*n2*n3*n4;
		
		if(sum == product)
		{
			System.out.println("Number is spy");
		}else 
		{
			System.out.println("Number is Not a Spy number");
		}
		
	}
}