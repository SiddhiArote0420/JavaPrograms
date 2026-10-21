/*

123454321
1234321
12321
121
1
*/


import java.util.*;
public class Pattern_49
{
   public static void main(String x[])
   {   int b=9;int a=5;
     for(int i = 1; i<=5 ; i++)
	 {   int temp = a;
	   for(int j = 1; j<=9 ; j++)
	   {     
         if(j<=b){
			 if(j<=a)
		     {
			    System.out.print(j);
		     }else //if(j>a)
			 {
				System.out.print(--temp);
             }	
         }
	   }
	   a--;
	   System.out.println();
	   b=b-2;
	 }
   }
}   