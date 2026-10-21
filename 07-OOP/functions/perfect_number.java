/*Write a function to check if a number is a perfect number.*/

import java.util.*;
public class perfect_number
{
  public static void main(String x[])
  {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  
	  boolean result = perfectcheck(n);
	  if(result){
	  System.out.println("It is a perfect");
	  }else{
	  System.out.println("It is Not a perfect");
	  }
	  
  }
  public static boolean perfectcheck(int n)
  { 
    int sum = 0;
	for(int i=1 ; i<=n/2 ; i++)
	{
	    if(n%i==0){
		 sum +=i;
	    }
	
    }
	return sum == n;
  }
}
