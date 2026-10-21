/*
 Password Strength Checker**

**Description:**

* Ask the user to enter a password in a do-while loop.
* If the password length is less than 6 characters, display a message and **continue** to re-ask.
* If the password is "quit", stop asking (**break**).
* Otherwise, print "Password accepted" and exit.

*/
import java.util.*;
public class  PasswordStrength_Checker
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String pin;
		
		do{
			
			System.out.println("Enter Your Password  : ");
		     pin = sc.next();
					
			if(pin.equalsIgnoreCase("quit"))
			{
				break;
			}else if(pin.length()<6)
			{
				System.out.println("length is less than 6 characters");
                continue;				
			}else
			{
				System.out.println("password Accepted");
				break;
				
			}
				
			
		}while(true);
	sc.close();
	  
	}
}