// calculate the parameter of a triangle

public class ParameterOfTran
{
	public static void main(String x[])
	{
		int side1 =Integer.parseInt(x[0]);
		int side2 =Integer.parseInt(x[1]);
		int side3 =Integer.parseInt(x[2]);
		
		int Parameter = side1+side2+side3;
		
		System.out.println("Parameter of a Trangle :"+Parameter);
	}
}
		