//Write a java program to find the minimum between two numbers.


import java.util.*;
public class MinNo
{
	public static void main(String x[])
	{
		Scanner min_no = new Scanner(System.in);
		
		System.out.println("Enter first number : ");
		int n1 = min_no.nextInt();
		
		System.out.println("Enter second number : ");
		int n2 = min_no.nextInt();

	   
	    String max = (n1 < n2 )? n1+" Is a minimum" :
		             n2+" is a minimum" ;
					 
        System.out.println(max);
	}
}
		