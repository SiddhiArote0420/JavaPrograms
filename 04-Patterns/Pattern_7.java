/*
12345
 2345
  345
   45
    5
*/

import java.util.*;
public class Pattern_7
{
  public static void main(String x[])
  {
	  Scanner sc = new Scanner(System.in);
	  
	  for(int i=1; i<=5;i++)
	  {
		  for(int j=1; j<=5; j++)
		  {
			  if(j>=i)
			  {
				  System.out.print(j);
			  }else
			  {
				  System.out.print(" ");
			  }
		  }System.out.print("\n");
	  }
  }
}