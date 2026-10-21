//Write a java program to enter temperature in Celsius and convert it into Fahrenheit.

public class temCelToFah
{
	public static void main(String x[])
	{
		float Cel = Float.parseFloat(x[0]);
		float fah = (Cel * 9 / 5) + 32;
		
		System.out.println("convert of "+Cel+"= "+fah+"f Fahrenheit");
	}
}