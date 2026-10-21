/*Write a function to find the sum of first n natural numbers.*/

import java.util.*;
public class NaturalNumberSum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int limit = sc.nextInt();
		
		int result = NaturalNo(limit);
		System.out.print("Sum of Natural Number: "+result);
	}
	public static int NaturalNo(int limit)
	{
		int sum =0;
		for(int i=1 ; i<=limit; i++)
		{
			sum+=i;
		}
	      return sum ;
	}
}
			
	