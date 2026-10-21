/*Classify temperature reading:
 
Input: Temperature in Celsius
Logic:
<0 → Freezing
0–20 → Cold
21–35 → Warm
35 → Hot
Output: Display weather type.
*/

import java.util.*;
public class WeatherType
{
  public static void main(String x[])
  {
	  Scanner checkWeatherType = new Scanner(System.in);
	  
	  System.out.println("Enter the Temperature :");
	  int temp = checkWeatherType.nextInt();
	  
	  if(temp < 0){
		  System.out.println("Tempreature is Freezing ");
	  }else if(temp >= 0 && temp <= 20){
		  System.out.println("Tempreature is Cold ");
	  }else if(temp >= 21 && temp <= 35){
		  System.out.println("Tempreature is Warm ");
	  }else{
		  System.out.println("Tempreature is Hot ");
	  }
  }
}