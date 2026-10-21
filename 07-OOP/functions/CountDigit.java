/*Write a function to count the number of digits in a given number.*/

import java.util.*;
public class CountDigit
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		
		int  result = AutomorphicCheck(n);
		   System.out.print("Number of digit is: "+result);
		
	}
	public static int AutomorphicCheck(int n)
	{
		int  count =0;
		while(n > 0)
		{
			n = n/10;
			count++;
		}
	
	      return count ;
	}
}
