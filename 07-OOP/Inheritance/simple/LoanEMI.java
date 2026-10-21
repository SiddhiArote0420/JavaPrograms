/* Create a base class Loan with fields amount and years.
HomeLoan has interest rate of 7%.
CarLoan has interest rate of 9%.
 Write a program to calculate and print EMI for both loans.
Explanation:
 Tests inheritance with customized formula calculations.
*/

import java.util.*;
class Loan{

   double amount;
   int year;
   
   Loan(double amount, int year)
   {
     this.amount = amount;
	 this.year = year;
   }
   
   void calculateEMI()
   {
      System.out.println("EMI not for base case");
   
   }
}

class HomeLoan extends Loan{
   HomeLoan(double amount, int year)
   {
     super(amount, year);
   }
   
  void calculateEMI() {

    double rate = 7.0;          // 7% annual interest
    double monthlyRate = rate / 12 / 100;
    int months = year * 12;

    // Calculate (1 + monthlyRate)^months manually
    double power = 1.0;
    for (int i = 1; i <= months; i++) {
        power = power * (1 + monthlyRate);
    }

    // EMI formula without Math.pow()
    double emi = (amount * monthlyRate) /
                 (1 - (1 / power));

    System.out.println("Home Loan EMI: " + emi);
  }
}

class CarLoan extends Loan{
       CarLoan(double amount, int year)
       {
           super(amount, year);
       }
   
  void calculateEMI() {

    double rate = 9.0;          // 7% annual interest
    double monthlyRate = rate / 12 / 100;
    int months = year * 12;

    // Calculate (1 + monthlyRate)^months manually
    double power = 1.0;
    for (int i = 1; i <= months; i++) {
        power = power * (1 + monthlyRate);
    }

    // EMI formula without Math.pow()
    double emi = (amount * monthlyRate) /
                 (1 - (1 / power));

    System.out.println("Home Loan EMI: " + emi);
   }
}

 public class LoanEMI{
  public static void main(String[] x)
  {
     Scanner sc = new Scanner(System.in);
	 
	 //Home loan
	 System.out.println("Enter the Amount of Home  loan");
	 double amount = sc.nextDouble();
	 
	 System.out.println("Enter the Home Year");
	 int year = sc.nextInt();
	 
	 //Car loan 
	 System.out.println("Enter the Amount of Car  loan");
	 double amount1 = sc.nextDouble();
	 
	 System.out.println("Enter the Car Year");
	 int year1 = sc.nextInt();
	 
	 HomeLoan h = new HomeLoan(amount, year);
	 h.calculateEMI();
	 
	 CarLoan c = new CarLoan(amount1, year1);
	 c.calculateEMI();
  }
 }
	 