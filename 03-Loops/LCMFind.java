//Write a java program to find LCM of two numbers.

import java.util.*;
public class LCMFind
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int num1 = ob.nextInt();
		
		System.out.println("Enter the second number");
		int num2 = ob.nextInt();
		
		if(num1 > 0 && num2 > 0)
		{
			int max = (num1 > num2)? num1:num2;
			int i = max;
			while(i>= max)// 
			{
				if( i % num1 == 0 && i % num2 ==0)
				{
					System.out.println(i);
					break;
				}i++;
			}
			//System.out.println("HCF is :"+i);
		}else
		{
			System.out.println("Enter valid Numbers");
		}
		
	}
}