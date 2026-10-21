/*Write a java program to find all roots of a quadratic equation using if else. 
How to find all roots of a quadratic equation using if else in java programming.
 
Example
Input a: 8 ,  b: -4 , c: -2
Output Root1: 0.80
Root2: -0.30
*/

import java.util.*;
public class FindRootsQuadEqu
  {
	  public static void main(String x[])
	  {
		  Scanner quadraticEqu = new Scanner(System.in);
		  
		  System.out.println("Enter value of a :");
		  double a = quadraticEqu.nextDouble();
		  
		  System.out.println("Enter value of b :");
		  double b = quadraticEqu.nextDouble();
		  
		  System.out.println("Enter value of c :");
		  double c = quadraticEqu.nextDouble();
		  
		  double D = b*b-4*a*c;
		  System.out.println(D);

          double x1,x2;		  
		  
		  if(D > 0)
		  {
			  x1 = (-b + Math.sqrt(D))/(2*a);
			  x2 = (-b - Math.sqrt(D))/(2*a);
			  System.out.println("Root 1 = " + x1);
              System.out.println("Root 2 = " + x2);
		  }else if(D == 0)
		  {
			  x1 = -b/(2*a);
			  System.out.println("Root 1 = " + x1);
             
		  }else
		  {
			  /*x1 = -b/(2*a);
			  x2 = Math.sqrt(D)/(2*a);
			  System.out.println("Root 1 = " + x1);
              System.out.println("Root 2 = " + x2);*/
			  
			  System.out.println("Result is Imaginary");
		  }
		  
	  }
  }
		  
		  
	