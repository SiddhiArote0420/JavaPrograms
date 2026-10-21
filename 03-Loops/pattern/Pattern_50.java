/*
A
B C
D E F
G H I J
K L M N O
*/


import java.util.*;
public class Pattern_50
{
   public static void main(String x[])
   {
	   int a=65;
     for(int i = 1; i<=5 ; i++)
	 {   
	   for(int j = 1; j<=5 ; j++)
	   {
		   if(j<=i)
		   {
			   System.out.print((char)(a)+" ");
			   a++;
		   }
	   }System.out.println();
	 }
   }
}