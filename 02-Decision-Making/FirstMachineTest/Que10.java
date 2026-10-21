/*Write a menu-driven program in java using switch case. 
            1. input any alphabet and check whether it is vowel or consonant. 
            2.Find the max number using 3 numbers. 
 3. input any number & check number is divisible by 5 & 11.*/
 
 import java.util.*;
public class Que10
{
 public static void main(String x[])
 {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("............Menu...........");
	 System.out.println("1. input any alphabet and check whether it is vowel or consonant." );
	 System.out.println("2. Find the max number using 3 numbers.");
	 System.out.println("3. input any number & check number is divisible by 5 & 11.");
	 
	 System.out.println("Enter Your choice");
	 int num = sc.nextInt();
	 
	 
	 switch(num)
	 {
		 case 1 :
		    System.out.println("Enter the Character");
	        char ch = sc.next().charAt(0);
			
			if( ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u')
			{
				System.out.println("it is vowel");
			}else
			{
				System.out.println("it is con sonant");
			}
			
			break;
			
			case 2 :
			System.out.println("Enter the First Number");
	        int num1 = sc.nextInt();
			System.out.println("Enter the 2nd Number");
	        int num2 = sc.nextInt();
	        System.out.println("Enter the 3rd Number");
	        int num3 = sc.nextInt();
			
			if(num1 > num2 && num1 > num3)
			{
				System.out.println(num1+" Is a max");
			}else if(num2 > num1 && num2 > num3)
			{
				System.out.println(num2+" Is a max");
			}else{
				System.out.println(num3+" Is a max");
			}
			break;
			
			case 3 :
			System.out.println("Enter the First Number");
	        num2 = sc.nextInt();
			
			if(num2 % 5 == 0 && num2 % 11 == 0)
			{
				System.out.println("is a divisible");
			}else{
				System.out.println("not divisible");
			}
	 }
 }
}
				
			
	 
	 