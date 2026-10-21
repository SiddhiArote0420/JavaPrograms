// Write a java program to find HCF (GCD) of two numbers.

import java.util.*;
public class HCFCheck
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int num1 = ob.nextInt();
		
		System.out.println("Enter the second number");
		int num2 = ob.nextInt();
		
          
         if(num1 > 0 && num2 >0)
		 {	int hcf=1;
             int max = (num1>num2)?num1:num2;	 
			int i =1;
			while(i<= max)
			{
				if( num1 % i == 0 && num2 % i ==0)
				{
					System.out.println(i);
					hcf = i;
				}i++;
			}
			System.out.println("HCF is :"+hcf);
		}else
		{
			System.out.println("Enter valid Numbers");
		}
		
		
	}
}