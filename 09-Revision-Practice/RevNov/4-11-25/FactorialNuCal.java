/* Write program to create class name as Factorial with two functions
       void setValue(int x): this function accept number as parameter
      int getFactorial(): this function can calculate factorial of number and return it.
*/

import java.util.*;
public class FactorialNuCal
 {
	 public static void main(String x[])
	 {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		Factorial fact = new Factorial();
		fact.setValue(num);
		int result =fact.getFactorial();
		 System.out.println("Fcatorial is: "+result);
		
	 }
 }
 class Factorial{
	 private int n;
	 
	 void setValue(int n)
	 {
		 this.n = n;
	 }
	 
	 public int getFactorial()
	 {
		 int sum = 1;
		 for(int i=1; i<=n; i++)
		 {
			sum = sum*i;
		 }
		 return sum;
	 }
 }
 
	 