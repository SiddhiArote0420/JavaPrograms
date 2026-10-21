//Write a java program to swap first and last digits of a number.

import java.util.*;
public class SwapFirst_Last
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = ob.nextInt();
		int count=0;
		int temp = n,first,last,p;
		
		while(n!=0)
		{
			n = n/10;
			count++;
		}
		n = temp;
		last=n%10;
		p=(int)(Math.pow(10 ,--count));
		
		first = n/p;
		n=n%p;
		n=n/10;
		
		n=(last*p)+(n*10)+first;
		
		
		
		
		System.out.println(n);
	}
}
			