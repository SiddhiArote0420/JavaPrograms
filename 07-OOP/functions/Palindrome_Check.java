/*Palindrome Check (Number or String)
Write a function isPalindrome(int n) that checks whether a number is palindrome or not.
*/

import java.util.*;
public class Palindrome_Check
{
  public static void main(String x[])
  {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the Number");
	  int n = sc.nextInt();
	  
	  boolean result =isPalindrome(n);
	  if(result)
	  {
		  System.out.print("It is Palindrome");
	  }else{
		  System.out.print("It is not a Palindrome");
	  }
  } 
	  public static boolean isPalindrome(int n)
	  {
		  int temp = n;
		  int rev = 0;
		  while(temp!=0)
		  {
			  int a = temp%10;
			  rev = rev*10 + a;
              temp = temp/10;
		  }
          
              return rev == n;
	  }
  }
  
			  