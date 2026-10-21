
/*
12345
2  5
3 5
45
5
*/


import java.util.*;
public class Pattern_24
{
  public static void main(String x[])
  {
	  for(int i=1 ; i<=5;i++)
	  {
		  for(int j=1 ; j<=5;j++)
		  {
			  if(i==1)
			  {
				  System.out.print(j);
			  }else if(j==1)
			  {
				  System.out.print(i);
			  }else if(j==6-i){
				System.out.print(5);
			  }	else{
				  System.out.print(" ");
			  }
		  }System.out.println();
	  }
  }
}