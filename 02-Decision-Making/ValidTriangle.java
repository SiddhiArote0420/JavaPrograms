//. Write a Java program to check whether a triangle is valid or not.
// using conditional statement

import java.util.*;
public class ValidTriangle
{
  public static void main(String x[])
  {
	  Scanner triangleValidOrNot = new Scanner(System.in);
	  
	  System.out.println("Enter the First Angle :");
	  int angle1 = triangleValidOrNot.nextInt();
	  
	  System.out.println("Enter the First Angle :");
	  int angle2 = triangleValidOrNot.nextInt();
	  
	  System.out.println("Enter the First Angle :");
	  int angle3 = triangleValidOrNot.nextInt();
	  
	  if(angle1 +angle2 + angle3 == 180)
	  {
	   System.out.println("The Triangle is valid");
	  }
	  else
	  {
	  System.out.println("The Triangle is valid");
	  }
	  
	}
}
	  