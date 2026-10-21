// Write a java program to Check Number Is Perfect Number or Not.
//perfect number, a positive integer that is equal to the sum of its proper divisors. 

import java.util.*;
public class PerfectNumber
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = ob.nextInt();
		
		boolean flag = false;
		
		int sum=0,i=1;
		while(i < n)
		{
			if(n%i==0)
			{
				sum +=i;
			}
			i++;
		}
			//using flag	
			/*if(sum == n)
			{
				flag = true;
			}
		
		if(flag)
		{
			System.out.println("Number is Perfect");
		}else{
			System.out.println("Number is Not Perfect");
		}*/
		if(sum == n)
		{
			System.out.println("Number is Perfect");
		}else{
			System.out.println("Number is Not Perfect");
		}
	}
}
		
		
