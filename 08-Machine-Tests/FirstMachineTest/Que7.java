/* Write a Java program to check whether a triangle is equilateral , isoscale 
or scalene.  */


import java.util.*;
public class Que7
{
 public static void main(String x[])
 {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the First side");
	 int side1 = sc.nextInt();
	 
	 System.out.println("Enter the Second side");
	 int side2 = sc.nextInt();
	 
	 System.out.println("Enter the Third side");
	 int side3 = sc.nextInt();
	 
	 if(side1 == side2 && side2 == side3)
	 {
		 System.out.println("triangle is equilateral");
	 }else if(side1 == side2 || side1 == side3 || side2 == side3)
	 {
		 System.out.println("triangle is isoscale ");
	 }else{
		 System.out.println("triangle is scalene ");
	 }
 }
}