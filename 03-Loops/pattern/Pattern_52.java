/*
A
BAB
CBABC
DCBABCD
EDCBABCDE

*/


import java.util.*;
public class Pattern_52
{
   public static void main(String x[])
   {
	 
     for(int i = 1; i<=5 ; i++)
	 {   
        // 'middle' starts at ASCII value of the peak letter for this row
		int middle = 65 + i;
	   for(int j = 1; j<=9 ; j++)
	   {
		 if(j<=i+i-1)
		 {   
	       
            if(j<=i)//decreasing characters
			{ 	middle--;
               System.out.print((char)(middle));
			   
			}else {//increasing characters
				middle++;
               System.out.print((char)(middle));				
			}
		 }
	   }System.out.println();
	 }
   }
}