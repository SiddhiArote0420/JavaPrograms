//Write a java program to input any alphabet and check whether it is vowel or consonant.

import java.util.*;
public class CheckVowel
{
	public static void main(String x[])
	{
		Scanner vowelConsonant = new Scanner(System.in);
		
		System.out.println("Enter The Alphabet : ");
		char ch = vowelConsonant.next().charAt(0);
		
		String result = ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')? "It is a Vowel" : " It is a Consonant";
		System.out.println(result);
		
	}
}
		