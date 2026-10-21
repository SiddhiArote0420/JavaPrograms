/*Write a function to find the sum of squares of first n natural numbers.*/

import java.util.*;
public class Natural_Num_SumSquare
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int limit = sc.nextInt();
		
		int result = NaturalNoSum(limit);
		System.out.print("Sum of Natural Number: "+result);
	}
	public static int NaturalNoSum(int limit)
	{
		int sum =0;
		for(int i=1 ; i<=limit; i++)
		{
			sum+=(i*i);
		}
	      return sum ;
	}
}
			
	
