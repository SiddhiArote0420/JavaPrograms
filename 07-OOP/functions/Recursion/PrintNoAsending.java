
/*Write a program to print numbers from 1 to n using recursion.*/

import java.util.*;
public class PrintNoAsending{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter last term");
		int n = sc.nextInt();
		
		 printAcending(n);
		
		
	}
	
	public static void printAcending(int n)
	{
	  if(n==0)
		  return;
	  
	  printAcending (n-1);
	   System.out.print(n +" ");
	}
	
}