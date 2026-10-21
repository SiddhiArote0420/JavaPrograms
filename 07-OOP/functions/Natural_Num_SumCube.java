/*Write a function to find the sum of cubes of first n natural numbers.*/

import java.util.*;
public class Natural_Num_SumCube
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int limit = sc.nextInt();
		
		int result = NaturalNoCube(limit);
		System.out.print("Sum of Natural Number: "+result);
	}
	public static int NaturalNoCube(int limit)
	{
		int sum =0;
		for(int i=1 ; i<=limit; i++)
		{
			sum+=(i*i*i);
		}
	      return sum ;
	}
}
