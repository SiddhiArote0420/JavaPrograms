//Write a java program to check whether a number is palindrome or not.

import java.util.*;
public class Palindrome
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = ob.nextInt();
		
		int temp =n;
		int rev=0, a;
		while(n!=0)
		{
			a=n%10;
			n=n/10;
			rev=rev*10+a;
		}
		if(temp == rev)
		{
			System.out.println("Number is Palindrom");
		}else
		{
			System.out.println("Number Not is Palindrom");
		}
	}
}