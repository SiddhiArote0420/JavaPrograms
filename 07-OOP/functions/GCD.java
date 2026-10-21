/*Write a function to find the GCD (HCF) of two numbers.*/

import java.util.*;
public class GCD
{
  public static void main(String x[])
  {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter two number");
	  int n1 = sc.nextInt();
	  int n2 = sc.nextInt();
	  
	  int result = GCDCal(n1 , n2);
	  System.out.println("GCD is: "+result);
	  
  }
  public static int GCDCal(int n1, int n2)
  { int gcd = 0;
	for(int i=1 ; i<=n1/2 && i<=n2/2 ; i++)
	{
		if(n1%i==0 && n2%i==0)
		{	
	      if(gcd < i)
			gcd = i;  
	    }
	}
	return gcd ;
  }
}