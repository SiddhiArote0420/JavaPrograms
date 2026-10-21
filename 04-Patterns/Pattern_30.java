/*
*
**
***
****
*****
****
***
**
*
*/
import java.util.*;
public class Pattern_30
{
	public static void main(String x[])
	{
		
		for(int i=1 ;i<=9;i++)
		{
			for(int j=1 ; j<=5; j++)
			{
				if(i <=5 && i>=j)
				{
					System.out.print("*");
				}else if(i > 5 && j<=10-i)
				{
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
}