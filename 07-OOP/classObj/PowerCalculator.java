/*Find Power of a Number
Create a class PowerCalculator with a method power that calculates base raised to an exponent.
Explanation: Demonstrates looping or recursion.*/

import java.util.*;
class PowerCalculator{
	public static int power(int base,int index)
	{
		int pow = 1;
		for(int i=1; i<=index ;i++)
		{ 
	       pow = pow * base;
		}
        return pow;
	}

    public static void main(String x[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the Base :");
    int base = sc.nextInt();

    System.out.println("Enter the index :");
    int index = sc.nextInt();
	
	int result = power(base,index);
	System.out.println("Power is :"+result);
	}
}
