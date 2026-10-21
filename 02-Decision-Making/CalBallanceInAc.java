/*
Q46. Pooja would like to withdraw X $US from an ATM. The cash machine will only accept the transaction if X is a multiple of 5, and Pooja's account balance has enough cash to perform the withdrawal transaction (including bank charges). For each successful withdrawal the bank charges 0.50 $US.
Calculate Pooja's account balance after an attempted transaction.
*/

import java.util.*;
public class CalBallanceInAc
{
   public static void main(String x[])
   {
	   Scanner remainBalnce = new Scanner(System.in);
	   
	   System.out.println("Enter Total balnce :");
	   int totalBalnce = remainBalnce.nextInt();
	   
	   System.out.println("Enter Withdraw Amount :");
	   int withdraw = remainBalnce.nextInt();
	   
	   double remainbal;
	   
	   if(withdraw%5==0)
	   {
		  if(0< withdraw && withdraw <= totalBalnce )
		  {
			  remainbal = totalBalnce - (withdraw+0.5);
			  System.out.println("Total balance Remain : "+remainbal);
			  
		  }else
		  System.out.println("You are not able to Withdraw");
	   }
   }
}
	   