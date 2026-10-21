/*Simple Calculator using Functions
Write separate functions:
add(int a, int b)
subtract(int a, int b)
multiply(int a, int b)
divide(int a, int b)
Call them based on user choice.

*/

import java.util.*;
public class Simple_Calculator
{
  public static void main(String x[])
  {
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("Enter the two numbers for performming opration");
	  int a = sc.nextInt();
	  int b = sc.nextInt();
	  
	  System.out.println("......Enter Your choice......");
	  System.out.println("1 : Addition ");
	  System.out.println("2 : Subtraction ");
	  System.out.println("3 : Multiplication ");
	  System.out.println("4 : Division ");
	  
	  System.out.println("Enter Your choice");
	  int choice = sc.nextInt();
	  
	  int result=0;
	  switch(choice)
	  {
		  case 1 : 
		         result = addCal(a,b);
				 System.out.println("Adition is: "+result);
				 break;
		  case 2 : 
		         result = subCal(a,b);
				 System.out.println("Subtraction is: "+result);
				 break;
		  case 3 : 
		         result = mulCal(a,b);
				 System.out.println("Multiplication is: "+result);
				 break;
		  case 4 : 
		         
				 if(b!=0){
	                 result = divCal(a,b);
					 System.out.println("Division is: "+result);
	               }else{
		            System.out.println("not valid input");
				   }
		  default : 
		         System.out.println("Invalide Input");
				 break;
	  }
  }
  public static int addCal(int a, int b)
  {
	  return a+b;
  }
  public static int subCal(int a, int b)
  {
	  return a-b;
  }
  public static int mulCal(int a, int b)
  {
	  return a*b;
  }
  public static int divCal(int a, int b)
  {
	  return a/b;
  }
 }
	  
	  