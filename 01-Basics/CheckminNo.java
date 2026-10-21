// Write a java program to find a minimum between three numbers.

import java.util.*;
public class CheckminNo
{
  public static void main(String x[])
  {
	  Scanner minNo = new Scanner(System.in);
	  
	  System.out.println("Enter thre numbers : ");
	  int num1 = minNo.nextInt();
	  int num2 = minNo.nextInt();
	  int num3 = minNo.nextInt();
	  
	  if ( num1<num2 && num1<num3)
	   {
		   System.out.println("The Minimum Number is :"+num1);
	   }else if (num2<num1 && num2<num3)
	   {
		   System.out.println("The Minimum Number is :"+num2);
	   }else{
		   System.out.println("The Minimum Number is :"+num3);
	   }
	   
  }
}