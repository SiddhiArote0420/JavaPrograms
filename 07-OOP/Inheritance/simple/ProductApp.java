/* Question:
 Create a base class Product with fields id, name, and price. Create subclasses Electronics (10% discount) and Clothing (20% discount).
 Write a program to calculate and print final prices after applying discounts.
 Explanation:
 This tests constructor chaining and method overriding for price calculation.

*/

class Product{
  int price;
  
  Product(int price)// use constructor
  {
	  this.price = price;
  }
  
  void finalPriceCal(){
	  System.out.println("Price calculation not defined for base class");
  }

}
class Electronics extends Product{// inheritance
	Electronics(int price){
		super(price);
	}
	
   double discount = 10;
   void finalPriceCal(){//method overrring
	   double fPrice = price - (price * discount) / 100;
	   System.out.println("Electronics product final price: "+fPrice);
   }
}
 


class Clothing extends Product{// inheritance
	Clothing(int price)
	{
		super(price);
	}
		
    double discount = 20;
   void finalPriceCal(){  // method overring
	   double fPrice = price - (price * discount) / 100;
	   System.out.println("Clothing  product final price: "+fPrice);
   }
}

public class ProductApp{
 public static void main(String[] args)
 {
    Electronics e = new Electronics(3000);
	e.finalPriceCal();
	
	Clothing c = new Clothing(4000);
	c.finalPriceCal();
	
 }
}