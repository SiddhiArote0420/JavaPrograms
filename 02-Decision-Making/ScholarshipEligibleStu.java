/* Check whether a student is eligible for scholarship:
 
    Attendance >= 75% and marks >= 80**
    Input: Attendance %, marks
    Logic: if-else
    Output: Eligible or not.
*/

import java.util.*;
public class ScholarshipEligibleStu
{
	public static void main(String x[])
	{
		Scanner eligibleStu = new Scanner(System.in);
		
		System.out.println("Enter Atendance Percentage : ");
		int attendance = eligibleStu.nextInt();
		
		System.out.println("Enter Marks : ");
		int marks = eligibleStu.nextInt();
		
		if(attendance >= 75 && marks >= 80)
		{
			System.out.println(" student is eligible for scholarship");
		}else
		{
			System.out.println(" student is Not eligible for scholarship");
		}
	}
}
		