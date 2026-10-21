// covert inches to centimeter
//using scanner class 

import java.util.*;
public class InchToCentimeter1
{
	public static void main(String x[])
	{
	    Scanner conI_C = new Scanner(System.in);
		
		System.out.println("Enter Inches : ");
		int inches = conI_C.nextInt();
		
		float centimeter = inches  * 2.54f;
		
		System.out.printf(+inches+" Inches = "+centimeter+" Centimeter");
	}
}