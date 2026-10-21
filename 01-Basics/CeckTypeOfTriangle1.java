//Write a Java program to check whether a triangle is equilateral , isoscale  or scalene.

// using conditional statement

import java.util.*;
public class CeckTypeOfTriangle1 
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
		
		if(side1 == side2 && side2 == side3) 
		{
			System.out.println("Triangle is equilateral") ;
		}else if (side1 == side2 || side2 == side3 || side1 == side3) 
		{
		  
            System.out.println( "Triangle is isoscele");
		}else
		{
			System.out.println("Triangle is scalene") ;
		}
							 
	}	
}
