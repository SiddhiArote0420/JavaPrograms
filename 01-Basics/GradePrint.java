/* Print a grade using ternary operators:
90+: A
80–89: B
70–79: C
<70: F
*/

import java.util.*;
public class GradePrint
{
	public static void main(String x[])
	{
		Scanner gradeShow = new Scanner(System.in);
		
		System.out.println("Enter the Marks : " );
		int marks = gradeShow.nextInt();
		
		String grade = (marks >= 90 && marks <=100)? "grade is 'A'" : 
		               (marks >= 80 && marks <=89)? "grade is 'B'" :
					   (marks >= 70 && marks <=79)? "grade is 'C'" : "grade is 'Fail'";
					   
		System.out.println(grade);
	}
}