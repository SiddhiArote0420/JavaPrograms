/*Write a function to find the sum of digits of a given number.*/

import java.util.*;
public class Sum_Of_Digit
{
  public static void main(String x[])
  {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  
	  int result = calSum(n);
	  System.out.println("Sum is: "+result);
	  
  }
  public static int calSum(int n)
  { 
    int sum =0;
	while(n!=0)
	{
		int a = n%10;
		sum = sum + a;
		n = n/10;
	}
	return sum;
  }
}
