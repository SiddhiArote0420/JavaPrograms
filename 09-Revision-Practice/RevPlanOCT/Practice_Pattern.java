/*
   1
   A B
  2   3
 C     D
4 5 6 7 8

*/

import java.util.*;
public class Practice_Pattern
{
  public static void main(String x[])
  { 
   char ch= 'A';
   int n = 1 ;
  
  boolean flag = false;
  for(int i = 1 ; i <= 5  ;i++)
   {
	   for(int j = 1 ; j <= 9  ;j++)
	   {
		   if((j==(6-i)) ||(j== 4+i))
		   {
			   if(i%2 != 0)
			   {
				   System.out.print(n);
				   n++;
			   }else{
				   System.out.print(ch);
				   ch++;
			   }
		   }else if (i==5 && j%2 != 0){ 
			   /*if(flag )
			   {
				   System.out.print(n);
				   n++;
				   flag = false;
			   }else{
				   System.out.print(" ");
				   flag = true;
			   }*/
			   System.out.print(n);
				   n++;
			   
		   }else{
			   System.out.print(" ");
		   }
	   }
	   System.out.println();
   }
  }
 }
