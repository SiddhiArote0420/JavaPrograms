/*Calculate Factorial
Write a function factorial(int n) that returns the factorial of a given number.
Call it from main() and display the factorial.
*/

import java.util.*;
public class Factorial
{
  public static void main(String args[])
  {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the Number");
	  int n = sc.nextInt();
	  
	  int result = factorial(n);
	  System.out.println("Factorital is "+result);
  }
  public static int factorial(int n)
  {
	  int fact = 1;
	  for(int i=1 ; i<=n ;i++)
	  { 
        fact = fact* i;
	  }
	  return fact;
  }
}