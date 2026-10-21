/*. Write a java program to Check Number Is Duck Number or Not.
Example : A Duck number is a positive number which has zeroes present in it, For example 3210, 8050896, 70709 are all Duck numbers.
*/

import java.util.*;
public class DuckNo
{
  public static void main(String x[])
  {
	  Scanner CheckDuck = new Scanner(System.in);
	  
	  System.out.println("Enter the number :");
	  int n = CheckDuck.nextInt();
	  
	  boolean flag=false;
	  
	  while(n!=0)
	  {	
		  int i=n%10;
		  n=n/10;
		  if(i==0)
		  {
			  flag = true;
			  break;
		  }
		  
	  }
		  if(flag){
			  System.out.println("Number is Duck");
		  }else{
			  System.out.println("Number is not Duck");
		  }
	  
  }
}
