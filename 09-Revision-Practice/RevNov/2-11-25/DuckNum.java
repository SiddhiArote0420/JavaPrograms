//.Write program to input number and check number is duck or not?

import java.util.*;
public class DuckNum{
    public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		boolean flag = false;
		while(num!=0)
		{
			int a = num%10;
			if(a == 0)
			{
				flag = true;
			}
			num = num/10;
		}
		
		if(flag)
		{
			System.out.println("Number is a duck");
		}else{
			System.out.println("Number is a duck");
		}
	}
}
		