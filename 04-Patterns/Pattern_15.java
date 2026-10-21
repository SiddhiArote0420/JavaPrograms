/*
12345
1234
123
12
1
 
*/

import java.util.*;
public class Pattern_15
{
  public static void main(String x[])
  {
	  Scanner sc = new Scanner(System.in);
	  
	  for(int i=1; i<=5;i++)
	  {
		
		  for(int j=1; j<=5; j++)
		  {
			  if(j<=5-(i-1)|| i==1|| j==1)
				  
			  {
				  System.out.print(j);
			  }
		  }System.out.print("\n");
	  }
  }
}