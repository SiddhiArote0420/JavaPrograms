//WAP to store 5 values in an array and find the second max or highest value from array.


import java.util.*;
public class Second_Max
{  public static void main(String x[])
   {   Scanner xyz  = new Scanner(System.in);
       int a[]=new int[5];
	   System.out.println("Enter values in array");
	   for(int i=0; i<a.length; i++)
	   { a[i]=xyz.nextInt();
	   }
	   int smax=Integer.MIN_VALUE;
	   int max=a[0];
	   for(int i=0; i<a.length; i++)
	   {
	       if(a[i]>max)
		   {  smax=max;
	          max=a[i];
		   }
		   else if(a[i]>smax && a[i]!=max)
		   { smax=a[i];
		   }
		   else{
		   }
	   }
	   if(smax!=Integer.MIN_VALUE)
	   {
	       System.out.println("Second Max value is  "+smax);
	   }
	   else{
		    System.out.println("There is no seconod max value");
	   }
   
   }
}
