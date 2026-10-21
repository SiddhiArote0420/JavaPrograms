/*Bank Account System
Concepts Used: Abstract class, runtime polymorphism
 Operations:
Abstract class BankAccount
Fields: accountNo, balance
Abstract methods:
calculateInterest()
Child classes:
SavingsAccount → 4% interest
CurrentAccount → 2% interest
Add interest to balance
Display updated balance


Explanation:
 Abstract method ensures every account type defines its own interest rule.
*/

import java.util.*;
abstract class BankAccount{
	String accountNo;
	double balance;
	
	BankAccount(String accountNo, double balance)
	{
		this.accountNo = accountNo;
		this.balance = balance;
	}
	
	abstract void calculateInterest();
	
	public void displayUpdatedBalance(double balance)
	{
		System.out.println("Total balance is: "+ (balance));
	}
	
}

class SavingsAccount extends BankAccount{
	SavingsAccount(String accountNo, double balance)
	{
		super(accountNo, balance);
	}
	
	void calculateInterest(){
		double interest = 0.04;
		int time = 3;
		double calInterest = balance*interest*time;
		balance += calInterest;
		displayUpdatedBalance(balance);
	}
}

class CurrentAccount extends BankAccount{
	CurrentAccount(String accountNo, double balance)
	{
		super(accountNo, balance);
	}
	
	void calculateInterest(){
		double interest = 0.02;
		int time = 2;
		double calInterest = balance*interest*time;
	
         balance += calInterest;
		displayUpdatedBalance(balance);
	}
}

public class BankAccountApp{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Details of Account:");
		System.out.println("Enter Account number");
		String accountNo = sc.nextLine();
		
		System.out.println("Enter the balance");
		double balance = sc.nextDouble();
		
		//sc.nextLine();
		
		System.out.println("Enter Account Type (1-SavingsAccount , 2-CurrentAccount)");
		int choice = sc.nextInt();
		
		BankAccount b = null ;
		if(choice == 1)
		{
			b = new SavingsAccount(accountNo, balance);
		}else if(choice == 2){
			b = new CurrentAccount(accountNo, balance);
		}else{
			System.out.println("Invalid input");
		}
		
		 b.calculateInterest();
		 
		
	}
}
		
		