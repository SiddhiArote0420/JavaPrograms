// Write a java program to insert value at specific index of array.

import java.util.*;
public class Insert_Value_AtSpecific_Index
{   public static void main(String x[])
	{  Scanner xyz  = new Scanner(System.in);
	    int a[]=new int[6];
		System.out.println("Enter values in array");
		for(int i=0; i<(a.length-1); i++)
		{  a[i]=xyz.nextInt();
		}
		System.out.println("Enter index and value");
		int index=xyz.nextInt();
		int value=xyz.nextInt();
		
		System.out.println("Display array before inserting");
		for(int i=0; i<a.length; i++)
		{ System.out.printf("a[%d]---->%d\n",i,a[i]);
		}
		//apply insertion logics 
		for(int i=(a.length-2); i>=index;i--)
		{
		  a[i+1]=a[i];
		}
		a[index]=value;
		System.out.println("Display array after inserting");
		for(int i=0; i<a.length; i++)
		{ System.out.printf("a[%d]---->%d\n",i,a[i]);
		}
	}
}

