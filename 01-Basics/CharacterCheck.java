//Write a Java program to check whether character is alphabetic or not.

import java.util.*;
public class CharacterCheck
{
	public static void main(String x[])
	{
		Scanner checkCharacter = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		char ch = checkCharacter.next().charAt(0);
		
		String result = (ch >= 'A' && ch <='Z') || (ch >= 'a' && ch <= 'z')?
		                      "Character is Alphabetic" :"Character is not Alphabetic" ;
							 
		System.out.println(result);
		
	}
}