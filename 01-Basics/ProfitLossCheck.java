//Write a Java program to input cost price and selling price of a product and check profit or loss.


import java.util.*;
public class ProfitLossCheck
{
	public static void main(String x[])
	{
		Scanner profitLoss = new Scanner(System.in);
		
		System.out.println("Enter the cost prise : ");
		int costPrice = profitLoss.nextInt();
		
		System.out.println("Enter the selling prise : ");
		int sellingPrice = profitLoss.nextInt();
		
		int profit = sellingPrice - costPrice;
		int loss = costPrice - sellingPrice;
		
		String result = (sellingPrice > costPrice)? "Profit" : "loss";
		
		System.out.println(result);
	}
}