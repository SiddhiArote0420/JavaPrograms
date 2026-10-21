/*Write a Java program to check whether a given number is a Harshad number (i.e., divisible by the sum of its digits)
 for numbers from 1 to n.
 Number = 18

Sum of digits = 1 + 8 = 9
18 ÷ 9 = 2 → No remainder → Harshad number
*/

import java.util.*;
public class HarshadNo
{
 public static void main(String x[])
 {
	 Scanner ob = new Scanner(System.in);
	 
	 System.out.println("Enter the number");
	 int num = ob.nextInt();
	 
	 int temp = num;
	 if(num >= 1)
	 {
		 int sum=0;
		 while(num!=0)
		 {
			 int a = num%10;
			 num = num/10;
			 sum = sum +a;
		 }
		 if(temp%sum==0)
		 {
			 System.out.println("It is Harshad Number");
		 }else
		 {
			 System.out.println("It is Not a Harshad Number");
		 }
	 }
 }
}