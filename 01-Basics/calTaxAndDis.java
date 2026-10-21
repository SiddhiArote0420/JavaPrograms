// calculate total bill with tax and discount

public class calTaxAndDis
{
	public static void main(String x[])
	{
		int orignalPrice = Integer.parseInt(x[0]);
		
		int taxper = Integer.parseInt(x[1]);
		int taxAmount = taxper*orignalPrice/100;
		
		int discountper = Integer.parseInt(x[2]);
		int dicAmount = discountper*orignalPrice/100;
		
		int totalBill =(orignalPrice + taxAmount)- dicAmount;
		
		System.out.println("Total Bill is : "+totalBill);
	}
}
		
		
		