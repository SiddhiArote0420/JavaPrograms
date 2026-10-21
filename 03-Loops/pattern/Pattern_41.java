/* 
    *
     *
      *
       *
*********
       *
      *
     *
    *


*/

import java.util.*;
public class Pattern_41
{
  public static void main(String x[])
  {
	  for(int i=1; i<=9; i++)
	  {
		  for(int j=1; j<=9; j++)
		  {
			  if( j== 4+i || i==5||j==14-i )
			  {
				System.out.print("*");
			  }else{
				  System.out.print(" ");
			  }
		  }System.out.println();
	  }
  }
}
			  