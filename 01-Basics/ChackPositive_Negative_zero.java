// Write a Java program to check whether a number is positive , negative or zero.

// using Decision making 


import java.util.*;
public class ChackPositive_Negative_zero
{
	public static void main(String x[])
	{
		Scanner positiveNegative = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = positiveNegative.nextInt();
		
		if(num < 0)
		{
		  System.out.println("Number is Negative ");
		}else if(num > 0)
		{
		  System.out.println("Number is Positive"); 
        }else
		{
     	  System.out.println("Number is Zero");
		}
	}
}