/*Write a program to find the sum of first n natural numbers using recursion.*/

import java.util.*;
public class NaturalNOSum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the limit");
		int limit = sc.nextInt();
		
		int result = naturalNo(limit);
		System.out.println("Natural sum is :"+result);
		
	}
	public static int naturalNo(int limit)
	{
		
		if(limit <= 0)
		{
			return 0;
			
		}else
		{
			return limit+naturalNo(limit-1);
		}
	}
}
