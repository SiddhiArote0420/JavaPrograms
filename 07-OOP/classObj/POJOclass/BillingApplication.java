/*Suppose consider we are working on billing Application and we have following types of classes 
1. Product with field id,name and price and it is POJO class 
2. Customer with field id, name address,email , contact and it is POJO class
3. Shop with following methods 
void storeProducts(Customer c,Product …p): this method can accept infinite product list
void calBill(): this method can calculate bill with grand total and your output should be 
*/

import java.util.*;
class Product {
  private int id;
  private String name;
  private int price;
  
   void setId(int id) { this.id = id; }
   int getId(){ return id; }
	
	void setName(String name){  this.name = name; }
	String getName(){ return name; }
	 
	void setPrice(int price){ this.price = price; }
    int getPrice(){ return price; }
  
}

class Customer{
     private int id;
     private String name;
     private String address;
	 private String email;
	 private String contact;
	 
	 void setId(int id) { this.id = id; }
   int getId(){ return id; }
	
	void setName(String name){  this.name = name; }
	String getName(){ return name; }
	
	void setAddress(String address) { this.address = address; }
    String getAddress(){ return address; }
	
	void setEmail(String email){  this.email = email; }
	String getEmail(){ return email; }
	
	void setContact(String contact){  this.contact = contact; }
	String getContact(){ return contact; }
}
 
class Shop{
	Scanner sc = new Scanner(System.in);
	Customer c;
    Product p[];
	void storeProducts(Customer c,Product ...p)
	{
		this.c = c;
		this.p = p;
	}
	
	void calBill(){
   
     System.out.println("..........Customer detail...........");
	 System.out.println("Customer Id: "+ c.getId());
	 System.out.println("Customer Name: "+ c.getName());
	 System.out.println("Customer Address: "+ c.getAddress());
	 System.out.println("Customer Email: "+ c.getEmail());
	 System.out.println("Customer Contact: "+ c.getContact());
	 
	 System.out.println("...........Your purchase product..........");
	 for(Product i : p)
	 {
		System.out.println("Product Id: "+ i.getId());
	    System.out.println(" Product Name: "+ i.getName());
	    System.out.println(" Product price: "+ i.getPrice()); 
		System.out.println();
	 }
	 
	 int subTotal = 0;
	 for(Product i : p)
	 {
		 subTotal = subTotal + i.getPrice();
	 }
	 
	 double  gst = subTotal*0.18;
	 System.out.println("Enter the  service charge");
	 int seviceFee = sc.nextInt();
	 
	 double grandTotal = (subTotal+gst+seviceFee);
	 System.out.println("Grand Total is: "+grandTotal);
	 
	 
}
}

public class BillingApplication{
 public static void main(String[] x)
 {
	 Scanner sc = new Scanner(System.in);
	 
	 Customer c = new Customer();
	 // --------Class input----------
	    System.out.print("Enter Customer ID: ");
        c.setId(sc.nextInt());

        sc.nextLine(); 

        System.out.print("Enter Customer Name: ");
        c.setName(sc.nextLine());

        System.out.print("Enter Address: ");
        c.setAddress(sc.nextLine());

        System.out.print("Enter Email: ");
        c.setEmail(sc.nextLine());

        System.out.print("Enter Contact: ");
        c.setContact(sc.nextLine());

        // -----------Product Input ----------------
        System.out.print("How many products you want to purchase? ");
        int n = sc.nextInt();

        Product[] p = new Product[n];

        for (int i = 0; i < n; i++) {
            p[i] = new Product();

            System.out.println("\nEnter details for Product " + (i+1));

            System.out.print("Product ID: ");
            p[i].setId(sc.nextInt());

            sc.nextLine(); // clear buffer

            System.out.print("Product Name: ");
            p[i].setName(sc.nextLine());

            System.out.print("Product Price: ");
            p[i].setPrice(sc.nextInt());
        }

        Shop s = new Shop();
		s.storeProducts(c, p);
		s.calBill();
 }
}
	 
	 