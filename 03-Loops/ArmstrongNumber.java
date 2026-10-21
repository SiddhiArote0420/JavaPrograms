//Write a java program to display 1 to nth Armstrong Number.


import java.util.*;
public class ArmstrongNumber
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the Limit");
		int limit = ob.nextInt();
		
		int count =0;
        int num =1;
		
		
		while(limit > count)
		{
			int temp = num;
			int check = temp;
			int count2 = 0;
			while(temp !=0)
			{
				count2++;
				temp = temp/10;
			}
			temp = check;
			int sum =0,a;
			while(temp!=0)
			{
				a = temp % 10;
				temp = temp/10;
			    sum += (int)(Math.pow(a,count2));
			}
			if(num == sum)
			{
				System.out.println(num);
				count++;
			}
			num++;
		}
	}
}
				