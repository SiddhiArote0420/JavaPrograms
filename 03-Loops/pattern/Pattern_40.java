/*
           *
         *   *
       *       *
     *           *
   *               *
 *   *   *   *   *   *
 
 */

import java.util.*;
public class Pattern_40
{
  public static void main(String x[])
  {
	 
	 
	  for(int i=1; i<=6;i++)
	  {
		boolean flag = true;
		  for(int j=1; j<=11; j++)
		  {
			  if(j==7-i || j==5+i || (i==6 && flag))
			  {
				  System.out.print(" *");
				  flag = false;
			  
			  }else{
				  System.out.print("  ");
				  flag = true;
			  }
			  
		  }System.out.print("\n");
	  }
		
  }
}  