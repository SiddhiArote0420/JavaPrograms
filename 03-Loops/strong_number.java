/*Write a function to check if a number is a strong number (sum of factorial of digits = number).*/

import java.util.*;
public class strong_number
{
  public static void main(String x[])
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number");
	  int n = sc.nextInt();
	  
	  boolean result = Strongcheck(n);
	  if(result){
	  System.out.println("It is a perfect");
	  }else{
	  System.out.println("It is Not a perfect");
	  }
	  
  }
  public static boolean Strongcheck(int n)
  { 
    int temp = n,sum =0;
	while(temp!=0){
	   int a = temp%10;
	   int fact = 1;
	   for(int i=1 ; i<=a ; i++)
	   {
	    fact *= i;
	   }
	   temp = temp/10;
	    sum += fact;
       }
	return sum == n;
  }
}
