/*Write a function to check if a number is an Armstrong number.*/

import java.util.*;
public class Armstrong
{
  public static void main(String x[])
  {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  
	  boolean result = ArmstrongCheck(n);
	  if(result)
	  {
		  System.out.print("It is Armstrong");
	  }else{
		  System.out.print("It is not a Armstrong");
	  }
	  
  }
  public static boolean ArmstrongCheck(int n)
  { 
    int count = 0;
	int temp = n ;
	while(temp!=0)
	{
		count++;
		temp = temp/10;
	}
	int arm = 0;
	temp = n;
	while(temp!=0)
	{
		int a = temp % 10;
		arm = arm + (int)(Math.pow(a,count));
		temp = temp/10;
	}

	return arm == n;
  }
}
