/*Create a base class Product with fields id, name, and price. Create subclasses Electronics (10% discount) and Clothing (20% discount).
 Write a program to calculate and print final prices after applying discounts.
 Explanation:
 This tests constructor chaining and method overriding for price calculation.

*/

import java.util.*;
class Product{
   int id ;
   String name;
   double price;
  
    Product(int id, String name , double price)
	{
	  this.id = id;
	  this.name = name;
	  this.price = price;
	}
	
	void calDescount(){
	    System.out.println("Discount not calculate for base case");
	}
	
}

class Electronics extends Product{
    Electronics(int id, String name , double price)
	{
		super(id, name, price);
	}

    void calDescount(){
		double discount = price*0.10;
		double finalPrice = price - discount;
		System.out.println("final price of the "+name+ " is: "+finalPrice);
	}
}

class Clothing extends Product{

     Clothing(int id, String name , double price)
	 {
		 super(id, name, price);
	 }
	 
	 void calDescount(){
		double discount = price*0.20;
		double finalPrice = price - discount;
		System.out.println("final price of the "+name+ " is: "+finalPrice);
	}
}

public class ProductDiscount{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		// ele item
		System.out.println("Enter id of Electronics item");
		int idE = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter name of Electronics item");
		String nameE = sc.nextLine();
		
		System.out.println("Enter price of Electronics item");
		double priceE = sc.nextDouble();
		sc.nextLine();
		
		//clothing item
		System.out.println("Enter id of Clothing item");
		int idC = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter name of Clothing item");
		String nameC = sc.nextLine();
		
		System.out.println("Enter price of Clothing item");
		double priceC = sc.nextDouble();
		sc.nextLine();
		
		Electronics e = new Electronics(idE, nameE, priceE);
		e.calDescount();
		
		Clothing c = new Clothing(idC, nameC, priceC);
		c.calDescount();
	}
}
		
