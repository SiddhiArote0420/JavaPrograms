//Write a java program to find the frequency of each digit in a given integer.

import java.util.*;
public class FrequencyDigit
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the the integer");
		int num = ob.nextInt();//1231
		
		int b = 0;
		while(b<=9)//0<=9
		{
			int temp = num;//1231
			int count=0,a;
			while(temp!=0)//1231!=0 123
			{
				a = temp%10;//1  3
				if(b == a)//0==1
				{
					count ++;
				}
				temp = temp/10;//123
			}
			if( count > 0)
			{
			System.out.println(+b+ " is Occurse" + count+" times");
			}
			b++;
		}
	}
}
		
			
		
		
