//Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.

import java.util.*;
public class EligibleCheck
{
	public static void main(String x[])
	{
		Scanner checkEligibility = new Scanner(System.in);
		
		System.out.println("Enter age : ");
		int age = checkEligibility.nextInt();
		
		String result = (age >= 18)? "Candidate are eligible for vote" : "Candidate are Not  eligible for vote";
		System.out.println(result);
		
	}
}