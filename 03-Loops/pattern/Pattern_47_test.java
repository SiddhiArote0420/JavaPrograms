/*
0        0
10      01
010    010
1010  0101
0101010101

*/

import java.util.*;
public class Pattern_47_test
{
   public static void main(String x[])
   {
	   int a=0;
     for(int i = 1; i<=5 ; i++)
	 {    
	   for(int j = 1; j<=10 ; j++)
	   {
	     if( j<=i || j>= 11-i)
		 {  
		    System.out.print(a);
			a= 1-a;
		 }else{
			   System.out.print(" ");
			   if(j==5)
				   a=0;
		   }
			   
		}System.out.println();
	 }
	}
}