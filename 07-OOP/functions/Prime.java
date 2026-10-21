/*Write a function to check whether a number is prime or not.*/

import java.util.*;
public class Prime
{
  public static void main(String x[])
  {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  
	  boolean result = checkPrime(n);
	  if(result){
		  System.out.println("It is Prime");
	  }else{
		  System.out.println("Not Prime");
	  }
	  
  }
  public static boolean checkPrime(int n)
  {
	  int count = 0;
	for(int i=2 ; i<=n/2; i++)
	{
		if(n%i==0)
		  count++;
	}
	return count == 0;
  }
}