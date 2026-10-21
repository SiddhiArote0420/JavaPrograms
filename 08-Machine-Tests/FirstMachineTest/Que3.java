//. Write a java program to enter two angles of a triangle and find the third angle.  

import java.util.*;
public class Que3
{
 public static void main(String x[])
 {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the First angle");
	 int angle1 = sc.nextInt();
	 
	 System.out.println("Enter the Second angle");
	 int angle2 = sc.nextInt();
	 
	 int angle3 = 180 -(angle1+angle2);
	 System.out.println("Third angle is : "+angle3);
 }
}