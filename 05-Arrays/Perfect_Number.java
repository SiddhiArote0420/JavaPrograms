//Write a java program to find perfect number of a array.


import java.util.*;
public class Perfect_Number
{ 
  public static void main(String x[])
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
	     int sum =0;
		  for(int j=1 ; j <= arr[i]/2 ; j++)
		  {
			  if( arr[i]%j == 0)
			  {
				 sum += j;
				 
			  }
		  }
		  if(arr[i]== sum)
		  {
			  System.out.print(arr[i]+" ");
		  }
	   }
   }
}