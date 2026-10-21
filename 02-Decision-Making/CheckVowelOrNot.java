// Write a java program to input any alphabet and check whether it is vowel or consonant.

//Write a java program to input any alphabet and check whether it is vowel or consonant.

import java.util.*;
public class CheckVowelOrNot
{
	public static void main(String x[])
	{
		Scanner vowelConsonant = new Scanner(System.in);
		
		System.out.println("Enter The Alphabet : ");
		char ch = vowelConsonant.next().charAt(0);
		
		 if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
     		{
			  System.out.println("It is a Vowel");
            }else	
            {
			 System.out.println(" It is a Consonant");
			}
		
		
	}
}
		