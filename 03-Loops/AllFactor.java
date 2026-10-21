//Write a java program to find all factors of a number.

import java.util.*;
public class AllFactor
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = ob.nextInt();
		
		int i=1;
		while(i < n)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}i++;
		}
	}
}
			