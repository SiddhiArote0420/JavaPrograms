/*Write a function to check whether the given number is a neon number (sum of digits of square = number)*/

import java.util.*;
public class Neon_Number_Check
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		
		boolean result = NeonCheck(n);
		if(result)
		{
		   System.out.print("It is Neon ");
		}else{
			System.out.print("It is Not Neon ");
		}
	}
	public static boolean NeonCheck(int n)
	{
		int square = n*n;
		int  sum=0;
		while(square > 0)
		{
			int a = square%10;
			sum +=a;
			square = square/10;
			
		}
		
		
	
	      return n == sum ;
	}
}
