//Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square — using ternary operators.

import java.util.*;
public class PerfectSquare 
{
	public static void main(String x[])
	{
		Scanner perfect_squre = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int num = perfect_squre.nextInt();
		
		String squre = (Math.sqrt(num)%1==0)? num+"Number is a Prefect Squre" : num+"Number is not a Prefect Squre";
		
		System.out.println(squre);
	}
}