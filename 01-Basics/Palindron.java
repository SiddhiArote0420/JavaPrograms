//Write a java program to check whether number is palindrome or not. 

import java.util.*;
public class Palindron 
{
 public static void main(String x[])
	{
		Scanner chackPalindrom = new Scanner(System.in);
		
		System.out.println("Enter the 3 digit number :");
        int num = chackPalindrom.nextInt();		
		
		//int num = 121;
		int number = num;
		
		int num1 = num%10;
		num = num/10;
		
		int num2 = num%10;
		num = num/10;
		
		int num3 = num;
		
		int reverese = num1*100+num2*10+num3;
		System.out.printf("Reverse Number is:"+reverese);
		
		String result = (number == reverese)?"Number is Palindrom":"Number is not Palindrom";
		
		
		System.out.println(result);
	}
}