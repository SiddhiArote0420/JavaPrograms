/*
    *
   ***
  *****
 *******
 
 */

import java.util.*;
public class Pattern_18
{
  public static void main(String x[])
  {
	 
	 
	  for(int i=1; i<=4;i++)
	  {
		
		  for(int j=1; j<=9; j++)
		  {
			  if(j>=6-i && j<=4+i )
			  {
				  System.out.print("*");
			  
			  }else{
				  System.out.print(" ");
				  
			  }
			  
		  }System.out.print("\n");
	  }
		
  }
}  