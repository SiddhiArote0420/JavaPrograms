/*Write a java program to Check Number Is Neon Number or Not.
Example : A neon number is a number where the sum of digits of the square of the number is equal to the number.
*/

import java.util.*;
public class NeonNo
{
  public static void main(String x[])
  {
	  Scanner ob = new Scanner(System.in);
	  
	  System.out.println("Enter the Number");
	  int  num = ob.nextInt();
	  
	  int temp = num;
	  num = num*num;
	  int a ,sum=0;
	  while(num !=0)
	  {
		  a = num%10;
		  num = num/10;
		  sum = sum+a;
	  }
	  if(sum == temp)
	  {
		  System.out.println("Number is a Neon Number");
	  }else
	  {
		  System.out.println("Number is a Not Neon ");
	  }
  }
}
		  