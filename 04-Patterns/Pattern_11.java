/*
ABCDE
 bcde
  CDE
   de
    E
*/

import java.util.*;
public class Pattern_11
{
  public static void main(String x[])
  {
	  Scanner sc = new Scanner(System.in);
	  
	  for(int i=1; i<=5;i++)
	  {
		  int a = 65;
		  for(int j=1; j<=5; j++)
		  {
		    if(j>=i){
				if(i%2==0){
				 
			     System.out.print((char)(a+32));
			     a++;
				}else
				{
				 System.out.print((char)a);
			     a++;	
				}	
					
			}else{
			System.out.print(" ");
			a++;
			}
		  }System.out.print("\n");
	  }
  }
}
				