// Write a java program to print all ASCII characters with their values.

import java.util.*;
public class AllCharAscii
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
	
		 int i = 0;
		while(i <=127 )
		{
		    //char ch = x[0].charAt(0);
		    //int ASCII = (int)i;
			System.out.println(i+" = "+(char)i);
			i++;
		}
	}
}