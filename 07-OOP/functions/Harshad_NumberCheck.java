/*Write a function to check whether a number is a Harshad number (divisible by sum of its digits).*/

import java.util.*;
public class Harshad_NumberCheck
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		
		boolean result = harshadCheck(n);
		if(result){
			System.out.println("It is a harshad Number");
		}else{
			System.out.println("It is Not a harshad number");
		}
	}
	
	public static boolean harshadCheck(int n)
	{
		int temp = n,sum=0;
		while(temp!=0)
		{
			int a = temp%10;
			temp /=10;
			sum += a;
		}
		
		return (n%sum == 0);
	}
}
