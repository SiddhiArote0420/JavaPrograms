/* Create a Product class with:
productName
stock
Use a constructor to set values.
 Create an array of 15 products.
 Write a method to count how many products have stock < 10.
Concepts Used:
 ✔ Constructor
 ✔ Array of objects
 ✔ Logical condition (stock < 10)
 ✔ Counter variable
Explanation:
 Loop through array, apply condition, increment count.
*/

import java.util.*;
class Product{
  private String productName;
  private int stock;
  private Product product[];
  
  Product(String productName, int stock)
  {
	  this.productName = productName;
	  this.stock = stock;
  }
  Product(Product[] product)
  {
	  this.product = product;
  }
  
  void countProcudt()
  {
	int count = 0;
    for(Product p : product)
	{
      if(p.stock < 10)
	  {
         count++;
	  }
	}
    System.out.println("Number of products with stock < 10 : "+count);
  }	
  
}

public class ProductStock{
  public static void main(String[] c)
  {
	  Scanner sc = new Scanner(System.in);
	  
	  Product p[] = new Product[4];
	
	  for(int i=0; i< p.length; i++)
	  {
	     System.out.println("Enter the Product name");
		 String productName = sc.nextLine();
		 
		 System.out.println("enter the stock");
		 int stock = sc.nextInt();
		 sc.nextLine();
		 
		 System.out.println();
		 p[i] = new Product(productName, stock);
	  }
	  
	  Product product = new Product(p);
	  product.countProcudt();
	  
  }
}