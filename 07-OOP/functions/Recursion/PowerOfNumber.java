/*Write a program to calculate the power of a number (x^n) using recursion*/

import java.util.*;
public class PowerOfNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the base");
		int base = sc.nextInt();
		System.out.println("Enter the power");
		int power = sc.nextInt();
		
		int result = powNo(base , power);
		System.out.println("power is :"+result);
		
	}
	public static int powNo(int base, int pow)//return store honar  ex. 3^4 = 3*(5,4),3*(5,3),.....3*(5,0)
	                                         // LIFO 3*(5,0)=3 , 3*(5,1)=3*3=9, 3*(5,2)=3*9=27, 3*(3,3)=3*27=81
	{
     if (pow == 0){           
        return 1;
     } else {     
        return base * powNo(base, pow - 1);
     }
   }
}
 