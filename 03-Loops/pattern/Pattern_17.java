/*
1
12
1 3
1  4
12345
 
*/

import java.util.*;
public class Pattern_17
{
  public static void main(String x[])
  {
	  Scanner sc = new Scanner(System.in);
	  
	  for(int i=1; i<=5;i++)
	  {
		
		  for(int j=1; j<=5; j++)
		  {
			  if(j==1|| i==5||i==j)
				  
			  {
				  System.out.print(j);
			  }else{
				  System.out.print(" ");
			  }
		  }System.out.print("\n");
	  }
  }
}