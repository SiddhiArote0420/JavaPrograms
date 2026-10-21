/* Compare Two Numbers
Create a class NumberComparison with a method compare that checks if two numbers are equal, greater, or less.
Explanation: Introduces conditional statements in a method.
*/

import java.util.*;
class NumberComparison{
  
    public void compare(int a, int b)
	{
	  if(a > b){
	     System.out.println(a+" is a Greater");
	  }else if(b > a){
	     System.out.println(b+" is a Greater");
	  }else{
	     System.out.println("Both are equal");
	  }
	}

}
public class CompareNo{
   public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 2 values");
	    int a = sc.nextInt();
		int b = sc.nextInt();	

        NumberComparison c = new NumberComparison();
        c.compare(a,b);
		
   }
}   