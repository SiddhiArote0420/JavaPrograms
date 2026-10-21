/*

8. Email Address Validator**

**Description:**

* Ask the user for an email address.
* If email doesn’t contain '@', **continue** to ask again.
* If user enters "cancel", **break**.
* Use a do-while loop to validate and accept only proper emails.
*/

import java.util.*;

public class EmailAddress_Validator {  
    private static final String CANCEL_CASE = "cancel";   

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String emailAdd, choice;

        do {
            System.out.println("Do you want to cancel? (cancel/no)");
            choice = sc.next();

            if (choice.equalsIgnoreCase(CANCEL_CASE)) {
                break; 
            }

            System.out.println("Enter your Email :");
            emailAdd = sc.next();

            if (emailAdd.contains("@")) {
                System.out.println("Your Email is accepted");
                break; 
            } else {
                System.out.println("Invalid email. Missing '@'. Try again...");
            }

        } while (true);

        sc.close();
    }
}
