/*Create a BankAccount class with:
accountNumber, holderName, balance, lastTransactionAmount


Parameterized constructor.
Logic Method: isFraudAlert()
 Return true when ANY condition matches:
lastTransactionAmount > 50% of balance
lastTransactionAmount > 50000
More than 3 transactions above ₹10,000 in a row (use an int counter passed to constructor)
balance suddenly dropped by more than 40% (use previousBalance passed to constructor)
Task:
 Create objects with different values.
 Check fraud alert result.
Expected Learning: Complex logical combinations (&&, ||), constructor usage, real-world reasoning.*/

import java.util.*;


class BankAccount{
   String accountNumber;
   String name;
   double balance;
   double lastTransactionAmount;
   int counter;
   double previousBalance;

   BankAccount(String accountNumber, String name, double balance, double lastTransactionAmount, int counter, double previousBalance)
   {
       this.accountNumber = accountNumber;
	   this.name = name;
	   this.balance = balance;
	   this.lastTransactionAmount = lastTransactionAmount;
	   this.counter = counter;
	   this.previousBalance = previousBalance;
	}
	
	boolean isFraudAlert(){
	      
		  return(lastTransactionAmount > (balance*0.50) || lastTransactionAmount > 50000 || counter > 3 || ((previousBalance - balance) > 0.40 * previousBalance));
	}
	
}

public class DetectFraud{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the accountNumber");
		String accountNumber = sc.nextLine();
		
		System.out.println("Enter the name of holder");
		String holderName = sc.nextLine();
		
		System.out.println("Enter the balance");
		double balance = sc.nextDouble();
		
		System.out.println("Enter the last Transaction Amount");
		double lastTransactionAmount = sc.nextDouble();
	
	    System.out.println("Enter the counter");
		int counter = sc.nextInt();
		
		System.out.print("Enter Previous Balance: ");
        double previousBalance = sc.nextDouble();
		
		BankAccount b = new BankAccount(accountNumber, holderName, balance, lastTransactionAmount, counter, previousBalance);
		boolean result = b.isFraudAlert();
		 if (result) {
            System.out.println(" FRAUD ALERT");
        } else {
            System.out.println(" Account is Safe");
        }
		
	}
}