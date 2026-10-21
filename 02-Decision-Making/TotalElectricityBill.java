/*Write a java program to input electricity unit charges & calculate total electricity bill according to the given condition
                	For first 50 units Rs. 0.50/unit
                	For next 100 units Rs. 0.75/unit
                	For next 150 units Rs. 1.20/unit
                	For unit above 250 Rs. 1.50/unit
 An additional surcharge of 20% is added to the bill.
*/

import java.util.*;
public class TotalElectricityBill
{
	public static void main(String x[])
	{
		Scanner electricityBill = new Scanner(System.in);
		
		System.out.println("Enter the Electricity Unit :");
		int eleUnit = electricityBill.nextInt();
		double bill;
		
		if(eleUnit >= 0 && eleUnit <= 50)
		{
			 bill = 0.50*eleUnit;
        }else if(eleUnit > 50 && eleUnit <= 100)
		{
             bill = 0.75*eleUnit;
        }else if(eleUnit > 100 && eleUnit <= 150)
		{
             bill = 1.20*eleUnit;	
        }else if(eleUnit >250)
		{
			 bill = 1.50*eleUnit;	
		}else {
            System.out.println("Invalid unit value.");
            return;
        }
		double surcharge = (20/100.0)*bill;
		double total = bill+surcharge;
		System.out.println("surcharge is :"+surcharge);
		System.out.println("Total bill is :"+total);
	}
}