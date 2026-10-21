// Write a Java program to check whether a number is even or odd.

import java.util.*;
public class ChackEvenOdd
{
	public static void main(String x[])
	{
		Scanner EvenAndOdd = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = EvenAndOdd.nextInt();
		
		String chackNo = (num % 2 ==0)? "Number is even ": "Number is Odd";
		System.out.println(chackNo);
	}
}