/*

*******
**   **
* * * *
*  *  *
* * * *
**   **
*******

*/

import java.util.*;
public class Pattern_38
{
	public static void main(String x[])
	{
		for(int i=1; i<=7; i++)
		{
			//System.out.println();
			
			for(int j=1 ; j<=7 ; j++)
			{
				if(j==1 || j==7 || i==1 || i==13|| j==i || j == 8-i || i==7)
				
				{
					System.out.print("*");
				}else 
				{
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
}