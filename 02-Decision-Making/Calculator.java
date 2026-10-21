/*Create a Java program to simulate a simple calculator using a switch case. It should take two numbers and an operator
 (+, -, *, /, %) as input and perform the corresponding operation.*/
 
 import java.util.*;
 public class Calculator
 {
	 public static void main(String x[])
	 {
		 Scanner createCalculator = new Scanner(System.in);
		 
		 System.out.println("Enter the First Number");
		 int n1 = createCalculator.nextInt();
		 
		 System.out.println("Enter the Second Number");
		 int n2 = createCalculator.nextInt();
		 
		 System.out.println("Enter the oprator");
		 char op = createCalculator.next().charAt(0);
		 
		 int result;
		 
		 switch(op)
		 {
		  case '+' :
		   result = n1 + n2;
		   System.out.println(result);
		   break;
		   
		   case '-' :
		    result = n1 - n2;
			System.out.println(result);
			break;
			
			case '*' :
		    result = n1 * n2;
			System.out.println(result);
			break;
			
			case '/' :
		    result = n1 / n2;
			System.out.println(result);
			break;
			
			case '%' :
		    result = n1 % n2;
			System.out.println(result);
			break;
			
			default:
                System.out.println("Invalid Input");
		 }	
         		 
	 }
 }