/*
*
*1*
*121*
*12321*
*121*
*1*
*

*/
import java.util.*;
public class Pattern_37
{
  public static void main(String x[])
  {    
	  for(int i=1 ; i<=7;i++)
	  {   int temp = 1;
		  for(int j=1 ; j<=7;j++)
		  {     if(i<=4 && j<=i+i-1){
	                if(j==1 || j==i+i-1){
					System.out.print("*");
				   }else if( j < i){
				    System.out.print(temp); 
				    temp++;
		          }else{ //(j>i && j!=i+i-1){
                    System.out.print(temp); 					
                    temp--;				 
			       }
				}else if(i>4 && j<= 2*(8-i)-1){
					if(j==1 || j==2*(8-i)-1){
					System.out.print("*");
				   }else if( j < 2*(7-i)-1){
				    System.out.print(temp); 
				    temp++;
		          }else{ //(j>i && j!=i+i-1){
                    System.out.print(temp); 					
                    temp--;	
					
				   }
			 
	            }
	  
	  
          }System.out.println();
     }
  }
}
  
	