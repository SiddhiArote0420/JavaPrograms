/*Employee salary hike based on performance and years of service:
Input: Basic salary, Years of service, Performance rating (1–5)
Logic:
If rating >= 4 and service > 5 yrs → 20% hike
Else if rating >= 3 → 10%
Else → 5%
Output: New salary.
*/

import java.util.*;
public class CalSalaryHike
{
	public static  void main(String x[])
	{
	 Scanner calSalary = new Scanner(System.in);
	
	System.out.println("Enter the basic salary");
	int basicSalary = calSalary.nextInt();
	
	System.out.println("Enter the Years of service");
	int yearOfService = calSalary.nextInt();
	
	System.out.println("Enter the Performance rating (1–5)");
	int rating = calSalary.nextInt();
	
	int hike;
	
	if(rating >= 4 && yearOfService > 5){
		hike = basicSalary /100*20;
	}else if (rating >= 3 ){
		hike = basicSalary /100*10;
	}else{
		hike = basicSalary /100*5;
	}
	
	int newSalary = basicSalary+hike;
	System.out.println("New Salary is : "+newSalary);
	
	}
}