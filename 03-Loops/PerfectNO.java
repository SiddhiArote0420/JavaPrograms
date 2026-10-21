//Write a java program to display 1 to nth Perfect Number.

import java.util.*;
public class PerfectNO
{
  public static void main(String x[]) 
  {
	  Scanner ob = new Scanner(System.in);
	  
	  System.out.println("Enter the limit :");
	  int limit = ob.nextInt();
	  
	  int count=0;
	  int num=1;
	   while(count <= limit)
	   {
		   int sum =0,div=1;
		   while (div <= num/2)
		   {
			   if(num%div==0)
			   {
				   sum +=div;
				  
			   }div++;
		   }
		  if(num == sum)
		  {
			 System.out.println(num);
			 count++;
		  }
			 num++;
		   
	    }   
		   
		   
	 }
}