/*
A
ABA
ABCBA
ABCDCBA
ABCDEDCBA

*/


import java.util.*;
public class Pattern_53
{
   public static void main(String x[])
   {
	 
     for(int i = 1; i<=5 ; i++)
	 {   
        int middle = 65 ;// // Start from 'A'
	   for(int j = 1; j<=9 ; j++)
	   {
		 if(j<=i+i-1)
		 {   
	       
            if(j<=i) // Left side: go from A up to the middle letter
			{ 	
               System.out.print((char)(middle));
			   middle++;
			   
			   // When at middle letter, set value to one less so right side matches
			   if(j==i) 
				 middle=65+i-1;
			   
			}else { // Right side: go backwards in alphabet
				middle--;
               System.out.print((char)(middle));				
			}
		 }
	   }System.out.println();
	 }
   }
}