/* Write a java program to print this pattern. 
 
1 
2 * 2 
3 * 3 * 3 
4 * 4 * 4 * 4 
3 * 3 * 3 
2 * 2 
1
*/

import java.util.*;
public class Que3
{
	public static void main(String  x[])
	{
		int num ;
		for(int i = 1 ; i<=7;i++)//row
		{
			for(int j=1; j<=7 ; j++)//col
			{
				if((i<= 4 && j<=(i+i)-1))// print first half col
				{ 
			        if(j%2 !=0){
					System.out.print(i +" ");
					}else{
						System.out.print("* ");
					}
				}else if(i>=5 && j<=2*(8-i)-1){//second half
				if(j%2 !=0){
					num = 8-i;
					System.out.print(num +" ");
					}else{
						System.out.print("* ");
					}	
				}
				
			}
			
			System.out.println();
			
			
		}
	}
}
	