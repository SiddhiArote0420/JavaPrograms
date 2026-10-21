// Write a Java program to check whether a character is alphabetic or not.

// using decision making statement

import java.util.*;
public class ChackCharAphabetic_Not
{
	public static void main(String x[])
	{
		Scanner checkCharecters = new Scanner(System.in);
		
		System.out.println("Enter a Character : ");
		char ch = checkCharecters.next().charAt(0);
		
		if((ch >= 'A' && ch <='Z') || (ch >= 'a' && ch <= 'z'))
		{
		    System.out.println("Character is Alphabetic");
		}else
		{
			System.out.println("Character is not Alphabetic");
		}
	}
}