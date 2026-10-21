//Write a Java program to convert seconds to hours, minutes and seconds.

import java.util.*;
public class ConverterTime 
{
 public static void main(String x[])
  {
	Scanner timeDivide = new Scanner(System.in);
	
	System.out.println("Enter the Seconds :");
	int seconds = timeDivide.nextInt();
	
	int hours =  seconds/3600;
	int remain = seconds%3600;
	
	
	int minutes =remain/60;
	remain = remain%60;
	 
	seconds = remain;


	System.out.println(hours + " Hours : " +minutes+" Minutes : " +seconds+ " seconds ");

  }
}
	
	