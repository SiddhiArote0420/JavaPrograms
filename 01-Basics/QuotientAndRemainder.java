//Given two integers, write a Java program to find the quotient and remainder using only arithmetic operators.
//Input: dividend = 20, divisor = 3 Output: Quotient = 6, Remainder = 2

import java.util.*;
public class QuotientAndRemainder
{
	public static void main(String x[])
	{
		Scanner calQR = new Scanner(System.in);
		
		System.out.println("Enter Dividend : ");
		int n1 = calQR.nextInt(); 
		
		System.out.println("Enter Divisor : ");
		int n2 = calQR.nextInt(); 
		
		int remainder = n1%n2;
		int quotient = n1/n2;
		
		System.out.println("Quotient is : " +quotient);
        System.out.println("Remainder is : "+ remainder);
	}
}