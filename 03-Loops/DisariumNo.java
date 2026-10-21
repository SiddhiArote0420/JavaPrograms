/* Write a Java program to check whether a given number is a Disarium number or not, and display all Disarium numbers up to n.
 A Disarium number is a number whose sum of its digits powered with their respective positions is equal to the number itself.
 Example: 135 is a Disarium number because 1¹ + 3² + 5³ = 1 + 9 + 125 = 135.
*/


import java.util.*;
public class DisariumNo
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		 System.out.println("Enter the Number");
		 int limit = ob.nextInt();
		 
		 
		 for(int num = 1;num <= limit;num++)
		 {
		 int temp = num;
		 int count =0;
		 while(temp !=0)
		 {
			 count++;
			 temp = temp/10;
		 }
		 
		 temp = num;
		 int sum =0;
		 while(temp!=0)
		 {  
			 int a = temp%10;
			 sum = sum+((int)(Math.pow(a, count)));
			 count--;
			 temp = temp/10;
		 } 
		 
		 if(sum == num)
		 {
			 System.out.println(num);
		 }
		 }
	}
}
			 
			 