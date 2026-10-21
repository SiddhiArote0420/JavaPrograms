 /*  Create a class Ticket with method calculatePrice().
MovieTicket has 18% GST.
BusTicket has 5% GST.
 Print ticket price including tax using overridden methods.
Explanation:
 Tests method overriding with percentage-based calculations.
*/

import java.util.*;
class Ticket{
	double price;
	
	Ticket(double price)
	{
		this.price = price;
	}
	
	void calculatePrice(){
		System.out.println("Price calculation not for base case");
	}
	
}

class MovieTicket extends Ticket{
	MovieTicket(double price)
	{
       super(price);
	}
	
	void calculatePrice(){
		double gst = 0.18;
		double totalPrice = price+(price*gst);
		System.out.println(" Your ticket price with GST is: "+ totalPrice);
	}
}

class BusTicket extends Ticket{
	BusTicket(double price)
	{
       super(price);
	}
	
	void calculatePrice(){
		double gst = 0.05;
		double totalPrice = price+(price*gst);
		System.out.println(" Your ticket price with GST is: "+ totalPrice);
	}
}

public class TicketBooking{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		// Movie Ticket
		System.out.println("Enter the price of Movie Ticket: ");
		double price1 = sc.nextDouble();
		
		// Bus Ticket
		System.out.println("Enter the price of Bus Ticket: ");
		double price2 = sc.nextDouble();
		
		MovieTicket m = new MovieTicket(price1);
		m.calculatePrice();
		
		BusTicket b = new BusTicket(price2);
		b.calculatePrice();
		
	}
}