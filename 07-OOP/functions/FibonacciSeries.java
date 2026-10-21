/*
Fibonacci Series (n terms)
Write a function printFibonacci(int n) that prints the first n terms of the Fibonacci series.
*/

import java.util.*;
public class FibonacciSeries
{
  public static void main(String x[])
  {
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  
	  printFibonacci(n);
	  
  }
  public static void printFibonacci(int n)
  {
	 int first = 0;
     int second =1;
     

     for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
	 }
      	
  }
}  