//Write a Java program to input cost price and selling price of a product and check profit or loss
// suding decisionmaking 


import java.util.*;
public class CheckProfitLoss
{
	public static void main(String x[])
	{
		Scanner profitLoss = new Scanner(System.in);
		
		System.out.println("Enter the cost prise : ");
		int costPrice = profitLoss.nextInt();
		
		System.out.println("Enter the selling prise : ");
		int sellingPrice = profitLoss.nextInt();
		
		//int profit = sellingPrice - costPrice;
		//int loss = costPrice - sellingPrice;
		
		if(sellingPrice > costPrice)
		{
		  System.out.println("Profit");
        }else
		{
		  System.out.println("loss");
		} 
		
		
	}
}