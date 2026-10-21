/*Q6. Create a BankAccount class with:
accountNumber
name
balance
Initialize these using a parameterized constructor.
Create a method withdraw(int amount) that checks:
Amount must be greater than 0
Amount must be <= balance
After withdrawal, update balance
If invalid → print message accordingly


Explanation:
You must apply multiple logical checks together:*/


import java.util.*;
class BankAccount{
   private int accountNumber;
   private String name;
   private double balance;
   
   BankAccount(int accountNumber,String name, double balance)
   {
	   this.accountNumber = accountNumber;
	   this.name = name;
	   this.balance = balance;
   }
   
   public void withdrawal(double withdrawalAmt)
   {
	   if(withdrawalAmt > 0 && withdrawalAmt <= balance)
	   {
		   System.out.println("Withdrawal amount succesfully");
		    System.out.println("Current balance is: "+ (balance - withdrawalAmt));
	   }else{
		    System.out.println(" Invalid amount / not sufficiant balance in your acount for withdraw");
	   }
   }
   

}

public class WithdrowAmt{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account number");
		int accountNumber = sc.nextInt();
		 sc.nextLine();
		
		System.out.println("Enter name");
		String name = sc.nextLine();
		
		System.out.println("Enter balance");
		double balance = sc.nextDouble();
		
		System.out.println("Enter how much amount you want to withdrow ");
		double withdrawalAmt = sc.nextInt();
		
		BankAccount b = new BankAccount(accountNumber, name, balance);
		b.withdrawal(withdrawalAmt);
	}
}
		
		