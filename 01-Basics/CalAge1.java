// calculate age from year of birth
// using scanner class

import java.util.*;
public class CalAge1
{
	public static void main(String x[])
	{
	    Scanner calage = new Scanner(System.in);
		int curYear,birthYear,age;
		
		System.out.println("Enter the current year : ");
		curYear = calage.nextInt();
		
		System.out.println("Enter the Birth year : ");
		birthYear = calage.nextInt();
		
		
		age = curYear-birthYear;
		
		System.out.println("Age is : "+age);
	}
}
		