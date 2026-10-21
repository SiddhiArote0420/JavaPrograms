//Write program to check number is prime or not?

import java.util.*;
public class PrimeNo{
public static void main(String x[])
 {
 Scanner sc = new Scanner(System.in);
 
 System.out.println("Enter the number");
 int num = sc.nextInt();
 
 int count = 0;
 for(int i=2; i<=num/2;i++)
 {
	if(num%i == 0)
	{
      count++;
	}
 }	
  if(count == 0)
  {
	  System.out.println("Number is a prime");
  }else{
	  System.out.println("Number is Not prime");
  }
 }
}