// Write a program to calculate sum of first and last digit of a number without using loop.
//Input : 123
//Output : 4  //scanner class

import java.util.*;
public class sumFirst_last
{
  public static void main(String x[])
  {
	  Scanner sumFirstAnsLast = new Scanner(System.in);
	  
      int num, sum;
	  
	  System.out.println("Enter the number : ");
	  num = sumFirstAnsLast.nextInt();
	  
	  int lastDigit = num % 10;      
      int firstDigit = num / 100;
	  
	  sum = lastDigit + firstDigit;
	  
	  System.out.println("Sum of last and first number is : "+sum );
  }
}
