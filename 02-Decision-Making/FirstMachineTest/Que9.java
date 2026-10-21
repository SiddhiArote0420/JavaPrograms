/*Create a Java program to simulate a simple calculator using a switch case. 
It should take two numbers and an operator (+, -, *, /, %) as input and perform 
the corresponding operation. 
 Explanation: 
 Use a switch on the operator to handle different arithmetic operations. Add  
default to handle invalid operators. */

import java.util.*;
public class Que9
{
 public static void main(String x[])
 {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the First Number");
	 int num1 = sc.nextInt();
	 
	 System.out.println("Enter the Second Number");
	 int num2 = sc.nextInt();
	 
	 System.out.println("Enter the Operator");
	 char ch = sc.next().charAt(0);
	 
	 int result = 0 ;
	 switch(ch)
	 {
		 case '+' :
		   result = num1+num2;
		   break;
		   
		   case '-' :
		   result = num1-num2;
		   break;
		   
		   case '*' :
		   result = num1*num2;
		   break;
		   
		   case '/' :
		    if(num1 > 0 && num2 >0 ){
		    result = num1/num2;
		    }else{
			   System.out.println( "Invalid input");
		    }
		   break;
		   
		   case '%':
		   if(num1 > 0 && num2 >0 ){
		    result = num1%num2;
		   }else{
			   System.out.println("Invalid input");
		   }
		   break;
		   
		   default :
		    System.out.println(" Invalid Operator(please enter (+, -, *, /, %))");
	 }
	 System.out.println(result);
 }
}
		   
		    