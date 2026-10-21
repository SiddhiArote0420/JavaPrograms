/* Write a java program to display following series :
           	5  3  10  6  15  9  20  12  25  15  30  18  35  21  40
*/

import java.util.*;
public class series_5
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Limit");
		int limit = sc.nextInt();
		
		for(int i=1;i<=limit;i++)
		{
		  
		  int a=5;
		  System.out.print(a*i+" ");
		  int b=3;
		  
		  System.out.print(b*i+" ");
		}
	}
}
