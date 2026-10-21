//. Write a java program to display 1 to nth Strong Number.

import java.util.*;
public class StrongNumber
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
			int sum =0;
			while(temp !=0)
			{   
		        int fact=1, i=1,a;
				a = temp %10;
				while(i<=a)
				{
					fact *= i;
					i++;	
                }
                sum += fact;
				temp = temp/10;
            }
            if(sum == num)
			{
               System.out.println(num);
			   count++;
			}num++;
		}
	}
}	