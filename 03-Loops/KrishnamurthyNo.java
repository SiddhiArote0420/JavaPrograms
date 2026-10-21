/*Write a Java program to check whether a given number is a Krishnamurthy Number and list all Krishnamurthy numbers up to n.
 A Krishnamurthy number is a number whose sum of the factorials of its digits equals the number itself.
 Example: 145 → 1! + 4! + 5! = 145.
*/

import java.util.*;
public class KrishnamurthyNo
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the Limit");
		int limit = ob.nextInt();
		
		for(int num=1; num <= limit; num++)
		{
		 int temp = num;
		 int sum =0;
		 while(temp != 0)
		{
			int a = temp%10;
			temp = temp/10;
			int fact =1;
			for( int i=1; i<=a;i++)// 
			{
			   fact =fact * i;
			   
			}
             sum +=	fact;	 
		}
        if(num == sum)
		{
		  System.out.println(num);
		}
		}
	}
}	