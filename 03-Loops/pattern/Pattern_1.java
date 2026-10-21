/*

*
**
***
****
*****

*/

import java.util.*;
public class Pattern_1
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1 ; j <=i; j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}
}