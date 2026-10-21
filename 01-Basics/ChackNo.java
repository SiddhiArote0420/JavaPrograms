//Write a Java program to check whether a number is a multiple of both 3 and 5 using logical AND (&&) operator.

import java.util.*;
public class ChackNo
{
	public static void main(String x[])
	{
		Scanner numChack = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int num = numChack.nextInt();
		
		String result = (num%3==0 && num%5==0)? "The Number is Multiple both" : "The Number is Not Multiple both";
		
		System.out.println(result);
	}
}
