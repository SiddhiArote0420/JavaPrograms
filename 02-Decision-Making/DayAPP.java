//Develop a Java program using switch to print the day type for an input day number :
//1 for Monday, …, 7 for Sunday.
//For 1-5, display “Weekday”; for 6-7, display “Weekend”.


import java.util.*;
public class DayAPP
{
   public static void main(String x[])
   { 
   Scanner xyz  = new Scanner(System.in);
	  System.out.println("Enter day number");
	  int n = xyz.nextInt() ;
	 
	  switch(n)
	  {
	     case 1:
		 System.out.println("Monday");
		 break;
		 
		 case 2:
		 System.out.println("Tuesday");
		 break;
		 
		 case 3:
		 System.out.println("Wednesday");
		 break;
		 
		 case 4:
		 System.out.println("Thursday");
		 break;
		 
		 case 5:
		 System.out.println("Friday");
		 break;
		 
		 case 6:
		 System.out.println("Saturday");
		 break;
		 
		 case 7:
		 System.out.println("Sunday");
		 break;
		 
		 default:
                System.out.println("Invalid month number. Please enter 1 to 12.");
        }
   }
}