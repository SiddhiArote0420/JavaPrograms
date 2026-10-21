/*
   ****
  ****
 ****
****

*/

import java.util.*;
public class Pattern_44
{
	public static void main(String x[])
	{   
		for(int i=1; i<=4 ; i++)
		{   //System.out.println();
			for(int j=1; j<=7; j++)
			{
				if( j>= 5-i && j<= 8-i)
				{
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
}