// calculate total bill with tax and discount
// using scanner class

import java.util.*;
public class calTaxAndDis1
{
	public static void main(String x[])
	{
		Scanner Calbill = new Scanner(System.in);
		int orignalPrice,taxper,discountper,totalBill;
		
		System.out.println("Enter the Original prise : ");
		orignalPrice = Calbill.nextInt();
		
		System.out.println("Enter the Tax persentage : ");
		taxper = Calbill.nextInt();
		int taxAmount = taxper*orignalPrice/100;
		
		System.out.println("Enter the Descount persentage : ");
		discountper = Calbill.nextInt();
		int disAmount = discountper*orignalPrice/100;
		
		totalBill =(orignalPrice + taxAmount)-disAmount;
		
		System.out.println("Total Bill is : "+totalBill);
	}
}
		
		
		