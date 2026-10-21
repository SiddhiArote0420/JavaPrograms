/*
1
121
12321
1234321
123454321
*/


import java.util.*;
public class Pattern_25
{
  public static void main(String x[])
  {    
	  for(int i=1 ; i<=5;i++)
	  {   int temp = 1;
		  for(int j=1 ; j<=i*2-1;j++)
		  {   System.out.print(temp); 
		        if( j < i){
				  temp++;
		        }else{		 
                 temp--;				 
			    }	 
			 
	      }System.out.println();
	  
	  
      }
  }
}
  
					  