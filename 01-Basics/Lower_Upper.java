//Write a java program to check whether a character is uppercase or lowercase alphabet.

import java.util.*;
public class Lower_Upper
{
	public static void main(String x[])
	{
		Scanner checkCharacter = new Scanner(System.in);
		
		System.out.println("Enter the Character");
		char ch = checkCharacter.next().charAt(0);
		
		if(ch>='A' && ch<='Z')
		{
			System.out.println("The Character is a Uppercase");
		}else 
		{
			System.out.println("The Character is a Lowercase");
		}
		
	}
}
 
