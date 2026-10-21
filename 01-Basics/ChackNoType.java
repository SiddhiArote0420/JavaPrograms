//Write a Java program to check whether a number is divisible by 5 and 11 or not.


import java.util.*;
public class ChackNoType
{
	public static void main(String x[])
	{
		Scanner numChack = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int num = numChack.nextInt();
		
		String result = (num%5==0 && num%11==0)? "The Number is divisible by 5 and 11" : "The Number is Not divisible by 5 and 11";
		
		System.out.println(result);
	}
}
