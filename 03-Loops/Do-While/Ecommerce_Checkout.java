/* E-commerce Checkout Simulation**

**Description:**

* Display a list of items with prices.
* Use a do-while loop to let the user keep adding items to the cart until they type "checkout".
* If they type "skip", use **continue** to skip adding that item.
* On checkout, print the total and exit the loop.
*/


import java.util.*;
public class Ecommerce_Checkout
{    
    private static final String SKIP_COMMAND = "Skip";
	private static final String CHECKOUT_COMMAND ="checkout";
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int totalBill = 0, itemsNo=0;
		
		String input=" ";
		do{
			System.out.println(".........Menu........");
			 System.out.println("1. Earbud's for Rs.2000");
            System.out.println("2. SmartWatch for Rs.4000");
            System.out.println("3. Laptop for Rs.50000");
            System.out.println("4. Pendrive for Rs.2000");
            System.out.println("5. Keyboard for Rs.1500");
            System.out.println("Type 'checkout' to finish or 'skip' to skip an item.");

			System.out.println("Enter Your Choice :");
			String choice = sc.next();
			  if(choice.equalsIgnoreCase(SKIP_COMMAND))
						continue;
					
			int choice1 = Integer.parseInt(choice);
			
			switch(choice1){
				case 1: 
				    System.out.println("You are choseing Earbud's");
					System.out.println("How many Earbud's you want to buy :");
					input = sc.next();
					if(input.equalsIgnoreCase(SKIP_COMMAND))
						continue;
					
					itemsNo = Integer.parseInt(input);
					totalBill = totalBill+(2000*itemsNo);
					break;
					
				case 2: 
				    System.out.println("You are choseing SmartWatch");
					System.out.println("How many SmartWatch you want to buy :");
					input = sc.next();
					if(input.equalsIgnoreCase(SKIP_COMMAND))
						continue;
					
					itemsNo = Integer.parseInt(input);
					totalBill = totalBill+(4000*itemsNo);
					break;
				case 3: 
				    System.out.println("You are choseing laptop");
					System.out.println("How many laptop you want to buy :");
					input = sc.next();
					if(input.equalsIgnoreCase(SKIP_COMMAND))
						continue;
					
					itemsNo = Integer.parseInt(input);
					totalBill = totalBill+(50000*itemsNo);
					break;
					
				case 4: 
				    System.out.println("You are choseing pendrive");
					System.out.println("How many pendrive you want to buy :");
					input = sc.next();
					if(input.equalsIgnoreCase(SKIP_COMMAND))
						continue;
					itemsNo = Integer.parseInt(input);
					
					totalBill = totalBill+(2000*itemsNo);
					break;
					
				case 5: 
				    System.out.println("You are choseing keyBoard");
					System.out.println("How many keyBoard you want to buy :");
					input = sc.next();
					if(input.equalsIgnoreCase(SKIP_COMMAND))
						continue;
					itemsNo = Integer.parseInt(input);
					
					totalBill = totalBill+(1500*itemsNo);
                    break;
			
			default:
			      System.out.println("You are Choseing Wrong choice. Please chose correct one");
				  continue;
			}
			
			System.out.println("You Want to checkout/Not :");
			String a =sc.next();
			
		if(a.equalsIgnoreCase(CHECKOUT_COMMAND)){
				System.out.println("Total Bill is : "+totalBill);
			    System.out.println("Thank You For Visiting");
				break;
		}
		}while(true);
		
		sc.close();
	}
}
			