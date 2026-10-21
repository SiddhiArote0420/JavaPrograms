/* Create a class Product with:
Fields: productId, name, price, category


Constructors:


Default constructor (assign temporary values)
Parameterized constructor (assign all fields)
Task Logic:
Write a method getFinalPrice() that applies:


if category = "Electronics" → 18% GST + 10% discount
if category = "Clothing" → 5% GST + 20% discount
otherwise → only 5% GST


Create 3 objects using all three constructors and find the final price for each.
Expected Learning: Constructor chaining + conditional logic.*/


import java.util.*;
class Product{
     private int productId;
	 private String name;
	 private int price;
	 private String category;
	 
	 Product()
	 {
		 this(0, "Unknown", 0, "General");
	 }
	 
	 Product(int productId, String name, int price, String category)
	 {
		 this.productId = productId;
		 this.name = name;
		 this.price = price;
		 this.category = category;
	 }
	 
	 void getFinalPrice()
	 {
		 if(category.equalsIgnoreCase("Electronics"))
		 {
			float gst = price*0.18f;
			float discount = price*0.10f;
			
			float finalPrice = price+gst-discount;
			System.out.println("Final price is: "+finalPrice);
		 }else if(category.equalsIgnoreCase("Clothing"))
		 {
	        float gst = price*0.05f;
			float discount = price*0.20f;
			
			float finalPrice = price+gst-discount;
			System.out.println("Final price is: "+finalPrice);
		 }else{
			 float gst = price*0.05f;
			
			float finalPrice = price+gst;
			System.out.println("Final price is: "+finalPrice);
		 }
	 }	 
}
public class ProductPrice{
 public static void main(String[] x)
 {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter the product Id");
	 int productId = sc.nextInt();
	 sc.nextLine();
	 
	 System.out.println("Enter the Name of product");
	 String name = sc.nextLine();
	 
	 System.out.println("Enter the Price of product");
	 int price = sc.nextInt();
	 sc.nextLine();
	 
	 System.out.println("Enter the Catagory of product");
	 String category = sc.nextLine();
	 
	 Product p = new Product(productId, name, price, category);// parametrerise
	 p.getFinalPrice();
	 
	 Product p2 = new Product();// default 
     p2.getFinalPrice();
 }
 
}
	