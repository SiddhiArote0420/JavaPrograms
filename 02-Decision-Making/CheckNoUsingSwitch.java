/*Write a menu-driven program in java using switch case.
           	1.Check Number is positive , negative or zero.
           	2.Check Number is even or odd.
           	3.Write a c program to find the max number using 2 numbers.

*/

import java.util.*;
public class CheckNoUsingSwitch
{
	public static void main(String x[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("...........MENU..........");
		System.out.println("1.Check Number is positive , negative or zero.");
		System.out.println("2.Check Number is even or odd.");
		System.out.println("3.Write a c program to find the max number using 2 numbers");
		
		System.out.println("Enter Your choice");
		int n = ob.nextInt();
		
		
		
		
		switch (n)
		{   
		     case 1:
		        System.out.println("Enter the number");
				int n1 = ob.nextInt();
				
			    if(n1 > 0){
				   System.out.println("The number is Positive");
			    }else if(n1 < 0){
				   System.out.println("The number is Negative");
			    }else {
				   System.out.println("The number is Zero");
			    }
			 break;
			 
			 case 2:
		        System.out.println("Enter the number");
				n1 = ob.nextInt();
				
			    if(n1 % 2 == 0){
				   System.out.println("The number is Even");
			    }else {
				   System.out.println("The number is Odd");
			    }
			 break;
			 
			 case 3:
			    System.out.println("Enter the first number");
				n1 = ob.nextInt();
				System.out.println("Enter the second number");
				int n2 = ob.nextInt();
				
			    if(n1 > n2){
				   System.out.println(n1+" is a Max Number");
				}else {
					System.out.println(n2+" is a Max Number");
				}
				break;
			 
			default:
			  System.out.println("Invalid input");
			  
		}
	}
} 