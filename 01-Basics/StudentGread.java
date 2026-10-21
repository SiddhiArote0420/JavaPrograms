// Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50) — 

import java.util.*;
public class StudentGread
{
	public static void main(String x[])
	{
		Scanner greadPrint = new Scanner(System.in);
		
		System.out.println("Enter the Marks :");
		int marks = greadPrint.nextInt();
		
		if (marks <= 100 && marks >= 90)
		{
			System.out.println("Excellent");
		}else if(marks < 90 && marks >= 75)
		{
			System.out.println("Good");
		}else if (marks < 75 && marks >= 50)
		{
			System.out.println("Average");
		}else if (marks < 50 && marks > 0)
		{
			System.out.println("poor");
		}else
		{
			System.out.println("Invalid input");
		}
		
	}
}
		
