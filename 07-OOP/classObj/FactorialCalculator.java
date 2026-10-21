/*Find Factorial of a Number
Create a class FactorialCalculator with a method findFactorial to compute the factorial of a number.
Explanation: Focuses on iterative or recursive logic.
*/

import java.util.*;
public class FactorialCalculator{
	int n;
	
	void inputAccept(){
		Scanner sc = new Scanner(System.in);
  
        System.out.println("Enter the Number");
        n = sc.nextInt();
	}

    void findFactorial(){
		
     int fact = 1;
     for(int i=1; i<=n ; i++)
	 {
  		fact = fact*i;
	 }
    System.out.println("Factorial is :"+fact);
	}

public static void main(String x[]){
 
     FactorialCalculator obj = new FactorialCalculator();
  
     obj.inputAccept();
     obj.findFactorial();
}
}  