/*Reverse a Number
Write a function reverseNumber(int n) that returns the reverse of a given number.
Example: Input 456 → Output: 654.*/

import java.util.*;
public class ReverseNumber
{
 public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Number ");
	int n = sc.nextInt();
	
	int result = reverseNumber(n);
	System.out.println("reverse is :"+result);
  }
  public static int reverseNumber(int n)
  {
	  int rev=0 ;
	  while(n!=0)
	  {
		  int a = n%10;
		  rev = rev*10+a;
		  n = n/10;
	  }
	  return rev;
  }
}