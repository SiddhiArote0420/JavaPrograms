/*
        1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5
 
 */

import java.util.*;
public class Pattern_21
{
  public static void main(String x[])
  {
	 
	 
	  for(int i=1; i<=5;i++)  
	  { 
          int num=i-1;
		  for(int j=1; j<=9; j++)
		  {
			  if(j>=6-i && j<=4+i )
			  {				  
			  int middle = 5;  // center column
                   /* int num;
                    if (j <= middle) {
                        num = i + (j - (6 - i));  // increasing part
                    }else {
                        num = i + ((4 + i) - j);  // decreasing part
                    }
                    System.out.print(num+" ");
                } else {
                    System.out.print("  ");
                }*/
				 
                    if (j <= middle) {
                        num++;  // increasing part
                    }else {
                        num--;  // decreasing part
                    }
                    System.out.print(num+" ");
                } else {
                    System.out.print("  ");
                }
			  
		  }System.out.print("\n");
	  }
		
  }
}  