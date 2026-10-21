/*
12345
1  4
1 3
12
1
 
*/

import java.util.*;
public class Pattern_19
{
  public static void main(String x[])
  {
	  Scanner sc = new Scanner(System.in);
	  
	  for(int i=1; i<=5;i++)
	  {
		
		  for(int j=1; j<=5; j++)
		  {
			  if(j==1|| i==1||j==5-(i-1))
				  
			  {
				  System.out.print(j);
			  }else{
				  System.out.print(" ");
			  }
		  }System.out.print("\n");
	  }
  }
}