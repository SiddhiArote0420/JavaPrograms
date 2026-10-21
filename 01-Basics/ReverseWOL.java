//Write a Java program to reverse a number without using loop.
		//	Input a number: 123
		//	Reverse number: 321
		
/*public class ReverseWOL
{
	public static void main(String x[])
	{
		int num = Integer.parseInt(x[0]);
		//int num = 123;
		
		int num1 = num%10;
		num = num/10;
		
		int num2 = num%10;
		num = num/10;
		
		int num3 = num;
		
		int reverese = num1*100+num2*10+num3;
		
		
		System.out.printf("Reverse Number is:%d\n",reverese);
	}
}*/

import java.util.*;
public class ReverseWOL
{
	public static void main(String x[])
	{
		Scanner reverseNo = new Scanner(System.in);
		 
		 System.out.println("Emter 3 digit Number");
		 int num = reverseNo.nextInt();
		 
		 num = (num%10)*100 + ((num/10)%10)*10 + (num/100);
		 System.out.printf("Reverse Number is:%d",num);
	}
}