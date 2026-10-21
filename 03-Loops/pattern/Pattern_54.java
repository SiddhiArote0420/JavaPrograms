/*

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
1 6 15 20 15 6 1

*/

import java.util.*;
public class Pattern_54
{
   public static void main(String x[])
   {
	 
     for(int i = 0; i<=6 ; i++)
	 {   
	   int sum=1;
	   for(int j = 0 ; j<=i ; j++)
	   {
	     System.out.print(sum+" ");
		 sum = sum*(i-j)/(j+1);
	   }System.out.println();
     }
   }
 }
	   