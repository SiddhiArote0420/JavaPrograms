//Given a number 1–7, print the day name.

import java.util.*;
public class  DayName
{
	public static void main(String x[])
	{
		Scanner dayPrint = new Scanner(System.in);
		
		System.out.println("Enter the number 1-7 :");
		int num = dayPrint.nextInt();
		
		String day = (num == 1)?"Monday" : (num == 2)? "Tuesday" :
		             (num == 3)?"Wednesday" :(num == 4)? "Thursday" :
					 (num == 5)? "Friday" : (num == 6)? "Saturday" :
					 (num == 7)? "Sunday" : "Enter valid day";
					 
		System.out.println(day);
	}
}