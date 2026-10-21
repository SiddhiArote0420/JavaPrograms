/*. Develop a program to simulate a basic banking menu:
 1: Deposit
 2: Withdraw
 3: Check Balance
 4: Exit
 Use a switch to handle user choice and print appropriate messages.
Explanation:
 Switch on user choice. Use variables for balance and update accordingly.*/
 
 import java.util.*;
 public class ATMSystem
 {
	 public static void main(String x[])
	 {
		 Scanner atmApp = new Scanner(System.in);
		 
		 System.out.println("Enter The Number (1-4)");
		 System.out.println("1: Deposit");
		 System.out.println("2: Withdraw");
		 System.out.println("3: Check Balance");
		 System.out.println(" 4: Exit");
		 
		 int n = atmApp.nextInt();
		 int totalBal = 10000;
		 int amount;
		 
		 switch(n)
		 {
			 case 1 :
			   System.out.println("Enter the Amout for Deposite");
			    amount = atmApp.nextInt();
			   if(amount > 0)
			   {
				  
				   totalBal= totalBal+amount;
				   System.out.println("Successfully Deposite Rs "+ amount);
				  
			   }else
			   {
				   System.out.println("Invalid Amount");
			   }
			   break;
			   
			  case 2 :
			   System.out.println("Enter the Amout for Withdraw");
			   amount = atmApp.nextInt();
			   if(amount > 0 && amount < totalBal)
			   {
				 totalBal= totalBal-amount;
				 System.out.println("Successfully Withdraw Rs "+ amount);
			   }else{
                 System.out.println("Insufficient balance or invalid amount.");
               }
                 break;

              	case 3 :
				 System.out.println("Total Balance : "+totalBal);
				 break;
				 
				 case 4 :
				  System.out.println("Succesfully Exit");
				  break ;
				  
				default:
                    System.out.println("Invalid choice. Please enter 1-4.");
					
		 }
	 }
 }
				  
				  
				