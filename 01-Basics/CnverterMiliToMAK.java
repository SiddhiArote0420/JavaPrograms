//Write a java program to enter length in centimeter and convert into meter and kilometer.

public class CnverterMiliToMAK
{    public static void main(String x[])
	{
	 int centimeter = Integer.parseInt(x[0]);
	 int meters = centimeter/100;
	 int kilometer = centimeter/1000000;
	 
	 System.out.printf(centimeter+" Centimeter =" +meters+" Meters\n");
	 System.out.printf(centimeter+" Centimeter =" +kilometer+" kilometer");
	}
}