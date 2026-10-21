//Write a Java program to convert seconds to hours, minutes and seconds. 

import java.util.*;
public class Que1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Seconds :");
		int sec = sc.nextInt();
		
		int hours = sec / 3600;
		sec = sec%3600;
		
		int min = sec / 60;
		sec = sec%60;
		
		System.out.println(hours+" Hours "+min+" Minutes "+sec);
	}
}