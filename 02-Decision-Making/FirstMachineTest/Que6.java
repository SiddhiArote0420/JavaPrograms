/*Calculate commission based on sales amount: 
• Input: Sales amount 
• Logic: 
o Sales < 5000 → 2% commission 
o Sales 5000–10000 → 5% commission 
o Sales > 10000 → 10% commission 
• Output: Display commission amount.*/

import java.util.*;
public class Que6
{
 public static void main(String x[])
 {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the Sales Amount");
	 int amt = sc.nextInt(); 
	 
	 int commission;
	 if( amt >=0 && amt < 5000)
	 {
		 commission = (amt/100)*2;
	 }else if(amt >= 5000 && amt <= 10000)
	 {
		 commission = (amt/100)*5;
	 }else
	 { 
         commission = (amt/100)*10;
	 }
	 System.out.println("Commission is : "+commission);
 }
}
		 