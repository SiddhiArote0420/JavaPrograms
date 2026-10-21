/*Check Even or Odd
Create a class NumberChecker with a method isEven that checks if a number is even or odd.
*/

import java.util.Scanner;
public class NumberChecker{
	
	int n;//instance veriable
	
	 // Method to accept input
    void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = sc.nextInt();
	}
		
 void checkEvenOdd()
 {

   if(n%2 == 0)
   {
      System.out.println("It is a Even");
   }else{
	  System.out.println("It is Odd");
   }
 }
 
public static void main (String x[]){
	
  NumberChecker obj = new NumberChecker(); //create object

  obj.acceptInput();
  obj.checkEvenOdd();
}  
}