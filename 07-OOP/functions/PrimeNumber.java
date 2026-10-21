/*Check Prime Number
Write a function isPrime(int n) that checks if a number is prime or not.
Use it in main() to test different inputs.
*/

import java.util.*;
public class PrimeNumber
{
 public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Number ");
	int n = sc.nextInt();
	
	boolean result = isPrime(n);
	if(result)
	{
	   System.out.println("It is Prime");
	}else{
		System.out.println("Not Prime");
	}
  }
  public static boolean isPrime(int n)
  {
	   if (n <= 1) {
            return false; // 0 and 1 are not prime
        }
		
	  int count=0;
	  for(int i=2 ; i<=n/2 ; i++)
	  {
		  if(n%i==0)
		  {
			  count++;
		  }
	  }
	  return count==0 ;
  }
	      
}	
	
	