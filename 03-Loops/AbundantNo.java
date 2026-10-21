/* Write a Java program to find all Abundant numbers up to n.
 An Abundant number is a number for which the sum of its proper divisors is greater than the number itself.
 Example: 12 is abundant because its proper divisors are 1, 2, 3, 4, 6 → sum = 16 > 12.*/
 
 import java.util.*;
 public class AbundantNo
 {
	 public static void main(String x[])
	 {
		 Scanner ob = new Scanner(System.in);
		 
		 System.out.println("Enter the number");
		 int limit = ob.nextInt();
		 
		 for(int num = 1; num <= limit; num++)
		 {
		 int sum =0;
		 for(int i=1; i <= num/2; i++)
		 {
			 
			 if(num % i ==0)
			 {
				sum+=i;
			 }
		 }
		 
		 if(sum > num)
		  System.out.println(num);
	     
		 }
	 }
 }	 