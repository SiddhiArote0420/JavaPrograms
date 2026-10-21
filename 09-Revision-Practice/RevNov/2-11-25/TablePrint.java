//.Write a program to input number and print its table?

import java.util.*;
public class TablePrint{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		for(int i=1; i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+ num*i);
		}
	}
}