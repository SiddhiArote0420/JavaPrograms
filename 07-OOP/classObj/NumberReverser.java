/*Reverse a Number
Create a class NumberReverser with a method reverse that reverses a given integer number.
Explanation: Covers basic loops for number manipulation.
*/

import java.util.*;
public class NumberReverser{
	public static int reverse(int n){
	int rev =0;	
	while(n!=0)
	{
       int a = n%10;
       n = n/10;
	   rev = rev*10+a;
	}
   
    return rev;
  }	
  
  public static void main(String x[]){
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the number");
	  int n = sc.nextInt();
	  
	  int result = reverse(n);
	  System.out.println("Reverse Number :"+result);
  }
}
	  
	  