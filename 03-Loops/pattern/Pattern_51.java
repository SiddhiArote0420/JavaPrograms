/*
ABCDEDCBA
ABCD DCBA
ABC   CBA
AB     BA
A       A

*/


import java.util.*;
public class Pattern_51
{
   public static void main(String x[])
   {
	 
     for(int i = 1; i<=5 ; i++)
	 {   
        int a=65; //'a' is used to store ASCII values of characters
		
	   for(int j = 1; j<=9 ; j++)
	   {
		 if(j<=6-i || j>=4+i)
		 {
			 if(j<=5){     // Left side increasing letters
             System.out.print((char)(a));
			 a++;
			  if(j==5) // When we reach column 5, reset 'a' to ASCII 69 = 'E'
				 a=69;
			 }else{
				  a--; // step back to previous letter
				 System.out.print((char)(a));
				
			 }
		 }else
		 {
			 System.out.print(" ");
		 }
	   }System.out.println();
	 }
   }
}
		 