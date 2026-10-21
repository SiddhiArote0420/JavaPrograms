// Write a Java program to check whether a triangle is valid or not.

import java.util.*;
public class CheckTriangle 
{
	public static void main(String x[])
	{
		Scanner Triangle_Valid_Not = new Scanner(System.in);
		
		System.out.println("Enter 1st side of Triangle : ");
		Double side1 = Triangle_Valid_Not.nextDouble();
		
		System.out.println("Enter 2nd side of Triangle : ");
		Double side2 = Triangle_Valid_Not.nextDouble();
		
		System.out.println("Enter 3nd side of Triangle : ");
		Double side3 = Triangle_Valid_Not.nextDouble();
		
		String result = ((side1 + side2) > side3 &&
		                (side2 + side3) > side1 &&
						(side1 + side3) > side2) ?
                            "Triangle is Valid" :
							"Triangle is Not Valid" ;
							
        System.out.println(result);
	}
}
		