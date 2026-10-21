/*
1
2*2
3*3*3
4*4*4*4
4*4*4*4
3*3*3
2*2
1
*/

import java.util.*;
public class Pattern_32
{
	public static void main(String x[])
	{
		for(int i=1;i<=8;i++)
		{   
			for(int j=1;j<=7;j++)
			{   
				if(i<=4 && j<=i+i-1)
				{  
					if(j%2!=0)
					{
						System.out.print(i);
					}else
					{   
				        System.out.print("*");
					}
				}else if(i>4 && j <= 2 * (9 - i) - 1 )//( j<=12-i)
				{  	
					 if(j%2!=0)
					 {
						System.out.print(9-i);
						
					 }else
					 {   
				        System.out.print("*");
					 }
				  
				   
				}else{  
				
					System.out.print(" ");
				}
			}System.out.println(); 
		}
	}
}
						
						