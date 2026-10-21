/* WAP to create class name as Factorial with two functions 
   void setNum(): this function can accept number as parameter 
   void showFactorial(): this function is used for calculate factorial of number and  display it
*/

import java.util.*;
class Factorial{
    int n;
	
	void setNum(int n){
	   this.n = n;
	 }
	 
	 void showFactorial(){
	    int fact =1;
	   for(int i=1; i<=n; i++)
	   {
	     fact *=i;
	   }
	   System.out.println("Factorial is: "+fact);
	 }
}

public class CalFactorial{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		Factorial f = new Factorial();
		f.setNum(n);
		f.showFactorial();
		
	}
}