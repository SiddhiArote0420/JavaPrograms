/* Check whether a given employee is eligible for bonus:
 
Input: Years of service and salary.
Logic: If service > 5 years, give 5% bonus.
Output: Display bonus amount or no bonus.
*/

import java.util.*;
public class EmpolyEligibility
{
	public static void main(String x[])
	{
		Scanner eligibalEmp = new Scanner(System.in);
		
		System.out.println("Enter the Service Year");
		int seviceYear = eligibalEmp.nextInt();
		
		System.out.println("Enter Your Salary");
		int salary = eligibalEmp.nextInt();
		
		if(seviceYear > 5)
		{
			int bonus = (salary/100)*5;
			System.out.println("Your bonus is : "+bonus);
		}else{
			System.out.println("You are not Eligible for bonus");
		}
	}
}
			