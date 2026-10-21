/*
********1********
*******2*2*******
******3*3*3******
*****4*4*4*4*****
****5*5*5*5*5****
*/

import java.util.*;
public class Pattern_26
{
  public static void main(String x[])
  {
	 
	 
	  for(int i=1; i<=5;i++)
	  {
		boolean flag = true;
		  for(int j=1; j<=17; j++)
		  {
			  if(j>=10-i && j<=8+i && flag )
			  {
				  
				  System.out.print(i);
				  flag = false;
				  
			  }else
			  {
				 System.out.print("*");
				 flag = true;
			  }
		  }System.out.println();
	  }
  }
}  