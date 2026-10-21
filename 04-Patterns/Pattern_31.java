/*
3
44
555
6666
555
44
3


*/
import java.util.*;
public class Pattern_31
{
	public static void main(String x[])
	{
		for(int i=1 ;i<=7;i++)
		{ 
			for(int j=1 ; j<=4; j++)
			{
				if(i <5 && i>=j)
				{
					System.out.print(2+i);
				}else if(i >= 5 && j<=8-i)
				{
					System.out.print(10-i);
				}else{
					System.out.print(" ");
				}
			}System.out.println();
			
		}
	}
}