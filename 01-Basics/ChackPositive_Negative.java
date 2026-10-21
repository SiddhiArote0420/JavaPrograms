// Write a Java program to check whether a number is positive , negative or zero


import java.util.*;
public class ChackPositive_Negative
{
	public static void main(String x[])
	{
		Scanner positiveNegative = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = positiveNegative.nextInt();
		
		String chackNo = (num < 0)? "Number is Negative ":
                  		 (num > 0)? "Number is Positive" : "Number is Zero";
		System.out.println(chackNo);
	}
}