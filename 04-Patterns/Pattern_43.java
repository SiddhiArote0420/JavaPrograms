/* 
    *         *
     *       *
      *     *
       *   *
*********  *********
       *   *
      *     *
     *       *
    *         *

*/

import java.util.*;
public class Pattern_43
{
  public static void main(String x[])
  {
	  for(int i=1; i<=9; i++)
	  {
		  for(int j=1; j<=20; j++)
		  {
			  if( j<= 9)
			  {				  
          		  String a= (i==5 ||j==i+4||  j==14-i )?"*" :" ";
			    		  System.out.print(a);
			     
			  }else
			  {
				  String a = (j>11 && (i==5 || j==16-i||j==i+6) )?"*" :" ";
			    		  System.out.print(a);
			  }
		  }System.out.println();
	  }
  }
}
			  