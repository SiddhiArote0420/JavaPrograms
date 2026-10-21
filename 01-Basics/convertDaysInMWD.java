
// Write a Java program to convert days to years, month and week.

import java.util.*;
public class convertDaysInMWD
{
	public static void main(String x[])
	{
	    Scanner ConvertDays = new Scanner(System.in);
		
		System.out.println("Enter Days :");
	    int days = ConvertDays.nextInt();
		
		int year = days /365;
		int remainDay = days%365;
  
        int month = remainDay/30;
        remainDay = remainDay%30;
 
        int week = remainDay/7;
		
		
		System.out.printf(year+" Year . "+month+" Month . "+week+"Week");
		
    }
}	