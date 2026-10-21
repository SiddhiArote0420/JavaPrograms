//Write program to input number using Scanner class and check this number duck or not?


import java.util.*;
public class DuckNo{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		boolean flag = false;
		while(num!=0)
		{
			int a = num%10;
			num = num/10;
			
			if(a == 0)
			{
				flag = true;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println("Number is Duck");
		}else{
			System.out.println("Number is not a duck");
		}
	}
}