//Write a java program to input week number(1-7) and print the corresponding day of week name using if else.
// How to print day of week using if else in java programming.

import java.util.*;
public class DayOfWeek
	{
		public static void main(String x[])
		{
			Scanner dayInWeek = new Scanner(System.in);
			
			System.out.println("Enter the Day Number : ");
			int dayNo = dayInWeek.nextInt();
			
			if(dayNo == 1)
			{
				System.out.println("Day Is 'Sunday'");
			}else if(dayNo == 2)
			{
				System.out.println("Day Is 'Monday'");
			}else if(dayNo == 3)
			{
				System.out.println("Day Is 'Tuesday'");
			}else if(dayNo == 4)
			{
				System.out.println("Day Is 'Wednesday'");
			}else if(dayNo == 5)
			{
				System.out.println("Day Is 'Thursday'");
			}else if(dayNo == 6)
			{
				System.out.println("Day Is 'Friday'");
			}else if(dayNo == 7)
			{
				System.out.println("Day Is 'Saturday'");
			}else 
			{
				System.out.println("Invalid Input");
			}
		}
	}