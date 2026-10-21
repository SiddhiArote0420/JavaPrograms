/*Write a program using switch that takes a number (1-4) and displays a season:
 1: Spring
 2: Summer
 3: Autumn
 4: Winter
*/



import java.util.*;
public class SeasonDisplay
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the number(1-4)");
		int n = ob.nextInt();
		
		switch(n)
		{
			case 1:
			  System.out.println("Spring");
			  break;
			  
			  case 2:
			  System.out.println("Summer");
			  break;
			  
			  case 3:
			  System.out.println("Autumn");
			  break;
			  
			  case 4:
			  System.out.println("Winter");
			  break;
			  
			  default:
			  System.out.println("Invalid input");
			  
		}
	}
}