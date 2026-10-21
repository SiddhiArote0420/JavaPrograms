//Write a C program to print all alphabets from a to z.

import java.util.*;
public class AllAlphabets
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
	
		
		int a=97;
		while(a<=122)
		{
			System.out.print((char)(a)+" ");
			a++;
		}
	}
}