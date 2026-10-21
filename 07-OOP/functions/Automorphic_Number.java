/*Write a function to check if a number is an automorphic number (last digits = square of number).*/

import java.util.*;
public class Automorphic_Number
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		
		boolean result = AutomorphicCheck(n);
		if(result)
		{
		   System.out.print("It is Automorphic ");
		}else{
			System.out.print("It is Not Automorphic ");
		}
	}
	public static boolean AutomorphicCheck(int n)
	{
		int temp = n, count =0;
		while(temp > 0)
		{
			temp = temp/10;
			count++;
		}
		int square = n*n;
		int b = (int)(Math.pow(10, count));
	
	      return n ==(square%b) ;
	}
}
