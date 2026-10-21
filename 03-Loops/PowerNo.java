//Write a java program to find power of a number.

import java.util.*;
public class PowerNo
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int base = ob.nextInt();
		
		System.out.println("Enter the Power");
		int power = ob.nextInt();
		
		int result=1, i=1;
		while(i<=power)
		{
			result=result*base;
			i++;
		}
		System.out.println(result);
	}
}
		
		
		
		
		
		 
		