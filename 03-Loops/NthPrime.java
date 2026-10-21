// Write a java program to display 1 to nth Prime Number.

import java.util.*;
public class NthPrime
{
  public static void main(String x[]) 
  {
	  Scanner ob = new Scanner(System.in);
	  
	  System.out.println("Enter the limit :");
	  int limit = ob.nextInt();
	  
	  int i=2,count=0;
	  while(count < limit)
	  {   
          int n = 2;
		  boolean flag = true;
		   System.out.println(n<=i/2);
		  while(n<=i/2)
		  {
			  if(i%n == 0)
			  {
				  flag = false;
				  break;
			  }
			  n++;
		  }
		  if(flag){
			  System.out.println(i);
			  count++;
		  }
		  i++;
	  }
  }
 
}		  
