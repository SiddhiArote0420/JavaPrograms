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
      // controls number of rows
	  for(int i=1 ; i<=7;i++)
	  {   
          int temp = 1; // temp will store the current number to print
		  
		  //controls columns for each row
		  for(int j=1 ; j<=7;j++)
		  {    
                  // ----- FIRST HALF of the pattern (rows 1 to 4) ----
            	  if(i<=4 && j<=i+i-1){//// Number of columns increases with row number
					  
	                  if(j==1 || j==i+i-1){
					    System.out.print("*");
					
				      }else if( j < i){
				        System.out.print(temp); 
				        temp++;
					
		              }else{ //(j>i && j!=i+i-1){
                        System.out.print(temp); 					
                        temp--;				 
			          }
				
               // --- SECOND HALF of the pattern (rows 5 to 7) ---				
				}else if(i>4 && j<= 2*(8-i)-1){ //Columns decrease after middle row
				
					if(j==1 || j==2*(8-i)-1){
					   System.out.print("*");
				    }else if( j < 2*(7-i)-1){//Print ascending numbers
				       System.out.print(temp); 
				       temp++;
		            }else{ //Print descending numbers
                       System.out.print(temp); 					
                       temp--;	
					
				   }
			 
	            }
	  
	  
          }System.out.println();
     }
  }
}
  
	