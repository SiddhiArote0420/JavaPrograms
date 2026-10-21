//2.Write program to input number using Scanner class and reverse it?

import java.util.*;
class ReverseNum{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = sc.nextInt();
		
		int sum = 0;
		for(;n!=0;)
		{
			int a = n%10;
			n = n/10;
			sum = sum*10+a;
		}
		System.out.println("Reverse is: "+sum);
	}
}