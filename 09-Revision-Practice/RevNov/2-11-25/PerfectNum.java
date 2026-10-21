//Write program to input number and check number is perfect or not?

import java.util.*;
public class PerfectNum{
    public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int sum =0;
		for(int i=1 ; i<= num/2; i++)
		{
			if(num%i == 0)
			{
				sum = sum+i;
			}
		}
	    if(num == sum )
		{
			System.out.println("Number is perfect");
		}else{
			System.out.println("number is not perfect");
		}
	}
}
		