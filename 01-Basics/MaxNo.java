//Write a java program to find maximum between three numbers.

import java.util.*;
public class MaxNo
{
	public static void main(String x[])
	{
		Scanner max_no = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int n1 = max_no.nextInt();
		
		System.out.println("Enter second number : ");
		int n2 = max_no.nextInt();
		
		System.out.println("Enter third number : ");
		int n3 = max_no.nextInt();
	   
	    String max = (n1 > n2 && n1 > n3)? n1+" Is a maximum" :
		             (n2 > n1 && n2 > n3)? n2+" is a maximum" : n3+ " is a maximum";
					 
        System.out.println(max);
	}
}
		