//Write a C program to count the number of digits in a number.


import java.util.*;
public class CountDigit
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = ob.nextInt();
		
		int i = 1;
		int count =0;
		while(n!=0){
			 count++;
             n=n/10;	
		
		}
		System.out.println(count);
	}
}
		 
		 