/*Write a program to print numbers from n down to 1 using recursion.
*/

import java.util.*;
public class PrintNoDecending{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter nth Term for start");
		int n = sc.nextInt();
		
		 printDecending(n);
		
		
	}
	
	public static void printDecending(int n)
	{
		if(n==0){
			return;
		}
		
		System.out.print(n + " ");
		printDecending(n-1);
	}
}
		
