/*
0        0
01      01
010    010
0101  0101
0101001010

*/

import java.util.*;
public class Pattern_55
{
   public static void main(String x[])
   {
	   
     for(int i = 1; i<=5 ; i++)
	 {    int a=0;
	   for(int j = 1; j<=10 ; j++)
	   {
	     if( j<=i || j>= 11-i)
		 {  
	         if(j==11-i)
				   a=0;
		    System.out.print(a);
			a= 1-a;	  
			 
		 }else{
			   System.out.print(" "); 
		      }
			   
		}System.out.println();
	 }
	}
}