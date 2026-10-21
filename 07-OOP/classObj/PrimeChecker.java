/* Check for Prime Numbers
Create a class PrimeChecker with a method isPrime to check if a number is prime.
Explanation: Introduces number theory logic.
*/

import java.util.*;
public class PrimeChecker{
	public static boolean isPrime(int n){
		
		int count = 0,i=2;
		while(i <= n/2)
		{
			if(n%i==0)
				count++;
			i++;
		}
		
		if(count == 0)
		{
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number ");
		int n = sc.nextInt();
		
		isPrime(n);
		
		if(isPrime(n)){
			System.out.println("Number is prime");
		}else{
			System.out.println("Number is Not prime");
		}
	}
}