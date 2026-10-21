//  Write a java program to find prime number of a array.


import java.util.*;
public class Prime_Number
{  public static void main(String x[])
   {   Scanner xyz  = new Scanner(System.in);
       int arr[]=new int[5];
	   
	   System.out.println("Enter values in array");
	   for(int i=0; i<arr.length; i++)
	   { 
	      arr[i]=xyz.nextInt();
	   }
	   
	   // check prime number
	   System.out.print("Prime Number: ");
	    for(int i=0; i<arr.length; i++)
	   { 
	      int count=0;
		  for(int j=2 ; j <= arr[i]/2 ; j++)
		  {
			  if( arr[i]%j == 0)
			  {
				  count ++;
				  break;
			  }
		  }
		  if(count == 0)
		  {
			  System.out.print(arr[i]+" ");
		  }
	   }
   }
}