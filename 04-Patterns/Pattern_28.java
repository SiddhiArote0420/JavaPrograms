/*
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *
*/


import java.util.*;
public class Pattern_28
{
   public static void main(String x[])
   {
	   
	   int j,i;
	   for(i=1;i<=10;i++)
	   {  boolean flag = true;
	     for(j=1; j<=9;j++)
	     {
			 if(i<=5 && j>=6-i && j<=4+i && flag)
			 {
				 System.out.print("*");
				 flag = false;
			 }else if(i>5 && j>=i-5 && j<=15-i && flag)
			 {
				 System.out.print("*");
				 flag = false;
			 }else{
				 System.out.print(" ");
				 flag = true;
			 }
		 }System.out.println();
	   }
   }
}