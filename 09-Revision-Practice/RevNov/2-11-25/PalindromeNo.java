//.Write a program to input number and check number is palindrome or not?

import java.util.*;
public class PalindromeNo{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int temp = num,rev=0;
		while(temp!=0)
		{
			int a = temp%10;
			temp /=10;
			rev = rev*10+a;
		}
		if(rev == num)
		{
			System.out.println("It is a palindrom");
		}else
		{
			System.out.println("It is Not a palindrom");
		}
	}
}