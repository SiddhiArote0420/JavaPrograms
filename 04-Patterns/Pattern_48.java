/*
1        1
12      21
123    321
1234  4321
1234554321
*/

import java.util.*;
public class Pattern_48
{
   public static void main(String x[])
   {
	   boolean flag = true;
     for(int i = 1; i<=5 ; i++)
	 {    int a=i;
	   for(int j = 1; j<=10 ; j++)
	   {
	     if( j<=i)
		 {  
		    System.out.print(j);
			
		 }else if(j>= 11-i){
			    
			   System.out.print(a); 
			    a=a-1;
		   }else{
			   System.out.print(" ");
		   }
			   
		}System.out.println();
	 }
	}
}