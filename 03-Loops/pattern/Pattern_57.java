/*

        *
      *   *
    *   *   *
  *   *   *   *
*   *   *   *   *
*   *   *   *   *
  *   *   *   *
    *   *   *
      *   *
        *
		
	*/


import java.util.*;
public class Pattern_57
{
  public static void main(String x[])
  {
	 
	   
	 
	  for(int i=1; i<=10;i++)  
	  {   boolean flag = true;
		  for(int j=1; j<=9; j++)
		  {
		    if((i<=5 && j>=6-i && j<=4+i ) || (i>=6 && j>=i-6+1 && j<=15-i))  
			{ 
		       if(flag){
				System.out.print("* ");
				flag = false;
			   }else{
				   System.out.print("  ");
				   flag = true;
			   }
				
			}else{
				System.out.print("  ");
				
				
			}
		  }System.out.println();
	  }
  }
}