/*Write a function to calculate the factorial of a number (using loop only).*/

import java.util.*;
public class FactorialCal
{
  public static void main(String x[])
  {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  
	  int result = factCal(n);
	  System.out.println("Factotial is: "+result);
	  
  }
  public static int factCal(int n)
  { 
    int fact = 1;
	for(int i=0 ; i<=n ; i++)
	{
	    fact = fact *i;
	}
	return fact;
  }
}