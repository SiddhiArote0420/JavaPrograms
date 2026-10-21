//  Write a java program to calculate the simple intrest.

public class SimpleIntrest
{
  public static void main(String x[])
  {
    int principleAmt = Integer.parseInt(x[0]);
	int RateOfIntrest = Integer.parseInt(x[1]);
	int TimeOfYear = Integer.parseInt(x[2]);
	
	double simpleIntrest = ( principleAmt * RateOfIntrest * TimeOfYear)/100;
	System.out.printf(" Simple Intrest is:%f\n", simpleIntrest);
	}
}