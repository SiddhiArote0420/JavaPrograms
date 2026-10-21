/* Write a program that takes a grade (A, B, C, D, F) as input and displays the corresponding remark using switch:
A: Excellent
B: Good
C: Average
D: Poor
F: Fail
*/

import java.util.*;
public class TakeGreadDisRemarks
{
  public static void main(String x[])
  {
	  Scanner displayRemark = new Scanner(System.in);
	  
	  System.out.println("Enter the greade");
	  char gread = displayRemark.nextLine().charAt(0);
	  
	  switch(gread)
	  {
		 case 'A':
		    System.out.println("Excellent");
			break;
			
		 case 'B':
		   System.out.println("Average");
		   break;
		   
		  case 'C':
		    System.out.println("Poor");
			break;
			
		 case 'D':
		    System.out.println("Fail");
			break;
		 default:
		    System.out.println("Invalid gread");
	  }
  
  }
}