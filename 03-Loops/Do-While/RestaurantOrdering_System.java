/* 
Restaurant Ordering System**

**Description:**

* Show menu items and let user order.
* If they choose "skip", **continue** to next iteration without adding to order.
* If "done" is entered, **break** and print final bill.
* Implement using a do-while loop
*/
 

import java.util.*;

public class RestaurantOrdering_System {
    private static final String SKIP = "skip";
    private static final String DONE = "done";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String choice;
        int totalBill = 0; 
        do {
            System.out.println("\nMenu:");
            System.out.println("1: Burger - 90 Rs");
            System.out.println("2: Pizza - 120 Rs");
            System.out.println("3: Pasta - 80 Rs");
            System.out.println("4: Sandwich - 60 Rs");
            System.out.println("Enter item number (or type 'skip' to skip, 'done' to finish):");
            choice = sc.next();

            if (choice.equalsIgnoreCase(SKIP)) {
                continue; 
            }
            if (choice.equalsIgnoreCase(DONE)) {
                break; 
            }

            int item = Integer.parseInt(choice);
            int price = 0;

            switch (item) {
                case 1: price = 90; break;
                case 2: price = 120; break;
                case 3: price = 80; break;
                case 4: price = 60; break;
                default:
                    System.out.println("Invalid choice!");
                    continue;
            }

            System.out.print("How many do you want? ");
            int qty = sc.nextInt();

            if (qty > 0) {
                int bill = price * qty;
                totalBill += bill; 
                System.out.println("Added to order. Subtotal = " + bill + " Rs");
            } else {
                System.out.println("Invalid quantity!");
            }

        } while (true);

        System.out.println("\n Final Bill = " + totalBill + " Rs");
        sc.close();
    }
}
