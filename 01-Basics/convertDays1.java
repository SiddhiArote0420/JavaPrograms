// convert days into years,weeks and day 
//using scanner class

import java.util.*;
public class convertDays1
{
	public static void main(String x[])
	{
	    Scanner ConvertDays = new Scanner(System.in);
	    int day,month,year;
		
		System.out.println("Enter Days :");
	    day = ConvertDays.nextInt();
		
		
		month = day/30;
	    year = day/365;
		int yearCToMonth = month/12;
		
		System.out.printf(day+" Days = "+month+" Month \n");
		System.out.printf(day+" Days = "+year+" Year \n");
		System.out.printf(month+" month = "+yearCToMonth+" Year \n");
    }
}	
	