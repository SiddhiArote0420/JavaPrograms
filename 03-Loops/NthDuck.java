//Write a java program to display 1 to nth Duck Number.

import java.util.*;
public class NthDuck
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner (System.in);
		
		System.out.println("Enter the Limit");
		int limit = ob.nextInt();
		
		int count =0;
		int num = 1;
		
		while (count < limit)
		{   boolean flag = false;
			//int temp = num;
			int check = num;
			while(check !=0)
			{
				int a = check%10;
				check = check/10;
				
				if(a == 0)
				{    
					flag = true;
					break;
				}
				
			}
			
			if(flag){
					System.out.println(num);
					count++;
				
			}
			num++;
		}
	}
}