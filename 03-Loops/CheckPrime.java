//Write a java program to check Number Is Prime Number or Not
/* A prime number is a number that can only be divided by itself and 1 without
 remainders.The prime numbers from 1 to 100 are: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97.
*/

import java.util.*;
public class CheckPrime
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int n = ob.nextInt();
		int i=2;
		boolean flag=true;
		
		
		while(i<n)//i<=n/2
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
			
			i++;
		}
		
		/*
		int count = 0;
		
		for(int i=2 ; i<=n/2 ; i++)
		{
			if(n%i == 0)
			{
				count++;
				//break;
			}
		}
		if (count == 0)
			{
				System.out.println("Number is Prime");
			}else{
				System.out.println("Number is not a prime");
			}
			
			*/
			
				if (flag)
			{
				System.out.println("Number is Prime");
			}else{
				System.out.println("Number is not a prime");
			}
	}
	
	}
