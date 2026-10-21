/*
1
2*3
4*5*6
7*8*9*10
7*8*9*10
4*5*6
2*3
1

*/

import java.util.*;
public class Pattern_33
{
	public static void main(String x[])
	{ int k=1;
	  int l=4;
		for(int i=1;i<=8;i++)
		{    int num = 1;
   			if(i == 5) num = 7;
                  else if(i == 6) num = 4;
                  else if(i == 7) num = 2;
                  else if(i == 8) num = 1;
			for(int j=1;j<=7;j++)
			{   
				if(i<=4 && j<=i+i-1)
				{  
					if(j%2!=0)
					{
						System.out.print(k);
						k=k+1;
					}else
					{   
				        System.out.print("*");
					}
				}else if(i>4 && j <= 2 * (9 - i) - 1 ) //( j<=12-i) j <= 2 * (9 - i) - 1 
				{  	
				  
    
                  // Set starting number for each row manually
                  
					 if(j%2!=0)
					 { 
						System.out.print(num);
						num++;
						
					 }else
					 {   
				        System.out.print("*");
					 }
				  
				  l--; 
				}else{  
				
					System.out.print(" ");
				}
			}
			
			System.out.println(); 
		}
	}
}
						
						