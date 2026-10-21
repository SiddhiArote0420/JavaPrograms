/*Given a score out of 100, print Excellent (≥90), Good (≥75), Average (≥50), Poor (< 50)
— using nested ternary operators.*/

import java.util.*;
public class ReviveMarks
{
	public static void main(String x[])
	{
		Scanner revive = new Scanner(System.in);
		
		System.out.println("Enter The Student Score : ");
	  int score = revive.nextInt();
	  
	  String result = (score >= 90 && score<=100)? " Excellent" :
                      (score >= 75 && score < 90)?	" Good":
					  (score >= 50 && score< 75)? " Average": "Poor" ;
	  System.out.println(result);
	  
	}
}