/* Write program to create class name as Factorial with two functions
 void setValue(int x): this function accept number as parameter
 int getFactorial(): this function can calculate the factorial of a number and return it.
*/

import java.util.*;
class Factorial{
	int n, fact;
	void setValue(int x){
	   this.n = x;
	}
	int getFactorial(){
		if (n < 0) {
        System.out.println("Factorial is not defined for negative numbers.");
        return -1;
       }
	   fact = 1;
		for(int i=1; i<= n; i++)
		{
			fact = fact*i;
		}
		return fact;
	}		
}

public class FactorialPrint{
	public static void main(String [] x)
	{
	   Scanner sc = new Scanner(System.in);
        
       System.out.println("Enter the Number:");
       int n = sc.nextInt();

       Factorial obj = new Factorial();
       obj.setValue(n);
       int result = obj.getFactorial();
        
       System.out.println("Factorial is: "+ result);		
	}
}