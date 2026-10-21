/*Sum of Digits
Write a function sumOfDigits(int n) that calculates and returns the sum of digits of a given number.
Example: Input 123 → Output: 6.
*/

import java.util.*;
public class SumOfDigits
{
 public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Number ");
	int n = sc.nextInt();
	
	int result = sumOfDigits(n);
	System.out.println("Sum is :"+result);
  }
  public static int sumOfDigits(int n)
  {
	  int sum=0 ;
	  while(n!=0)
	  {
		  int a = n%10;
		  sum+=a;
		  n = n/10;
	  }
	  return sum;
  }
}