/*Write a function to find the product of digits of a given number.*/

import java.util.*;
public class ProductDigit
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		
		int  result = ProductCount(n);
		   System.out.print("Product od digit is : "+result);
		
	}
	public static int ProductCount(int n)
	{
		int  product =1;
		while(n > 0)
		{ 
	        int a = n%10;
			product *=a;
			n = n/10;
				
		}
	
	      return product ;
	}
}