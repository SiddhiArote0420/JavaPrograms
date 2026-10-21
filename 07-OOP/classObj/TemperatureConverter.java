/*Convert Celsius to Fahrenheit
Create a class TemperatureConverter with a method convertToFahrenheit that converts a Celsius value to Fahrenheit.
*/

import java.util.*;
public class TemperatureConverter{
	public static double convertToFahrenheit(double tempCel){
	   
	   return (tempCel*9/5)+32;
	   
	
	}
	
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Temparature ");
		double tempCel = sc.nextInt();
		
		double result = convertToFahrenheit(tempCel);
		
		System.out.println("Temparature in Fahrenheit :"+result);
	}
}