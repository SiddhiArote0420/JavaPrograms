/*
Write a menu-driven program using do-while and switch-case to perform operations on  a bank account balance (initial balance entered by user):
Deposit money.
Withdraw money (only if sufficient balance).
Check current balance.
Exit.
Program should repeatedly allow operations until exit.
*/

import java.util.*;
public class Bank_account
{    private static final String EXIT = "exit";
	public static void main(String x[ ])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your initial balance: ");
        int balance = sc.nextInt();
        System.out.println("Your account opened with balance: " + balance);
		
		String ch;
		do{
		    System.out.println("Can you perform Some oprations(yes/no)");
			ch = sc.next();
			 
			if(ch.equalsIgnoreCase("yes"))
			{
			System.out.println("......MENU......");
			System.out.println("1.Deposit money.");
			System.out.println("2.Withdraw money ");
			System.out.println("3. Check current balance.");
			System.out.println("4. Exit");
		
			System.out.println("Enter Your choice");
			int choice = sc.nextInt();
			
			int amount = 0;
			switch(choice)
			{
				case 1:
				    System.out.println("Enter Amount you want to Deposit");
					amount = sc.nextInt();
					
					if(amount > 0){
						System.out.println("Amount Deposite Successfully");
					}else{
						System.out.println("Invalid amount. Please Enter valid amount");
						continue;
					}
					balance = balance+amount;
					break;
					
				case 2 :
				    System.out.println("Enter Amount you want to Deposit");
					amount = sc.nextInt();
					
					if( balance >= amount ){
						System.out.println("Amount Withdrow Successfully");
					}else{
						System.out.println("In your acount not sufficeant balnce for withdrow(Enter valid amount)");
						continue ;
					}
					balance = balance - amount;
					break;
					
			    case 3 :
			        System.out.println("Your current balance is :"+balance);
					break;
				
                case 4:	
                    System.out.println("You Are Exit");
                    break;
					
				default :
                    System.out.println("Invalid Input");
                    break;	
			
			 }
		 }else{
				System.out.println("You are Exit");
				break;
		}
		}while(true);
	}
}