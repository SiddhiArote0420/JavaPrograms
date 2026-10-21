//. Write a java program to find strong number of a array.

import java.util.*;
public class Strong_Number
{ 
  public static void main(String x[])
   {   Scanner xyz  = new Scanner(System.in);
       int arr[]=new int[5];
	   
	   System.out.println("Enter values in array");
	   for(int i=0; i<arr.length; i++)
	   { 
	      arr[i]=xyz.nextInt();
	   }
	   
	   // check duck number
	   System.out.print("Strong Number: ");
	    for(int i=0; i<arr.length; i++){
			int temp = arr[i];
			
			int sum =0;
			while( temp != 0)
			{   int fact=1;
				int a = temp % 10;
				temp = temp / 10;
				for(int j =1 ; j <= a ; j++)
				{
					 fact *= j;
				}
				sum += fact;
			}
			
			if(arr[i] == sum )
				System.out.print(arr[i]+" ");
		}
   }
}