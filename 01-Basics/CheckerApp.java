// Write a java program to input any character and check whether it is alphabet, digit or special character.


import java.util.*;
public class CheckerApp
{
	public static void main(String x[])
	{
		Scanner checkCharacter = new Scanner(System.in);
		
		System.out.println("Enter The character : ");
		char ch = checkCharacter.next().charAt(0);
		
		String result = (ch >= 'A' && ch <='Z') || (ch >= 'a' && ch <= 'z')?
		                      "Character is Alphabet" : 
							  (ch >= '0' && ch <= '9')? " Character is digit": "Character is Special character";
		System.out.println(result);
		
	}
}
		
