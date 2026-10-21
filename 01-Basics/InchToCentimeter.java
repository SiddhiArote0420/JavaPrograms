// covert inches to centimeter

public class InchToCentimeter{
	public static void main(String x[])
	{
		int inches = Integer.parseInt(x[0]);
		float centimeter = inches  * 2.54f;
		
		System.out.printf(+inches+" Inches = "+centimeter+"Centimeter");
	}
}