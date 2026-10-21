//Write a Java program to check whether a year is a leap year or not.
//Using decisionmaking

import java.util.*;
public class LeapYearOrNot
{
	public static void main(String x[])
	{
		Scanner leapYearChack = new Scanner(System.in);
		
		System.out.println("Enter the year : ");
		int year = leapYearChack.nextInt();
		
		if(year % 4 == 0 && year % 400 == 0)
		{
		 System.out.println("Year is a Leap Year");
        }else
		{
		 System.out.println("Year is a not Leap Year");
		}
		
	}
}
