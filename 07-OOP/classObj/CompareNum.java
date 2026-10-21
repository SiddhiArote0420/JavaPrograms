/*Compare Two Numbers
Create a class NumberComparison with a method compare that checks if two numbers are equal, greater, or less.
*/

import java.util.Scanner;
class CompareNum{
	
	int num1 , num2 ;
	
	void inputAccept(){
		 Scanner sc = new Scanner(System.in);
   
          System.out.println("Enter the First Number");
          num1 = sc.nextInt();
   
          System.out.println("Enter the First Number");
          num2 = sc.nextInt();
	}
 // Method to compare two numbers
    void compareNo() {
        if (num1 == num2) {
            System.out.println("Both numbers are equal");
        } else if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num1 + " is less than " + num2);
        }
    } 
	
 
 public static void main(String x[])
 {
	CompareNum obj = new CompareNum();
  
   obj.inputAccept();
   obj.compareNo();
   
    
}
}

   