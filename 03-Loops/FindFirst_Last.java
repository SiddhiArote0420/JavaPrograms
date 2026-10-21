 //Write a java program to find the first and last digit of a number.
 
 import java.util.*;
public class FindFirst_Last
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = ob.nextInt();
		
		int temp = n;
		int first,count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		n=temp;
		first = n/((int)(Math.pow(10, --count)));
        n=n%10;
    
       System.out.println("First digit is :"+first+"Last Degit is :"+n);
}}	