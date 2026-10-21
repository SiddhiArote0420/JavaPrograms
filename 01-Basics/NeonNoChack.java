//Write a java program to check whether a number is neon or not. 

import java.util.*;
public class NeonNoChack
{
public static void main(String x[])
{
	Scanner neonNo = new Scanner(System.in);
	
	System.out.println("Enter the number :");
	int n = neonNo.nextInt();
	
	int squre = n*n;
	System.out.println("Squre is : "+squre);
	
	int add = (squre%10)+((squre/10)%10);
	System.out.println("Addition is : "+add);
	
	if (n == add)
	{
		System.out.println("Number is Neon");
	}else{
		System.out.println("Number is Not a Neon Number");
	}
}
}
	