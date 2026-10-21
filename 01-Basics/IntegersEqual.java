//Write a java program to accept two integers and check whether they are equal or not.

import java.util.*;
public class IntegersEqual
{
	public static void main(String x[])
	{
		Scanner checkEqual = new Scanner(System.in);
		
		System.out.println("Enter the two Integer : ");
		int n1 = checkEqual.nextInt();
		int n2 = checkEqual.nextInt();
		
		if(n1 == n2)
		{
			System.out.println("They are Equal");
		}else
		{
			System.out.println("They are not Equal");
		}
		
	}
}
		
