//Write a java program to input any character and check whether it is alphabet, digit or special character.

import java.util.*;
public class TypeCheckChar
{
   public static void main(String x[])
   {
    Scanner charType = new Scanner(System.in);
	
	System.out.println("Enter the Character : ");
	char ch = charType.next().charAt(0);
	
	if(( ch >= 'A' && ch <= 'z')||(ch >= 'a' && ch <= 'z'))
	{
	 System.out.println("Character is Alphabetic");
	}else if(ch <= '9' && ch >= '0')
	{
	 System.out.println("Character is a Digit");
	}else
	{
	 System.out.println("It is a Special character");
	}
	
}
}
