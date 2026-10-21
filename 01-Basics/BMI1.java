//calculate  the BMI (body mass index ) from hight and weight
//using scanner class

import java.util.*;
public class BMI1
{
	public static void main(String x[])
	{
	    Scanner calBmi = new Scanner(System.in);
		float bmi,height, weight;
		 
		System.out.println("Enter the Weight : ");
		weight = calBmi.nextFloat();
		
		System.out.println("Enter the Hight(in meter) : ");
		height = calBmi.nextFloat();
		
		
		
	    bmi = weight/(height*height);
		
		System.out.printf("body mass index is ="+bmi);
	}
}
		