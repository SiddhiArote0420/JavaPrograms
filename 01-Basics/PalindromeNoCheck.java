//Write a java program to check whether a number is palindrome or not. 

import java.util.*;
public class PalindromeNoCheck
{
	public static void main(String x[])
	{
		Scanner checkPalindrom = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int n = checkPalindrom.nextInt();
		
		int rev = (n%10)*100+((n/10)%10)*10+(n/100);// (no%10)*100 +   ( (no/10)%10)*10 + no /100;
		System.out.println(rev);
		
		if(n == rev)
		{
			System.out.println("Number is palindrome");
		}
		else{
			System.out.println("Number is not a palindrome");
		}
	}
}