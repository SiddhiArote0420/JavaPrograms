//Write a java program to find duck number of a array.


import java.util.*;
public class Duck_Number
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
	   System.out.print("duck Number: ");
	    for(int i=0; i<arr.length; i++)
	   {  
        // boolean flag = false;
   
         int temp = arr[i], a=1;
          for(; temp != 0;){
	       a = temp%10;
		   temp = temp/10;
		  
		  if(a == 0)
		  {
			  System.out.print(arr[i] +" ");
			  
		  }
		 }
		
		  
	   }
   }
}