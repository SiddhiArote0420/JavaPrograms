/*
    1
   1 2
  1   3
 1     4
1       5
*/

import java.util.*;
public class Pattern_22
{
  public static void main(String x[])
  {
	  for(int i=1 ; i<=5;i++)
	  {
		  for(int j=1 ; j<=9;j++)
		  {
				  if(j==6-i)
				  {
					  System.out.print("1");
					 
				  }else if(j==5+i-1 && i>1)
				  {
					  System.out.print(i);
					 
				  }else{
					  System.out.print(" ");
				  }
			}System.out.print("\n");
		  }
	  }
  }
