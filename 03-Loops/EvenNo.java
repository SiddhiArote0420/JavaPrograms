//Write a C program to print all even numbers between 1 to 100. - using while loop

import java.util.*;
public class EvenNo
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		
		int i = 1;
		while(i <= 100)
		{
			if(i%2==0){
			System.out.println(i);
			}
			i++;
			
		}
	}
}