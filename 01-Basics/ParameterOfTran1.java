// calculate the parameter of a triangle
//using scanner class 

import java.util.*;
public class ParameterOfTran1
{
	public static void main(String x[])
	{
		Scanner calPrameter = new Scanner(System.in);
		int side1,side2,side3,Parameter;
		
		System.out.println("Enter First side of Triangle : ");
		side1 = calPrameter.nextInt();
		
		System.out.println("Enter Second side of Triangle : ");
		side2 = calPrameter.nextInt();
		
		System.out.println("Enter Third side of Triangle : ");
		side3 = calPrameter.nextInt();
		
		Parameter = side1+side2+side3;
		
		System.out.println("Parameter of a Trangle :"+Parameter);
	}
}
		