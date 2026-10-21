//Given a number, print Perfect Square if its square root is an integer, otherwise Not Perfect Square — using ternary operators.

import java.util.*;
public class PrintPerfectSqure
{
	public static void main(String x[])
	{
		Scanner perfectSqure = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = perfectSqure.nextInt();
		
		if(Math.sqrt(n)%1==0)
		{
			System.out.println("The Number is Perfect squre");
		}else{
			System.out.println("The Number is Not a Perfect Squre");
		}
	}
}