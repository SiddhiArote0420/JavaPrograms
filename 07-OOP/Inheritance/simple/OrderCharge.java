 /*Create a base class Order with fields orderId and amount.
Subclass CODOrder adds a fixed delivery charge of ₹50.
Subclass OnlinePaymentOrder adds no delivery charge but gives 5% cashback.
 Write a program to calculate the final bill amount using overridden methods.
Explanation:
 Tests overriding with additional logic and conditional calculations in subclasses.*/
 
 import java.util.*;
 class Order{
	int id;
    int amount;

    Order(int id, int amount)
	{
        this.id = id;
        this.amount = amount;
	}

   void finalBill()
   {
       System.out.println("Final bill calculation not for base case");
   }	   
 }
 
 class CODOrder extends Order{
	CODOrder(int id, int amount)
	{
		super(id, amount);
	}
	
	void finalBill()
	{
		double charge = 50;
		System.out.println("Final bill of Cash on delivery Item is: "+ (amount+50));
	}
	
 }
 
 class OnlinePaymentOrder extends Order{
	OnlinePaymentOrder(int id, int amount)
	{
		super(id, amount);
	}

    void finalBill()
	{
		double chashBack = amount*0.05;
		System.out.println("Final bill of Cash on delivery Item is: "+ (amount - chashBack));
	}	
 }
 
 public class OrderCharge{
	 public static void main(String[] x)
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 // Cash on deilivary
		 System.out.println("Enter the Order Id ");
		 int id1 = sc.nextInt();
		 
		 System.out.println("Enter the Order Amount");
		 int amount1 = sc.nextInt();
		 
		 //online payment
		 System.out.println("Enter the Order Id ");
		 int id2 = sc.nextInt();
		 
		 System.out.println("Enter the Order Amount");
		 int amount2 = sc.nextInt();
		 
		 CODOrder c = new CODOrder(id1, amount1);
		 c.finalBill();
		 
		 OnlinePaymentOrder o = new OnlinePaymentOrder(id2, amount2);
		 o.finalBill();
		 
	 }
 }