/*
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *
*/

import java.util.*;
public class Pattern_35
{
	public static void main(String x[])
	{
		for(int i=1 ;i<=10;i++)
		{ 
			for(int j=1 ; j<=10; j++)
			{
				if(i<=5 && (j<=i|| j>=11-i))
				{
					System.out.print("*");
				}else if(i>5 && ( j<=11-i || j>=i))
				{
					  System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
}
				