//.Write program to character from keyboard and check character is alphabet digit or special symbols?

import java.util.*;
public class CharCheck{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any character");
		char ch = sc.next().charAt(0);
		
		if(( ch>='a' && ch<='z')||( ch>='A' && ch<='Z'))
		{
			System.out.println("It is a Alphabet");
		}else if(ch >= 0 && ch <= 9)
		{
			System.out.println("It is a Digit");
		}else{
			System.out.println("It is a Special char");
		}
	}
}