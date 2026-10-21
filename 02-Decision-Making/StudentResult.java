//Given a student’s score, print Pass if it’s 40 or above, otherwise print Fail.

import java.util.*;
public class StudentResult
{
	public static void main(String x[])
	{
		Scanner printResult = new Scanner(System.in);
		
		System.out.println("Enter the marks : ");
		int marks = printResult.nextInt();
		
		if(marks >= 40)
		{
			System.out.println("The student is Pass");
		}else
		{
			System.out.println("The student is Fail");
		}
		
	}
}