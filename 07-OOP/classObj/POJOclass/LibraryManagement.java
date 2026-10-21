/*1. Library Book Management
Task:
 Create a Book class with fields: title, author, and price.
 In the main method:
Create two individual Book objects.
Compare the prices of the two books and print the title of the more expensive book.
Explanation:
 This task teaches object instantiation and accessing instance variables directly to perform comparisons.
*/

import java.util.*;
class Book{
  private String title,author;
  private int price;
  
  /*public void getInput(String title, String author,int price)
  {
	  this.title = title;
	  this.author = author;
	  this.price = price;  
  }*/
  
  public void setTitle(String title)
  {
	  this.title = title;
  }
  public String getTitle()
  {
	 return title;
  }
  public void setAuthor(String author)
  {
	  this.author = author;
  }
  public String getAuthor()
  {
	 return author;
  }
  public void setPrice(int price)
  {
	 this.price = price;  
  }
  public int getPrice()
  {
	 return price;
  }
  
   
}

public class LibraryManagement{
	public static void main(String [] x)
	{
		Scanner sc = new Scanner(System.in);
		
		// --- First Book ---
		System.out.println("Emter the First book Title: ");
		String title1 = sc.nextLine();
		
		System.out.println("Enter the First book Author Name: ");
		String author1 = sc.nextLine();
		
		System.out.println("Enter the First book Price: ");
		int price1 = sc.nextInt();
		sc.nextLine();
		
		Book obj1 = new Book();
		obj1.setTitle(title1);
        obj1.setAuthor(author1);
        obj1.setPrice(price1);
		
		// --- Second Book ---
		System.out.println("\nEnter the title of second book:");
        String title2 = sc.nextLine();

        System.out.println("Enter the author of second book:");
        String author2 = sc.nextLine();

        System.out.println("Enter the price of second book:");
        int price2 = sc.nextInt();

        Book obj2 = new Book();
        obj2.setTitle(title2);
        obj2.setAuthor(author2);
        obj2.setPrice(price2);
		
		// --- Compare prices ---
        if (obj1.getPrice() > obj2.getPrice()) {
            System.out.println("\nMore expensive book: " + obj1.getTitle());
        } else if (obj2.getPrice() > obj1.getPrice()) {
            System.out.println("\nMore expensive book: " + obj2.getTitle());
        } else {
            System.out.println("\nBoth books have the same price!");
     }
		}
}
