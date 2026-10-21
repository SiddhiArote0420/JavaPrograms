// . Write a Java program to check whether a triangle is equilateral , isoscale or scalene.

import java.util.*;
public class TypeOfTriangle 
{
	public static void main(String x[])
	{
		Scanner TriangleType = new Scanner(System.in);
		
		System.out.println("Enter 1st side of Triangle : ");
		double side1 = TriangleType.nextDouble();
		
		System.out.println("Enter 2nd side of Triangle : ");
		double side2 = TriangleType.nextDouble();
		
		System.out.println("Enter 3rd side of Triangle : ");
		double side3 = TriangleType.nextDouble();
		
		String type = (side1 == side2 && side2 == side3) ? "Triangle is equilateral" :
              (side1 == side2 || side2 == side3 || side1 == side3) ?
              "Triangle is isoscele" : "Triangle is scalene" ;
							 
		System.out.println("The triangle is: " + type);
	}
}