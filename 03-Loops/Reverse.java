/* Write a function to find the reverse of a number.*/

import java.util.*;
public class Reverse
{
  public static void main(String x[])
  {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  
	  int result = Reverse(n);
	  System.out.println("Reverse is: "+result);
	  
  }
  public static int Reverse(int n)
  { 
    int rev = 0;
	while(n!=0)
	{
		int a = n%10;
		rev = rev*10+a;
		n = n/10;
	}
	return rev;
  }
}

