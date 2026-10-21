/*Create a Java program using switch to convert a given number (1-5) to its word equivalent 
(One, Two, ..., Five). If the number is not between 1 and 5, display “Invalid number”.
*/


import java.util.*;
public class NoToSpeling
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the number(1-5)");
		int n = ob.nextInt();
		
		switch(n)
		{
			case 1:
			  System.out.println("One");
			  break;
			  
			  case 2:
			  System.out.println("Two");
			  break;
			  
			  case 3:
			  System.out.println("Three");
			  break;
			  
			  case 4:
			  System.out.println("Four");
			  break;
			  
			  case 5:
			  System.out.println("Five");
			  break;
			  
			  default:
			  System.out.println("Invalid input");
			  
		}
	}
}