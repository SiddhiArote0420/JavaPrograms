/*
ATM PIN Validation**

**Description:**
Write a program that:

* Asks the user for a 4-digit ATM PIN.
* Gives **max 3 attempts** to enter the correct PIN using a do-while loop.
* If the PIN is correct, print "Access Granted" and **break** the loop.
* If attempts are over, print "Card Blocked".
*/

import java.util.*;
public class ATM_Validation
{
	private static final int RealPin  = 2014;// Constant for actual PIN
	private static final int MaxAttempt = 3;  // Constant for allowed attempts
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
	
		boolean accessGranted = false;
		int count=0;
		do{
			count++;
			
			System.out.println("Enter Your 4-digit pin Number : ");
		    int pin = sc.nextInt();
			
			// Check if PIN matches
			if(pin == RealPin )
			{
				System.out.println("Access Granted");
				accessGranted = true;
				break;
			}else {
                System.out.println("Wrong PIN. Attempts left: " + (MaxAttempt - count));
            }
				
			
		}while(count<3);
		
      if(!accessGranted)		
		System.out.println("Card Blocked");	
	  
	  sc.close();
	}
}