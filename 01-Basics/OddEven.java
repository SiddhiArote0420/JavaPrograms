//Write a Java program to check whether a number is even or odd.

import java.util.*;
public class OddEven
{
  public static void main(String x[])
  {
	  Scanner evenOdd = new Scanner(System.in);
	  
	  
	  System.out.println("Enter the First number :");
	  int n1 = evenOdd.nextInt();
	  
	  if(n1%2==0)
		  System.out.println("The Number is Even");
	    else
		  System.out.println("The number is odd ");
	  }
  }