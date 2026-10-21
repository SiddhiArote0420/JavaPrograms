// Write a java program to enter temperature in Fahrenheit and convert to Celsius.

public class temFahToCel
{
	public static void main(String x[])
	{
		float Fah = Float.parseFloat(x[0]);
		float Cel = (Fah - 32) * 5 / 9;
		
		System.out.println("Fahrenheit of "+Fah+"F= "+Cel+" Celsius");
	}
}
