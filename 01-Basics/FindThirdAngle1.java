//Write a java program to enter two angles of a triangle and find the third angle.
//using scanner class

import java.util.*;
public class FindThirdAngle1
{
	public static void main(String x[])
	{
		Scanner calAngle = new Scanner(System.in);
        float side1,side2, side3;

        System.out.println("Enter first side : ");
        side1 = calAngle.nextFloat();
		
		System.out.println("Enter second side : ");
        side2 = calAngle.nextFloat();
		
		side3 = 180-(side1 + side2);
		
		System.out.printf("Third Angle of Triangle is =%f", side3);
	}
}
		
