/*Implement Voting Eligibility
Create a class Voter with a method isEligible that checks if a person (age provided) is eligible to vote.
Explanation: Introduces basic logical validation.
*/

import java.util.*;
public class Voter{
	public static boolean isEligible(int age)
	{
		if(age >= 18){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Age");
		int age = sc.nextInt();
		
		//isEligible(age);
		boolean flag = isEligible(age);
		
		if(flag){
			System.out.println("person is eligible to vote");
	    }else{
			System.out.println("perso is not eligible to vote");
		}
	}
}
