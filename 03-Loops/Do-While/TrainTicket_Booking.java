/* Train Ticket Booking**

**Description:**

* Ask the user to select a seat number.
* If seat is already booked (use a sample booked seat list), **continue** to ask again.
* If the user enters "exit", **break** the loop.
* Use a do-while loop to keep asking until a valid seat is booked.*/

import java.util.*;

public class TrainTicket_Booking {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Sample booked seats (no array)
        int seatAlredyBook1 = 5;
        int seatAlredyBook2 = 10;
        int seatAlredyBook3 = 15;

        int seatNo;
        String opinion;

        do {
            System.out.print("Enter seat number (1-21) or type 'exit' to quit: ");
            opinion = sc.next();

            if (opinion.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for using the booking system!");
                break;
            }

            seatNo = Integer.parseInt(opinion);

            if (seatNo == seatAlredyBook1 || seatNo == seatAlredyBook2 || seatNo == seatAlredyBook3) {
                System.out.println("This seat is Not Available");
                System.out.print("Remaining seats are: ");
                for (int i = 1; i <= 21; i++) {
                    if (i != seatAlredyBook1 && i != seatAlredyBook2 && i != seatAlredyBook3) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
                continue; 
            }

            System.out.println("Seat " + seatNo + " is booked for you!");
            break;

        } while (true);

        sc.close();
    }
}

				