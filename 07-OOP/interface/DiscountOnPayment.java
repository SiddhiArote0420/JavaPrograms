/*Q10. Payment Discount Logic
Concept: Interface + conditions
Rules:
Interface Payment
Method: payAmount(double amount)
Implementing classes:
CashPayment
CardPayment
Logic:
Cash → 5% discount if amount > 5000
Card → 2% discount if amount > 10000
Logic:
 Discount depends on payment method & amount.
*/

import java.util.*;
interface Payment{
  public void payAmount();
  
}

class CashPayment implements Payment{
   double amount;
   
    CashPayment(double amount)
	{
	  this.amount = amount;
	}
	
	public void payAmount()
	{
	   if(amount > 5000)
	   {
	      double discount = 0.05;
		  double disAmt = amount*discount;
		  
		  System.out.println("CashPayment discount is :"+(amount - disAmt));
		}else {
            System.out.println("Cash Payment Final Amount: " + amount);
        }
	}
}
class CardPayment implements Payment{
   double amount;
   
    CardPayment(double amount)
	{
	  this.amount = amount;
	}
	
	public void payAmount()
	{
	   if(amount > 10000)
	   {
	      double discount = 0.02;
		  double disAmt = amount*discount;
		  
		  System.out.println("CardPayment discount is :"+(amount - disAmt));
		}else {
            System.out.println("Card Payment Final Amount: " + amount);
        }
	}
}

public class DiscountOnPayment{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount");
		double amount = sc.nextDouble();
		
		System.out.println("Enter the which payment mode you prefare(1-Cash,2-Card)");
		int choice = sc.nextInt();
		
		Payment p;
		
		if(choice == 1)
		{
			p = new CashPayment(amount);
		}else if(choice == 2)
		{
			p = new CardPayment(amount);
		}else{
			System.out.println("Invalid input");
			return;
		}
		
		p.payAmount();
	}
}
