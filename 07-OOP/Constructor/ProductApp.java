/*Create a Product class having fields productName and price.
 Initialize using a constructor.
 Write a method isDiscountEligible() that returns true if price > 500, else false.
 In main, print which products get discount.
Concepts Used:
 ✔ Constructor to set values
 ✔ Logical operator (>)
 ✔ Returning boolean
*/

import java.util.*;
class Product{
 private String productName;
 private float price;
 
 Product(String productName, float price)
  {
   this.productName = productName;
   this.price = price;
  }
  
  public boolean isDiscountEligible(){
     if(price > 500)
	    return true;
	  else
	    return false;
		
	}
  
}
public class ProductApp{
 public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter the name of product");
   String name = sc.nextLine();
   
   System.out.println("Enter the price of product");
   float price = sc.nextFloat();
   
   Product p = new Product(name, price);
   boolean result = p.isDiscountEligible();
   
   if(result){
    System.out.println("you get discount");
   }else{
    System.out.println("you dont get discount");
   }
   
 }
 }