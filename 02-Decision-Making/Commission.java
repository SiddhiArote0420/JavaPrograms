/* Calculate commission based on sales amount:
Input: Sales amount
Logic:
Sales < 5000 → 2% commission
Sales 5000–10000 → 5% commission
Sales > 10000 → 10% commission
Output: Display commission amount.
*/

import java.util.*;
public class Commission
{
	public static void main(String x[])
	{
		Scanner calCommisstion = new Scanner(System.in);
		
		System.out.println("Enter sale amount : ");
		int saleAmount = calCommisstion.nextInt();
		
		int commission;
		
		if( saleAmount < 5000){
			 commission = saleAmount/100*2;
		}else if(saleAmount >= 5000 && saleAmount <=10000){
			 commission = saleAmount/100*5;
		}else {
			 commission = saleAmount/100*10;
		}
		System.out.println("Commission is : "+commission);
	}
}