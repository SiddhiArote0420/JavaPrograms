//Write a java program to find armstrong number of a array. 

import java.util.*;
public class Armstrong_Number
{ 
  public static void main(String x[])
   {   Scanner xyz  = new Scanner(System.in);
       int arr[]=new int[5];
	   
	   System.out.println("Enter values in array");
	   for(int i=0; i<arr.length; i++)
	   { 
	      arr[i]=xyz.nextInt();
	   }
	   
	   // check armstrong number
	   System.out.print("armstrong Number: ");
	    for(int i=0; i<arr.length; i++){
			int temp = arr[i];
			int count = 0;
			
			while(temp != 0)
			{
				int a = temp %10;
			    temp = temp /10;
                 count ++;
			}
            temp = arr[i];
			int sum =0;
            while(temp != 0)
			{
               int a = temp %10;
			   temp = temp /10;
			   sum += ((int)Math.pow(a, count));
			}
			if(sum == arr[i])
				System.out.print(arr[i]+" ");
		}
   }
}