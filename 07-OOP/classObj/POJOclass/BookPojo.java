/*WAP to create POJO class name as Book with field id,name and price and we have to
create one more class name as Library and Library class contain two methods
void setBook(Book book)
void showBook()*/


import java.util.*;
class Book{
  private int id;
  private String name;
  private int price;
  
   public void setId(int id)
   {
	   this.id = id;
   }
   public int getId()
   {
	   return id;
   }
   
   public void setName(String name)
   {
	   this.name = name;
   }
   public String getName()
   {
	   return name;
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

class Library{
	Book book;
   void setBook(Book book){
	   this.book = book;
   }
   void showBook(){
	   System.out.printf("Book Id =%d\n Book Name =%s\n Book Price =%d\n", book.getId(), book.getName(), book.getPrice());
   }
}


public class BookPojo{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the id");
		int id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter the name of book: ");
		String name = sc.nextLine();
		
		System.out.println("Enter the Price");
		int price = sc.nextInt();
		
		Book b = new Book();
		b.setId(id);
		b.setName(name);
		b.setPrice(price);
		
		Library l = new Library();
		l.setBook(b);
		l.showBook();
	}
}
		
		

