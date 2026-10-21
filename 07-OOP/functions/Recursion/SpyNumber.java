// Write a java program to Check If a Number Is a Spy Number or Not spy number using function recursion. 

import java.util.*;
public class SpyNumber{
	public static void main(String[] x){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Where you want to start print No: ");
		int n = sc.nextInt();
		
		System.out.println("Enter the How much number you want to print: ");
		int limit = sc.nextInt();
		
		System.out.print("Spy numbers is: ");
		SpyNo(n,limit,0);
		
	}
	
	public static void SpyNo(int n, int limit,int count)
	{
		if(count == limit)
		  return;
	  
	  if(isSpy(n))
	  {
		  System.out.print(n+" ");
		  count++;
	  }
	  SpyNo(n+1,limit,count);//recursion
	}
	
	public static boolean isSpy(int num)
	{
		int sum = 0;
		int prod = 1;
		int temp = num;
		
		while(temp != 0)
		{
			int a = temp%10;
			sum = sum + a;
			prod = prod*a;
			temp = temp/10;
		}
		return sum == prod;
	}
}
		
	  
	  
		