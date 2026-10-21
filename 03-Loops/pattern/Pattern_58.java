/*
12345
 1234
  123
   12
    1
   12
  123
 1234
12345

*/

import java.util.*;
public class Pattern_58
{
	public static void main(String x[])
	{
		for(int i=1; i<=9; i++)
		{  
	       int n =1;
			for(int j=1; j<=5;j++)
			{
				if((i<=5 && j>=i) || (i>5 && j>= 10-i) )
				{
					System.out.print(n);
					n++;
				}else{
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
}
					