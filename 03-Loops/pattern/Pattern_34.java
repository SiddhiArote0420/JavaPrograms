/*
*
*1*
*121*
*12321*
*1234321*
*123454321*
*12345654321*

*/
import java.util.*;
public class Pattern_34
{
  public static void main(String x[])
  {    
	  for(int i=1 ; i<=7;i++)
	  {   int temp = 1;
		  for(int j=1 ; j<=i*2-1;j++)
		  {      
	            if(j==1 || j==i+i-1){
					System.out.print("*");
				}else if( j < i){
				 System.out.print(temp); 
				  temp++;
		        }else{ //(j>i && j!=i+i-1){
                 System.out.print(temp); 					
                 temp--;				 
			    }
			 
	      }System.out.println();
	  
	  
      }
  }
}
  
	