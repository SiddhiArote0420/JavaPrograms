/* Implement a Calculator
Create a class Calculator with methods add, subtract, multiply, and divide for two numbers. Call them from the main method and print results.
Explanation: Teaches basic arithmetic operations using methods.
*/

import java.util.*;
class Calculator{
  
  public void add(int a, int b)
  {
     int c = a+b;
	 System.out.println("Addition of " +a+ " and "+b+ " is: "+c);
  }
  
  public void subtract(int a, int b)
  {
     int c = a-b;
	 System.out.println("Subtraction of " +a+ " and "+b+ " is: "+c);
  }
  
  public void multiply(int a, int b)
  {
     int c = a*b;
	 System.out.println("Multiplication of " +a+ " and "+b+ " is: "+c);
  }
  
  public void divide(int a, int b)
  { if(a!=0 && b!=0){
      int c = a/b;
	  System.out.println("Division of " +a+ " and "+b+ " is: "+c);
	  }else{
	    System.out.println("Invalid input");
	}
  }
  
  public void exit() {
    System.out.println("Exiting...");
    System.exit(0);
   }

  
 }
 public class CalculatorApp{
      public static void main(String[] args)
	  {
		  Scanner sc = new Scanner(System.in);
		  
		  while(true)
		  {
		  
		     System.out.println("==============MENU================");
		     System.out.println("1. Addition ");
		     System.out.println("2. Subtraction");
		     System.out.println("3. Multiplication");
		     System.out.println("4. Division");
		     System.out.println("0. Exit");
		  
		    System.out.println("Enter your choice");
		    int choice = sc.nextInt();
		  
		    Calculator c = new Calculator();
			  switch(choice){
				 case 1:
				    System.out.println("Enter the 2 values");
				    int a = sc.nextInt();
				    int b = sc.nextInt();
				    c.add( a, b);
				    break;
				 case 2:
				    System.out.println("Enter the 2 values");
				    a = sc.nextInt();
				    b = sc.nextInt();
				    c.subtract( a, b);
				    break;
				  case 3:
				    System.out.println("Enter the 2 values");
				    a = sc.nextInt();
				    b = sc.nextInt();
				    c.multiply( a, b);
				    break;
				  case 4:
				    System.out.println("Enter the 2 values");
				    a = sc.nextInt();
				    b = sc.nextInt();
				    c.divide( a, b);
				    break;
				  case 0 :
				    c.exit();
					break;
				  default:
				    System.out.println("Invalid Input");
					break;
			  }
		  }
				    
	  }
 }