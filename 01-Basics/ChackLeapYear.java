// Write a Java program to check whether a year is leap year or not.

import java.util.*;
public class ChackLeapYear
{
	public static void main(String x[])
	{
		Scanner leapYearChack = new Scanner(System.in);
		
		System.out.println("Enter the year : ");
		int year = leapYearChack.nextInt();
		
		String check = (year % 4 == 0 && year % 400 == 0)? "Year is a Leap Year" : "Year is a not Leap Year";
		System.out.println(check);
	}
}
	

