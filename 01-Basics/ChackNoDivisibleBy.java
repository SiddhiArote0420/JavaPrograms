// Write a Java program to check whether a number is divisible by 5 and 11 or not.

// using Decision making 


import java.util.*;
public class ChackNoDivisibleBy
{
	public static void main(String x[])
	{
		Scanner divisibleBy = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = divisibleBy.nextInt();
		
		if(num%5 == 0 && num%11 == 0)
		{
		  System.out.println("Number is Divisible ");
		}else
		{
		  System.out.println("Number is not Divisible"); 
        }
	}
}