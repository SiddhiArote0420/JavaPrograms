/*Write a java program to Check Number Is Spy Number or Not.
Example : A number is said to be a Spy number if the sum of all the digits is equal to the product of all digits.
*/

import java.util.*;
public class SpyNO
{
 public static void main(String x[])
 {
	 Scanner ob = new Scanner(System.in);
	 
	 System.out.println("Enter the Number :");
	 int num = ob.nextInt();
	 
	 int sum = 0, prod = 1,n;
	 while(num!=0)
	 {
		 n = num %10;
		 sum +=n;
		 prod *=n;
		 num = num/10;
	 }
		 if(sum == prod)
		 {
			 System.out.println("Number is Spy");
		 }else{
			 System.out.println("Number is Not a Spy");
		 }
		 
 }
}