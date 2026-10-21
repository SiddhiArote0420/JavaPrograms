//Write a java program to enter two angles of a triangle and find the third angle.

public class FindThirdAngle
{
	public static void main(String x[])
	{
		float side1 = Float.parseFloat(x[0]);
		float side2 = Float.parseFloat(x[1]);
		
		float side3 = 180-(side1 + side2);
		
		System.out.printf("Third Angle of Triangle is =%f", side3);
	}
}
		
