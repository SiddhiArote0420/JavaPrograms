/*Calculate fine for library book return:
Input: Number of days late
Logic:
Up to 5 days → ₹2/day
6–10 days → ₹3/day
11–30 days → ₹5/day
More than 30 days → Membership canceled + ₹500 fine
Output: Total fine + membership status.
*/

import java.util.*;
public class LibraryApp
{
	public static void main(String x[])
	{
		Scanner libraryFine = new Scanner(System.in);
		
		System.out.println("Enter Number of days late");
		int lateDay = libraryFine.nextInt();
		int fine ;
		String status;
		
		if(lateDay >=1  && lateDay <= 5){
			fine = lateDay*2;
			status = "Membership Active" ;
		}else if(lateDay >=6  && lateDay <= 10){
			fine = lateDay*3;
			status = "Membership Active" ;
		}else if(lateDay >=11  && lateDay <= 30){
			fine = lateDay*5;
			status = "Membership Active";
		}else if(lateDay > 30){
			fine = lateDay*500;
			status = "Membership canceled" ;
		}else {
			fine = 0;
			status = "Membership Active";
		}
		System.out.println("Total fine :"+fine+" , membership status : " +status);
	}
}
			