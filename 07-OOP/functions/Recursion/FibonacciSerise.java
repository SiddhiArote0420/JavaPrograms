/*Write a program to print the first n Fibonacci numbers using recursion.*/


import java.util.*;
public class FibonacciSerise
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
		
		System.out.println("Fibonacci series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
     
    
	
    private static int fibo(int n) {
        if (n == 0)                      
            return 0 ;
		if (n == 1)
			return 1;
        
        return fibo(n-1)+fibo(n-2);
    }
}
