//Write a java program to accept two integers and check whether they are equal or not

import java.util.*;
public class EqualIntergersNo
{
	public static void main(String x[])
	{
		Scanner integersNo = new Scanner(System.in);
		
		System.out.println("Enter First number : ");
		int num1 = integersNo.nextInt();
		
		System.out.println("Enter second number : ");
		int num2 = integersNo.nextInt();
		
		String result = (num1 == num2)? " Number are equal" : "Number are not equal";
		System.out.println(result);
		
	}
}