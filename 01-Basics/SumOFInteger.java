//Write a Java program and compute the sum of an integer's digits.
//Input : 123
//Output : 6  // scanner class

import java.util.*;
public class SumOFInteger
{
    public static void main(String x[])
	{
		Scanner sumOf = new Scanner(System.in);
		//int n1,n2,n3;
		
		/*System.out.println("Enter the First digit : ");
		n1 = sumOf.nextInt();
		
		System.out.println("Enter the second digit : ");
		n2 = sumOf.nextInt();
		
		System.out.println("Enter the third digit : ");
		n3 = sumOf.nextInt();
		
		int sum = n1+n2+n3;
		
		System.out.println("Sum is :" +sum);*/
		
		System.out.println("Enter the three digit number : ");
		int num = sumOf.nextInt();
		int n1,n2,n3,sum=0;
		
		n1 = num % 10;  // 3
	    num = num /10; // remove last digit 3 from 123
		sum = sum + n1;
		
		n2 = num % 10; // 2
		num = num/10; // remove last digit 2 from 12
		sum = sum + n2;
		n3= num;
		
		sum = sum + n3;
		System.out.println(sum);
		
		
	}
}