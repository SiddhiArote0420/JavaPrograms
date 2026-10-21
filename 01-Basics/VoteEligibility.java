//Write a java program to read the age of a candidate and determine whether he is eligible to cast his/her own vote.

import java.util.*;
public class VoteEligibility
{
	public static void main(String x[])
	{
		Scanner checkEligibility = new Scanner(System.in);
		
		System.out.println("Enter Your Age : ");
		int age = checkEligibility.nextInt();
		
		if(age >= 18 )
		{
			System.out.println("Candidate is Eligible for vote");
		}else
		{
			System.out.println("Candidate are Not Eligible for vote");
		}
		
	}
}