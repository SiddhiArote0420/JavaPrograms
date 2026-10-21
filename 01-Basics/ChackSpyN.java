//Write a java program to Check Number Is Spy Number or Not.

import java.util.*;
public class ChackSpyN
{
	public static void main(String x[])
	{
		Scanner spy = new Scanner(System.in);
		
		int num,sum,product;
		
		System.out.println("Enter 3 digit number ;");
		num = spy.nextInt(); 
		
		int n1 = num%10;
		num = num/10;
		
		int n2 = num%10;
		num = num/10;
		
		int n3 = num;
		
		sum = n1+n2+n3;
		product = n1*n2*n3;
		
		System.out.println("Sum is : "+sum);
		System.out.println("Product is : "+product);
		
		String result = (sum == product)?"Number is Spy" : "Number is not Spy";
		System.out.println(result);
	}
}